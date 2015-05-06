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
 * Generated managedobject class for type SkuToProductData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface SkuToProductData extends ManagedObject, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "SkuToProductData";
	
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.itemName</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, String> ITEMNAME = new AttributeType<>("itemName");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.channel</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, String> CHANNEL = new AttributeType<>("channel");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.percent</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, Integer> PERCENT = new AttributeType<>("percent");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.itemId</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, String> ITEMID = new AttributeType<>("itemId");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.innerSource</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, String> INNERSOURCE = new AttributeType<>("innerSource");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.quantity</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, Integer> QUANTITY = new AttributeType<>("quantity");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.outerId</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, String> OUTERID = new AttributeType<>("outerId");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.lockStatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, String> LOCKSTATUS = new AttributeType<>("lockStatus");
	/** <i>Generated constant</i> - Attribute key of <code>SkuToProductData.ratio</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<SkuToProductData, Double> RATIO = new AttributeType<>("ratio");


	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.channel</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the channel
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getChannel();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.outerId</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the outerId
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getOuterId();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.itemId</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the itemId
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getItemId();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.itemName</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the itemName
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getItemName();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.quantity</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the quantity
	 */
	int getQuantity();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.ratio</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the ratio
	 */
	double getRatio();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.innerSource</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the innerSource
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getInnerSource();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.percent</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the percent
	 */
	int getPercent();
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SkuToProductData.lockStatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * .
	 * 
	 * @return the lockStatus
	 */
	@javax.validation.constraints.Size(max=255)
	java.lang.String getLockStatus();
	

	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.channel</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the channel
	 */
	void setChannel(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.outerId</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the outerId
	 */
	void setOuterId(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.itemId</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the itemId
	 */
	void setItemId(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.itemName</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the itemName
	 */
	void setItemName(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.quantity</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the quantity
	 */
	void setQuantity(final int value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.ratio</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the ratio
	 */
	void setRatio(final double value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.innerSource</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the innerSource
	 */
	void setInnerSource(final java.lang.String value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.percent</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the percent
	 */
	void setPercent(final int value);
	
	/**
	 * <i>Generated method</i> - Setter of <code>SkuToProductData.lockStatus</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * .
	 *
	 * @param value the lockStatus
	 */
	void setLockStatus(final java.lang.String value);
	
}
