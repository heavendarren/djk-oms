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
 
package tasly.greathealth.oms.domain.order;

import com.hybris.kernel.api.*;

import com.hybris.kernel.api.ManagedObject;

    
/**
 * Generated managedobject class for type PendingOrderData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface PendingOrderData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "PendingOrderData";
	
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.rawmsg</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, String> RAWMSG = new AttributeType<>("rawmsg");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.oid</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, String> OID = new AttributeType<>("oid");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.channelsource</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, tasly.greathealth.oms.domain.order.ChannelSource> CHANNELSOURCE = new AttributeType<>("channelsource");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.innersource</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, tasly.greathealth.oms.domain.order.InnerSource> INNERSOURCE = new AttributeType<>("innersource");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.refundfee</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, Double> REFUNDFEE = new AttributeType<>("refundfee");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.eventtype</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, tasly.greathealth.oms.domain.order.EventType> EVENTTYPE = new AttributeType<>("eventtype");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.eventtime</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, java.util.Date> EVENTTIME = new AttributeType<>("eventtime");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.errormsg</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, String> ERRORMSG = new AttributeType<>("errormsg");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.state</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, tasly.greathealth.oms.domain.order.OrderState> STATE = new AttributeType<>("state");
	/** <i>Generated constant</i> - Attribute key of <code>PendingOrderData.tid</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<PendingOrderData, String> TID = new AttributeType<>("tid");


	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.tid</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the tid
	 */
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max=32)
	java.lang.String getTid();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.oid</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the oid
	 */
	@javax.validation.constraints.Size(max=32)
	java.lang.String getOid();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.refundfee</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the refundfee
	 */
	double getRefundfee();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.eventtype</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the eventtype
	 */
	tasly.greathealth.oms.domain.order.EventType getEventtype();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.eventtime</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the eventtime
	 */
	java.util.Date getEventtime();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.errormsg</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the errormsg
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getErrormsg();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.state</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the state
	 */
	tasly.greathealth.oms.domain.order.OrderState getState();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.rawmsg</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the rawmsg
	 */
	@javax.validation.constraints.Size(max=20000)
	java.lang.String getRawmsg();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.innersource</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the innersource
	 */
	tasly.greathealth.oms.domain.order.InnerSource getInnersource();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PendingOrderData.channelsource</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the channelsource
	 */
	tasly.greathealth.oms.domain.order.ChannelSource getChannelsource();
	

	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.tid</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the tid
	 */
	void setTid(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.oid</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the oid
	 */
	void setOid(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.refundfee</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the refundfee
	 */
	void setRefundfee(final double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.eventtype</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the eventtype
	 */
	void setEventtype(final tasly.greathealth.oms.domain.order.EventType value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.eventtime</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the eventtime
	 */
	void setEventtime(final java.util.Date value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.errormsg</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the errormsg
	 */
	void setErrormsg(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.state</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the state
	 */
	void setState(final tasly.greathealth.oms.domain.order.OrderState value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.rawmsg</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the rawmsg
	 */
	void setRawmsg(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.innersource</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the innersource
	 */
	void setInnersource(final tasly.greathealth.oms.domain.order.InnerSource value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>PendingOrderData.channelsource</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the channelsource
	 */
	void setChannelsource(final tasly.greathealth.oms.domain.order.ChannelSource value);
	
}
