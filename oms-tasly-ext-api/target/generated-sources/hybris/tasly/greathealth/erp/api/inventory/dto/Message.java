

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* Inventory Message DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Message extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 616168633L;

	@XmlElement
	private Inventorys inventorys;

	
	public Message(){}

	protected Message(Builder builder)
	{
		super(builder); 
		setInventorys(builder.getInventorys());
	
	}

				
	@Override
	public String getId()
	{
		return null;
	}
						
			

	/**
	* gets 
	*
	* @returns Inventorys
	*/
	public Inventorys getInventorys()
	{
		return inventorys;
	}

	/**
	* sets 
	*
	*/
	public void setInventorys(Inventorys inventorys)
	{
		this.inventorys = inventorys;
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
		private Inventorys inventorys;
		
	
		/**
		* sets 
		*
		*/
		public T setInventorys(Inventorys inventorys)
		{
			this.inventorys = inventorys;
			return self();
		}

		private Inventorys getInventorys()
		{
			return inventorys;
		}
	
		protected abstract T self();

		public Message build(){
			return new Message(this);
		}
	}
}

