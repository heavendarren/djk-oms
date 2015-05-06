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

import com.hybris.oms.service.managedobjects.inventory.ItemLocationData;

    
/**
 * Generated managedobject class for type TaslyItemLocationData first defined at extension <code>oms-tasly-ext-inventory</code>.
 * <p/>
 * .
 */
public interface TaslyItemLocationData extends ItemLocationData, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyItemLocationData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyItemLocationData.itemInfo</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<TaslyItemLocationData, tasly.greathealth.oms.inventory.domain.ItemInfoData> ITEMINFO = new AttributeType<>("itemInfo");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyItemLocationData.allocationPercent</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<TaslyItemLocationData, Integer> ALLOCATIONPERCENT = new AttributeType<>("allocationPercent");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyItemLocationData.safetyStock</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<TaslyItemLocationData, Integer> SAFETYSTOCK = new AttributeType<>("safetyStock");

	/** <i>Generated constant</i> - Index of <code>TaslyItemLocationData</code> type defined at extension <code>oms-tasly-ext-inventory</code>. */
	UniqueIndexMultiple<TaslyItemLocationData> UQ_ITEMLOC_SKULOCFUT = new UniqueIndexMultiple<>("UQ_ItemLoc_skuLocFut", TaslyItemLocationData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyItemLocationData.allocationPercent</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the allocationPercent
	 */
	int getAllocationPercent();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyItemLocationData.safetyStock</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the safetyStock
	 */
	int getSafetyStock();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyItemLocationData.itemInfo</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the itemInfo
	 */
	tasly.greathealth.oms.inventory.domain.ItemInfoData getItemInfo();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyItemLocationData.allocationPercent</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the allocationPercent
	 */
	void setAllocationPercent(final int value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyItemLocationData.safetyStock</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the safetyStock
	 */
	void setSafetyStock(final int value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyItemLocationData.itemInfo</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the itemInfo
	 */
	void setItemInfo(final tasly.greathealth.oms.inventory.domain.ItemInfoData value);
	
}
