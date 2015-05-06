

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

package tasly.greathealth.oms.api.inventory.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import com.hybris.oms.domain.inventory.Location;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
/**
* StockroomLocation DTO for oms-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class StockroomLocation extends Location implements Serializable
{

	public final static long serialVersionUID = -352975400L;

	private int defaultAllocatePercent;

	
	public StockroomLocation(){}

	protected StockroomLocation(Builder builder)
	{
		super(builder); 
		setDefaultAllocatePercent(builder.getDefaultAllocatePercent());
	
	}


	/**
	* gets 
	*
	* @returns int
	*/
	public int getDefaultAllocatePercent()
	{
		return defaultAllocatePercent;
	}

	/**
	* sets 
	*
	*/
	public void setDefaultAllocatePercent(int defaultAllocatePercent)
	{
		this.defaultAllocatePercent = defaultAllocatePercent;
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

	public abstract static class Builder<T extends Builder<T>> extends Location.Builder<T>
	{
		private int defaultAllocatePercent;
		
	
		/**
		* sets 
		*
		*/
		public T setDefaultAllocatePercent(int defaultAllocatePercent)
		{
			this.defaultAllocatePercent = defaultAllocatePercent;
			return self();
		}

		private int getDefaultAllocatePercent()
		{
			return defaultAllocatePercent;
		}
	
		protected abstract T self();

		public StockroomLocation build(){
			return new StockroomLocation(this);
		}
	}
}

