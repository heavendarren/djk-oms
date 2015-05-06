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
 
package tasly.greathealth.oms.domain.order;

import com.hybris.kernel.api.*;

import com.hybris.oms.service.managedobjects.shipment.ShippingAndHandlingData;

    
/**
 * Generated managedobject class for type TaslyShippingAndHandlingData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface TaslyShippingAndHandlingData extends ShippingAndHandlingData, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyShippingAndHandlingData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyShippingAndHandlingData.shpr_insurance</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyShippingAndHandlingData, Double> SHPR_INSURANCE = new AttributeType<>("shpr_insurance");

	/** <i>Generated constant</i> - Index of <code>TaslyShippingAndHandlingData</code> type defined at extension <code>oms-tasly-ext-order</code>. */
	UniqueIndexSingle<TaslyShippingAndHandlingData, String> UX_SHIPPINGANDHANDLING_ORDERID = new UniqueIndexSingle<>("UX_shippingAndHandling_orderId", TaslyShippingAndHandlingData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyShippingAndHandlingData.shpr_insurance</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 运费险.
	 * 
	 * @return the shpr_insurance
	 */
	java.lang.Double getShpr_insurance();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyShippingAndHandlingData.shpr_insurance</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 运费险.
	 *
	 * @param value the shpr_insurance
	 */
	void setShpr_insurance(final java.lang.Double value);
	
}
