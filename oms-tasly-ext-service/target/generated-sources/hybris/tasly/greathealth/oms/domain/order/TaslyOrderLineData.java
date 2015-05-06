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

import com.hybris.oms.service.managedobjects.order.OrderLineData;

    
/**
 * Generated managedobject class for type TaslyOrderLineData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface TaslyOrderLineData extends OrderLineData, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyOrderLineData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.refundflag</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, String> REFUNDFLAG = new AttributeType<>("refundflag");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.refundquantity</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, String> REFUNDQUANTITY = new AttributeType<>("refundquantity");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.orderlinePayment</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, Double> ORDERLINEPAYMENT = new AttributeType<>("orderlinePayment");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.basequantityunitcode</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, String> BASEQUANTITYUNITCODE = new AttributeType<>("basequantityunitcode");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.refundamount</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, Double> REFUNDAMOUNT = new AttributeType<>("refundamount");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.refundstatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, String> REFUNDSTATUS = new AttributeType<>("refundstatus");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.third_party_orderline_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, String> THIRD_PARTY_ORDERLINE_ID = new AttributeType<>("third_party_orderline_id");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.gift_item_flag</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, String> GIFT_ITEM_FLAG = new AttributeType<>("gift_item_flag");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderLineData.unit_discount_fee</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderLineData, Double> UNIT_DISCOUNT_FEE = new AttributeType<>("unit_discount_fee");

	/** <i>Generated constant</i> - Index of <code>TaslyOrderLineData</code> type defined at extension <code>oms-tasly-ext-order</code>. */
	UniqueIndexDiadic<TaslyOrderLineData, com.hybris.oms.service.managedobjects.order.OrderData, String> UQ_ORDER_ORDERLINEID = new UniqueIndexDiadic<>("UQ_Order_OrderLineId", TaslyOrderLineData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.third_party_orderline_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 淘宝订单行项目ID.
	 * 
	 * @return the third_party_orderline_id
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getThird_party_orderline_id();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.basequantityunitcode</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 单位.
	 * 
	 * @return the basequantityunitcode
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getBasequantityunitcode();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.unit_discount_fee</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 单品折扣价格.
	 * 
	 * @return the unit_discount_fee
	 */
	java.lang.Double getUnit_discount_fee();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.gift_item_flag</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 单品折扣价格.
	 * 
	 * @return the gift_item_flag
	 */
	@javax.validation.constraints.Size(max=1)
	java.lang.String getGift_item_flag();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.refundamount</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 退款金额.
	 * 
	 * @return the refundamount
	 */
	java.lang.Double getRefundamount();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.refundquantity</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 退款数量.
	 * 
	 * @return the refundquantity
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getRefundquantity();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.refundstatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 退款、退货状态.
	 * 
	 * @return the refundstatus
	 */
	@javax.validation.constraints.Size(max=128)
	java.lang.String getRefundstatus();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.orderlinePayment</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 子订单实付金额.
	 * 
	 * @return the orderlinePayment
	 */
	java.lang.Double getOrderlinePayment();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderLineData.refundflag</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 退款标志.
	 * 
	 * @return the refundflag
	 */
	@javax.validation.constraints.Size(max=15)
	java.lang.String getRefundflag();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.third_party_orderline_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 淘宝订单行项目ID.
	 *
	 * @param value the third_party_orderline_id
	 */
	void setThird_party_orderline_id(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.basequantityunitcode</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 单位.
	 *
	 * @param value the basequantityunitcode
	 */
	void setBasequantityunitcode(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.unit_discount_fee</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 单品折扣价格.
	 *
	 * @param value the unit_discount_fee
	 */
	void setUnit_discount_fee(final java.lang.Double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.gift_item_flag</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 单品折扣价格.
	 *
	 * @param value the gift_item_flag
	 */
	void setGift_item_flag(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.refundamount</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 退款金额.
	 *
	 * @param value the refundamount
	 */
	void setRefundamount(final java.lang.Double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.refundquantity</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 退款数量.
	 *
	 * @param value the refundquantity
	 */
	void setRefundquantity(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.refundstatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 退款、退货状态.
	 *
	 * @param value the refundstatus
	 */
	void setRefundstatus(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.orderlinePayment</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 子订单实付金额.
	 *
	 * @param value the orderlinePayment
	 */
	void setOrderlinePayment(final java.lang.Double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderLineData.refundflag</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 退款标志.
	 *
	 * @param value the refundflag
	 */
	void setRefundflag(final java.lang.String value);
	
}
