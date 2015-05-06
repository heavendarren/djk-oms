

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

package tasly.greathealth.oms.api.financial.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import tasly.greathealth.oms.xml.bind.MapDoubleAdapter;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import java.util.HashMap;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* DTO for Tasly Financial Report
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TaslyFinancialReport extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 664889135L;

	private String originalOrderId;

	@XmlElement(required = false)
	@XmlJavaTypeAdapter(MapDoubleAdapter.class)
	private Map<String, Double> priceMap = new HashMap();

	private double freight;

	private double totalPrice;

	private String endPrice;

	
	public TaslyFinancialReport(){}

	protected TaslyFinancialReport(Builder builder)
	{
		super(builder); 
		setOriginalOrderId(builder.getOriginalOrderId());
		setPriceMap(builder.getPriceMap());
		setFreight(builder.getFreight());
		setTotalPrice(builder.getTotalPrice());
		setEndPrice(builder.getEndPrice());
	
	}

				
	@Override
	public String getId()
	{
		return this.originalOrderId;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOriginalOrderId()
	{
		return originalOrderId;
	}

	/**
	* sets 
	*
	*/
	public void setOriginalOrderId(String originalOrderId)
	{
		this.originalOrderId = originalOrderId;
	}

	/**
	* gets 
	*
	* @returns Map<String, Double>
	*/
	public Map<String, Double> getPriceMap()
	{
		return priceMap;
	}

	/**
	* sets 
	*
	*/
	public void setPriceMap(Map<String, Double> priceMap)
	{
		this.priceMap = priceMap;
	}

	/**
	* gets 
	*
	* @returns double
	*/
	public double getFreight()
	{
		return freight;
	}

	/**
	* sets 
	*
	*/
	public void setFreight(double freight)
	{
		this.freight = freight;
	}

	/**
	* gets 
	*
	* @returns double
	*/
	public double getTotalPrice()
	{
		return totalPrice;
	}

	/**
	* sets 
	*
	*/
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEndPrice()
	{
		return endPrice;
	}

	/**
	* sets 
	*
	*/
	public void setEndPrice(String endPrice)
	{
		this.endPrice = endPrice;
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
		private String originalOrderId;
		private Map<String, Double> priceMap;
		private double freight;
		private double totalPrice;
		private String endPrice;
		
	
		/**
		* sets 
		*
		*/
		public T setOriginalOrderId(String originalOrderId)
		{
			this.originalOrderId = originalOrderId;
			return self();
		}

		private String getOriginalOrderId()
		{
			return originalOrderId;
		}
	
		/**
		* sets 
		*
		*/
		public T setPriceMap(Map<String, Double> priceMap)
		{
			this.priceMap = priceMap;
			return self();
		}

		private Map<String, Double> getPriceMap()
		{
			return priceMap;
		}
	
		/**
		* sets 
		*
		*/
		public T setFreight(double freight)
		{
			this.freight = freight;
			return self();
		}

		private double getFreight()
		{
			return freight;
		}
	
		/**
		* sets 
		*
		*/
		public T setTotalPrice(double totalPrice)
		{
			this.totalPrice = totalPrice;
			return self();
		}

		private double getTotalPrice()
		{
			return totalPrice;
		}
	
		/**
		* sets 
		*
		*/
		public T setEndPrice(String endPrice)
		{
			this.endPrice = endPrice;
			return self();
		}

		private String getEndPrice()
		{
			return endPrice;
		}
	
		protected abstract T self();

		public TaslyFinancialReport build(){
			return new TaslyFinancialReport(this);
		}
	}
}

