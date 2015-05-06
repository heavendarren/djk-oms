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
 * Generated managedobject class for type ExpresslocationsData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface ExpresslocationsData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "ExpresslocationsData";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExpresslocationsData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpresslocationsData, String> EXPRESS_CODE = new AttributeType<>("express_code");
	/** <i>Generated constant</i> - Attribute key of <code>ExpresslocationsData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpresslocationsData, String> INNER_SOURCE = new AttributeType<>("inner_source");
	/** <i>Generated constant</i> - Attribute key of <code>ExpresslocationsData.province</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpresslocationsData, String> PROVINCE = new AttributeType<>("province");
	/** <i>Generated constant</i> - Attribute key of <code>ExpresslocationsData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpresslocationsData, String> CHANNEL_SOURCE = new AttributeType<>("channel_source");


	/**
	 * <i>Generated method</i> - Getter of the <code>ExpresslocationsData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 渠道来源.
	 * 
	 * @return the channel_source
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getChannel_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpresslocationsData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 业态类别.
	 * 
	 * @return the inner_source
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getInner_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpresslocationsData.province</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 收件人所在省.
	 * 
	 * @return the province
	 */
	@javax.validation.constraints.Size(max=32)
	java.lang.String getProvince();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpresslocationsData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 快递公司代码.
	 * 
	 * @return the express_code
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getExpress_code();
	

	/**
	 * <i>Generated method</i> - Setter of <code>ExpresslocationsData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 渠道来源.
	 *
	 * @param value the channel_source
	 */
	void setChannel_source(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpresslocationsData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 业态类别.
	 *
	 * @param value the inner_source
	 */
	void setInner_source(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpresslocationsData.province</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 收件人所在省.
	 *
	 * @param value the province
	 */
	void setProvince(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpresslocationsData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 快递公司代码.
	 *
	 * @param value the express_code
	 */
	void setExpress_code(final java.lang.String value);
	
}
