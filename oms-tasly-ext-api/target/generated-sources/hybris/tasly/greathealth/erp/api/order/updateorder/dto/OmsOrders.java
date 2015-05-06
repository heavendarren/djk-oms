

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

package tasly.greathealth.erp.api.order.updateorder.dto;

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
* OMSORDERS DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class OmsOrders extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -616524892L;

	@XmlElement
	private List<OmsOrder> omsOrder = new ArrayList();

	
	public OmsOrders(){}

	protected OmsOrders(Builder builder)
	{
		super(builder); 
		setOmsOrder(builder.getOmsOrder());
	
	}

				
	@Override
	public String getId()
	{
		return null;
	}
						
			

	/**
	* gets 
	*
	* @returns List<OmsOrder>
	*/
	public List<OmsOrder> getOmsOrder()
	{
		return omsOrder;
	}

	/**
	* sets 
	*
	*/
	public void setOmsOrder(List<OmsOrder> omsOrder)
	{
		this.omsOrder = omsOrder;
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
		private List<OmsOrder> omsOrder;
		
	
		/**
		* sets 
		*
		*/
		public T setOmsOrder(List<OmsOrder> omsOrder)
		{
			this.omsOrder = omsOrder;
			return self();
		}

		private List<OmsOrder> getOmsOrder()
		{
			return omsOrder;
		}
	
		protected abstract T self();

		public OmsOrders build(){
			return new OmsOrders(this);
		}
	}
}

