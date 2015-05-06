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
 
package tasly.greathealth.oms.domain.principal;

import com.hybris.kernel.api.*;

import com.hybris.kernel.api.ManagedObject;

  
/**
 * Generated managedobject class for type DataPrincipalData first defined at extension <code>oms-tasly-ext-principal</code>.
 * <p/>
 * .
 */
public interface DataPrincipalData extends ManagedObject
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "DataPrincipalData";
	
	/** <i>Generated constant</i> - Attribute key of <code>DataPrincipalData.group</code> attribute defined at extension <code>oms-tasly-ext-principal</code>. */
	AttributeType<DataPrincipalData, String> GROUP = new AttributeType<>("group");
	/** <i>Generated constant</i> - Attribute key of <code>DataPrincipalData.principal</code> attribute defined at extension <code>oms-tasly-ext-principal</code>. */
	AttributeType<DataPrincipalData, String> PRINCIPAL = new AttributeType<>("principal");
	/** <i>Generated constant</i> - Attribute key of <code>DataPrincipalData.active</code> attribute defined at extension <code>oms-tasly-ext-principal</code>. */
	AttributeType<DataPrincipalData, Boolean> ACTIVE = new AttributeType<>("active");
	/** <i>Generated constant</i> - Attribute key of <code>DataPrincipalData.uniqueid</code> attribute defined at extension <code>oms-tasly-ext-principal</code>. */
	AttributeType<DataPrincipalData, String> UNIQUEID = new AttributeType<>("uniqueid");
	/** <i>Generated constant</i> - Attribute key of <code>DataPrincipalData.isGroup</code> attribute defined at extension <code>oms-tasly-ext-principal</code>. */
	AttributeType<DataPrincipalData, Boolean> ISGROUP = new AttributeType<>("isGroup");

	/** <i>Generated constant</i> - Index of <code>DataPrincipalData</code> type defined at extension <code>oms-tasly-ext-principal</code>. */
	UniqueIndexSingle<DataPrincipalData, String> UX_DATAPRINCIPALS_UNIQUEID = new UniqueIndexSingle<>("UX_dataPrincipals_uniqueid", DataPrincipalData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>DataPrincipalData.uniqueid</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.
	 * <p/>
	 * .
	 * 
	 * @return the uniqueid
	 */
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max=255)
	java.lang.String getUniqueid();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataPrincipalData.isGroup</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.
	 * <p/>
	 * .
	 * 
	 * @return the isGroup
	 */
	@javax.validation.constraints.NotNull
	boolean isIsGroup();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataPrincipalData.group</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.
	 * <p/>
	 * .
	 * 
	 * @return the group
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getGroup();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataPrincipalData.principal</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.
	 * <p/>
	 * .
	 * 
	 * @return the principal
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getPrincipal();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataPrincipalData.active</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.
	 * <p/>
	 * .
	 * 
	 * @return the active
	 */
	boolean isActive();
	

	/**
	 * <i>Generated method</i> - Setter of <code>DataPrincipalData.uniqueid</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the uniqueid
	 */
	void setUniqueid(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>DataPrincipalData.isGroup</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the isGroup
	 */
	void setIsGroup(final boolean value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>DataPrincipalData.group</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the group
	 */
	void setGroup(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>DataPrincipalData.principal</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the principal
	 */
	void setPrincipal(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>DataPrincipalData.active</code> attribute defined at extension <code>oms-tasly-ext-principal</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the active
	 */
	void setActive(final boolean value);
	
}
