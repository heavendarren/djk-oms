

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
* DTO for skuToProductList
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class SkuToProduct extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 517102242L;

	private String id;

	private String channel;

	private String outerId;

	private String itemId;

	private String itemName;

	private int quantity;

	private double ratio;

	private String innerSource;

	private int percent;

	private String lockStatus;

	
	public SkuToProduct(){}

	protected SkuToProduct(Builder builder)
	{
		super(builder); 
		setId(builder.getId());
		setChannel(builder.getChannel());
		setOuterId(builder.getOuterId());
		setItemId(builder.getItemId());
		setItemName(builder.getItemName());
		setQuantity(builder.getQuantity());
		setRatio(builder.getRatio());
		setInnerSource(builder.getInnerSource());
		setPercent(builder.getPercent());
		setLockStatus(builder.getLockStatus());
	
	}


	/**
	* gets 
	*
	* @returns String
	*/
	public String getId()
	{
		return id;
	}

	/**
	* sets 
	*
	*/
	public void setId(String id)
	{
		this.id = id;
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
	public String getItemId()
	{
		return itemId;
	}

	/**
	* sets 
	*
	*/
	public void setItemId(String itemId)
	{
		this.itemId = itemId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getItemName()
	{
		return itemName;
	}

	/**
	* sets 
	*
	*/
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
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

	/**
	* gets 
	*
	* @returns double
	*/
	public double getRatio()
	{
		return ratio;
	}

	/**
	* sets 
	*
	*/
	public void setRatio(double ratio)
	{
		this.ratio = ratio;
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
	* @returns int
	*/
	public int getPercent()
	{
		return percent;
	}

	/**
	* sets 
	*
	*/
	public void setPercent(int percent)
	{
		this.percent = percent;
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
		private String id;
		private String channel;
		private String outerId;
		private String itemId;
		private String itemName;
		private int quantity;
		private double ratio;
		private String innerSource;
		private int percent;
		private String lockStatus;
		
	
		/**
		* sets 
		*
		*/
		public T setId(String id)
		{
			this.id = id;
			return self();
		}

		private String getId()
		{
			return id;
		}
	
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
		public T setItemId(String itemId)
		{
			this.itemId = itemId;
			return self();
		}

		private String getItemId()
		{
			return itemId;
		}
	
		/**
		* sets 
		*
		*/
		public T setItemName(String itemName)
		{
			this.itemName = itemName;
			return self();
		}

		private String getItemName()
		{
			return itemName;
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
	
		/**
		* sets 
		*
		*/
		public T setRatio(double ratio)
		{
			this.ratio = ratio;
			return self();
		}

		private double getRatio()
		{
			return ratio;
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
		public T setPercent(int percent)
		{
			this.percent = percent;
			return self();
		}

		private int getPercent()
		{
			return percent;
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

		public SkuToProduct build(){
			return new SkuToProduct(this);
		}
	}
}

