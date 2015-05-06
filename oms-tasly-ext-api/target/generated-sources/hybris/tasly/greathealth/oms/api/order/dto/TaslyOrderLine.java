

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


import javax.xml.bind.annotation.XmlAccessorType;
import com.hybris.oms.domain.order.OrderLine;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
/**
* Tasly Order Line DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TaslyOrderLine extends OrderLine implements Serializable
{

	public final static long serialVersionUID = -1532564149L;

	private String thirdPartyOrderlineId;

	private String baseQuantityUnitCode;

	private Double unitDiscountFee;

	private String giftItemFlag;

	private Double refundAmount;

	private String refundStatus;

	private Double orderlinePayment;

	private String refundFlag;

	
	public TaslyOrderLine(){}

	protected TaslyOrderLine(Builder builder)
	{
		super(builder); 
		setThirdPartyOrderlineId(builder.getThirdPartyOrderlineId());
		setBaseQuantityUnitCode(builder.getBaseQuantityUnitCode());
		setUnitDiscountFee(builder.getUnitDiscountFee());
		setGiftItemFlag(builder.getGiftItemFlag());
		setRefundAmount(builder.getRefundAmount());
		setRefundStatus(builder.getRefundStatus());
		setOrderlinePayment(builder.getOrderlinePayment());
		setRefundFlag(builder.getRefundFlag());
	
	}


	/**
	* gets 
	*
	* @returns String
	*/
	public String getThirdPartyOrderlineId()
	{
		return thirdPartyOrderlineId;
	}

	/**
	* sets 
	*
	*/
	public void setThirdPartyOrderlineId(String thirdPartyOrderlineId)
	{
		this.thirdPartyOrderlineId = thirdPartyOrderlineId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getBaseQuantityUnitCode()
	{
		return baseQuantityUnitCode;
	}

	/**
	* sets 
	*
	*/
	public void setBaseQuantityUnitCode(String baseQuantityUnitCode)
	{
		this.baseQuantityUnitCode = baseQuantityUnitCode;
	}

	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getUnitDiscountFee()
	{
		return unitDiscountFee;
	}

	/**
	* sets 
	*
	*/
	public void setUnitDiscountFee(Double unitDiscountFee)
	{
		this.unitDiscountFee = unitDiscountFee;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getGiftItemFlag()
	{
		return giftItemFlag;
	}

	/**
	* sets 
	*
	*/
	public void setGiftItemFlag(String giftItemFlag)
	{
		this.giftItemFlag = giftItemFlag;
	}

	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getRefundAmount()
	{
		return refundAmount;
	}

	/**
	* sets 
	*
	*/
	public void setRefundAmount(Double refundAmount)
	{
		this.refundAmount = refundAmount;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRefundStatus()
	{
		return refundStatus;
	}

	/**
	* sets 
	*
	*/
	public void setRefundStatus(String refundStatus)
	{
		this.refundStatus = refundStatus;
	}

	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getOrderlinePayment()
	{
		return orderlinePayment;
	}

	/**
	* sets 
	*
	*/
	public void setOrderlinePayment(Double orderlinePayment)
	{
		this.orderlinePayment = orderlinePayment;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRefundFlag()
	{
		return refundFlag;
	}

	/**
	* sets 
	*
	*/
	public void setRefundFlag(String refundFlag)
	{
		this.refundFlag = refundFlag;
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

	public abstract static class Builder<T extends Builder<T>> extends OrderLine.Builder<T>
	{
		private String thirdPartyOrderlineId;
		private String baseQuantityUnitCode;
		private Double unitDiscountFee;
		private String giftItemFlag;
		private Double refundAmount;
		private String refundStatus;
		private Double orderlinePayment;
		private String refundFlag;
		
	
		/**
		* sets 
		*
		*/
		public T setThirdPartyOrderlineId(String thirdPartyOrderlineId)
		{
			this.thirdPartyOrderlineId = thirdPartyOrderlineId;
			return self();
		}

		private String getThirdPartyOrderlineId()
		{
			return thirdPartyOrderlineId;
		}
	
		/**
		* sets 
		*
		*/
		public T setBaseQuantityUnitCode(String baseQuantityUnitCode)
		{
			this.baseQuantityUnitCode = baseQuantityUnitCode;
			return self();
		}

		private String getBaseQuantityUnitCode()
		{
			return baseQuantityUnitCode;
		}
	
		/**
		* sets 
		*
		*/
		public T setUnitDiscountFee(Double unitDiscountFee)
		{
			this.unitDiscountFee = unitDiscountFee;
			return self();
		}

		private Double getUnitDiscountFee()
		{
			return unitDiscountFee;
		}
	
		/**
		* sets 
		*
		*/
		public T setGiftItemFlag(String giftItemFlag)
		{
			this.giftItemFlag = giftItemFlag;
			return self();
		}

		private String getGiftItemFlag()
		{
			return giftItemFlag;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefundAmount(Double refundAmount)
		{
			this.refundAmount = refundAmount;
			return self();
		}

		private Double getRefundAmount()
		{
			return refundAmount;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefundStatus(String refundStatus)
		{
			this.refundStatus = refundStatus;
			return self();
		}

		private String getRefundStatus()
		{
			return refundStatus;
		}
	
		/**
		* sets 
		*
		*/
		public T setOrderlinePayment(Double orderlinePayment)
		{
			this.orderlinePayment = orderlinePayment;
			return self();
		}

		private Double getOrderlinePayment()
		{
			return orderlinePayment;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefundFlag(String refundFlag)
		{
			this.refundFlag = refundFlag;
			return self();
		}

		private String getRefundFlag()
		{
			return refundFlag;
		}
	
		protected abstract T self();

		public TaslyOrderLine build(){
			return new TaslyOrderLine(this);
		}
	}
}

