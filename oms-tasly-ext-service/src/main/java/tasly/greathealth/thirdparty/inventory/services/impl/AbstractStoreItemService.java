/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package tasly.greathealth.thirdparty.inventory.services.impl;

import com.hybris.oms.service.ats.AtsResult;
import com.hybris.oms.service.ats.impl.DefaultAtsService;
import com.hybris.oms.service.inventory.InventoryService;
import com.hybris.oms.service.managedobjects.inventory.ItemQuantityData;
import com.hybris.oms.service.managedobjects.inventory.StockroomLocationData;
import com.hybris.oms.service.service.AbstractHybrisService;
import org.slf4j.Logger;
import org.springframework.transaction.annotation.Transactional;
import tasly.greathealth.oms.inventory.domain.ItemInfoData;
import tasly.greathealth.oms.inventory.domain.TaslyItemLocationData;
import tasly.greathealth.oms.inventory.services.ItemInfoService;
import tasly.greathealth.oms.inventory.services.TaslyItemLocationService;
import tasly.greathealth.oms.log.OmsLoggerFactory;
import tasly.greathealth.thirdparty.inventory.beans.StoreSku;
import tasly.greathealth.thirdparty.inventory.convertor.StoreSkuConvertor;
import tasly.greathealth.thirdparty.inventory.dao.StoreItemDao;
import tasly.greathealth.thirdparty.inventory.exception.StoreExceptionHandle;
import tasly.greathealth.thirdparty.inventory.services.UpdateItemService;
import tasly.greathealth.thirdparty.order.OrderConstants;
import tasly.greathealth.thirdparty.packagedto.PackageItemModelList;
import tasly.greathealth.thirdparty.packagedto.PackageItemRelationModel;
import tasly.greathealth.thirdparty.packagedto.PackageModel;
import tasly.greathealth.thirdparty.packagedto.PackageRelationModel;
import tasly.greathealth.tmall.inventory.ItemConstants;
import tasly.greathealth.tmall.inventory.domain.ProductOms;
import tasly.greathealth.tmall.inventory.domain.ProductTm;
import tasly.greathealth.tmall.inventory.file.WriteToFile;

import java.util.*;


/**
 *
 */
public class AbstractStoreItemService extends AbstractHybrisService implements UpdateItemService
{
	protected static final Logger Log = OmsLoggerFactory.getJdinventorylog();

	protected static List<StoreSku> updateFailedList = new ArrayList<StoreSku>();
	protected StoreItemDao storeItemDao;
	protected StoreSkuConvertor storeSkuConvertor;
	protected StoreExceptionHandle exceptionHandle;
	protected DefaultAtsService defaultAtsService;
	protected ItemInfoService itemService;
	protected InventoryService inventoryService;
	protected WriteToFile writeToFile;
	protected String FILENAME;
	protected String FILEPATH;
	protected static int updateFailedDataCount = 0;
	protected final int updateFailedLimit = ItemConstants.UPDATEFAILEDLIMIT;
	protected UpdateItemService storeItemService;
	private TaslyItemLocationService taslyItemLocationService;

	protected String channel;
	protected String innerSource;

	@Override
	@Transactional
	public void syncInventoryToStore()
	{
		// get invnetory from oms

		List<ProductOms> pos = getProductsInventoryFromOms();
		// update inventory to store
		this.updateInventoryToStore(this.prepareData(pos));
		// record failed data
		this.writeFailedDataToFile();
	}

