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
 * Generated enumeration OrderState declared at extension oms-tasly-ext-order.
 * <p/>
 * .
 */
public enum OrderState implements HybrisEnumValue
{
	/**
	 * Generated enumeration value for SUCCESS declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	SUCCESS ("SUCCESS")
		,
		/**
	 * Generated enumeration value for PROCESSED declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	PROCESSED ("PROCESSED")
		,
		/**
	 * Generated enumeration value for PENDING declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	PENDING ("PENDING")
		,
		/**
	 * Generated enumeration value for FAIL declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	FAIL ("FAIL")
		;
		 
	/**<i>Generated type code constant.</i>*/
	public static final String _TYPECODE = "OrderState";
	
	
	/** The code of this enumeration.*/
	private final String code;
	
	/**
	 * Creates a new enumeration value for this enumeration type.
	 *  
	 * @param code the enumeration value code
	 */
	private OrderState (final String code)
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
