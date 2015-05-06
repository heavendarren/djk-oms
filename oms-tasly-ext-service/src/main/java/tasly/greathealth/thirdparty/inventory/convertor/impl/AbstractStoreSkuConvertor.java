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
package tasly.greathealth.thirdparty.inventory.convertor.impl;

import org.slf4j.Logger;
import tasly.greathealth.oms.api.order.dto.SkuToProduct;
import tasly.greathealth.oms.log.OmsLoggerFactory;
import tasly.greathealth.tamll.api.SkuToProductFacade;
import tasly.greathealth.thirdparty.inventory.beans.StoreSku;
import tasly.greathealth.thirdparty.inventory.convertor.StoreSkuConvertor;
import tasly.greathealth.tmall.inventory.domain.ProductOms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 */
public class AbstractStoreSkuConvertor implements StoreSkuConvertor
{
	private static final Logger Log = OmsLoggerFactory.getTmallinventorylog();
	protected String channel;
	protected String innerSource;

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

	protected SkuToProductFacade skuToProductFacade;



	/**
	 * @return the skuToProductFacade
	 */
	public SkuToProductFacade getSkuToProductFacade()
	{
		return skuToProductFacade;
	}

	/**
	 * @param skuToProductFacade the skuToProductFacade to set
	 */
	public void setSkuToProductFacade(final SkuToProductFacade skuToProductFacade)
	{
		this.skuToProductFacade = skuToProductFacade;
	}

	public static List<StoreSku> matchFailedSkus = new ArrayList<StoreSku>();

	@Override
	public List<StoreSku> convertData(final List<StoreSku> skus, final List<ProductOms> omsProducts)
	{

		final List<StoreSku> storeSkus = new ArrayList<StoreSku>();
		// 做数据匹配，已本地库存为准，因为oms中只有目前在售的产品，但渠道上可能会出现多种商品，即oms可能有100种
		//商品，但是天猫上可能有1000种，但是这1000种只有100种在卖（冗余数据）
		//先将

		matchFailedSkus.clear();


		// 转成map
		final Map<String, ProductOms> omsItems = new HashMap<String, ProductOms>();
		for (final ProductOms p : omsProducts)
		{
			final String outerid = p.getSkuId();
			if (outerid != null && outerid.length() > 0)
			{
				omsItems.put(outerid, p);

			}
		}
		// Log.info("库存同步:最终筛选后的oms单品数量为:" + omsItems.keySet().size());
		// 首先匹配取出来的单品的数据，如果匹配不成功的放到一个新的map里面
		Map<String,StoreSku>failedSkus = new HashMap<String,StoreSku>();
		for (final StoreSku sku : skus)
		{
			final String outerid = sku.getOuterid();
			if (outerid == null || outerid.length() == 0)
			{
				matchFailedSkus.add(sku);
				Log.info("线上数据错误，skuid为："+sku.getSkuid()+";错误原因为：没有outerid");
				continue;
			}
			if (omsItems.containsKey(outerid))
			{
				// 存在相同的,放到最终的集合里
				final ProductOms oms = omsItems.get(outerid);
				sku.setStockQuntity(oms.getNum());
				storeSkus.add(sku);
				Log.info("匹配成功的单品:outerid:" + sku.getOuterid()+";skuid:"+sku.getSkuid());

			}
			else
			{
				// 如果不存在,则将这个放到匹配不成功的集合里，下一步配对
				failedSkus.put(outerid,sku);
			}

		}
		// 其次匹配套餐的，如果还匹配不上则为最终不可用的
		dataMappingList(storeSkus,omsProducts, failedSkus);
		return storeSkus;
	}


	private void dataMappingList(final List<StoreSku> storeSkus ,final List<ProductOms> omsProducts,Map<String,StoreSku>failedSkus) {

		if (null != omsProducts)
		{
			//循环oms的items，根据item查询数据库中这个单品是否构成了多个套餐，如果只够成了一个多盒装套餐，则把这个套餐更新，
			//其他的不处理
			for (final ProductOms pos : omsProducts)
			{
				//
				final SkuToProduct skuToProduct = this.validateIfExistInSkuRelation(pos.getSkuId());
				if (null != skuToProduct)
				{
					StoreSku sku=failedSkus.get(skuToProduct.getOuterId());
					if(null!=sku){
						// caculate the new quantity of this item
						final Long num = pos.getNum() / skuToProduct.getQuantity();

						Log.info("匹配成功的套餐:outerid:" + sku.getOuterid()+";skuid:"+sku.getSkuid());
						sku.setStockQuntity(num);
						storeSkus.add(sku);
						failedSkus.remove(sku.getOuterid());//从失败的数据中删除
					}


				}
			}
		}
		for(String key:failedSkus.keySet()){
			StoreSku sku=failedSkus.get(key);
			matchFailedSkus.add(sku);
			Log.info("套餐："+sku.getSkuid()+"不上传，原因：套餐为组合 套餐或构成套餐的sku构成了其他的套餐");
		}
	}


	private  SkuToProduct validateIfExistInSkuRelation( final String itemId)
	{
		 List<SkuToProduct> skuToProduct  = (List<SkuToProduct>) skuToProductFacade.querySkuToProductByitemId(itemId, getChannel(),
		 getInnerSource());
		 if (null != skuToProduct && skuToProduct.size() == 1)
		 {
		 return skuToProduct.get(0);
		 }
		return null;
	}


	@Override
	public List<StoreSku> getMatchFailedData()
	{
		return matchFailedSkus;
	}



}
