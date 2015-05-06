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
 * Generated managedobject class for type JobTimerShaftData first defined at extension <code>oms-tasly-ext-job</code>.
 * <p/>
 * .
 */
public interface JobTimerShaftData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "JobTimerShaftData";
	
	/** <i>Generated constant</i> - Attribute key of <code>JobTimerShaftData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<JobTimerShaftData, String> INNER_SOURCE = new AttributeType<>("inner_source");
	/** <i>Generated constant</i> - Attribute key of <code>JobTimerShaftData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<JobTimerShaftData, String> CHANNEL_SOURCE = new AttributeType<>("channel_source");
	/** <i>Generated constant</i> - Attribute key of <code>JobTimerShaftData.intervaltime</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<JobTimerShaftData, Integer> INTERVALTIME = new AttributeType<>("intervaltime");
	/** <i>Generated constant</i> - Attribute key of <code>JobTimerShaftData.executtime</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<JobTimerShaftData, java.util.Date> EXECUTTIME = new AttributeType<>("executtime");
	/** <i>Generated constant</i> - Attribute key of <code>JobTimerShaftData.event</code> attribute defined at extension <code>oms-tasly-ext-job</code>. */
	AttributeType<JobTimerShaftData, String> EVENT = new AttributeType<>("event");


	/**
	 * <i>Generated method</i> - Getter of the <code>JobTimerShaftData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * 渠道来源.
	 * 
	 * @return the channel_source
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getChannel_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobTimerShaftData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * 业态类别.
	 * 
	 * @return the inner_source
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getInner_source();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobTimerShaftData.event</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * 事件.
	 * 
	 * @return the event
	 */
	@javax.validation.constraints.Size(max=32)
	java.lang.String getEvent();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobTimerShaftData.executtime</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * 本次成功执行结束时间.
	 * 
	 * @return the executtime
	 */
	java.util.Date getExecuttime();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobTimerShaftData.intervaltime</code> attribute defined at extension <code>oms-tasly-ext-job</code>.
	 * <p/>
	 * 执行时间间隔，单位分钟.
	 * 
	 * @return the intervaltime
	 */
	int getIntervaltime();
	

	/**
	 * <i>Generated method</i> - Setter of <code>JobTimerShaftData.channel_source</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * 渠道来源.
	 *
	 * @param value the channel_source
	 */
	void setChannel_source(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>JobTimerShaftData.inner_source</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * 业态类别.
	 *
	 * @param value the inner_source
	 */
	void setInner_source(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>JobTimerShaftData.event</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * 事件.
	 *
	 * @param value the event
	 */
	void setEvent(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>JobTimerShaftData.executtime</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * 本次成功执行结束时间.
	 *
	 * @param value the executtime
	 */
	void setExecuttime(final java.util.Date value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>JobTimerShaftData.intervaltime</code> attribute defined at extension <code>oms-tasly-ext-job</code>.  
	 * <p/>
	 * 执行时间间隔，单位分钟.
	 *
	 * @param value the intervaltime
	 */
	void setIntervaltime(final int value);
	
}
