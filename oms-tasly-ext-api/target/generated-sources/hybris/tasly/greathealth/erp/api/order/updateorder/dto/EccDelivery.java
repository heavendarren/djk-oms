

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
* SHIPTO DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class EccDelivery extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 483776085L;

	@XmlID
	private String eccExpressId;

	private String eccExpressName;

	
	public EccDelivery(){}

	protected EccDelivery(Builder builder)
	{
		super(builder); 
		setEccExpressId(builder.getEccExpressId());
		setEccExpressName(builder.getEccExpressName());
	
	}

				
	@Override
	public String getId()
	{
		return this.eccExpressId;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccExpressId()
	{
		return eccExpressId;
	}

	/**
	* sets 
	*
	*/
	public void setEccExpressId(String eccExpressId)
	{
		this.eccExpressId = eccExpressId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccExpressName()
	{
		return eccExpressName;
	}

	/**
	* sets 
	*
	*/
	public void setEccExpressName(String eccExpressName)
	{
		this.eccExpressName = eccExpressName;
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
		private String eccExpressId;
		private String eccExpressName;
		
	
		/**
		* sets 
		*
		*/
		public T setEccExpressId(String eccExpressId)
		{
			this.eccExpressId = eccExpressId;
			return self();
		}

		private String getEccExpressId()
		{
			return eccExpressId;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccExpressName(String eccExpressName)
		{
			this.eccExpressName = eccExpressName;
			return self();
		}

		private String getEccExpressName()
		{
			return eccExpressName;
		}
	
		protected abstract T self();

		public EccDelivery build(){
			return new EccDelivery(this);
		}
	}
}

