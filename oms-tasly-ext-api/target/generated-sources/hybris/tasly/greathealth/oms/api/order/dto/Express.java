

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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* Express DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Express extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1821259256L;

	@XmlID
	private String code;

	private String name;

	
	public Express(){}

	protected Express(Builder builder)
	{
		super(builder); 
		setCode(builder.getCode());
		setName(builder.getName());
	
	}

				
	@Override
	public String getId()
	{
		return this.code;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getCode()
	{
		return code;
	}

	/**
	* sets 
	*
	*/
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getName()
	{
		return name;
	}

	/**
	* sets 
	*
	*/
	public void setName(String name)
	{
		this.name = name;
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
		private String code;
		private String name;
		
	
		/**
		* sets 
		*
		*/
		public T setCode(String code)
		{
			this.code = code;
			return self();
		}

		private String getCode()
		{
			return code;
		}
	
		/**
		* sets 
		*
		*/
		public T setName(String name)
		{
			this.name = name;
			return self();
		}

		private String getName()
		{
			return name;
		}
	
		protected abstract T self();

		public Express build(){
			return new Express(this);
		}
	}
}

