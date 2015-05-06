

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
* Express item DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ExpressItem extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 558388032L;

	private String skuid;

	private String channelSource;

	private String innerSource;

	private String expressCode;

	private String status;

	
	public ExpressItem(){}

	protected ExpressItem(Builder builder)
	{
		super(builder); 
		setSkuid(builder.getSkuid());
		setChannelSource(builder.getChannelSource());
		setInnerSource(builder.getInnerSource());
		setExpressCode(builder.getExpressCode());
		setStatus(builder.getStatus());
	
	}

				
	@Override
	public String getId()
	{
		return this.skuid+"|"+this.channelSource+"|"+this.innerSource;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSkuid()
	{
		return skuid;
	}

	/**
	* sets 
	*
	*/
	public void setSkuid(String skuid)
	{
		this.skuid = skuid;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getChannelSource()
	{
		return channelSource;
	}

	/**
	* sets 
	*
	*/
	public void setChannelSource(String channelSource)
	{
		this.channelSource = channelSource;
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
	public String getStatus()
	{
		return status;
	}

	/**
	* sets 
	*
	*/
	public void setStatus(String status)
	{
		this.status = status;
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
		private String skuid;
		private String channelSource;
		private String innerSource;
		private String expressCode;
		private String status;
		
	
		/**
		* sets 
		*
		*/
		public T setSkuid(String skuid)
		{
			this.skuid = skuid;
			return self();
		}

		private String getSkuid()
		{
			return skuid;
		}
	
		/**
		* sets 
		*
		*/
		public T setChannelSource(String channelSource)
		{
			this.channelSource = channelSource;
			return self();
		}

		private String getChannelSource()
		{
			return channelSource;
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
		public T setStatus(String status)
		{
			this.status = status;
			return self();
		}

		private String getStatus()
		{
			return status;
		}
	
		protected abstract T self();

		public ExpressItem build(){
			return new ExpressItem(this);
		}
	}
}

