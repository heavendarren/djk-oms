

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

package tasly.greathealth.oms.api.orderstatus.dto;

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
* Message DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Message extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 1864459268L;

	@XmlElement
	private List<Oms_orders> Oms_orders = new ArrayList();

	
	public Message(){}

	protected Message(Builder builder)
	{
		super(builder); 
		setOms_orders(builder.getOms_orders());
	
	}

				
	@Override
	public String getId()
	{
		return null;
	}
						
			

	/**
	* gets 
	*
	* @returns List<Oms_orders>
	*/
	public List<Oms_orders> getOms_orders()
	{
		return Oms_orders;
	}

	/**
	* sets 
	*
	*/
	public void setOms_orders(List<Oms_orders> Oms_orders)
	{
		this.Oms_orders = Oms_orders;
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
		private List<Oms_orders> Oms_orders;
		
	
		/**
		* sets 
		*
		*/
		public T setOms_orders(List<Oms_orders> Oms_orders)
		{
			this.Oms_orders = Oms_orders;
			return self();
		}

		private List<Oms_orders> getOms_orders()
		{
			return Oms_orders;
		}
	
		protected abstract T self();

		public Message build(){
			return new Message(this);
		}
	}
}

