

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

package tasly.greathealth.erp.api.inventory.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* Inventory DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Inventory extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -2096602795L;

	@XmlID
	private String skuId;

	private String unit;

	private int quantity;

	
	public Inventory(){}

	protected Inventory(Builder builder)
	{
		super(builder); 
		setSkuId(builder.getSkuId());
		setUnit(builder.getUnit());
		setQuantity(builder.getQuantity());
	
	}

				
	@Override
	public String getId()
	{
		return this.skuId;
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
	public String getUnit()
	{
		return unit;
	}

	/**
	* sets 
	*
	*/
	public void setUnit(String unit)
	{
		this.unit = unit;
	}

	/**
	* gets 
	*
	* @returns int
	*/
	public int getQuantity()
	{
		return quantity;
	}

	/**
	* sets 
	*
	*/
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
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
		private String skuId;
		private String unit;
		private int quantity;
		
	
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
		public T setUnit(String unit)
		{
			this.unit = unit;
			return self();
		}

		private String getUnit()
		{
			return unit;
		}
	
		/**
		* sets 
		*
		*/
		public T setQuantity(int quantity)
		{
			this.quantity = quantity;
			return self();
		}

		private int getQuantity()
		{
			return quantity;
		}
	
		protected abstract T self();

		public Inventory build(){
			return new Inventory(this);
		}
	}
}

