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
 */
package tasly.greathealth.tmall.order.commands;

import java.util.Date;

import org.slf4j.Logger;

import tasly.greathealth.oms.domain.order.EventType;
import tasly.greathealth.oms.domain.order.InnerSource;
import tasly.greathealth.oms.domain.order.OrderState;
import tasly.greathealth.oms.log.OmsLoggerFactory;
import tasly.greathealth.tmall.order.services.OmsOrderRetrieveService;

import com.taobao.api.domain.Trade;
import com.taobao.api.internal.tmc.Message;


/**
 *
 */
public class CreateTmallRefundCommand extends AbstractTmallOrderCommand
{

	private static final Logger LOG = OmsLoggerFactory.getTmallorderlog();

	public CreateTmallRefundCommand(final OmsOrderRetrieveService<Trade> omsOrderRetrieveService, final Message message,
			final InnerSource innerSource)
	{
		super(omsOrderRetrieveService, message, innerSource);
	}

	@Override
	public void execute()
	{
		LOG.info("CreateTmallRefundCommand#####" + this.getInnerSource());
		final String tmallTid = this.getTmallTidFromMsg();
		final String tmallOid = this.getTmallOidFromMsg();
		final String refundFee = this.getTmallRefundFeeFromMsg();
		final Date eventTime = getTmallEventtimeFromMsg();
		Trade trade;
		try
		{
			trade = omsOrderRetrieveService.retrieveOrderDetail(tmallTid);
			final String currentState = getLineLevelState(trade, tmallOid);
			if (WAIT_SELLER_SEND_GOODS.equalsIgnoreCase(currentState))
			{
				// 未发货退款
				omsOrderRetrieveService.createRefund(tmallTid, tmallOid, refundFee, false);
			}
			else if (WAIT_BUYER_CONFIRM_GOODS.equalsIgnoreCase(currentState) || TRADE_FINISHED.equalsIgnoreCase(currentState))
			{
				// 已发货/已收货退款
				omsOrderRetrieveService.createRefund(tmallTid, tmallOid, refundFee, true);
			}
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
			omsOrderRetrieveService.saveFailedOrder(tmallTid, tmallOid, refundFee, EventType.REFUNDCREATE, e.getMessage(),
					OrderState.FAIL, null, eventTime, this.getChannelSource(), this.getInnerSource());
			throw new RuntimeException("Error happened when create refund. " + this.getInnerSource() + " TID[" + tmallTid
					+ "] ERROR[" + e.getMessage() + "]");
		}
	}

	@Override
	public tasly.greathealth.thirdparty.order.EventType getEventType()
	{
		return tasly.greathealth.thirdparty.order.EventType.REFUNDCREATE;
	}
}
