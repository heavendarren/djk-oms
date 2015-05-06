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

import com.hybris.oms.service.managedobjects.inventory.StockroomLocationData;

    
/**
 * Generated managedobject class for type TaslyStockroomLocationData first defined at extension <code>oms-tasly-ext-inventory</code>.
 * <p/>
 * .
 */
public interface TaslyStockroomLocationData extends StockroomLocationData, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyStockroomLocationData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyStockroomLocationData.defaultAllocatePercent</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>. */
	AttributeType<TaslyStockroomLocationData, Integer> DEFAULTALLOCATEPERCENT = new AttributeType<>("defaultAllocatePercent");

	/** <i>Generated constant</i> - Index of <code>TaslyStockroomLocationData</code> type defined at extension <code>oms-tasly-ext-inventory</code>. */
	UniqueIndexSingle<TaslyStockroomLocationData, String> UX_STOCKROOMLOCATIONS_LOCATIONID = new UniqueIndexSingle<>("UX_stockroomlocations_locationId", TaslyStockroomLocationData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyStockroomLocationData.defaultAllocatePercent</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.
	 * <p/>
	 * .
	 * 
	 * @return the defaultAllocatePercent
	 */
	int getDefaultAllocatePercent();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyStockroomLocationData.defaultAllocatePercent</code> attribute defined at extension <code>oms-tasly-ext-inventory</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the defaultAllocatePercent
	 */
	void setDefaultAllocatePercent(final int value);
	
}
