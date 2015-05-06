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

import com.hybris.kernel.api.HybrisEnumValue;

/**
 * Generated enumeration EventType declared at extension oms-tasly-ext-order.
 * <p/>
 * .
 */
public enum EventType implements HybrisEnumValue
{
	/**
	 * Generated enumeration value for REFUNDSELLERREFUSE declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	REFUNDSELLERREFUSE ("REFUNDSELLERREFUSE")
		,
		/**
	 * Generated enumeration value for REFUNDCREATE declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	REFUNDCREATE ("REFUNDCREATE")
		,
		/**
	 * Generated enumeration value for SELLERSHIP declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	SELLERSHIP ("SELLERSHIP")
		,
		/**
	 * Generated enumeration value for UPDATEORDERPRICE declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	UPDATEORDERPRICE ("UPDATEORDERPRICE")
		,
		/**
	 * Generated enumeration value for ORDERCREATE declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	ORDERCREATE ("ORDERCREATE")
		,
		/**
	 * Generated enumeration value for TESTCANCELSHIPMENT declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	TESTCANCELSHIPMENT ("TESTCANCELSHIPMENT")
		,
		/**
	 * Generated enumeration value for REFUNDSELLERAGREE declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	REFUNDSELLERAGREE ("REFUNDSELLERAGREE")
		,
		/**
	 * Generated enumeration value for UPDATEORDERMEMO declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	UPDATEORDERMEMO ("UPDATEORDERMEMO")
		,
		/**
	 * Generated enumeration value for REFUNDCLOSE declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	REFUNDCLOSE ("REFUNDCLOSE")
		,
		/**
	 * Generated enumeration value for REFUNDSUCCESS declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	REFUNDSUCCESS ("REFUNDSUCCESS")
		,
		/**
	 * Generated enumeration value for LOGISTICSCHANGED declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	LOGISTICSCHANGED ("LOGISTICSCHANGED")
		;
		 
	/**<i>Generated type code constant.</i>*/
	public static final String _TYPECODE = "EventType";
	
	
	/** The code of this enumeration.*/
	private final String code;
	
	/**
	 * Creates a new enumeration value for this enumeration type.
	 *  
	 * @param code the enumeration value code
	 */
	private EventType (final String code)
	{
		this.code = code.intern();
	}
	
	/**
	 * Gets the code of this enumeration value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enumeration value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return getClass().getSimpleName();
	}
}
