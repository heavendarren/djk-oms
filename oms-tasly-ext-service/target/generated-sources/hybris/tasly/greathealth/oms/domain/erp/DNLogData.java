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
 
package tasly.greathealth.oms.domain.erp;

import com.hybris.kernel.api.*;

import com.hybris.kernel.api.ManagedObject;

    
/**
 * Generated managedobject class for type DNLogData first defined at extension <code>oms-tasly-ext-erp-integration</code>.
 * <p/>
 * .
 */
public interface DNLogData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "DNLogData";
	
	/** <i>Generated constant</i> - Attribute key of <code>DNLogData.replication_flag</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>. */
	AttributeType<DNLogData, String> REPLICATION_FLAG = new AttributeType<>("replication_flag");
	/** <i>Generated constant</i> - Attribute key of <code>DNLogData.oms_order_line_id</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>. */
	AttributeType<DNLogData, String> OMS_ORDER_LINE_ID = new AttributeType<>("oms_order_line_id");
	/** <i>Generated constant</i> - Attribute key of <code>DNLogData.oms_order_id</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>. */
	AttributeType<DNLogData, String> OMS_ORDER_ID = new AttributeType<>("oms_order_id");


	/**
	 * <i>Generated method</i> - Getter of the <code>DNLogData.oms_order_id</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.
	 * <p/>
	 * OMS Order ID.
	 * 
	 * @return the oms_order_id
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getOms_order_id();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DNLogData.oms_order_line_id</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.
	 * <p/>
	 * OMS Order Line ID.
	 * 
	 * @return the oms_order_line_id
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getOms_order_line_id();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DNLogData.replication_flag</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.
	 * <p/>
	 * flags to indicate replicated or not.
	 * 
	 * @return the replication_flag
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getReplication_flag();
	

	/**
	 * <i>Generated method</i> - Setter of <code>DNLogData.oms_order_id</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.  
	 * <p/>
	 * OMS Order ID.
	 *
	 * @param value the oms_order_id
	 */
	void setOms_order_id(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>DNLogData.oms_order_line_id</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.  
	 * <p/>
	 * OMS Order Line ID.
	 *
	 * @param value the oms_order_line_id
	 */
	void setOms_order_line_id(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>DNLogData.replication_flag</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.  
	 * <p/>
	 * flags to indicate replicated or not.
	 *
	 * @param value the replication_flag
	 */
	void setReplication_flag(final java.lang.String value);
	
}
