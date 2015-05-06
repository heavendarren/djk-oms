

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


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* Inventorys DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Inventorys extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1504905468L;

	@XmlElement
	private List<Inventory> inventory = new ArrayList();

	
	public Inventorys(){}

	protected Inventorys(Builder builder)
	{
		super(builder); 
		setInventory(builder.getInventory());
	
	}

				
	@Override
	public String getId()
	{
		return null;
	}
						
			

	/**
	* gets 
	*
	* @returns List<Inventory>
	*/
	public List<Inventory> getInventory()
	{
		return inventory;
	}

	/**
	* sets 
	*
	*/
	public void setInventory(List<Inventory> inventory)
	{
		this.inventory = inventory;
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
		private List<Inventory> inventory;
		
	
		/**
		* sets 
		*
		*/
		public T setInventory(List<Inventory> inventory)
		{
			this.inventory = inventory;
			return self();
		}

		private List<Inventory> getInventory()
		{
			return inventory;
		}
	
		protected abstract T self();

		public Inventorys build(){
			return new Inventorys(this);
		}
	}
}

