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

import com.hybris.oms.service.managedobjects.order.OrderLineQuantityData;

    
/**
 * Generated managedobject class for type TaslyOrderLineQuantityData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface TaslyOrderLineQuantityData extends OrderLineQuantityData, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyOrderLineQuantityData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineQuantityData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineQuantityData, String> EXPRESS_CODE = new AttributeType<>("express_code");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineQuantityData.express_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineQuantityData, String> EXPRESS_ORDER_ID = new AttributeType<>("express_order_id");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineQuantityData.refundstatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineQuantityData, String> REFUNDSTATUS = new AttributeType<>("refundstatus");

	/** <i>Generated constant</i> - Index of <code>TaslyOrderLineQuantityData</code> type defined at extension <code>oms-tasly-ext-order</code>. */
	UniqueIndexSingle<TaslyOrderLineQuantityData, Long> UX_ORDERLINEQUANTITIES_OLQID = new UniqueIndexSingle<>("UX_orderLineQuantities_olqId", TaslyOrderLineQuantityData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineQuantityData.express_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 快递运单号.
	 * 
	 * @return the express_order_id
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getExpress_order_id();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineQuantityData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 快递公司代码.
	 * 
	 * @return the express_code
	 */
	@javax.validation.constraints.Size(max=10)
	java.lang.String getExpress_code();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineQuantityData.refundstatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 退款、退货状态.
	 * 
	 * @return the refundstatus
	 */
	@javax.validation.constraints.Size(max=128)
	java.lang.String getRefundstatus();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineQuantityData.express_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 快递运单号.
	 *
	 * @param value the express_order_id
	 */
	void setExpress_order_id(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineQuantityData.express_code</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 快递公司代码.
	 *
	 * @param value the express_code
	 */
	void setExpress_code(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineQuantityData.refundstatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 退款、退货状态.
	 *
	 * @param value the refundstatus
	 */
	void setRefundstatus(final java.lang.String value);
	
}
