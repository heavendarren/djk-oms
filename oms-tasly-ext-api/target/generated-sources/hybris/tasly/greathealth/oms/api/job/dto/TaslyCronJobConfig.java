

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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* Product DTO for oms-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TaslyCronJobConfig extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -1805213788L;

	@XmlID
	private String jobName;

	private String description;

	private String cronExpression;

	private boolean enable;

	private String jobParams;

	private String tenantId;

	private boolean success;

	
	public TaslyCronJobConfig(){}

	protected TaslyCronJobConfig(Builder builder)
	{
		super(builder); 
		setJobName(builder.getJobName());
		setDescription(builder.getDescription());
		setCronExpression(builder.getCronExpression());
		setEnable(builder.getEnable());
		setJobParams(builder.getJobParams());
		setTenantId(builder.getTenantId());
		setSuccess(builder.getSuccess());
	
	}

				
	@Override
	public String getId()
	{
		return this.jobName;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getJobName()
	{
		return jobName;
	}

	/**
	* sets 
	*
	*/
	public void setJobName(String jobName)
	{
		this.jobName = jobName;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getDescription()
	{
		return description;
	}

	/**
	* sets 
	*
	*/
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getCronExpression()
	{
		return cronExpression;
	}

	/**
	* sets 
	*
	*/
	public void setCronExpression(String cronExpression)
	{
		this.cronExpression = cronExpression;
	}

	/**
	* gets 
	*
	* @returns boolean
	*/
	public boolean getEnable()
	{
		return enable;
	}

	/**
	* sets 
	*
	*/
	public void setEnable(boolean enable)
	{
		this.enable = enable;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getJobParams()
	{
		return jobParams;
	}

	/**
	* sets 
	*
	*/
	public void setJobParams(String jobParams)
	{
		this.jobParams = jobParams;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getTenantId()
	{
		return tenantId;
	}

	/**
	* sets 
	*
	*/
	public void setTenantId(String tenantId)
	{
		this.tenantId = tenantId;
	}

	/**
	* gets 
	*
	* @returns boolean
	*/
	public boolean getSuccess()
	{
		return success;
	}

	/**
	* sets 
	*
	*/
	public void setSuccess(boolean success)
	{
		this.success = success;
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
		private String jobName;
		private String description;
		private String cronExpression;
		private boolean enable;
		private String jobParams;
		private String tenantId;
		private boolean success;
		
	
		/**
		* sets 
		*
		*/
		public T setJobName(String jobName)
		{
			this.jobName = jobName;
			return self();
		}

		private String getJobName()
		{
			return jobName;
		}
	
		/**
		* sets 
		*
		*/
		public T setDescription(String description)
		{
			this.description = description;
			return self();
		}

		private String getDescription()
		{
			return description;
		}
	
		/**
		* sets 
		*
		*/
		public T setCronExpression(String cronExpression)
		{
			this.cronExpression = cronExpression;
			return self();
		}

		private String getCronExpression()
		{
			return cronExpression;
		}
	
		/**
		* sets 
		*
		*/
		public T setEnable(boolean enable)
		{
			this.enable = enable;
			return self();
		}

		private boolean getEnable()
		{
			return enable;
		}
	
		/**
		* sets 
		*
		*/
		public T setJobParams(String jobParams)
		{
			this.jobParams = jobParams;
			return self();
		}

		private String getJobParams()
		{
			return jobParams;
		}
	
		/**
		* sets 
		*
		*/
		public T setTenantId(String tenantId)
		{
			this.tenantId = tenantId;
			return self();
		}

		private String getTenantId()
		{
			return tenantId;
		}
	
		/**
		* sets 
		*
		*/
		public T setSuccess(boolean success)
		{
			this.success = success;
			return self();
		}

		private boolean getSuccess()
		{
			return success;
		}
	
		protected abstract T self();

		public TaslyCronJobConfig build(){
			return new TaslyCronJobConfig(this);
		}
	}
}

