

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

package tasly.greathealth.erp.api.order.updatedelivery.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* deliveryinfo DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class EccDelivery extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1109604098L;

	@XmlID
	private String omsOrderId;

	private String omsLineId;

	private String skuId;

	private String skuQuantity;

	private String forwardId;

	private String deliveryNumber;

	
	public EccDelivery(){}

	protected EccDelivery(Builder builder)
	{
		super(builder); 
		setOmsOrderId(builder.getOmsOrderId());
		setOmsLineId(builder.getOmsLineId());
		setSkuId(builder.getSkuId());
		setSkuQuantity(builder.getSkuQuantity());
		setForwardId(builder.getForwardId());
		setDeliveryNumber(builder.getDeliveryNumber());
	
	}

				
	@Override
	public String getId()
	{
		return this.omsOrderId;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOmsOrderId()
	{
		return omsOrderId;
	}

	/**
	* sets 
	*
	*/
	public void setOmsOrderId(String omsOrderId)
	{
		this.omsOrderId = omsOrderId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOmsLineId()
	{
		return omsLineId;
	}

	/**
	* sets 
	*
	*/
	public void setOmsLineId(String omsLineId)
	{
		this.omsLineId = omsLineId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSkuId()
	{
		return skuId;
	}

	/**
	* sets 
	*
	*/
	public void setSkuId(String skuId)
	{
		this.skuId = skuId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSkuQuantity()
	{
		return skuQuantity;
	}

	/**
	* sets 
	*
	*/
	public void setSkuQuantity(String skuQuantity)
	{
		this.skuQuantity = skuQuantity;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getForwardId()
	{
		return forwardId;
	}

	/**
	* sets 
	*
	*/
	public void setForwardId(String forwardId)
	{
		this.forwardId = forwardId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getDeliveryNumber()
	{
		return deliveryNumber;
	}

	/**
	* sets 
	*
	*/
	public void setDeliveryNumber(String deliveryNumber)
	{
		this.deliveryNumber = deliveryNumber;
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

	public abstract static class Builder<T extends Builder<T>> extends PropertyAwareEntityDto.Builder<T>
	{
		private String omsOrderId;
		private String omsLineId;
		private String skuId;
		private String skuQuantity;
		private String forwardId;
		private String deliveryNumber;
		
	
		/**
		* sets 
		*
		*/
		public T setOmsOrderId(String omsOrderId)
		{
			this.omsOrderId = omsOrderId;
			return self();
		}

		private String getOmsOrderId()
		{
			return omsOrderId;
		}
	
		/**
		* sets 
		*
		*/
		public T setOmsLineId(String omsLineId)
		{
			this.omsLineId = omsLineId;
			return self();
		}

		private String getOmsLineId()
		{
			return omsLineId;
		}
	
		/**
		* sets 
		*
		*/
		public T setSkuId(String skuId)
		{
			this.skuId = skuId;
			return self();
		}

		private String getSkuId()
		{
			return skuId;
		}
	
		/**
		* sets 
		*
		*/
		public T setSkuQuantity(String skuQuantity)
		{
			this.skuQuantity = skuQuantity;
			return self();
		}

		private String getSkuQuantity()
		{
			return skuQuantity;
		}
	
		/**
		* sets 
		*
		*/
		public T setForwardId(String forwardId)
		{
			this.forwardId = forwardId;
			return self();
		}

		private String getForwardId()
		{
			return forwardId;
		}
	
		/**
		* sets 
		*
		*/
		public T setDeliveryNumber(String deliveryNumber)
		{
			this.deliveryNumber = deliveryNumber;
			return self();
		}

		private String getDeliveryNumber()
		{
			return deliveryNumber;
		}
	
		protected abstract T self();

		public EccDelivery build(){
			return new EccDelivery(this);
		}
	}
}

