

/*
 * [y] hybris Core+ Platform
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

package tasly.greathealth.oms.api.order.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import java.lang.Integer;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.oms.domain.order.Order;
import javax.xml.bind.annotation.XmlElement;
/**
* Tasly Order DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlRootElement(name="taslyOrder")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaslyOrder extends Order implements Serializable
{

	public final static long serialVersionUID = -26028742L;

	private String expressMemo;

	private PackingType packing;

	private String nickName;

	private String invoiceName;

	private String invoiceType;

	private String invoiceContent;

	private DeliveryServiceType deliveryService;

	private Double discountFee;

	private Double totalPrice;

	private Double paymentPointAmount;

	private String buyerMessage;

	private String sellerMessage;

	private String specialMemo;

	private String special_memo_reason;

	private Date confirmReceivedTime;

	private ChannelSource channelSource;

	private InnerSource innerSource;

	private ShippingLockStatus shippingLockStatus;

	private String shadCity;

	private String shadCitydistrict;

	private ShadInfoUpdateStatus shadInfoUpdateStatus;

	private SpecialMemoUpdateStatus specialMemoUpdateStatus;

	private String originalOrderId;

	private ApproveStatus approveStatus;

	private String paymentNo;

	private String shadMobile;

	private String replicationStatus;

	private Integer replicationTimes;

	private String eccTaxpayerNumber;

	private String eccBankName;

	private String eccBankNumber;

	private String eccCustomerAddress;

	private String eccCustomerPhone;

	private String eccOrderId;

	private String eccModificationStatus;

	private String merchantTag;

	private Date orderCreatedTime;

	private Double payment;

	@XmlElement
	private List<TaslyOrderLineQuantity> taslyOrderLineQuantities = new ArrayList();

	
	public TaslyOrder(){}

	protected TaslyOrder(Builder builder)
	{
		super(builder); 
		setExpressMemo(builder.getExpressMemo());
		setPacking(builder.getPacking());
		setNickName(builder.getNickName());
		setInvoiceName(builder.getInvoiceName());
		setInvoiceType(builder.getInvoiceType());
		setInvoiceContent(builder.getInvoiceContent());
		setDeliveryService(builder.getDeliveryService());
		setDiscountFee(builder.getDiscountFee());
		setTotalPrice(builder.getTotalPrice());
		setPaymentPointAmount(builder.getPaymentPointAmount());
		setBuyerMessage(builder.getBuyerMessage());
		setSellerMessage(builder.getSellerMessage());
		setSpecialMemo(builder.getSpecialMemo());
		setSpecial_memo_reason(builder.getSpecial_memo_reason());
		setConfirmReceivedTime(builder.getConfirmReceivedTime());
		setChannelSource(builder.getChannelSource());
		setInnerSource(builder.getInnerSource());
		setShippingLockStatus(builder.getShippingLockStatus());
		setShadCity(builder.getShadCity());
		setShadCitydistrict(builder.getShadCitydistrict());
		setShadInfoUpdateStatus(builder.getShadInfoUpdateStatus());
		setSpecialMemoUpdateStatus(builder.getSpecialMemoUpdateStatus());
		setOriginalOrderId(builder.getOriginalOrderId());
		setApproveStatus(builder.getApproveStatus());
		setPaymentNo(builder.getPaymentNo());
		setShadMobile(builder.getShadMobile());
		setReplicationStatus(builder.getReplicationStatus());
		setReplicationTimes(builder.getReplicationTimes());
		setEccTaxpayerNumber(builder.getEccTaxpayerNumber());
		setEccBankName(builder.getEccBankName());
		setEccBankNumber(builder.getEccBankNumber());
		setEccCustomerAddress(builder.getEccCustomerAddress());
		setEccCustomerPhone(builder.getEccCustomerPhone());
		setEccOrderId(builder.getEccOrderId());
		setEccModificationStatus(builder.getEccModificationStatus());
		setMerchantTag(builder.getMerchantTag());
		setOrderCreatedTime(builder.getOrderCreatedTime());
		setPayment(builder.getPayment());
		setTaslyOrderLineQuantities(builder.getTaslyOrderLineQuantities());
	
	}


	/**
	* gets 
	*
	* @returns String
	*/
	public String getExpressMemo()
	{
		return expressMemo;
	}

	/**
	* sets 
	*
	*/
	public void setExpressMemo(String expressMemo)
	{
		this.expressMemo = expressMemo;
	}

	/**
	* gets 
	*
	* @returns PackingType
	*/
	public PackingType getPacking()
	{
		return packing;
	}

	/**
	* sets 
	*
	*/
	public void setPacking(PackingType packing)
	{
		this.packing = packing;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getNickName()
	{
		return nickName;
	}

	/**
	* sets 
	*
	*/
	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getInvoiceName()
	{
		return invoiceName;
	}

	/**
	* sets 
	*
	*/
	public void setInvoiceName(String invoiceName)
	{
		this.invoiceName = invoiceName;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getInvoiceType()
	{
		return invoiceType;
	}

	/**
	* sets 
	*
	*/
	public void setInvoiceType(String invoiceType)
	{
		this.invoiceType = invoiceType;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getInvoiceContent()
	{
		return invoiceContent;
	}

	/**
	* sets 
	*
	*/
	public void setInvoiceContent(String invoiceContent)
	{
		this.invoiceContent = invoiceContent;
	}

	/**
	* gets 
	*
	* @returns DeliveryServiceType
	*/
	public DeliveryServiceType getDeliveryService()
	{
		return deliveryService;
	}

	/**
	* sets 
	*
	*/
	public void setDeliveryService(DeliveryServiceType deliveryService)
	{
		this.deliveryService = deliveryService;
	}

	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getDiscountFee()
	{
		return discountFee;
	}

	/**
	* sets 
	*
	*/
	public void setDiscountFee(Double discountFee)
	{
		this.discountFee = discountFee;
	}

	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getTotalPrice()
	{
		return totalPrice;
	}

	/**
	* sets 
	*
	*/
	public void setTotalPrice(Double totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getPaymentPointAmount()
	{
		return paymentPointAmount;
	}

	/**
	* sets 
	*
	*/
	public void setPaymentPointAmount(Double paymentPointAmount)
	{
		this.paymentPointAmount = paymentPointAmount;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getBuyerMessage()
	{
		return buyerMessage;
	}

	/**
	* sets 
	*
	*/
	public void setBuyerMessage(String buyerMessage)
	{
		this.buyerMessage = buyerMessage;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSellerMessage()
	{
		return sellerMessage;
	}

	/**
	* sets 
	*
	*/
	public void setSellerMessage(String sellerMessage)
	{
		this.sellerMessage = sellerMessage;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSpecialMemo()
	{
		return specialMemo;
	}

	/**
	* sets 
	*
	*/
	public void setSpecialMemo(String specialMemo)
	{
		this.specialMemo = specialMemo;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSpecial_memo_reason()
	{
		return special_memo_reason;
	}

	/**
	* sets 
	*
	*/
	public void setSpecial_memo_reason(String special_memo_reason)
	{
		this.special_memo_reason = special_memo_reason;
	}

	/**
	* gets 
	*
	* @returns Date
	*/
	public Date getConfirmReceivedTime()
	{
		return confirmReceivedTime;
	}

	/**
	* sets 
	*
	*/
	public void setConfirmReceivedTime(Date confirmReceivedTime)
	{
		this.confirmReceivedTime = confirmReceivedTime;
	}

	/**
	* gets 
	*
	* @returns ChannelSource
	*/
	public ChannelSource getChannelSource()
	{
		return channelSource;
	}

	/**
	* sets 
	*
	*/
	public void setChannelSource(ChannelSource channelSource)
	{
		this.channelSource = channelSource;
	}

	/**
	* gets 
	*
	* @returns InnerSource
	*/
	public InnerSource getInnerSource()
	{
		return innerSource;
	}

	/**
	* sets 
	*
	*/
	public void setInnerSource(InnerSource innerSource)
	{
		this.innerSource = innerSource;
	}

	/**
	* gets 
	*
	* @returns ShippingLockStatus
	*/
	public ShippingLockStatus getShippingLockStatus()
	{
		return shippingLockStatus;
	}

	/**
	* sets 
	*
	*/
	public void setShippingLockStatus(ShippingLockStatus shippingLockStatus)
	{
		this.shippingLockStatus = shippingLockStatus;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getShadCity()
	{
		return shadCity;
	}

	/**
	* sets 
	*
	*/
	public void setShadCity(String shadCity)
	{
		this.shadCity = shadCity;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getShadCitydistrict()
	{
		return shadCitydistrict;
	}

	/**
	* sets 
	*
	*/
	public void setShadCitydistrict(String shadCitydistrict)
	{
		this.shadCitydistrict = shadCitydistrict;
	}

	/**
	* gets 
	*
	* @returns ShadInfoUpdateStatus
	*/
	public ShadInfoUpdateStatus getShadInfoUpdateStatus()
	{
		return shadInfoUpdateStatus;
	}

	/**
	* sets 
	*
	*/
	public void setShadInfoUpdateStatus(ShadInfoUpdateStatus shadInfoUpdateStatus)
	{
		this.shadInfoUpdateStatus = shadInfoUpdateStatus;
	}

	/**
	* gets 
	*
	* @returns SpecialMemoUpdateStatus
	*/
	public SpecialMemoUpdateStatus getSpecialMemoUpdateStatus()
	{
		return specialMemoUpdateStatus;
	}

	/**
	* sets 
	*
	*/
	public void setSpecialMemoUpdateStatus(SpecialMemoUpdateStatus specialMemoUpdateStatus)
	{
		this.specialMemoUpdateStatus = specialMemoUpdateStatus;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOriginalOrderId()
	{
		return originalOrderId;
	}

	/**
	* sets 
	*
	*/
	public void setOriginalOrderId(String originalOrderId)
	{
		this.originalOrderId = originalOrderId;
	}

	/**
	* gets 
	*
	* @returns ApproveStatus
	*/
	public ApproveStatus getApproveStatus()
	{
		return approveStatus;
	}

	/**
	* sets 
	*
	*/
	public void setApproveStatus(ApproveStatus approveStatus)
	{
		this.approveStatus = approveStatus;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getPaymentNo()
	{
		return paymentNo;
	}

	/**
	* sets 
	*
	*/
	public void setPaymentNo(String paymentNo)
	{
		this.paymentNo = paymentNo;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getShadMobile()
	{
		return shadMobile;
	}

	/**
	* sets 
	*
	*/
	public void setShadMobile(String shadMobile)
	{
		this.shadMobile = shadMobile;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getReplicationStatus()
	{
		return replicationStatus;
	}

	/**
	* sets 
	*
	*/
	public void setReplicationStatus(String replicationStatus)
	{
		this.replicationStatus = replicationStatus;
	}

	/**
	* gets 
	*
	* @returns Integer
	*/
	public Integer getReplicationTimes()
	{
		return replicationTimes;
	}

	/**
	* sets 
	*
	*/
	public void setReplicationTimes(Integer replicationTimes)
	{
		this.replicationTimes = replicationTimes;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccTaxpayerNumber()
	{
		return eccTaxpayerNumber;
	}

	/**
	* sets 
	*
	*/
	public void setEccTaxpayerNumber(String eccTaxpayerNumber)
	{
		this.eccTaxpayerNumber = eccTaxpayerNumber;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccBankName()
	{
		return eccBankName;
	}

	/**
	* sets 
	*
	*/
	public void setEccBankName(String eccBankName)
	{
		this.eccBankName = eccBankName;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccBankNumber()
	{
		return eccBankNumber;
	}

	/**
	* sets 
	*
	*/
	public void setEccBankNumber(String eccBankNumber)
	{
		this.eccBankNumber = eccBankNumber;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccCustomerAddress()
	{
		return eccCustomerAddress;
	}

	/**
	* sets 
	*
	*/
	public void setEccCustomerAddress(String eccCustomerAddress)
	{
		this.eccCustomerAddress = eccCustomerAddress;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccCustomerPhone()
	{
		return eccCustomerPhone;
	}

	/**
	* sets 
	*
	*/
	public void setEccCustomerPhone(String eccCustomerPhone)
	{
		this.eccCustomerPhone = eccCustomerPhone;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccOrderId()
	{
		return eccOrderId;
	}

	/**
	* sets 
	*
	*/
	public void setEccOrderId(String eccOrderId)
	{
		this.eccOrderId = eccOrderId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccModificationStatus()
	{
		return eccModificationStatus;
	}

	/**
	* sets 
	*
	*/
	public void setEccModificationStatus(String eccModificationStatus)
	{
		this.eccModificationStatus = eccModificationStatus;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getMerchantTag()
	{
		return merchantTag;
	}

	/**
	* sets 
	*
	*/
	public void setMerchantTag(String merchantTag)
	{
		this.merchantTag = merchantTag;
	}

	/**
	* gets 
	*
	* @returns Date
	*/
	public Date getOrderCreatedTime()
	{
		return orderCreatedTime;
	}

	/**
	* sets 
	*
	*/
	public void setOrderCreatedTime(Date orderCreatedTime)
	{
		this.orderCreatedTime = orderCreatedTime;
	}

	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getPayment()
	{
		return payment;
	}

	/**
	* sets 
	*
	*/
	public void setPayment(Double payment)
	{
		this.payment = payment;
	}

	/**
	* gets 
	*
	* @returns List<TaslyOrderLineQuantity>
	*/
	public List<TaslyOrderLineQuantity> getTaslyOrderLineQuantities()
	{
		return taslyOrderLineQuantities;
	}

	/**
	* sets 
	*
	*/
	public void setTaslyOrderLineQuantities(List<TaslyOrderLineQuantity> taslyOrderLineQuantities)
	{
		this.taslyOrderLineQuantities = taslyOrderLineQuantities;
	}


	@Override
	public String toString()
	{
		return reflectionToString(this, SHORT_PREFIX_STYLE);
	}

	private static class Builder2 extends Builder<Builder2>
	{
		@Override
		protected Builder2 self()
		{
			return this;
		}
	}

	public static Builder<?> builder()
	{
		return new Builder2();
	}

	public abstract static class Builder<T extends Builder<T>> extends Order.Builder<T>
	{
		private String expressMemo;
		private PackingType packing;
		private String nickName;
		private String invoiceName;
		private String invoiceType;
		private String invoiceContent;
		private DeliveryServiceType deliveryService;
		private Double discountFee;
		private Double totalPrice;
		private Double paymentPointAmount;
		private String buyerMessage;
		private String sellerMessage;
		private String specialMemo;
		private String special_memo_reason;
		private Date confirmReceivedTime;
		private ChannelSource channelSource;
		private InnerSource innerSource;
		private ShippingLockStatus shippingLockStatus;
		private String shadCity;
		private String shadCitydistrict;
		private ShadInfoUpdateStatus shadInfoUpdateStatus;
		private SpecialMemoUpdateStatus specialMemoUpdateStatus;
		private String originalOrderId;
		private ApproveStatus approveStatus;
		private String paymentNo;
		private String shadMobile;
		private String replicationStatus;
		private Integer replicationTimes;
		private String eccTaxpayerNumber;
		private String eccBankName;
		private String eccBankNumber;
		private String eccCustomerAddress;
		private String eccCustomerPhone;
		private String eccOrderId;
		private String eccModificationStatus;
		private String merchantTag;
		private Date orderCreatedTime;
		private Double payment;
		private List<TaslyOrderLineQuantity> taslyOrderLineQuantities;
		
	
		/**
		* sets 
		*
		*/
		public T setExpressMemo(String expressMemo)
		{
			this.expressMemo = expressMemo;
			return self();
		}

		private String getExpressMemo()
		{
			return expressMemo;
		}
	
		/**
		* sets 
		*
		*/
		public T setPacking(PackingType packing)
		{
			this.packing = packing;
			return self();
		}

		private PackingType getPacking()
		{
			return packing;
		}
	
		/**
		* sets 
		*
		*/
		public T setNickName(String nickName)
		{
			this.nickName = nickName;
			return self();
		}

		private String getNickName()
		{
			return nickName;
		}
	
		/**
		* sets 
		*
		*/
		public T setInvoiceName(String invoiceName)
		{
			this.invoiceName = invoiceName;
			return self();
		}

		private String getInvoiceName()
		{
			return invoiceName;
		}
	
		/**
		* sets 
		*
		*/
		public T setInvoiceType(String invoiceType)
		{
			this.invoiceType = invoiceType;
			return self();
		}

		private String getInvoiceType()
		{
			return invoiceType;
		}
	
		/**
		* sets 
		*
		*/
		public T setInvoiceContent(String invoiceContent)
		{
			this.invoiceContent = invoiceContent;
			return self();
		}

		private String getInvoiceContent()
		{
			return invoiceContent;
		}
	
		/**
		* sets 
		*
		*/
		public T setDeliveryService(DeliveryServiceType deliveryService)
		{
			this.deliveryService = deliveryService;
			return self();
		}

		private DeliveryServiceType getDeliveryService()
		{
			return deliveryService;
		}
	
		/**
		* sets 
		*
		*/
		public T setDiscountFee(Double discountFee)
		{
			this.discountFee = discountFee;
			return self();
		}

		private Double getDiscountFee()
		{
			return discountFee;
		}
	
		/**
		* sets 
		*
		*/
		public T setTotalPrice(Double totalPrice)
		{
			this.totalPrice = totalPrice;
			return self();
		}

		private Double getTotalPrice()
		{
			return totalPrice;
		}
	
		/**
		* sets 
		*
		*/
		public T setPaymentPointAmount(Double paymentPointAmount)
		{
			this.paymentPointAmount = paymentPointAmount;
			return self();
		}

		private Double getPaymentPointAmount()
		{
			return paymentPointAmount;
		}
	
		/**
		* sets 
		*
		*/
		public T setBuyerMessage(String buyerMessage)
		{
			this.buyerMessage = buyerMessage;
			return self();
		}

		private String getBuyerMessage()
		{
			return buyerMessage;
		}
	
		/**
		* sets 
		*
		*/
		public T setSellerMessage(String sellerMessage)
		{
			this.sellerMessage = sellerMessage;
			return self();
		}

		private String getSellerMessage()
		{
			return sellerMessage;
		}
	
		/**
		* sets 
		*
		*/
		public T setSpecialMemo(String specialMemo)
		{
			this.specialMemo = specialMemo;
			return self();
		}

		private String getSpecialMemo()
		{
			return specialMemo;
		}
	
		/**
		* sets 
		*
		*/
		public T setSpecial_memo_reason(String special_memo_reason)
		{
			this.special_memo_reason = special_memo_reason;
			return self();
		}

		private String getSpecial_memo_reason()
		{
			return special_memo_reason;
		}
	
		/**
		* sets 
		*
		*/
		public T setConfirmReceivedTime(Date confirmReceivedTime)
		{
			this.confirmReceivedTime = confirmReceivedTime;
			return self();
		}

		private Date getConfirmReceivedTime()
		{
			return confirmReceivedTime;
		}
	
		/**
		* sets 
		*
		*/
		public T setChannelSource(ChannelSource channelSource)
		{
			this.channelSource = channelSource;
			return self();
		}

		private ChannelSource getChannelSource()
		{
			return channelSource;
		}
	
		/**
		* sets 
		*
		*/
		public T setInnerSource(InnerSource innerSource)
		{
			this.innerSource = innerSource;
			return self();
		}

		private InnerSource getInnerSource()
		{
			return innerSource;
		}
	
		/**
		* sets 
		*
		*/
		public T setShippingLockStatus(ShippingLockStatus shippingLockStatus)
		{
			this.shippingLockStatus = shippingLockStatus;
			return self();
		}

		private ShippingLockStatus getShippingLockStatus()
		{
			return shippingLockStatus;
		}
	
		/**
		* sets 
		*
		*/
		public T setShadCity(String shadCity)
		{
			this.shadCity = shadCity;
			return self();
		}

		private String getShadCity()
		{
			return shadCity;
		}
	
		/**
		* sets 
		*
		*/
		public T setShadCitydistrict(String shadCitydistrict)
		{
			this.shadCitydistrict = shadCitydistrict;
			return self();
		}

		private String getShadCitydistrict()
		{
			return shadCitydistrict;
		}
	
		/**
		* sets 
		*
		*/
		public T setShadInfoUpdateStatus(ShadInfoUpdateStatus shadInfoUpdateStatus)
		{
			this.shadInfoUpdateStatus = shadInfoUpdateStatus;
			return self();
		}

		private ShadInfoUpdateStatus getShadInfoUpdateStatus()
		{
			return shadInfoUpdateStatus;
		}
	
		/**
		* sets 
		*
		*/
		public T setSpecialMemoUpdateStatus(SpecialMemoUpdateStatus specialMemoUpdateStatus)
		{
			this.specialMemoUpdateStatus = specialMemoUpdateStatus;
			return self();
		}

		private SpecialMemoUpdateStatus getSpecialMemoUpdateStatus()
		{
			return specialMemoUpdateStatus;
		}
	
		/**
		* sets 
		*
		*/
		public T setOriginalOrderId(String originalOrderId)
		{
			this.originalOrderId = originalOrderId;
			return self();
		}

		private String getOriginalOrderId()
		{
			return originalOrderId;
		}
	
		/**
		* sets 
		*
		*/
		public T setApproveStatus(ApproveStatus approveStatus)
		{
			this.approveStatus = approveStatus;
			return self();
		}

		private ApproveStatus getApproveStatus()
		{
			return approveStatus;
		}
	
		/**
		* sets 
		*
		*/
		public T setPaymentNo(String paymentNo)
		{
			this.paymentNo = paymentNo;
			return self();
		}

		private String getPaymentNo()
		{
			return paymentNo;
		}
	
		/**
		* sets 
		*
		*/
		public T setShadMobile(String shadMobile)
		{
			this.shadMobile = shadMobile;
			return self();
		}

		private String getShadMobile()
		{
			return shadMobile;
		}
	
		/**
		* sets 
		*
		*/
		public T setReplicationStatus(String replicationStatus)
		{
			this.replicationStatus = replicationStatus;
			return self();
		}

		private String getReplicationStatus()
		{
			return replicationStatus;
		}
	
		/**
		* sets 
		*
		*/
		public T setReplicationTimes(Integer replicationTimes)
		{
			this.replicationTimes = replicationTimes;
			return self();
		}

		private Integer getReplicationTimes()
		{
			return replicationTimes;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccTaxpayerNumber(String eccTaxpayerNumber)
		{
			this.eccTaxpayerNumber = eccTaxpayerNumber;
			return self();
		}

		private String getEccTaxpayerNumber()
		{
			return eccTaxpayerNumber;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccBankName(String eccBankName)
		{
			this.eccBankName = eccBankName;
			return self();
		}

		private String getEccBankName()
		{
			return eccBankName;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccBankNumber(String eccBankNumber)
		{
			this.eccBankNumber = eccBankNumber;
			return self();
		}

		private String getEccBankNumber()
		{
			return eccBankNumber;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccCustomerAddress(String eccCustomerAddress)
		{
			this.eccCustomerAddress = eccCustomerAddress;
			return self();
		}

		private String getEccCustomerAddress()
		{
			return eccCustomerAddress;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccCustomerPhone(String eccCustomerPhone)
		{
			this.eccCustomerPhone = eccCustomerPhone;
			return self();
		}

		private String getEccCustomerPhone()
		{
			return eccCustomerPhone;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccOrderId(String eccOrderId)
		{
			this.eccOrderId = eccOrderId;
			return self();
		}

		private String getEccOrderId()
		{
			return eccOrderId;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccModificationStatus(String eccModificationStatus)
		{
			this.eccModificationStatus = eccModificationStatus;
			return self();
		}

		private String getEccModificationStatus()
		{
			return eccModificationStatus;
		}
	
		/**
		* sets 
		*
		*/
		public T setMerchantTag(String merchantTag)
		{
			this.merchantTag = merchantTag;
			return self();
		}

		private String getMerchantTag()
		{
			return merchantTag;
		}
	
		/**
		* sets 
		*
		*/
		public T setOrderCreatedTime(Date orderCreatedTime)
		{
			this.orderCreatedTime = orderCreatedTime;
			return self();
		}

		private Date getOrderCreatedTime()
		{
			return orderCreatedTime;
		}
	
		/**
		* sets 
		*
		*/
		public T setPayment(Double payment)
		{
			this.payment = payment;
			return self();
		}

		private Double getPayment()
		{
			return payment;
		}
	
		/**
		* sets 
		*
		*/
		public T setTaslyOrderLineQuantities(List<TaslyOrderLineQuantity> taslyOrderLineQuantities)
		{
			this.taslyOrderLineQuantities = taslyOrderLineQuantities;
			return self();
		}

		private List<TaslyOrderLineQuantity> getTaslyOrderLineQuantities()
		{
			return taslyOrderLineQuantities;
		}
	
		protected abstract T self();

		public TaslyOrder build(){
			return new TaslyOrder(this);
		}
	}
}