	/**
	 * 获取产品库中，相关的所有产品数据
	 *
	 * @return
	 */
	@Transactional
	public List<ProductOms> getProductsInventoryFromOms()
	{
		Log.info("库存同步:从oms获取商品库存信息...");
		final Set<String> filterSkus = new HashSet<String>();
		final List<ProductOms> oms = new ArrayList<ProductOms>();
		/**
		 * 获取能够同步的商品信息
		 * 只同步自己的商品,不同步第三方或其他
		 * 这里只获取otc
		 */
		final List<ItemInfoData> iteminfodataList = itemService.getItemInfoByStockManageFlag(ItemConstants.ITEM_STOCKROOM_FLAG,
				innerSource);
		if (!iteminfodataList.isEmpty())
		{
			List<String> skuIdList = new ArrayList<String>();
			for (ItemInfoData itemInfoData : iteminfodataList)
			{
				List<TaslyItemLocationData> itemLocationDataList = taslyItemLocationService.getByItemID(itemInfoData.getSku(), channel);
				if(itemLocationDataList != null && itemLocationDataList.size() != 0){
					List<ItemQuantityData> itemQuantities = itemLocationDataList.get(0).getItemQuantities();
					StockroomLocationData stockroomLocation = itemLocationDataList.get(0).getStockroomLocation();
					if(stockroomLocation != null){
						if(itemQuantities != null && itemQuantities.size() != 0){
							skuIdList.add(itemInfoData.getSku());
						}else {
							Log.info("没有找到ItemQuantity信息，sku：" + itemInfoData.getSku());
						}
					}else {
						Log.info("没有找到StockroomLocation信息，sku：" + itemInfoData.getSku());
					}
				}else {
					Log.info("没有找到ItemLocation信息，sku：" + itemInfoData.getSku());
				}
			}
			String skuIds[] = skuIdList.toArray(new String[0]);

			final StockroomLocationData stockRoolLocation = inventoryService.getLocationByLocationId(channel);
			final List<TaslyItemLocationData> itemInfos = itemService.getByLocation(stockRoolLocation, skuIds);
			if (null != itemInfos && !itemInfos.isEmpty())
			{
				Log.info("库存同步:oms商品数量" + itemInfos.size());
				for (final TaslyItemLocationData itemLocationInfoData : itemInfos)
				{
					filterSkus.add(itemLocationInfoData.getItemId());
				}
				// add location addr
				final Set<String> filterLocations = new HashSet<String>();
				filterLocations.add(getChannel());

				// add available to sell id
				final Set<String> atsIds = new HashSet<String>();
				atsIds.add(ItemConstants.ATSID);

				final AtsResult atsResult = defaultAtsService.getLocalAts(filterSkus, filterLocations, atsIds);
				for (final String sku : filterSkus)
				{
					final int inventory = atsResult.getResult(sku, ItemConstants.ATSID, stockRoolLocation.getLocationId());
					final ProductOms po = new ProductOms();
					po.setSkuId(sku);
					po.setNum(Long.valueOf(String.valueOf(inventory)));
					oms.add(po);
				}
				for (final ProductOms pom : oms)
				{
					if (pom.getNum() < 0) {
						Log.info("库存小于等于0的商品:" + pom.getSkuId() + "|原库存数量:" + pom.getNum()+ "|现库存数量:0");
						pom.setNum(0L);
					}
				}
				if (oms.size() > 0)
				{
					Log.info("库存同步:封装后商品库存数量" + oms.size() + "|获取所有的商品库存完成 ...");
				}
			}
		}
		return oms;
	}

	/**
	 * according to the different shop, include otc and jsc
	 * here get the different products info
	 *
	 * @return
	 */
	@Override
	public List<StoreSku> getItemsFromStore()
	{
		final List<StoreSku> items = new ArrayList<StoreSku>();
		List<StoreSku> inStockItem_for_shelved = new ArrayList<StoreSku>();
		final List<StoreSku> inStockItem_sold_out = new ArrayList<StoreSku>();
		final List<StoreSku> onSaleItem = new ArrayList<StoreSku>();
        storeItemDao.setPageAmount(0);
		Log.info("库存同步:获取上架的商品列表");
		inStockItem_for_shelved = storeItemDao.getInStockItemsFromStore();
//		 Log.info("库存同步:获取已售罄的商品列表");
//		 inStockItem_sold_out = storeItemDao.getDownStockItemsFromStore();
//		 Log.info("库存同步:获取已上架的商品列表");
//		 onSaleItem = storeItemDao.getOnSaleItemsFromStore();
		// }

		if (null != inStockItem_for_shelved)
		{
			items.addAll(inStockItem_for_shelved);
		}
		if (null != inStockItem_sold_out)
		{
			items.addAll(inStockItem_sold_out);
		}
		if (null != onSaleItem)
		{
			items.addAll(onSaleItem);
		}
		return items;
	}

	@Override
	public List<StoreSku> prepareData(final List<ProductOms> pos)
	{
		List<StoreSku> skus = new ArrayList<StoreSku>();
		// get all the  products information from store
		Log.info("库存同步:获取商品列表...");
		final List<StoreSku> otcItems = this.getItemsFromStore();

		if (!otcItems.isEmpty())
		{
			Log.info("库存同步:商品数量" + otcItems.size());

			Log.info("库存同步: 开始转换数据格式...");
			skus = storeSkuConvertor.convertData(otcItems, pos);
		}
		return skus;
	}

