

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


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* Order DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Oms_order extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1490000030L;

	@XmlID
	private String OMS_ORDER_ID;

	private String OPERATION;

	private String RESULT_CODE;

	private String RESULT_MESSAGE;

	private String ECC_ORDER_ID;

	
	public Oms_order(){}

	protected Oms_order(Builder builder)
	{
		super(builder); 
		setOMS_ORDER_ID(builder.getOMS_ORDER_ID());
		setOPERATION(builder.getOPERATION());
		setRESULT_CODE(builder.getRESULT_CODE());
		setRESULT_MESSAGE(builder.getRESULT_MESSAGE());
		setECC_ORDER_ID(builder.getECC_ORDER_ID());
	
	}

				
	@Override
	public String getId()
	{
		return this.OMS_ORDER_ID;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOMS_ORDER_ID()
	{
		return OMS_ORDER_ID;
	}

	/**
	* sets 
	*
	*/
	public void setOMS_ORDER_ID(String OMS_ORDER_ID)
	{
		this.OMS_ORDER_ID = OMS_ORDER_ID;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOPERATION()
	{
		return OPERATION;
	}

	/**
	* sets 
	*
	*/
	public void setOPERATION(String OPERATION)
	{
		this.OPERATION = OPERATION;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRESULT_CODE()
	{
		return RESULT_CODE;
	}

	/**
	* sets 
	*
	*/
	public void setRESULT_CODE(String RESULT_CODE)
	{
		this.RESULT_CODE = RESULT_CODE;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getRESULT_MESSAGE()
	{
		return RESULT_MESSAGE;
	}

	/**
	* sets 
	*
	*/
	public void setRESULT_MESSAGE(String RESULT_MESSAGE)
	{
		this.RESULT_MESSAGE = RESULT_MESSAGE;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getECC_ORDER_ID()
	{
		return ECC_ORDER_ID;
	}

	/**
	* sets 
	*
	*/
	public void setECC_ORDER_ID(String ECC_ORDER_ID)
	{
		this.ECC_ORDER_ID = ECC_ORDER_ID;
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
		private String OMS_ORDER_ID;
		private String OPERATION;
		private String RESULT_CODE;
		private String RESULT_MESSAGE;
		private String ECC_ORDER_ID;
		
	
		/**
		* sets 
		*
		*/
		public T setOMS_ORDER_ID(String OMS_ORDER_ID)
		{
			this.OMS_ORDER_ID = OMS_ORDER_ID;
			return self();
		}

		private String getOMS_ORDER_ID()
		{
			return OMS_ORDER_ID;
		}
	
		/**
		* sets 
		*
		*/
		public T setOPERATION(String OPERATION)
		{
			this.OPERATION = OPERATION;
			return self();
		}

		private String getOPERATION()
		{
			return OPERATION;
		}
	
		/**
		* sets 
		*
		*/
		public T setRESULT_CODE(String RESULT_CODE)
		{
			this.RESULT_CODE = RESULT_CODE;
			return self();
		}

		private String getRESULT_CODE()
		{
			return RESULT_CODE;
		}
	
		/**
		* sets 
		*
		*/
		public T setRESULT_MESSAGE(String RESULT_MESSAGE)
		{
			this.RESULT_MESSAGE = RESULT_MESSAGE;
			return self();
		}

		private String getRESULT_MESSAGE()
		{
			return RESULT_MESSAGE;
		}
	
		/**
		* sets 
		*
		*/
		public T setECC_ORDER_ID(String ECC_ORDER_ID)
		{
			this.ECC_ORDER_ID = ECC_ORDER_ID;
			return self();
		}

		private String getECC_ORDER_ID()
		{
			return ECC_ORDER_ID;
		}
	
		protected abstract T self();

		public Oms_order build(){
			return new Oms_order(this);
		}
	}
}

