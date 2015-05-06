

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
* ECC_BILLTO DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class EccBillto extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 468860893L;

	@XmlID
	private String eccInvoiceType;

	private String eccInvoiceTitle;

	private String eccInvoiceContent;

	private String eccTaxpayerNumber;

	private String eccBankName;

	private String eccBankNumber;

	private String eccCustomerAddress;

	private String eccCustomerPhone;

	
	public EccBillto(){}

	protected EccBillto(Builder builder)
	{
		super(builder); 
		setEccInvoiceType(builder.getEccInvoiceType());
		setEccInvoiceTitle(builder.getEccInvoiceTitle());
		setEccInvoiceContent(builder.getEccInvoiceContent());
		setEccTaxpayerNumber(builder.getEccTaxpayerNumber());
		setEccBankName(builder.getEccBankName());
		setEccBankNumber(builder.getEccBankNumber());
		setEccCustomerAddress(builder.getEccCustomerAddress());
		setEccCustomerPhone(builder.getEccCustomerPhone());
	
	}

				
	@Override
	public String getId()
	{
		return null;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccInvoiceType()
	{
		return eccInvoiceType;
	}

	/**
	* sets 
	*
	*/
	public void setEccInvoiceType(String eccInvoiceType)
	{
		this.eccInvoiceType = eccInvoiceType;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccInvoiceTitle()
	{
		return eccInvoiceTitle;
	}

	/**
	* sets 
	*
	*/
	public void setEccInvoiceTitle(String eccInvoiceTitle)
	{
		this.eccInvoiceTitle = eccInvoiceTitle;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccInvoiceContent()
	{
		return eccInvoiceContent;
	}

	/**
	* sets 
	*
	*/
	public void setEccInvoiceContent(String eccInvoiceContent)
	{
		this.eccInvoiceContent = eccInvoiceContent;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccTaxpayerNumber()
	{
		return eccTaxpayerNumber;
	}

	/**
	* sets 
	*
	*/
	public void setEccTaxpayerNumber(String eccTaxpayerNumber)
	{
		this.eccTaxpayerNumber = eccTaxpayerNumber;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccBankName()
	{
		return eccBankName;
	}

	/**
	* sets 
	*
	*/
	public void setEccBankName(String eccBankName)
	{
		this.eccBankName = eccBankName;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccBankNumber()
	{
		return eccBankNumber;
	}

	/**
	* sets 
	*
	*/
	public void setEccBankNumber(String eccBankNumber)
	{
		this.eccBankNumber = eccBankNumber;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccCustomerAddress()
	{
		return eccCustomerAddress;
	}

	/**
	* sets 
	*
	*/
	public void setEccCustomerAddress(String eccCustomerAddress)
	{
		this.eccCustomerAddress = eccCustomerAddress;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccCustomerPhone()
	{
		return eccCustomerPhone;
	}

	/**
	* sets 
	*
	*/
	public void setEccCustomerPhone(String eccCustomerPhone)
	{
		this.eccCustomerPhone = eccCustomerPhone;
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
		private String eccInvoiceType;
		private String eccInvoiceTitle;
		private String eccInvoiceContent;
		private String eccTaxpayerNumber;
		private String eccBankName;
		private String eccBankNumber;
		private String eccCustomerAddress;
		private String eccCustomerPhone;
		
	
		/**
		* sets 
		*
		*/
		public T setEccInvoiceType(String eccInvoiceType)
		{
			this.eccInvoiceType = eccInvoiceType;
			return self();
		}

		private String getEccInvoiceType()
		{
			return eccInvoiceType;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccInvoiceTitle(String eccInvoiceTitle)
		{
			this.eccInvoiceTitle = eccInvoiceTitle;
			return self();
		}

		private String getEccInvoiceTitle()
		{
			return eccInvoiceTitle;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccInvoiceContent(String eccInvoiceContent)
		{
			this.eccInvoiceContent = eccInvoiceContent;
			return self();
		}

		private String getEccInvoiceContent()
		{
			return eccInvoiceContent;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccTaxpayerNumber(String eccTaxpayerNumber)
		{
			this.eccTaxpayerNumber = eccTaxpayerNumber;
			return self();
		}

		private String getEccTaxpayerNumber()
		{
			return eccTaxpayerNumber;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccBankName(String eccBankName)
		{
			this.eccBankName = eccBankName;
			return self();
		}

		private String getEccBankName()
		{
			return eccBankName;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccBankNumber(String eccBankNumber)
		{
			this.eccBankNumber = eccBankNumber;
			return self();
		}

		private String getEccBankNumber()
		{
			return eccBankNumber;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccCustomerAddress(String eccCustomerAddress)
		{
			this.eccCustomerAddress = eccCustomerAddress;
			return self();
		}

		private String getEccCustomerAddress()
		{
			return eccCustomerAddress;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccCustomerPhone(String eccCustomerPhone)
		{
			this.eccCustomerPhone = eccCustomerPhone;
			return self();
		}

		private String getEccCustomerPhone()
		{
			return eccCustomerPhone;
		}
	
		protected abstract T self();

		public EccBillto build(){
			return new EccBillto(this);
		}
	}
}

