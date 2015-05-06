

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


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* OMSORDER DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class OmsOrder extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -670413564L;

	@XmlID
	private String eccOrderId;

	private String operation;

	private String omsOrderId;

	private String userNotes;

	private String csNotes;

	private Shipto shipto;

	private EccBillto eccBillto;

	private EccDelivery eccDelivery;

	private Refund refund;

	
	public OmsOrder(){}

	protected OmsOrder(Builder builder)
	{
		super(builder); 
		setEccOrderId(builder.getEccOrderId());
		setOperation(builder.getOperation());
		setOmsOrderId(builder.getOmsOrderId());
		setUserNotes(builder.getUserNotes());
		setCsNotes(builder.getCsNotes());
		setShipto(builder.getShipto());
		setEccBillto(builder.getEccBillto());
		setEccDelivery(builder.getEccDelivery());
		setRefund(builder.getRefund());
	
	}

				
	@Override
	public String getId()
	{
		return this.eccOrderId;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccOrderId()
	{
		return eccOrderId;
	}

	/**
	* sets 
	*
	*/
	public void setEccOrderId(String eccOrderId)
	{
		this.eccOrderId = eccOrderId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOperation()
	{
		return operation;
	}

	/**
	* sets 
	*
	*/
	public void setOperation(String operation)
	{
		this.operation = operation;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOmsOrderId()
	{
		return omsOrderId;
	}

	/**
	* sets 
	*
	*/
	public void setOmsOrderId(String omsOrderId)
	{
		this.omsOrderId = omsOrderId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getUserNotes()
	{
		return userNotes;
	}

	/**
	* sets 
	*
	*/
	public void setUserNotes(String userNotes)
	{
		this.userNotes = userNotes;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getCsNotes()
	{
		return csNotes;
	}

	/**
	* sets 
	*
	*/
	public void setCsNotes(String csNotes)
	{
		this.csNotes = csNotes;
	}

	/**
	* gets 
	*
	* @returns Shipto
	*/
	public Shipto getShipto()
	{
		return shipto;
	}

	/**
	* sets 
	*
	*/
	public void setShipto(Shipto shipto)
	{
		this.shipto = shipto;
	}

	/**
	* gets 
	*
	* @returns EccBillto
	*/
	public EccBillto getEccBillto()
	{
		return eccBillto;
	}

	/**
	* sets 
	*
	*/
	public void setEccBillto(EccBillto eccBillto)
	{
		this.eccBillto = eccBillto;
	}

	/**
	* gets 
	*
	* @returns EccDelivery
	*/
	public EccDelivery getEccDelivery()
	{
		return eccDelivery;
	}

	/**
	* sets 
	*
	*/
	public void setEccDelivery(EccDelivery eccDelivery)
	{
		this.eccDelivery = eccDelivery;
	}

	/**
	* gets 
	*
	* @returns Refund
	*/
	public Refund getRefund()
	{
		return refund;
	}

	/**
	* sets 
	*
	*/
	public void setRefund(Refund refund)
	{
		this.refund = refund;
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
		private String eccOrderId;
		private String operation;
		private String omsOrderId;
		private String userNotes;
		private String csNotes;
		private Shipto shipto;
		private EccBillto eccBillto;
		private EccDelivery eccDelivery;
		private Refund refund;
		
	
		/**
		* sets 
		*
		*/
		public T setEccOrderId(String eccOrderId)
		{
			this.eccOrderId = eccOrderId;
			return self();
		}

		private String getEccOrderId()
		{
			return eccOrderId;
		}
	
		/**
		* sets 
		*
		*/
		public T setOperation(String operation)
		{
			this.operation = operation;
			return self();
		}

		private String getOperation()
		{
			return operation;
		}
	
		/**
		* sets 
		*
		*/
		public T setOmsOrderId(String omsOrderId)
		{
			this.omsOrderId = omsOrderId;
			return self();
		}

		private String getOmsOrderId()
		{
			return omsOrderId;
		}
	
		/**
		* sets 
		*
		*/
		public T setUserNotes(String userNotes)
		{
			this.userNotes = userNotes;
			return self();
		}

		private String getUserNotes()
		{
			return userNotes;
		}
	
		/**
		* sets 
		*
		*/
		public T setCsNotes(String csNotes)
		{
			this.csNotes = csNotes;
			return self();
		}

		private String getCsNotes()
		{
			return csNotes;
		}
	
		/**
		* sets 
		*
		*/
		public T setShipto(Shipto shipto)
		{
			this.shipto = shipto;
			return self();
		}

		private Shipto getShipto()
		{
			return shipto;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccBillto(EccBillto eccBillto)
		{
			this.eccBillto = eccBillto;
			return self();
		}

		private EccBillto getEccBillto()
		{
			return eccBillto;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccDelivery(EccDelivery eccDelivery)
		{
			this.eccDelivery = eccDelivery;
			return self();
		}

		private EccDelivery getEccDelivery()
		{
			return eccDelivery;
		}
	
		/**
		* sets 
		*
		*/
		public T setRefund(Refund refund)
		{
			this.refund = refund;
			return self();
		}

		private Refund getRefund()
		{
			return refund;
		}
	
		protected abstract T self();

		public OmsOrder build(){
			return new OmsOrder(this);
		}
	}
}

