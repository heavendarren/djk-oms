

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
* Orders DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Oms_orders extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1481828417L;

	@XmlElement
	private List<Oms_order> Oms_order = new ArrayList();

	
	public Oms_orders(){}

	protected Oms_orders(Builder builder)
	{
		super(builder); 
		setOms_order(builder.getOms_order());
	
	}

				
	@Override
	public String getId()
	{
		return null;
	}
						
			

	/**
	* gets 
	*
	* @returns List<Oms_order>
	*/
	public List<Oms_order> getOms_order()
	{
		return Oms_order;
	}

	/**
	* sets 
	*
	*/
	public void setOms_order(List<Oms_order> Oms_order)
	{
		this.Oms_order = Oms_order;
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
		private List<Oms_order> Oms_order;
		
	
		/**
		* sets 
		*
		*/
		public T setOms_order(List<Oms_order> Oms_order)
		{
			this.Oms_order = Oms_order;
			return self();
		}

		private List<Oms_order> getOms_order()
		{
			return Oms_order;
		}
	
		protected abstract T self();

		public Oms_orders build(){
			return new Oms_orders(this);
		}
	}
}