	@Override
	public void updateInventoryToStore(final List<StoreSku> skus)
	{
		Log.debug("库存同步:清空更新失败的内存列表");
		this.getUpdateFailedList().clear();// clear the data which update to store failed last time
		Log.debug("库存同步:开始更新库存,待同步商品数量：" + skus.size());
		for (final StoreSku sku : skus)
		{
			try
			{
				storeItemDao.updateStockInfoByStoreSku(sku);
			}
			catch (final Exception e)
			{
				// handle the update failed data
				exceptionHandle.handleConnectionTimeOutException(sku);
			}
		}
		// update the failed data
		if (null != this.getUpdateFailedList() && !this.getUpdateFailedList().isEmpty())
		{
			if (updateFailedDataCount < updateFailedLimit)
			{
				this.updateFailedDataToStore();
			}
			else
			{
				updateFailedDataCount = 0;
				Log.info("更新成功. 失败商品数量:" + this.getUpdateFailedList().size());
			}
		}
		else
		{
			Log.info("所有商品更新成功");
		}
	}
    /**
     * 构造上传的dto类型
     *
     * @return
     */
    public List<StoreSku> rebuildStoreDto(final PackageRelationModel packageRelationModel)
    {
        final List<StoreSku> ptms = new ArrayList<StoreSku>();
        final PackageItemRelationModel packageItemRelationModel = packageRelationModel.getPackageItemRelationModel();
        final List<PackageItemModelList> packageItemModelList = packageItemRelationModel.getPackageItemModelList();
        final List<String> tempOuterIds = new ArrayList<String>();

        for (final PackageItemModelList pim : packageItemModelList)
        {
            final String itemId = pim.getItemId();
            Log.info("待更新的skuId:" + itemId);
            final List<PackageModel> packageModels = pim.getPackageModelList().getPackageModel();
            for (final PackageModel p : packageModels)
            {
                // final boolean dataException = false;
                final String outerId = p.getOuterId();
                final Long quantity = p.getQuantity();
                if (!tempOuterIds.contains(outerId))
                {
                    tempOuterIds.add(outerId);
                    // 根据套餐outerId获取信息
                    // final ProductTm pt = new ProductTm();
                    // pt.setShopName(packageRelationModel.getInnersource());
                    // pt.setTmFreeQuntity(quantity);
                    // pt.setOuterId(outerId);
                    final StoreSku sku = getStoreSkuFromStore(outerId.toString());
                    // pt.setCombo(true);
                    // pt.setTmProductId(sku.getNumIid());
                    ptms.add(sku);
                    Log.info("相关待更新的套餐编码:库存|" + outerId + ":" + quantity + "SKU:" + sku.getSkuid() + "|tmall库存"
                            + sku.getStockQuntity());
                }
            }
        }
        Log.info("待更新总数:" + ptms.size());
        return ptms;
    }

	/**
	 * update again for the data which update to tmall failed last time
	 * the failed data saved in the memory
	 */
	public void updateFailedDataToStore()
	{
		updateFailedDataCount++;
		// get the failed data from memory
		final List<StoreSku> failedData = new ArrayList<StoreSku>();
		failedData.addAll(this.getUpdateFailedList());
		this.getUpdateFailedList().clear();
		if (failedData.size() > 0)
		{
			Log.info("update failed data size:" + failedData.size());

			final List<StoreSku> tempFailedPts = new ArrayList<StoreSku>();
			tempFailedPts.addAll(failedData);
			this.updateInventoryToStore(tempFailedPts);
		}
		else
		{
			Log.info("update all items success.");
		}
	}

	/**
	 * @return the updateFailedList
	 */
	@Override
	public List<StoreSku> getUpdateFailedList()
	{
		return updateFailedList;
	}


	public void writeFailedDataToFile()
	{
		final List<StoreSku> poms = storeSkuConvertor.getMatchFailedData();
		if (poms == null)
		{
			Log.info("没有需要更新的失败数据");
			return;
		}
		final List<StoreSku> failedSkus = this.getUpdateFailedList();
		final StringBuilder sb = new StringBuilder();
		sb.append("--------------------------match failed list----------------------");
		sb.append(System.getProperty("line.separator"));
		for (final StoreSku p : poms)
		{
			sb.append("oms-sku:" + p.getSkuid() + "|oms-sku-num:" + p.getOuterid());
			sb.append(System.getProperty("line.separator"));
		}
		sb.append("--------------------------update failed list----------------------");
		sb.append(System.getProperty("line.separator"));
		for (final StoreSku p : failedSkus)
		{
			sb.append("oms-sku:" + p.getOuterid() + "| num_iid" + p.getShopName() + "|oms-sku-num:" + p.getStockQuntity());
			sb.append(System.getProperty("line.separator"));
		}
		try
		{
//			writeToFile.createFile(FILEPATH, FILENAME, sb);
            Log.info(sb.toString());
		}

		catch (final Exception e)
		{
			throw new RuntimeException(e);
		}
	}



