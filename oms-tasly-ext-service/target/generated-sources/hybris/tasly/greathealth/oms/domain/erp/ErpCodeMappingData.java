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
 * Generated managedobject class for type ErpCodeMappingData first defined at extension <code>oms-tasly-ext-erp-integration</code>.
 * <p/>
 * .
 */
public interface ErpCodeMappingData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "ErpCodeMappingData";
	
	/** <i>Generated constant</i> - Attribute key of <code>ErpCodeMappingData.type</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>. */
	AttributeType<ErpCodeMappingData, String> TYPE = new AttributeType<>("type");
	/** <i>Generated constant</i> - Attribute key of <code>ErpCodeMappingData.souceCode</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>. */
	AttributeType<ErpCodeMappingData, String> SOUCECODE = new AttributeType<>("souceCode");
	/** <i>Generated constant</i> - Attribute key of <code>ErpCodeMappingData.comments</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>. */
	AttributeType<ErpCodeMappingData, String> COMMENTS = new AttributeType<>("comments");
	/** <i>Generated constant</i> - Attribute key of <code>ErpCodeMappingData.targetCode</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>. */
	AttributeType<ErpCodeMappingData, String> TARGETCODE = new AttributeType<>("targetCode");


	/**
	 * <i>Generated method</i> - Getter of the <code>ErpCodeMappingData.type</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.
	 * <p/>
	 * type of field.
	 * 
	 * @return the type
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getType();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ErpCodeMappingData.souceCode</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.
	 * <p/>
	 * OMS souce code.
	 * 
	 * @return the souceCode
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getSouceCode();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ErpCodeMappingData.targetCode</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.
	 * <p/>
	 * ECC needed code.
	 * 
	 * @return the targetCode
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getTargetCode();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ErpCodeMappingData.comments</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.
	 * <p/>
	 * comments.
	 * 
	 * @return the comments
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getComments();
	

	/**
	 * <i>Generated method</i> - Setter of <code>ErpCodeMappingData.type</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.  
	 * <p/>
	 * type of field.
	 *
	 * @param value the type
	 */
	void setType(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ErpCodeMappingData.souceCode</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.  
	 * <p/>
	 * OMS souce code.
	 *
	 * @param value the souceCode
	 */
	void setSouceCode(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ErpCodeMappingData.targetCode</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.  
	 * <p/>
	 * ECC needed code.
	 *
	 * @param value the targetCode
	 */
	void setTargetCode(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>ErpCodeMappingData.comments</code> attribute defined at extension <code>oms-tasly-ext-erp-integration</code>.  
	 * <p/>
	 * comments.
	 *
	 * @param value the comments
	 */
	void setComments(final java.lang.String value);
	
}
