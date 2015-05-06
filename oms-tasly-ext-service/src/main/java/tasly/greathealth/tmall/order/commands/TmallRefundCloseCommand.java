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
public class TmallRefundCloseCommand extends AbstractTmallOrderCommand
{

	private static final Logger LOG = OmsLoggerFactory.getTmallorderlog();

	public TmallRefundCloseCommand(final OmsOrderRetrieveService<Trade> omsOrderRetrieveService, final Message message,
			final InnerSource innerSource)
	{
		super(omsOrderRetrieveService, message, innerSource);
	}

	@Override
	public void execute()
	{
		LOG.info("TmallRefundCloseCommand#####" + this.getInnerSource());
		final String tmallTid = this.getTmallTidFromMsg();
		final String tmallOid = this.getTmallOidFromMsg();
		final Date eventTime = getTmallEventtimeFromMsg();
		Trade trade;
		try
		{
			trade = omsOrderRetrieveService.retrieveOrderDetail(tmallTid);
			final String currentState = getLineLevelState(trade, tmallOid);
			LOG.info("TID : " + tmallTid + " Current State : " + currentState);
			if (WAIT_SELLER_SEND_GOODS.equalsIgnoreCase(currentState))
			{
				// 未发货 未发货订单，取消订单锁定状态。所有行项目置"退款退货关闭"
				omsOrderRetrieveService.closeRefund(tmallTid, tmallOid, false);
			}
			else if (WAIT_BUYER_CONFIRM_GOODS.equalsIgnoreCase(currentState))
			{
				// 已发货 退款退货关闭
				omsOrderRetrieveService.closeRefund(tmallTid, tmallOid, true);
			}
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
			omsOrderRetrieveService.saveFailedOrder(tmallTid, tmallOid, null, EventType.REFUNDCLOSE, e.getMessage(),
					OrderState.FAIL, null, eventTime, this.getChannelSource(), this.getInnerSource());
			throw new RuntimeException("Error happened when handle refund close event. InnerSource:" + this.getInnerSource()
					+ " TID[" + tmallTid + "] ERROR[" + e.getMessage() + "]");
		}
	}

	@Override
	public tasly.greathealth.thirdparty.order.EventType getEventType()
	{
		return tasly.greathealth.thirdparty.order.EventType.REFUNDCLOSE;
	}
}
