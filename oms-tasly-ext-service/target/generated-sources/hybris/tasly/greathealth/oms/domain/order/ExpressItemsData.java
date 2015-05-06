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
 * Generated managedobject class for type ExpressItemsData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface ExpressItemsData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "ExpressItemsData";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExpressItemsData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpressItemsData, String> CHANNEL_SOURCE = new AttributeType<>("channel_source");
	/** <i>Generated constant</i> - Attribute key of <code>ExpressItemsData.skuid</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpressItemsData, String> SKUID = new AttributeType<>("skuid");
	/** <i>Generated constant</i> - Attribute key of <code>ExpressItemsData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpressItemsData, String> INNER_SOURCE = new AttributeType<>("inner_source");
	/** <i>Generated constant</i> - Attribute key of <code>ExpressItemsData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpressItemsData, String> EXPRESS_CODE = new AttributeType<>("express_code");
	/** <i>Generated constant</i> - Attribute key of <code>ExpressItemsData.status</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<ExpressItemsData, String> STATUS = new AttributeType<>("status");


	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressItemsData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 渠道来源.
	 * 
	 * @return the channel_source
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getChannel_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressItemsData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 业态类别.
	 * 
	 * @return the inner_source
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getInner_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressItemsData.skuid</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 商品sku.
	 * 
	 * @return the skuid
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getSkuid();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressItemsData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 快递公司代码.
	 * 
	 * @return the express_code
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getExpress_code();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExpressItemsData.status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 状态标识.
	 * 
	 * @return the status
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getStatus();
	

	/**
	 * <i>Generated method</i> - Setter of <code>ExpressItemsData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 渠道来源.
	 *
	 * @param value the channel_source
	 */
	void setChannel_source(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpressItemsData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 业态类别.
	 *
	 * @param value the inner_source
	 */
	void setInner_source(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpressItemsData.skuid</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 商品sku.
	 *
	 * @param value the skuid
	 */
	void setSkuid(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpressItemsData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 快递公司代码.
	 *
	 * @param value the express_code
	 */
	void setExpress_code(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExpressItemsData.status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 状态标识.
	 *
	 * @param value the status
	 */
	void setStatus(final java.lang.String value);
	
}
