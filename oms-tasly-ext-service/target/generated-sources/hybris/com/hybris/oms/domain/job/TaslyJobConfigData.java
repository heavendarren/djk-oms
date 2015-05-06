/*
 * [y] hybris Platform
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
 
package com.hybris.oms.domain.job;

import com.hybris.kernel.api.*;

import com.hybris.kernel.api.ManagedObject;

  
/**
 * Generated managedobject class for type TaslyJobConfigData first defined at extension <code>oms-tasly-ext-job</code>.
 * <p/>
 * .
 */
public interface TaslyJobConfigData extends ManagedObject
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyJobConfigData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyJobConfigData.description</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<TaslyJobConfigData, String> DESCRIPTION = new AttributeType<>("description");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyJobConfigData.jobParams</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<TaslyJobConfigData, String> JOBPARAMS = new AttributeType<>("jobParams");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyJobConfigData.jobName</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<TaslyJobConfigData, String> JOBNAME = new AttributeType<>("jobName");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyJobConfigData.cronExpression</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<TaslyJobConfigData, String> CRONEXPRESSION = new AttributeType<>("cronExpression");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyJobConfigData.enable</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<TaslyJobConfigData, Boolean> ENABLE = new AttributeType<>("enable");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyJobConfigData.tenantId</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<TaslyJobConfigData, String> TENANTID = new AttributeType<>("tenantId");
	/** <i>Generated constant</i> - Attribute key of <code>TaslyJobConfigData.success</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<TaslyJobConfigData, Boolean> SUCCESS = new AttributeType<>("success");

	/** <i>Generated constant</i> - Index of <code>TaslyJobConfigData</code> type defined at extension <code>oms-tasly-ext-job</code>. */
	UniqueIndexSingle<TaslyJobConfigData, String> UX_TASLYJOBCONFIGDATA_JOBNAME = new UniqueIndexSingle<>("UX_TaslyJobConfigData_jobName", TaslyJobConfigData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyJobConfigData.jobName</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * .
	 * 
	 * @return the jobName
	 */
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max=255)
	java.lang.String getJobName();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyJobConfigData.cronExpression</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * .
	 * 
	 * @return the cronExpression
	 */
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max=255)
	java.lang.String getCronExpression();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyJobConfigData.jobParams</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * .
	 * 
	 * @return the jobParams
	 */
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max=255)
	java.lang.String getJobParams();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyJobConfigData.tenantId</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * .
	 * 
	 * @return the tenantId
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getTenantId();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyJobConfigData.enable</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * .
	 * 
	 * @return the enable
	 */
	boolean isEnable();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyJobConfigData.description</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * .
	 * 
	 * @return the description
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getDescription();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyJobConfigData.success</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * .
	 * 
	 * @return the success
	 */
	boolean isSuccess();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyJobConfigData.jobName</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the jobName
	 */
	void setJobName(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyJobConfigData.cronExpression</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the cronExpression
	 */
	void setCronExpression(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyJobConfigData.jobParams</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the jobParams
	 */
	void setJobParams(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyJobConfigData.tenantId</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the tenantId
	 */
	void setTenantId(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyJobConfigData.enable</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the enable
	 */
	void setEnable(final boolean value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyJobConfigData.description</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the description
	 */
	void setDescription(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>TaslyJobConfigData.success</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the success
	 */
	void setSuccess(final boolean value);
	
}
