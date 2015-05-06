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
 * Generated managedobject class for type ExpressData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface ExpressData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "ExpressData";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExpressData.code</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpressData, String> CODE = new AttributeType<>("code");
	/** <i>Generated constant</i> - Attribute key of <code>ExpressData.name</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpressData, String> NAME = new AttributeType<>("name");

	/** <i>Generated constant</i> - Index of <code>ExpressData</code> type defined at extension <code>oms-tasly-ext-order</code>. */
	UniqueIndexSingle<ExpressData, String> UX_EXPRESS_CODE = new UniqueIndexSingle<>("UX_express_code", ExpressData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressData.code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 快递公司代码.
	 * 
	 * @return the code
	 */
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max=10)
	java.lang.String getCode();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressData.name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 快递公司名称.
	 * 
	 * @return the name
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getName();
	

	/**
	 * <i>Generated method</i> - Setter of <code>ExpressData.code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 快递公司代码.
	 *
	 * @param value the code
	 */
	void setCode(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpressData.name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 快递公司名称.
	 *
	 * @param value the name
	 */
	void setName(final java.lang.String value);
	
}
