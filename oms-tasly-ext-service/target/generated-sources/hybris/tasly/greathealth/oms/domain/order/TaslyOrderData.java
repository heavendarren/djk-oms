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

import com.hybris.oms.service.managedobjects.order.OrderData;

    
/**
 * Generated managedobject class for type TaslyOrderData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface TaslyOrderData extends OrderData, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyOrderData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.packing</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.PackingType> PACKING = new AttributeType<>("packing");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.replication_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> REPLICATION_STATUS = new AttributeType<>("replication_status");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.ecc_customer_phone</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ECC_CUSTOMER_PHONE = new AttributeType<>("ecc_customer_phone");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.payment_no</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> PAYMENT_NO = new AttributeType<>("payment_no");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.ecc_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ECC_ORDER_ID = new AttributeType<>("ecc_order_id");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.approve_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.ApproveStatus> APPROVE_STATUS = new AttributeType<>("approve_status");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.confirm_received_time</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, java.util.Date> CONFIRM_RECEIVED_TIME = new AttributeType<>("confirm_received_time");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.nick_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> NICK_NAME = new AttributeType<>("nick_name");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.ecc_bank_number</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ECC_BANK_NUMBER = new AttributeType<>("ecc_bank_number");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.shad_citydistrict</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> SHAD_CITYDISTRICT = new AttributeType<>("shad_citydistrict");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.InnerSource> INNER_SOURCE = new AttributeType<>("inner_source");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.delivery_service</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.DeliveryServiceType> DELIVERY_SERVICE = new AttributeType<>("delivery_service");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.shad_info_update_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.ShadInfoUpdateStatus> SHAD_INFO_UPDATE_STATUS = new AttributeType<>("shad_info_update_status");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.ecc_bank_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ECC_BANK_NAME = new AttributeType<>("ecc_bank_name");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.special_memo</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> SPECIAL_MEMO = new AttributeType<>("special_memo");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.payment_point_amount</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, Double> PAYMENT_POINT_AMOUNT = new AttributeType<>("payment_point_amount");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.special_memo_update_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.SpecialMemoUpdateStatus> SPECIAL_MEMO_UPDATE_STATUS = new AttributeType<>("special_memo_update_status");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.invoice_content</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> INVOICE_CONTENT = new AttributeType<>("invoice_content");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.ChannelSource> CHANNEL_SOURCE = new AttributeType<>("channel_source");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.replication_times</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, Integer> REPLICATION_TIMES = new AttributeType<>("replication_times");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.shad_city</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> SHAD_CITY = new AttributeType<>("shad_city");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.discount_fee</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, Double> DISCOUNT_FEE = new AttributeType<>("discount_fee");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.seller_message</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> SELLER_MESSAGE = new AttributeType<>("seller_message");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.invoice_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> INVOICE_NAME = new AttributeType<>("invoice_name");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.buyer_message</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> BUYER_MESSAGE = new AttributeType<>("buyer_message");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.total_price</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, Double> TOTAL_PRICE = new AttributeType<>("total_price");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.special_memo_reason</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> SPECIAL_MEMO_REASON = new AttributeType<>("special_memo_reason");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.payment</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, Double> PAYMENT = new AttributeType<>("payment");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.ecc_modification_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ECC_MODIFICATION_STATUS = new AttributeType<>("ecc_modification_status");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.ecc_customer_address</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ECC_CUSTOMER_ADDRESS = new AttributeType<>("ecc_customer_address");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.original_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ORIGINAL_ORDER_ID = new AttributeType<>("original_order_id");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.merchant_tag</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> MERCHANT_TAG = new AttributeType<>("merchant_tag");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.invoice_type</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> INVOICE_TYPE = new AttributeType<>("invoice_type");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.order_created_time</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, java.util.Date> ORDER_CREATED_TIME = new AttributeType<>("order_created_time");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.ecc_taxpayer_number</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> ECC_TAXPAYER_NUMBER = new AttributeType<>("ecc_taxpayer_number");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.shipping_lock_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, tasly.greathealth.oms.domain.order.ShippingLockStatus> SHIPPING_LOCK_STATUS = new AttributeType<>("shipping_lock_status");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.shad_mobile</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> SHAD_MOBILE = new AttributeType<>("shad_mobile");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyOrderData.express_memo</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyOrderData, String> EXPRESS_MEMO = new AttributeType<>("express_memo");

	/** <i>Generated constant</i> - Index of <code>TaslyOrderData</code> type defined at extension <code>oms-tasly-ext-order</code>. */
	UniqueIndexSingle<TaslyOrderData, String> UX_ORDERS_ORDERID = new UniqueIndexSingle<>("UX_orders_orderId", TaslyOrderData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.payment</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 实付金额.
	 * 
	 * @return the payment
	 */
	java.lang.Double getPayment();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.order_created_time</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 第三方平台订单创建时间.
	 * 
	 * @return the order_created_time
	 */
	java.util.Date getOrder_created_time();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.merchant_tag</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 商户标记：自营/外租/混合.
	 * 
	 * @return the merchant_tag
	 */
	@javax.validation.constraints.Size(max=1280)
	java.lang.String getMerchant_tag();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.express_memo</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 物流备注.
	 * 
	 * @return the express_memo
	 */
	@javax.validation.constraints.Size(max=1280)
	java.lang.String getExpress_memo();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.packing</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 拨次.
	 * 
	 * @return the packing
	 */
	tasly.greathealth.oms.domain.order.PackingType getPacking();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.nick_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 买家昵称.
	 * 
	 * @return the nick_name
	 */
	@javax.validation.constraints.Size(max=35)
	java.lang.String getNick_name();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.invoice_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 发票抬头.
	 * 
	 * @return the invoice_name
	 */
	@javax.validation.constraints.Size(max=80)
	java.lang.String getInvoice_name();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.invoice_type</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 发票类型.
	 * 
	 * @return the invoice_type
	 */
	@javax.validation.constraints.Size(max=8)
	java.lang.String getInvoice_type();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.invoice_content</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 发票内容.
	 * 
	 * @return the invoice_content
	 */
	@javax.validation.constraints.Size(max=128)
	java.lang.String getInvoice_content();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.delivery_service</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 配送方式.
	 * 
	 * @return the delivery_service
	 */
	tasly.greathealth.oms.domain.order.DeliveryServiceType getDelivery_service();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.discount_fee</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 订单折扣.
	 * 
	 * @return the discount_fee
	 */
	java.lang.Double getDiscount_fee();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.total_price</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 订单总价.
	 * 
	 * @return the total_price
	 */
	java.lang.Double getTotal_price();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.payment_point_amount</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 积分支付额度.
	 * 
	 * @return the payment_point_amount
	 */
	java.lang.Double getPayment_point_amount();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.buyer_message</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 买家说明信息.
	 * 
	 * @return the buyer_message
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getBuyer_message();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.seller_message</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 卖家说明信息.
	 * 
	 * @return the seller_message
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getSeller_message();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.special_memo</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 特殊备注.
	 * 
	 * @return the special_memo
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getSpecial_memo();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.special_memo_reason</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 特殊备注原因.
	 * 
	 * @return the special_memo_reason
	 */
	@javax.validation.constraints.Size(max=1)
	java.lang.String getSpecial_memo_reason();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.confirm_received_time</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 确认收货时间.
	 * 
	 * @return the confirm_received_time
	 */
	java.util.Date getConfirm_received_time();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 渠道来源.
	 * 
	 * @return the channel_source
	 */
	tasly.greathealth.oms.domain.order.ChannelSource getChannel_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 业态.
	 * 
	 * @return the inner_source
	 */
	tasly.greathealth.oms.domain.order.InnerSource getInner_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.shipping_lock_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 发货锁定标记.
	 * 
	 * @return the shipping_lock_status
	 */
	tasly.greathealth.oms.domain.order.ShippingLockStatus getShipping_lock_status();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.shad_city</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 收货人地址：市.
	 * 
	 * @return the shad_city
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getShad_city();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.shad_citydistrict</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 收货人地址：区／县.
	 * 
	 * @return the shad_citydistrict
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getShad_citydistrict();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.shad_info_update_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 订单收货人信息修改状态.
	 * 
	 * @return the shad_info_update_status
	 */
	tasly.greathealth.oms.domain.order.ShadInfoUpdateStatus getShad_info_update_status();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.special_memo_update_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 特殊备注信息修改状态.
	 * 
	 * @return the special_memo_update_status
	 */
	tasly.greathealth.oms.domain.order.SpecialMemoUpdateStatus getSpecial_memo_update_status();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.original_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 商户订单号.
	 * 
	 * @return the original_order_id
	 */
	@javax.validation.constraints.Size(max=35)
	java.lang.String getOriginal_order_id();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.approve_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 审核标示.
	 * 
	 * @return the approve_status
	 */
	tasly.greathealth.oms.domain.order.ApproveStatus getApprove_status();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.payment_no</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 支付交易号.
	 * 
	 * @return the payment_no
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getPayment_no();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.shad_mobile</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 收货人手机号.
	 * 
	 * @return the shad_mobile
	 */
	@javax.validation.constraints.Size(max=64)
	java.lang.String getShad_mobile();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.replication_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * ECC同步订单状态.
	 * 
	 * @return the replication_status
	 */
	@javax.validation.constraints.Size(max=1)
	java.lang.String getReplication_status();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.replication_times</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * ECC同步订单次数.
	 * 
	 * @return the replication_times
	 */
	java.lang.Integer getReplication_times();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.ecc_taxpayer_number</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 专票纳税人登记号.
	 * 
	 * @return the ecc_taxpayer_number
	 */
	@javax.validation.constraints.Size(max=30)
	java.lang.String getEcc_taxpayer_number();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.ecc_bank_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 专票银行名称.
	 * 
	 * @return the ecc_bank_name
	 */
	@javax.validation.constraints.Size(max=80)
	java.lang.String getEcc_bank_name();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.ecc_bank_number</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 专票银行账号.
	 * 
	 * @return the ecc_bank_number
	 */
	@javax.validation.constraints.Size(max=30)
	java.lang.String getEcc_bank_number();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.ecc_customer_address</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 专票客户地址.
	 * 
	 * @return the ecc_customer_address
	 */
	@javax.validation.constraints.Size(max=80)
	java.lang.String getEcc_customer_address();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.ecc_customer_phone</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 专票客户电话.
	 * 
	 * @return the ecc_customer_phone
	 */
	@javax.validation.constraints.Size(max=18)
	java.lang.String getEcc_customer_phone();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.ecc_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * ECC订单ID.
	 * 
	 * @return the ecc_order_id
	 */
	@javax.validation.constraints.Size(max=35)
	java.lang.String getEcc_order_id();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyOrderData.ecc_modification_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * ECC修改订单状态.
	 * 
	 * @return the ecc_modification_status
	 */
	@javax.validation.constraints.Size(max=20)
	java.lang.String getEcc_modification_status();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.payment</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 实付金额.
	 *
	 * @param value the payment
	 */
	void setPayment(final java.lang.Double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.order_created_time</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 第三方平台订单创建时间.
	 *
	 * @param value the order_created_time
	 */
	void setOrder_created_time(final java.util.Date value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.merchant_tag</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 商户标记：自营/外租/混合.
	 *
	 * @param value the merchant_tag
	 */
	void setMerchant_tag(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.express_memo</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 物流备注.
	 *
	 * @param value the express_memo
	 */
	void setExpress_memo(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.packing</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 拨次.
	 *
	 * @param value the packing
	 */
	void setPacking(final tasly.greathealth.oms.domain.order.PackingType value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.nick_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 买家昵称.
	 *
	 * @param value the nick_name
	 */
	void setNick_name(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.invoice_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 发票抬头.
	 *
	 * @param value the invoice_name
	 */
	void setInvoice_name(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.invoice_type</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 发票类型.
	 *
	 * @param value the invoice_type
	 */
	void setInvoice_type(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.invoice_content</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 发票内容.
	 *
	 * @param value the invoice_content
	 */
	void setInvoice_content(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.delivery_service</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 配送方式.
	 *
	 * @param value the delivery_service
	 */
	void setDelivery_service(final tasly.greathealth.oms.domain.order.DeliveryServiceType value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.discount_fee</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 订单折扣.
	 *
	 * @param value the discount_fee
	 */
	void setDiscount_fee(final java.lang.Double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.total_price</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 订单总价.
	 *
	 * @param value the total_price
	 */
	void setTotal_price(final java.lang.Double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.payment_point_amount</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 积分支付额度.
	 *
	 * @param value the payment_point_amount
	 */
	void setPayment_point_amount(final java.lang.Double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.buyer_message</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 买家说明信息.
	 *
	 * @param value the buyer_message
	 */
	void setBuyer_message(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.seller_message</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 卖家说明信息.
	 *
	 * @param value the seller_message
	 */
	void setSeller_message(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.special_memo</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 特殊备注.
	 *
	 * @param value the special_memo
	 */
	void setSpecial_memo(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.special_memo_reason</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 特殊备注原因.
	 *
	 * @param value the special_memo_reason
	 */
	void setSpecial_memo_reason(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.confirm_received_time</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 确认收货时间.
	 *
	 * @param value the confirm_received_time
	 */
	void setConfirm_received_time(final java.util.Date value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 渠道来源.
	 *
	 * @param value the channel_source
	 */
	void setChannel_source(final tasly.greathealth.oms.domain.order.ChannelSource value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 业态.
	 *
	 * @param value the inner_source
	 */
	void setInner_source(final tasly.greathealth.oms.domain.order.InnerSource value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.shipping_lock_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 发货锁定标记.
	 *
	 * @param value the shipping_lock_status
	 */
	void setShipping_lock_status(final tasly.greathealth.oms.domain.order.ShippingLockStatus value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.shad_city</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 收货人地址：市.
	 *
	 * @param value the shad_city
	 */
	void setShad_city(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.shad_citydistrict</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 收货人地址：区／县.
	 *
	 * @param value the shad_citydistrict
	 */
	void setShad_citydistrict(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.shad_info_update_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 订单收货人信息修改状态.
	 *
	 * @param value the shad_info_update_status
	 */
	void setShad_info_update_status(final tasly.greathealth.oms.domain.order.ShadInfoUpdateStatus value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.special_memo_update_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 特殊备注信息修改状态.
	 *
	 * @param value the special_memo_update_status
	 */
	void setSpecial_memo_update_status(final tasly.greathealth.oms.domain.order.SpecialMemoUpdateStatus value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.original_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 商户订单号.
	 *
	 * @param value the original_order_id
	 */
	void setOriginal_order_id(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.approve_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 审核标示.
	 *
	 * @param value the approve_status
	 */
	void setApprove_status(final tasly.greathealth.oms.domain.order.ApproveStatus value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.payment_no</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 支付交易号.
	 *
	 * @param value the payment_no
	 */
	void setPayment_no(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.shad_mobile</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 收货人手机号.
	 *
	 * @param value the shad_mobile
	 */
	void setShad_mobile(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.replication_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * ECC同步订单状态.
	 *
	 * @param value the replication_status
	 */
	void setReplication_status(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.replication_times</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * ECC同步订单次数.
	 *
	 * @param value the replication_times
	 */
	void setReplication_times(final java.lang.Integer value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.ecc_taxpayer_number</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 专票纳税人登记号.
	 *
	 * @param value the ecc_taxpayer_number
	 */
	void setEcc_taxpayer_number(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.ecc_bank_name</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 专票银行名称.
	 *
	 * @param value the ecc_bank_name
	 */
	void setEcc_bank_name(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.ecc_bank_number</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 专票银行账号.
	 *
	 * @param value the ecc_bank_number
	 */
	void setEcc_bank_number(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.ecc_customer_address</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 专票客户地址.
	 *
	 * @param value the ecc_customer_address
	 */
	void setEcc_customer_address(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.ecc_customer_phone</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 专票客户电话.
	 *
	 * @param value the ecc_customer_phone
	 */
	void setEcc_customer_phone(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.ecc_order_id</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * ECC订单ID.
	 *
	 * @param value the ecc_order_id
	 */
	void setEcc_order_id(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyOrderData.ecc_modification_status</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * ECC修改订单状态.
	 *
	 * @param value the ecc_modification_status
	 */
	void setEcc_modification_status(final java.lang.String value);
	
}
