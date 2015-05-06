

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

package tasly.greathealth.oms.api.principal.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* Principal DTO for oms-tasly-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class DataPrincipal extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -920831386L;

	@XmlID
	private String uniqueid;

	private boolean isGroup;

	private String group;

	private String principal;

	private boolean active;

	
	public DataPrincipal(){}

	protected DataPrincipal(Builder builder)
	{
		super(builder); 
		setUniqueid(builder.getUniqueid());
		setIsGroup(builder.getIsGroup());
		setGroup(builder.getGroup());
		setPrincipal(builder.getPrincipal());
		setActive(builder.getActive());
	
	}

				
	@Override
	public String getId()
	{
		return this.uniqueid;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getUniqueid()
	{
		return uniqueid;
	}

	/**
	* sets 
	*
	*/
	public void setUniqueid(String uniqueid)
	{
		this.uniqueid = uniqueid;
	}

	/**
	* gets 
	*
	* @returns boolean
	*/
	public boolean getIsGroup()
	{
		return isGroup;
	}

	/**
	* sets 
	*
	*/
	public void setIsGroup(boolean isGroup)
	{
		this.isGroup = isGroup;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getGroup()
	{
		return group;
	}

	/**
	* sets 
	*
	*/
	public void setGroup(String group)
	{
		this.group = group;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getPrincipal()
	{
		return principal;
	}

	/**
	* sets 
	*
	*/
	public void setPrincipal(String principal)
	{
		this.principal = principal;
	}

	/**
	* gets 
	*
	* @returns boolean
	*/
	public boolean getActive()
	{
		return active;
	}

	/**
	* sets 
	*
	*/
	public void setActive(boolean active)
	{
		this.active = active;
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
		private String uniqueid;
		private boolean isGroup;
		private String group;
		private String principal;
		private boolean active;
		
	
		/**
		* sets 
		*
		*/
		public T setUniqueid(String uniqueid)
		{
			this.uniqueid = uniqueid;
			return self();
		}

		private String getUniqueid()
		{
			return uniqueid;
		}
	
		/**
		* sets 
		*
		*/
		public T setIsGroup(boolean isGroup)
		{
			this.isGroup = isGroup;
			return self();
		}

		private boolean getIsGroup()
		{
			return isGroup;
		}
	
		/**
		* sets 
		*
		*/
		public T setGroup(String group)
		{
			this.group = group;
			return self();
		}

		private String getGroup()
		{
			return group;
		}
	
		/**
		* sets 
		*
		*/
		public T setPrincipal(String principal)
		{
			this.principal = principal;
			return self();
		}

		private String getPrincipal()
		{
			return principal;
		}
	
		/**
		* sets 
		*
		*/
		public T setActive(boolean active)
		{
			this.active = active;
			return self();
		}

		private boolean getActive()
		{
			return active;
		}
	
		protected abstract T self();

		public DataPrincipal build(){
			return new DataPrincipal(this);
		}
	}
}

