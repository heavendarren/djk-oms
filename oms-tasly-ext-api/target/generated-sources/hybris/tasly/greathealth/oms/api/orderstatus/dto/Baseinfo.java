

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
* BaseInfo DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Baseinfo extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -462632497L;

	@XmlID
	private String MSGID;

	private String PMSGID;

	private String SENDTIME;

	private String S_SYSTEM;

	private String SERVICENAME;

	private String T_SYSTEM;

	private int RETRY;

	
	public Baseinfo(){}

	protected Baseinfo(Builder builder)
	{
		super(builder); 
		setMSGID(builder.getMSGID());
		setPMSGID(builder.getPMSGID());
		setSENDTIME(builder.getSENDTIME());
		setS_SYSTEM(builder.getS_SYSTEM());
		setSERVICENAME(builder.getSERVICENAME());
		setT_SYSTEM(builder.getT_SYSTEM());
		setRETRY(builder.getRETRY());
	
	}

				
	@Override
	public String getId()
	{
		return this.MSGID;
	}
						
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getMSGID()
	{
		return MSGID;
	}

	/**
	* sets 
	*
	*/
	public void setMSGID(String MSGID)
	{
		this.MSGID = MSGID;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getPMSGID()
	{
		return PMSGID;
	}

	/**
	* sets 
	*
	*/
	public void setPMSGID(String PMSGID)
	{
		this.PMSGID = PMSGID;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSENDTIME()
	{
		return SENDTIME;
	}

	/**
	* sets 
	*
	*/
	public void setSENDTIME(String SENDTIME)
	{
		this.SENDTIME = SENDTIME;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getS_SYSTEM()
	{
		return S_SYSTEM;
	}

	/**
	* sets 
	*
	*/
	public void setS_SYSTEM(String S_SYSTEM)
	{
		this.S_SYSTEM = S_SYSTEM;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSERVICENAME()
	{
		return SERVICENAME;
	}

	/**
	* sets 
	*
	*/
	public void setSERVICENAME(String SERVICENAME)
	{
		this.SERVICENAME = SERVICENAME;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getT_SYSTEM()
	{
		return T_SYSTEM;
	}

	/**
	* sets 
	*
	*/
	public void setT_SYSTEM(String T_SYSTEM)
	{
		this.T_SYSTEM = T_SYSTEM;
	}

	/**
	* gets 
	*
	* @returns int
	*/
	public int getRETRY()
	{
		return RETRY;
	}

	/**
	* sets 
	*
	*/
	public void setRETRY(int RETRY)
	{
		this.RETRY = RETRY;
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
		private String MSGID;
		private String PMSGID;
		private String SENDTIME;
		private String S_SYSTEM;
		private String SERVICENAME;
		private String T_SYSTEM;
		private int RETRY;
		
	
		/**
		* sets 
		*
		*/
		public T setMSGID(String MSGID)
		{
			this.MSGID = MSGID;
			return self();
		}

		private String getMSGID()
		{
			return MSGID;
		}
	
		/**
		* sets 
		*
		*/
		public T setPMSGID(String PMSGID)
		{
			this.PMSGID = PMSGID;
			return self();
		}

		private String getPMSGID()
		{
			return PMSGID;
		}
	
		/**
		* sets 
		*
		*/
		public T setSENDTIME(String SENDTIME)
		{
			this.SENDTIME = SENDTIME;
			return self();
		}

		private String getSENDTIME()
		{
			return SENDTIME;
		}
	
		/**
		* sets 
		*
		*/
		public T setS_SYSTEM(String S_SYSTEM)
		{
			this.S_SYSTEM = S_SYSTEM;
			return self();
		}

		private String getS_SYSTEM()
		{
			return S_SYSTEM;
		}
	
		/**
		* sets 
		*
		*/
		public T setSERVICENAME(String SERVICENAME)
		{
			this.SERVICENAME = SERVICENAME;
			return self();
		}

		private String getSERVICENAME()
		{
			return SERVICENAME;
		}
	
		/**
		* sets 
		*
		*/
		public T setT_SYSTEM(String T_SYSTEM)
		{
			this.T_SYSTEM = T_SYSTEM;
			return self();
		}

		private String getT_SYSTEM()
		{
			return T_SYSTEM;
		}
	
		/**
		* sets 
		*
		*/
		public T setRETRY(int RETRY)
		{
			this.RETRY = RETRY;
			return self();
		}

		private int getRETRY()
		{
			return RETRY;
		}
	
		protected abstract T self();

		public Baseinfo build(){
			return new Baseinfo(this);
		}
	}
}

