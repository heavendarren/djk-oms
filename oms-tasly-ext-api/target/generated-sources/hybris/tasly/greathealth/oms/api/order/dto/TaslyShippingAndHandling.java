

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
import com.hybris.oms.domain.shipping.ShippingAndHandling;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
/**
* Tasly Shipping And Handling DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TaslyShippingAndHandling extends ShippingAndHandling implements Serializable
{

	public final static long serialVersionUID = 180753402L;

	private Double shpr_insurance;

	
	public TaslyShippingAndHandling(){}

	protected TaslyShippingAndHandling(Builder builder)
	{
		super(builder); 
		setShpr_insurance(builder.getShpr_insurance());
	
	}


	/**
	* gets 
	*
	* @returns Double
	*/
	public Double getShpr_insurance()
	{
		return shpr_insurance;
	}

	/**
	* sets 
	*
	*/
	public void setShpr_insurance(Double shpr_insurance)
	{
		this.shpr_insurance = shpr_insurance;
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

	public abstract static class Builder<T extends Builder<T>> extends ShippingAndHandling.Builder<T>
	{
		private Double shpr_insurance;
		
	
		/**
		* sets 
		*
		*/
		public T setShpr_insurance(Double shpr_insurance)
		{
			this.shpr_insurance = shpr_insurance;
			return self();
		}

		private Double getShpr_insurance()
		{
			return shpr_insurance;
		}
	
		protected abstract T self();

		public TaslyShippingAndHandling build(){
			return new TaslyShippingAndHandling(this);
		}
	}
}

