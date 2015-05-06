

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

package tasly.greathealth.oms.api.job.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* JobTimerShaft DTO for oms-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class JobTimerShaft extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 1042743416L;

	private String channelSource;

	private String innerSource;

	private String event;

	private Date executTime;

	private int intervalTime;

	
	public JobTimerShaft(){}

	protected JobTimerShaft(Builder builder)
	{
		super(builder); 
		setChannelSource(builder.getChannelSource());
		setInnerSource(builder.getInnerSource());
		setEvent(builder.getEvent());
		setExecutTime(builder.getExecutTime());
		setIntervalTime(builder.getIntervalTime());
	
	}

				
	@Override
	public String getId()
	{
		return this.channelSource + "|" + this.innerSource + "|" + this.event;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getChannelSource()
	{
		return channelSource;
	}

	/**
	* sets 
	*
	*/
	public void setChannelSource(String channelSource)
	{
		this.channelSource = channelSource;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getInnerSource()
	{
		return innerSource;
	}

	/**
	* sets 
	*
	*/
	public void setInnerSource(String innerSource)
	{
		this.innerSource = innerSource;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEvent()
	{
		return event;
	}

	/**
	* sets 
	*
	*/
	public void setEvent(String event)
	{
		this.event = event;
	}

	/**
	* gets 
	*
	* @returns Date
	*/
	public Date getExecutTime()
	{
		return executTime;
	}

	/**
	* sets 
	*
	*/
	public void setExecutTime(Date executTime)
	{
		this.executTime = executTime;
	}

	/**
	* gets 
	*
	* @returns int
	*/
	public int getIntervalTime()
	{
		return intervalTime;
	}

	/**
	* sets 
	*
	*/
	public void setIntervalTime(int intervalTime)
	{
		this.intervalTime = intervalTime;
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
		private String channelSource;
		private String innerSource;
		private String event;
		private Date executTime;
		private int intervalTime;
		
	
		/**
		* sets 
		*
		*/
		public T setChannelSource(String channelSource)
		{
			this.channelSource = channelSource;
			return self();
		}

		private String getChannelSource()
		{
			return channelSource;
		}
	
		/**
		* sets 
		*
		*/
		public T setInnerSource(String innerSource)
		{
			this.innerSource = innerSource;
			return self();
		}

		private String getInnerSource()
		{
			return innerSource;
		}
	
		/**
		* sets 
		*
		*/
		public T setEvent(String event)
		{
			this.event = event;
			return self();
		}

		private String getEvent()
		{
			return event;
		}
	
		/**
		* sets 
		*
		*/
		public T setExecutTime(Date executTime)
		{
			this.executTime = executTime;
			return self();
		}

		private Date getExecutTime()
		{
			return executTime;
		}
	
		/**
		* sets 
		*
		*/
		public T setIntervalTime(int intervalTime)
		{
			this.intervalTime = intervalTime;
			return self();
		}

		private int getIntervalTime()
		{
			return intervalTime;
		}
	
		protected abstract T self();

		public JobTimerShaft build(){
			return new JobTimerShaft(this);
		}
	}
}

