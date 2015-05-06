

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

package com.hybris.oms.domain.types;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

import com.hybris.oms.domain.ValueType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
/**
* Represents a Measure with unit code and value.
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlRootElement
public class Measure  implements Serializable, ValueType<Measure>
{

	public final static long serialVersionUID = 2030684562L;

	private String unitCode;

	private float value;

	
	public Measure(){}

	protected Measure(Builder builder)
	{
	
		setUnitCode(builder.getUnitCode());
		setValue(builder.getValue());
	
	}


	public Measure(final String unitCode, final float value)
	{
		this.unitCode = unitCode;
		this.value = value;
	}

    		

	/**
	* gets 
	*
	* @returns String
	*/
	public String getUnitCode()
	{
		return unitCode;
	}

	/**
	* sets 
	*
	*/
	public void setUnitCode(String unitCode)
	{
		this.unitCode = unitCode;
	}

	/**
	* gets 
	*
	* @returns float
	*/
	public float getValue()
	{
		return value;
	}

	/**
	* sets 
	*
	*/
	public void setValue(float value)
	{
		this.value = value;
	}


	@Override
	public int hashCode()
	{
		return new HashCodeBuilder()
				.append(unitCode)
				.append(value)
			.toHashCode();
	}

	@Override
	public boolean equals(final Object obj)
	{
		if(obj instanceof Measure){
			final Measure other = (Measure) obj;
			return new EqualsBuilder()
				.append(unitCode, other.unitCode)
				.append(value, other.value)
			.isEquals();
		} else{
			return false;
		}
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

	public abstract static class Builder<T extends Builder<T>> 
	{
		private String unitCode;
		private float value;
		
	
		/**
		* sets 
		*
		*/
		public T setUnitCode(String unitCode)
		{
			this.unitCode = unitCode;
			return self();
		}

		private String getUnitCode()
		{
			return unitCode;
		}
	
		/**
		* sets 
		*
		*/
		public T setValue(float value)
		{
			this.value = value;
			return self();
		}

		private float getValue()
		{
			return value;
		}
	
		protected abstract T self();

		public Measure build(){
			return new Measure(this);
		}
	}
}

