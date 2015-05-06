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
 * 
 *  
 */
 
package tasly.greathealth.oms.inventory.domain;

import com.hybris.kernel.api.*;

import com.hybris.kernel.api.ManagedObject;

    
/**
 * Generated managedobject class for type ItemInfoData first defined at extension <code>oms-tasly-ext-inventory</code>.
 * <p/>
 * .
 */
public interface ItemInfoData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "ItemInfoData";
	
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.description</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> DESCRIPTION = new AttributeType<>("description");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.ext2</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> EXT2 = new AttributeType<>("ext2");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.sku</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> SKU = new AttributeType<>("sku");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.innerSource</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, tasly.greathealth.oms.inventory.domain.InventoryDomainInnerSource> INNERSOURCE = new AttributeType<>("innerSource");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.ext5</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> EXT5 = new AttributeType<>("ext5");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.ext3</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> EXT3 = new AttributeType<>("ext3");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.ext1</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> EXT1 = new AttributeType<>("ext1");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.baseUnitCode</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> BASEUNITCODE = new AttributeType<>("baseUnitCode");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.vendor</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> VENDOR = new AttributeType<>("vendor");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.ext4</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> EXT4 = new AttributeType<>("ext4");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.quantity</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, Integer> QUANTITY = new AttributeType<>("quantity");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.stockManageFlag</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, Integer> STOCKMANAGEFLAG = new AttributeType<>("stockManageFlag");
	/** <i>Generated constant</i> - Attribute key of <code>ItemInfoData.oldMaterialNumber</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<ItemInfoData, String> OLDMATERIALNUMBER = new AttributeType<>("oldMaterialNumber");

	/** <i>Generated constant</i> - Index of <code>ItemInfoData</code> type defined at extension <code>oms-tasly-ext-inventory</code>. */
	UniqueIndexSingle<ItemInfoData, String> UX_ITEMINFOS_SKU = new UniqueIndexSingle<>("UX_itemInfos_sku", ItemInfoData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.sku</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the sku
	 */
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max=255)
	java.lang.String getSku();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.description</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the description
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getDescription();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.quantity</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the quantity
	 */
	int getQuantity();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.baseUnitCode</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the baseUnitCode
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getBaseUnitCode();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.stockManageFlag</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the stockManageFlag
	 */
	int getStockManageFlag();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.innerSource</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the innerSource
	 */
	tasly.greathealth.oms.inventory.domain.InventoryDomainInnerSource getInnerSource();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.oldMaterialNumber</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the oldMaterialNumber
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getOldMaterialNumber();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.ext1</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the ext1
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getExt1();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.ext2</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the ext2
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getExt2();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.ext3</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the ext3
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getExt3();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.ext4</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the ext4
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getExt4();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.ext5</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the ext5
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getExt5();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemInfoData.vendor</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the vendor
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getVendor();
	

	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.sku</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the sku
	 */
	void setSku(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.description</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the description
	 */
	void setDescription(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.quantity</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the quantity
	 */
	void setQuantity(final int value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.baseUnitCode</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the baseUnitCode
	 */
	void setBaseUnitCode(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.stockManageFlag</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the stockManageFlag
	 */
	void setStockManageFlag(final int value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.innerSource</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the innerSource
	 */
	void setInnerSource(final tasly.greathealth.oms.inventory.domain.InventoryDomainInnerSource value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.oldMaterialNumber</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the oldMaterialNumber
	 */
	void setOldMaterialNumber(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.ext1</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the ext1
	 */
	void setExt1(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.ext2</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the ext2
	 */
	void setExt2(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.ext3</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the ext3
	 */
	void setExt3(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.ext4</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the ext4
	 */
	void setExt4(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.ext5</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the ext5
	 */
	void setExt5(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ItemInfoData.vendor</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the vendor
	 */
	void setVendor(final java.lang.String value);
	
}