	@Override
	public boolean updateStockInfoByStoreSku(final StoreSku sku)
	{
		return storeItemDao.updateStockInfoByStoreSku(sku);
	}



	/**************************************************
	 * ----------------get set method---------------- *
	 *************************************************/

	/**
	 * @return the defaultAtsService
	 */
	public DefaultAtsService getDefaultAtsService()
	{
		return defaultAtsService;
	}

	/**
	 * @param defaultAtsService the defaultAtsService to set
	 */
	public void setDefaultAtsService(final DefaultAtsService defaultAtsService)
	{
		this.defaultAtsService = defaultAtsService;
	}

	/**
	 * @return the exceptionHandle
	 */
	public StoreExceptionHandle getExceptionHandle()
	{
		return exceptionHandle;
	}

	/**
	 * @param exceptionHandle the exceptionHandle to set
	 */
	public void setExceptionHandle(final StoreExceptionHandle exceptionHandle)
	{
		this.exceptionHandle = exceptionHandle;
	}


	/**
	 * @return the itemService
	 */
	public ItemInfoService getItemService()
	{
		return itemService;
	}



	/**
	 * @param itemService the itemService to set
	 */
	public void setItemService(final ItemInfoService itemService)
	{
		this.itemService = itemService;
	}



	/**
	 * @return the inventoryService
	 */
	public InventoryService getInventoryService()
	{
		return inventoryService;
	}



	/**
	 * @param inventoryService the inventoryService to set
	 */
	public void setInventoryService(final InventoryService inventoryService)
	{
		this.inventoryService = inventoryService;
	}

	/**
	 * @return the storeItemDao
	 */
	public StoreItemDao getstoreItemDao()
	{
		return storeItemDao;
	}

	/**
	 * @param storeItemDao the storeItemDao to set
	 */
	public void setstoreItemDao(final StoreItemDao storeItemDao)
	{
		this.storeItemDao = storeItemDao;
	}


	/**
	 * @param writeToFile the writeToFile to set
	 */
	public void setWriteToFile(final WriteToFile writeToFile)
	{
		this.writeToFile = writeToFile;
	}

	/**
	 * @param fILENAME the fILENAME to set
	 */
	public void setFILENAME(final String fILENAME)
	{
		FILENAME = fILENAME;
	}

	/**
	 * @param fILEPATH the fILEPATH to set
	 */
	public void setFILEPATH(final String fILEPATH)
	{
		FILEPATH = fILEPATH;
	}


	@Override
	public StoreSku getStoreSkuFromStore(final String outerid)
	{
		return storeItemDao.getStoreSkuByOuterId(outerid);
	}

	/**
	 * @return the storeSkuConvertor
	 */
	public StoreSkuConvertor getStoreSkuConvertor()
	{
		return storeSkuConvertor;
	}

	/**
	 * @param storeSkuConvertor the storeSkuConvertor to set
	 */
	public void setStoreSkuConvertor(final StoreSkuConvertor storeSkuConvertor)
	{
		this.storeSkuConvertor = storeSkuConvertor;
	}

	/**
	 * @return the innerSource
	 */
	public String getInnerSource()
	{
		return innerSource;
	}

	/**
	 * @param innerSource the innerSource to set
	 */
	public void setInnerSource(final String innerSource)
	{
		this.innerSource = innerSource;
	}

	/**
	 * @return the storeItemDao
	 */
	public StoreItemDao getStoreItemDao()
	{
		return storeItemDao;
	}

	/**
	 * @param storeItemDao the storeItemDao to set
	 */
	public void setStoreItemDao(final StoreItemDao storeItemDao)
	{
		this.storeItemDao = storeItemDao;
	}

	/**
	 * @return the storeItemService
	 */
	public UpdateItemService getStoreItemService()
	{
		return storeItemService;
	}

	/**
	 * @param storeItemService the storeItemService to set
	 */
	public void setStoreItemService(final UpdateItemService storeItemService)
	{
		this.storeItemService = storeItemService;
	}

	/**
	 * @param updateFailedList the updateFailedList to set
	 */
	public static void setUpdateFailedList(final List<StoreSku> updateFailedList)
	{
		AbstractStoreItemService.updateFailedList = updateFailedList;
	}

	/**
	 * @return the channel
	 */
	public String getChannel()
	{
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(final String channel)
	{
		this.channel = channel;
	}

	public void setTaslyItemLocationService(TaslyItemLocationService taslyItemLocationService) {
		this.taslyItemLocationService = taslyItemLocationService;
	}



}
