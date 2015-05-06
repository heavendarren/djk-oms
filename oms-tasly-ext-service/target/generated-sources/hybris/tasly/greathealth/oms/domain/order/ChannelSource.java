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
 * Generated enumeration ChannelSource declared at extension oms-tasly-ext-order.
 * <p/>
 * .
 */
public enum ChannelSource implements HybrisEnumValue
{
	/**
	 * Generated enumeration value for CCTV declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	CCTV ("CCTV")
		,
		/**
	 * Generated enumeration value for ICBC declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	ICBC ("ICBC")
		,
		/**
	 * Generated enumeration value for GREATHEALTH declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	GREATHEALTH ("GREATHEALTH")
		,
		/**
	 * Generated enumeration value for SUNING declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	SUNING ("SUNING")
		,
		/**
	 * Generated enumeration value for AMAZON declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	AMAZON ("AMAZON")
		,
		/**
	 * Generated enumeration value for CCB declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	CCB ("CCB")
		,
		/**
	 * Generated enumeration value for JD declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	JD ("JD")
		,
		/**
	 * Generated enumeration value for YHD declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	YHD ("YHD")
		,
		/**
	 * Generated enumeration value for TMALL declared at extension oms-tasly-ext-order.
	 * <p/>
	 	 * .
	 	 */
	TMALL ("TMALL")
		;
		 
	/**<i>Generated type code constant.</i>*/
	public static final String _TYPECODE = "ChannelSource";
	
	
	/** The code of this enumeration.*/
	private final String code;
	
	/**
	 * Creates a new enumeration value for this enumeration type.
	 *  
	 * @param code the enumeration value code
	 */
	private ChannelSource (final String code)
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
