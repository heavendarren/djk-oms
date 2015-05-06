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

import com.hybris.oms.service.managedobjects.order.PaymentInfoData;

    
/**
 * Generated managedobject class for type TaslyPaymentInfoData first defined at extension <code>oms-tasly-ext-order</code>.
 * <p/>
 * .
 */
public interface TaslyPaymentInfoData extends PaymentInfoData, PropertyAware
{
	/**<i>Generated managed object type code constant.</i>*/
	String _TYPECODE = "TaslyPaymentInfoData";
	
	/** <i>Generated constant</i> - Attribute key of <code>TaslyPaymentInfoData.issuedate</code> attribute defined at extension <code>oms-tasly-ext-order</code>. */
	AttributeType<TaslyPaymentInfoData, java.util.Date> ISSUEDATE = new AttributeType<>("issuedate");

	/** <i>Generated constant</i> - Index of <code>TaslyPaymentInfoData</code> type defined at extension <code>oms-tasly-ext-order</code>. */
	UniqueIndexSingle<TaslyPaymentInfoData, Long> UX_PAYMENTINFO_PAYMENTINFOID = new UniqueIndexSingle<>("UX_paymentInfo_paymentInfoId", TaslyPaymentInfoData.class);

	/**
	 * <i>Generated method</i> - Getter of the <code>TaslyPaymentInfoData.issuedate</code> attribute defined at extension <code>oms-tasly-ext-order</code>.
	 * <p/>
	 * 支付时间.
	 * 
	 * @return the issuedate
	 */
	java.util.Date getIssuedate();
	

	/**
	 * <i>Generated method</i> - Setter of <code>TaslyPaymentInfoData.issuedate</code> attribute defined at extension <code>oms-tasly-ext-order</code>.  
	 * <p/>
	 * 支付时间.
	 *
	 * @param value the issuedate
	 */
	void setIssuedate(final java.util.Date value);
	
}
