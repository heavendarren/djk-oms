

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* DTO for Pending Orders
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class PendingOrder extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1952113568L;

	private String tid;

	private String oid;

	private double refundFee;

	private EventType eventType;

	private String errorMsg;

	private OrderState state;

	private String rawMsg;

	private InnerSource innerSource;

	private ChannelSource channelSource;

	
	public PendingOrder(){}

	protected PendingOrder(Builder builder)
	{
		super(builder); 
		setTid(builder.getTid());
		setOid(builder.getOid());
		setRefundFee(builder.getRefundFee());
		setEventType(builder.getEventType());
		setErrorMsg(builder.getErrorMsg());
		setState(builder.getState());
		setRawMsg(builder.getRawMsg());
		setInnerSource(builder.getInnerSource());
		setChannelSource(builder.getChannelSource());
	
	}

				
	@Override
	public String getId()
	{
		return this.tid + "|" + this.oid + "|" + this.eventType.toString();
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getTid()
	{
		return tid;
	}

	/**
	* sets 
	*
	*/
	public void setTid(String tid)
	{
		this.tid = tid;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOid()
	{
		return oid;
	}

	/**
	* sets 
	*
	*/
	public void setOid(String oid)
	{
		this.oid = oid;
	}

	/**
	* gets 
	*
	* @returns double
	*/
	public double getRefundFee()
	{
		return refundFee;
	}

	/**
	* sets 
	*
	*/
	public void setRefundFee(double refundFee)
	{
		this.refundFee = refundFee;
	}

	/**
	* gets 
	*
	* @returns EventType
	*/
	public EventType getEventType()
	{
		return eventType;
	}

	/**
	* sets 
	*
	*/
	public void setEventType(EventType eventType)
	{
		this.eventType = eventType;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getErrorMsg()
	{
		return errorMsg;
	}

	/**
	* sets 
	*
	*/
	public void setErrorMsg(String errorMsg)
	{
		this.errorMsg = errorMsg;
	}

	/**
	* gets 
	*
	* @returns OrderState
	*/
	public OrderState getState()
	{
		return state;
	}

	/**
	* sets 
	*
	*/
	public void setState(OrderState state)
	{
		this.state = state;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRawMsg()
	{
		return rawMsg;
	}

	/**
	* sets 
	*
	*/
	public void setRawMsg(String rawMsg)
	{
		this.rawMsg = rawMsg;
	}

	/**
	* gets 
	*
	* @returns InnerSource
	*/
	public InnerSource getInnerSource()
	{
		return innerSource;
	}

	/**
	* sets 
	*
	*/
	public void setInnerSource(InnerSource innerSource)
	{
		this.innerSource = innerSource;
	}

	/**
	* gets 
	*
	* @returns ChannelSource
	*/
	public ChannelSource getChannelSource()
	{
		return channelSource;
	}

	/**
	* sets 
	*
	*/
	public void setChannelSource(ChannelSource channelSource)
	{
		this.channelSource = channelSource;
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
		private String tid;
		private String oid;
		private double refundFee;
		private EventType eventType;
		private String errorMsg;
		private OrderState state;
		private String rawMsg;
		private InnerSource innerSource;
		private ChannelSource channelSource;
		
	
		/**
		* sets 
		*
		*/
		public T setTid(String tid)
		{
			this.tid = tid;
			return self();
		}

		private String getTid()
		{
			return tid;
		}
	
		/**
		* sets 
		*
		*/
		public T setOid(String oid)
		{
			this.oid = oid;
			return self();
		}

		private String getOid()
		{
			return oid;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefundFee(double refundFee)
		{
			this.refundFee = refundFee;
			return self();
		}

		private double getRefundFee()
		{
			return refundFee;
		}
	
		/**
		* sets 
		*
		*/
		public T setEventType(EventType eventType)
		{
			this.eventType = eventType;
			return self();
		}

		private EventType getEventType()
		{
			return eventType;
		}
	
		/**
		* sets 
		*
		*/
		public T setErrorMsg(String errorMsg)
		{
			this.errorMsg = errorMsg;
			return self();
		}

		private String getErrorMsg()
		{
			return errorMsg;
		}
	
		/**
		* sets 
		*
		*/
		public T setState(OrderState state)
		{
			this.state = state;
			return self();
		}

		private OrderState getState()
		{
			return state;
		}
	
		/**
		* sets 
		*
		*/
		public T setRawMsg(String rawMsg)
		{
			this.rawMsg = rawMsg;
			return self();
		}

		private String getRawMsg()
		{
			return rawMsg;
		}
	
		/**
		* sets 
		*
		*/
		public T setInnerSource(InnerSource innerSource)
		{
			this.innerSource = innerSource;
			return self();
		}

		private InnerSource getInnerSource()
		{
			return innerSource;
		}
	
		/**
		* sets 
		*
		*/
		public T setChannelSource(ChannelSource channelSource)
		{
			this.channelSource = channelSource;
			return self();
		}

		private ChannelSource getChannelSource()
		{
			return channelSource;
		}
	
		protected abstract T self();

		public PendingOrder build(){
			return new PendingOrder(this);
		}
	}
}

