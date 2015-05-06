

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
* SHIPTO DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Shipto extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 932654844L;

	@XmlID
	private String eccShiptoId;

	private String eccShiptoName;

	private String eccShiptoRegion;

	private String eccShiptoCity;

	private String eccShiptoDistrict;

	private String eccShiptoAddress;

	private String eccShiptoZipcode;

	private String eccShiptoMob;

	private String eccShiptoTel;

	
	public Shipto(){}

	protected Shipto(Builder builder)
	{
		super(builder); 
		setEccShiptoId(builder.getEccShiptoId());
		setEccShiptoName(builder.getEccShiptoName());
		setEccShiptoRegion(builder.getEccShiptoRegion());
		setEccShiptoCity(builder.getEccShiptoCity());
		setEccShiptoDistrict(builder.getEccShiptoDistrict());
		setEccShiptoAddress(builder.getEccShiptoAddress());
		setEccShiptoZipcode(builder.getEccShiptoZipcode());
		setEccShiptoMob(builder.getEccShiptoMob());
		setEccShiptoTel(builder.getEccShiptoTel());
	
	}

				
	@Override
	public String getId()
	{
		return this.eccShiptoId;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoId()
	{
		return eccShiptoId;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoId(String eccShiptoId)
	{
		this.eccShiptoId = eccShiptoId;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoName()
	{
		return eccShiptoName;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoName(String eccShiptoName)
	{
		this.eccShiptoName = eccShiptoName;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoRegion()
	{
		return eccShiptoRegion;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoRegion(String eccShiptoRegion)
	{
		this.eccShiptoRegion = eccShiptoRegion;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoCity()
	{
		return eccShiptoCity;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoCity(String eccShiptoCity)
	{
		this.eccShiptoCity = eccShiptoCity;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoDistrict()
	{
		return eccShiptoDistrict;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoDistrict(String eccShiptoDistrict)
	{
		this.eccShiptoDistrict = eccShiptoDistrict;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoAddress()
	{
		return eccShiptoAddress;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoAddress(String eccShiptoAddress)
	{
		this.eccShiptoAddress = eccShiptoAddress;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoZipcode()
	{
		return eccShiptoZipcode;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoZipcode(String eccShiptoZipcode)
	{
		this.eccShiptoZipcode = eccShiptoZipcode;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoMob()
	{
		return eccShiptoMob;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoMob(String eccShiptoMob)
	{
		this.eccShiptoMob = eccShiptoMob;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getEccShiptoTel()
	{
		return eccShiptoTel;
	}

	/**
	* sets 
	*
	*/
	public void setEccShiptoTel(String eccShiptoTel)
	{
		this.eccShiptoTel = eccShiptoTel;
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
		private String eccShiptoId;
		private String eccShiptoName;
		private String eccShiptoRegion;
		private String eccShiptoCity;
		private String eccShiptoDistrict;
		private String eccShiptoAddress;
		private String eccShiptoZipcode;
		private String eccShiptoMob;
		private String eccShiptoTel;
		
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoId(String eccShiptoId)
		{
			this.eccShiptoId = eccShiptoId;
			return self();
		}

		private String getEccShiptoId()
		{
			return eccShiptoId;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoName(String eccShiptoName)
		{
			this.eccShiptoName = eccShiptoName;
			return self();
		}

		private String getEccShiptoName()
		{
			return eccShiptoName;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoRegion(String eccShiptoRegion)
		{
			this.eccShiptoRegion = eccShiptoRegion;
			return self();
		}

		private String getEccShiptoRegion()
		{
			return eccShiptoRegion;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoCity(String eccShiptoCity)
		{
			this.eccShiptoCity = eccShiptoCity;
			return self();
		}

		private String getEccShiptoCity()
		{
			return eccShiptoCity;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoDistrict(String eccShiptoDistrict)
		{
			this.eccShiptoDistrict = eccShiptoDistrict;
			return self();
		}

		private String getEccShiptoDistrict()
		{
			return eccShiptoDistrict;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoAddress(String eccShiptoAddress)
		{
			this.eccShiptoAddress = eccShiptoAddress;
			return self();
		}

		private String getEccShiptoAddress()
		{
			return eccShiptoAddress;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoZipcode(String eccShiptoZipcode)
		{
			this.eccShiptoZipcode = eccShiptoZipcode;
			return self();
		}

		private String getEccShiptoZipcode()
		{
			return eccShiptoZipcode;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoMob(String eccShiptoMob)
		{
			this.eccShiptoMob = eccShiptoMob;
			return self();
		}

		private String getEccShiptoMob()
		{
			return eccShiptoMob;
		}
	
		/**
		* sets 
		*
		*/
		public T setEccShiptoTel(String eccShiptoTel)
		{
			this.eccShiptoTel = eccShiptoTel;
			return self();
		}

		private String getEccShiptoTel()
		{
			return eccShiptoTel;
		}
	
		protected abstract T self();

		public Shipto build(){
			return new Shipto(this);
		}
	}
}

