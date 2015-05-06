

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
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* DTO for UIskuToProduct
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UISkuToProduct extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1651519047L;

	private String channel;

	private String outerId;

	private String innerSource;

	private String lockStatus;

	
	public UISkuToProduct(){}

	protected UISkuToProduct(Builder builder)
	{
		super(builder); 
		setChannel(builder.getChannel());
		setOuterId(builder.getOuterId());
		setInnerSource(builder.getInnerSource());
		setLockStatus(builder.getLockStatus());
	
	}

				
				@Override
				public String getId()
				{
					return this.outerId;
				}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getChannel()
	{
		return channel;
	}

	/**
	* sets 
	*
	*/
	public void setChannel(String channel)
	{
		this.channel = channel;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOuterId()
	{
		return outerId;
	}

	/**
	* sets 
	*
	*/
	public void setOuterId(String outerId)
	{
		this.outerId = outerId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getInnerSource()
	{
		return innerSource;
	}

	/**
	* sets 
	*
	*/
	public void setInnerSource(String innerSource)
	{
		this.innerSource = innerSource;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getLockStatus()
	{
		return lockStatus;
	}

	/**
	* sets 
	*
	*/
	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
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
		private String channel;
		private String outerId;
		private String innerSource;
		private String lockStatus;
		
	
		/**
		* sets 
		*
		*/
		public T setChannel(String channel)
		{
			this.channel = channel;
			return self();
		}

		private String getChannel()
		{
			return channel;
		}
	
		/**
		* sets 
		*
		*/
		public T setOuterId(String outerId)
		{
			this.outerId = outerId;
			return self();
		}

		private String getOuterId()
		{
			return outerId;
		}
	
		/**
		* sets 
		*
		*/
		public T setInnerSource(String innerSource)
		{
			this.innerSource = innerSource;
			return self();
		}

		private String getInnerSource()
		{
			return innerSource;
		}
	
		/**
		* sets 
		*
		*/
		public T setLockStatus(String lockStatus)
		{
			this.lockStatus = lockStatus;
			return self();
		}

		private String getLockStatus()
		{
			return lockStatus;
		}
	
		protected abstract T self();

		public UISkuToProduct build(){
			return new UISkuToProduct(this);
		}
	}
}

