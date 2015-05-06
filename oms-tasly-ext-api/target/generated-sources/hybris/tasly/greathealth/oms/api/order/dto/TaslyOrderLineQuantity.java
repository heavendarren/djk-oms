

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.oms.domain.order.OrderLineQuantity;
/**
* Tasly Order Line Quantity DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TaslyOrderLineQuantity extends OrderLineQuantity implements Serializable
{

	public final static long serialVersionUID = 448074085L;

	private String expressName;

	private String expressOrderId;

	private String expressCode;

	private String refundStatus;

	
	public TaslyOrderLineQuantity(){}

	protected TaslyOrderLineQuantity(Builder builder)
	{
		super(builder); 
		setExpressName(builder.getExpressName());
		setExpressOrderId(builder.getExpressOrderId());
		setExpressCode(builder.getExpressCode());
		setRefundStatus(builder.getRefundStatus());
	
	}


	/**
	* gets 
	*
	* @returns String
	*/
	public String getExpressName()
	{
		return expressName;
	}

	/**
	* sets 
	*
	*/
	public void setExpressName(String expressName)
	{
		this.expressName = expressName;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getExpressOrderId()
	{
		return expressOrderId;
	}

	/**
	* sets 
	*
	*/
	public void setExpressOrderId(String expressOrderId)
	{
		this.expressOrderId = expressOrderId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getExpressCode()
	{
		return expressCode;
	}

	/**
	* sets 
	*
	*/
	public void setExpressCode(String expressCode)
	{
		this.expressCode = expressCode;
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

	public abstract static class Builder<T extends Builder<T>> extends OrderLineQuantity.Builder<T>
	{
		private String expressName;
		private String expressOrderId;
		private String expressCode;
		private String refundStatus;
		
	
		/**
		* sets 
		*
		*/
		public T setExpressName(String expressName)
		{
			this.expressName = expressName;
			return self();
		}

		private String getExpressName()
		{
			return expressName;
		}
	
		/**
		* sets 
		*
		*/
		public T setExpressOrderId(String expressOrderId)
		{
			this.expressOrderId = expressOrderId;
			return self();
		}

		private String getExpressOrderId()
		{
			return expressOrderId;
		}
	
		/**
		* sets 
		*
		*/
		public T setExpressCode(String expressCode)
		{
			this.expressCode = expressCode;
			return self();
		}

		private String getExpressCode()
		{
			return expressCode;
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
	
		protected abstract T self();

		public TaslyOrderLineQuantity build(){
			return new TaslyOrderLineQuantity(this);
		}
	}
}

