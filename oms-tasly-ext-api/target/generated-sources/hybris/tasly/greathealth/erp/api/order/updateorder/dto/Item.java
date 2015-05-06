

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

package tasly.greathealth.erp.api.order.updateorder.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* ITEM DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Item extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -561357802L;

	@XmlID
	private String refundOmsItemId;

	private String refundType;

	private String refundQuantity;

	private double refundAmount;

	
	public Item(){}

	protected Item(Builder builder)
	{
		super(builder); 
		setRefundOmsItemId(builder.getRefundOmsItemId());
		setRefundType(builder.getRefundType());
		setRefundQuantity(builder.getRefundQuantity());
		setRefundAmount(builder.getRefundAmount());
	
	}

				
	@Override
	public String getId()
	{
		return this.refundOmsItemId;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRefundOmsItemId()
	{
		return refundOmsItemId;
	}

	/**
	* sets 
	*
	*/
	public void setRefundOmsItemId(String refundOmsItemId)
	{
		this.refundOmsItemId = refundOmsItemId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRefundType()
	{
		return refundType;
	}

	/**
	* sets 
	*
	*/
	public void setRefundType(String refundType)
	{
		this.refundType = refundType;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRefundQuantity()
	{
		return refundQuantity;
	}

	/**
	* sets 
	*
	*/
	public void setRefundQuantity(String refundQuantity)
	{
		this.refundQuantity = refundQuantity;
	}

	/**
	* gets 
	*
	* @returns double
	*/
	public double getRefundAmount()
	{
		return refundAmount;
	}

	/**
	* sets 
	*
	*/
	public void setRefundAmount(double refundAmount)
	{
		this.refundAmount = refundAmount;
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
		private String refundOmsItemId;
		private String refundType;
		private String refundQuantity;
		private double refundAmount;
		
	
		/**
		* sets 
		*
		*/
		public T setRefundOmsItemId(String refundOmsItemId)
		{
			this.refundOmsItemId = refundOmsItemId;
			return self();
		}

		private String getRefundOmsItemId()
		{
			return refundOmsItemId;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefundType(String refundType)
		{
			this.refundType = refundType;
			return self();
		}

		private String getRefundType()
		{
			return refundType;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefundQuantity(String refundQuantity)
		{
			this.refundQuantity = refundQuantity;
			return self();
		}

		private String getRefundQuantity()
		{
			return refundQuantity;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefundAmount(double refundAmount)
		{
			this.refundAmount = refundAmount;
			return self();
		}

		private double getRefundAmount()
		{
			return refundAmount;
		}
	
		protected abstract T self();

		public Item build(){
			return new Item(this);
		}
	}
}

