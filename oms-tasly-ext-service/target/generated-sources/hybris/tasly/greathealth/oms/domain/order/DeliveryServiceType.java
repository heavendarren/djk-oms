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
 * Generated enumeration DeliveryServiceType declared at extension oms-tasly-ext-order.
 * <p/>
 * .
 */
public enum DeliveryServiceType implements HybrisEnumValue
{
	/**
	 * Generated enumeration value for EXPRESS declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	EXPRESS ("EXPRESS")
		,
		/**
	 * Generated enumeration value for EMS declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	EMS ("EMS")
		;
		 
	/**<i>Generated type code constant.</i>*/
	public static final String _TYPECODE = "DeliveryServiceType";
	
	
	/** The code of this enumeration.*/
	private final String code;
	
	/**
	 * Creates a new enumeration value for this enumeration type.
	 *  
	 * @param code the enumeration value code
	 */
	private DeliveryServiceType (final String code)
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
