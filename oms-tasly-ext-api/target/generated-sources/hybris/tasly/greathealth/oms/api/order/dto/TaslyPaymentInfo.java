

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
import com.hybris.oms.domain.order.PaymentInfo;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
/**
* Tasly payment info DTO
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TaslyPaymentInfo extends PaymentInfo implements Serializable
{

	public final static long serialVersionUID = -1902368335L;

	private Date issueDate;

	
	public TaslyPaymentInfo(){}

	protected TaslyPaymentInfo(Builder builder)
	{
		super(builder); 
		setIssueDate(builder.getIssueDate());
	
	}


	/**
	* gets 
	*
	* @returns Date
	*/
	public Date getIssueDate()
	{
		return issueDate;
	}

	/**
	* sets 
	*
	*/
	public void setIssueDate(Date issueDate)
	{
		this.issueDate = issueDate;
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

	public abstract static class Builder<T extends Builder<T>> extends PaymentInfo.Builder<T>
	{
		private Date issueDate;
		
	
		/**
		* sets 
		*
		*/
		public T setIssueDate(Date issueDate)
		{
			this.issueDate = issueDate;
			return self();
		}

		private Date getIssueDate()
		{
			return issueDate;
		}
	
		protected abstract T self();

		public TaslyPaymentInfo build(){
			return new TaslyPaymentInfo(this);
		}
	}
}

