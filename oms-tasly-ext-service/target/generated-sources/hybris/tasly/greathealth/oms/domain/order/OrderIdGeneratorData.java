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

import com.hybris.kernel.api.ManagedObject;

  
/**
 * Generated managedobject class for type OrderIdGeneratorData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface OrderIdGeneratorData extends ManagedObject
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "OrderIdGeneratorData";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderIdGeneratorData.orderId</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<OrderIdGeneratorData, Number> ORDERID = new AttributeType<>("orderId");

	/** <i>Generated constant</i> - Index of <code>OrderIdGeneratorData</code> type defined at extension <code>oms-tasly-ext-order</code>. */
	UniqueIndexSingle<OrderIdGeneratorData, Number> UX_ORDERIDGENERATOR_ORDERID = new UniqueIndexSingle<>("UX_orderidgenerator_orderId", OrderIdGeneratorData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>OrderIdGeneratorData.orderId</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	* <b>Value for this attribute is auto-generated at entity creation time using available sequence generator!</b>
	 * <p/>
	 * Unique id identifier.
	 * 
	 * @return the orderId
	 */
	@javax.validation.constraints.NotNull
	java.lang.Number getOrderId();
	

	/**
	 * <i>Generated method</i> - Setter of <code>OrderIdGeneratorData.orderId</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * Unique id identifier.
	 *
	 * @param value the orderId
	 */
	void setOrderId(final java.lang.Number value);
	
}
