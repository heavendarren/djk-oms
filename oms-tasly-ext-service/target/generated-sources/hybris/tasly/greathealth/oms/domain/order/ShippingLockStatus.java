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
 * Generated enumeration ShippingLockStatus declared at extension oms-tasly-ext-order.
 * <p/>
 * .
 */
public enum ShippingLockStatus implements HybrisEnumValue
{
	/**
	 * Generated enumeration value for LOCK_FAILED declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	LOCK_FAILED ("LOCK_FAILED")
		,
		/**
	 * Generated enumeration value for LOCK_SUCCESS declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	LOCK_SUCCESS ("LOCK_SUCCESS")
		,
		/**
	 * Generated enumeration value for PENDING_UNLOCK declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	PENDING_UNLOCK ("PENDING_UNLOCK")
		,
		/**
	 * Generated enumeration value for NON_LOCK declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	NON_LOCK ("NON_LOCK")
		,
		/**
	 * Generated enumeration value for UNLOCK_FAILED declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	UNLOCK_FAILED ("UNLOCK_FAILED")
		,
		/**
	 * Generated enumeration value for PENDING_LOCK declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	PENDING_LOCK ("PENDING_LOCK")
		;
		 
	/**<i>Generated type code constant.</i>*/
	public static final String _TYPECODE = "ShippingLockStatus";
	
	
	/** The code of this enumeration.*/
	private final String code;
	
	/**
	 * Creates a new enumeration value for this enumeration type.
	 *  
	 * @param code the enumeration value code
	 */
	private ShippingLockStatus (final String code)
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
