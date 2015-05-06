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
 * Generated enumeration ShadInfoUpdateStatus declared at extension oms-tasly-ext-order.
 * <p/>
 * .
 */
public enum ShadInfoUpdateStatus implements HybrisEnumValue
{
	/**
	 * Generated enumeration value for REQ_FAILED declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	REQ_FAILED ("REQ_FAILED")
		,
		/**
	 * Generated enumeration value for REQ_MODIFY declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	REQ_MODIFY ("REQ_MODIFY")
		,
		/**
	 * Generated enumeration value for DEFAULT declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	DEFAULT ("DEFAULT")
		;
		 
	/**<i>Generated type code constant.</i>*/
	public static final String _TYPECODE = "ShadInfoUpdateStatus";
	
	
	/** The code of this enumeration.*/
	private final String code;
	
	/**
	 * Creates a new enumeration value for this enumeration type.
	 *  
	 * @param code the enumeration value code
	 */
	private ShadInfoUpdateStatus (final String code)
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
