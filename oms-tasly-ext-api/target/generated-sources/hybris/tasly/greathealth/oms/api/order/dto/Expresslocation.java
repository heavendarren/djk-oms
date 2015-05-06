

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
* Express Location DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Expresslocation extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -977966153L;

	private String province;

	private String channelSource;

	private String innerSource;

	private String expressCode;

	
	public Expresslocation(){}

	protected Expresslocation(Builder builder)
	{
		super(builder); 
		setProvince(builder.getProvince());
		setChannelSource(builder.getChannelSource());
		setInnerSource(builder.getInnerSource());
		setExpressCode(builder.getExpressCode());
	
	}

				
	@Override
	public String getId()
	{
		return this.province+"|"+this.channelSource+"|"+this.innerSource;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getProvince()
	{
		return province;
	}

	/**
	* sets 
	*
	*/
	public void setProvince(String province)
	{
		this.province = province;
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
		private String province;
		private String channelSource;
		private String innerSource;
		private String expressCode;
		
	
		/**
		* sets 
		*
		*/
		public T setProvince(String province)
		{
			this.province = province;
			return self();
		}

		private String getProvince()
		{
			return province;
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
	
		protected abstract T self();

		public Expresslocation build(){
			return new Expresslocation(this);
		}
	}
}

