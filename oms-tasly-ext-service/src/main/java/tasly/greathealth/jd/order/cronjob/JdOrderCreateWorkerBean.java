/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package tasly.greathealth.jd.order.cronjob;

import com.hybris.kernel.api.JobWorkerBean;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import tasly.greathealth.oms.log.OmsLoggerFactory;
import tasly.greathealth.thirdparty.order.common.ProduceOrderService;


/**
 *
 * @author libin
 */
@Component
public class JdOrderCreateWorkerBean implements JobWorkerBean
{
	private static final long serialVersionUID = 357819854242895500L;

	private static final Logger LOG = OmsLoggerFactory.getJdorderlog();

	private String beanName;

	private ProduceOrderService jdJscProduceOrderService;

	@Override
	public void execute(final Serializable arg0)
	{
		LOG.info("开始同步JD订单到OMS: " + arg0);
		final long beginTime = System.currentTimeMillis();
		try
		{
			final List<String> jdOrderIds = jdJscProduceOrderService.produceOrders();
			LOG.info("京东JD订单同步工作完成！订单成功放到队列中的数量:" + jdOrderIds.size() + ",耗时:" + (System.currentTimeMillis() - beginTime) / 1000f
					+ " 秒 ");
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void setBeanName(final String name)
	{
		beanName = name;

	}

	@Override
	public String getBeanName()
	{

		return beanName;
	}

	/**
	 * @param jdJscProduceOrderService the jdJscProduceOrderService to set
	 */
	public void setJdJscProduceOrderService(final ProduceOrderService jdJscProduceOrderService)
	{
		this.jdJscProduceOrderService = jdJscProduceOrderService;
	}


}
