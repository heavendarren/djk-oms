

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

package tasly.greathealth.erp.api.codeMapping.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import javax.xml.bind.annotation.XmlAccessorType;
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
public class ErpCodeMapping extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = -630708912L;

	private String type;

	private String sourceCode;

	private String targetCode;

	private String comments;

	
	public ErpCodeMapping(){}

	protected ErpCodeMapping(Builder builder)
	{
		super(builder); 
		setType(builder.getType());
		setSourceCode(builder.getSourceCode());
		setTargetCode(builder.getTargetCode());
		setComments(builder.getComments());
	
	}

				
	@Override
	public String getId()
	{
		return this.type;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getType()
	{
		return type;
	}

	/**
	* sets 
	*
	*/
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSourceCode()
	{
		return sourceCode;
	}

	/**
	* sets 
	*
	*/
	public void setSourceCode(String sourceCode)
	{
		this.sourceCode = sourceCode;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getTargetCode()
	{
		return targetCode;
	}

	/**
	* sets 
	*
	*/
	public void setTargetCode(String targetCode)
	{
		this.targetCode = targetCode;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getComments()
	{
		return comments;
	}

	/**
	* sets 
	*
	*/
	public void setComments(String comments)
	{
		this.comments = comments;
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
		private String type;
		private String sourceCode;
		private String targetCode;
		private String comments;
		
	
		/**
		* sets 
		*
		*/
		public T setType(String type)
		{
			this.type = type;
			return self();
		}

		private String getType()
		{
			return type;
		}
	
		/**
		* sets 
		*
		*/
		public T setSourceCode(String sourceCode)
		{
			this.sourceCode = sourceCode;
			return self();
		}

		private String getSourceCode()
		{
			return sourceCode;
		}
	
		/**
		* sets 
		*
		*/
		public T setTargetCode(String targetCode)
		{
			this.targetCode = targetCode;
			return self();
		}

		private String getTargetCode()
		{
			return targetCode;
		}
	
		/**
		* sets 
		*
		*/
		public T setComments(String comments)
		{
			this.comments = comments;
			return self();
		}

		private String getComments()
		{
			return comments;
		}
	
		protected abstract T self();

		public ErpCodeMapping build(){
			return new ErpCodeMapping(this);
		}
	}
}

