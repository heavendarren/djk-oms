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
package tasly.greathealth.oms.order.services.impl;

import com.hybris.kernel.api.CriteriaQuery;
import com.hybris.kernel.api.RawRestrictions;
import com.hybris.kernel.api.Restriction;
import com.hybris.oms.domain.SortDirection;
import com.hybris.oms.service.service.AbstractQueryFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import tasly.greathealth.oms.api.order.ExpressQueryObject;
import tasly.greathealth.oms.api.order.dto.ExpressQuerySupport;
import tasly.greathealth.oms.domain.order.ExpressData;


/**
 * @author Henter Liu
 */
public class ExpressQueryFactory extends AbstractQueryFactory
{
	private static final Map<String, String> QUERY_SUPPORT_MAPPING = new HashMap<String, String>();

	static
	{
		QUERY_SUPPORT_MAPPING.put(ExpressQuerySupport.DEFAULT.name(), "name");
		QUERY_SUPPORT_MAPPING.put(ExpressQuerySupport.NAME.name(), "name");
		QUERY_SUPPORT_MAPPING.put(ExpressQuerySupport.CODE.name(), "code");
	}

	public CriteriaQuery<ExpressData> findExpressByQuery(final ExpressQueryObject query)
	{
		final CriteriaQuery<ExpressData> criteriaQuery = query(ExpressData.class);
		final List<Restriction> restrictions = new ArrayList<Restriction>();

		final String name = query.getName();
		if (StringUtils.isNotEmpty(name))
		{
			restrictions.add(RawRestrictions.like(ExpressData.NAME.name(), name));
		}
		final String code = query.getCode();
		if (StringUtils.isNotEmpty(code))
		{
			restrictions.add(RawRestrictions.like(ExpressData.CODE.name(), code));
		}

		applyingCollectedRestrictionsToCriteriaQuery(criteriaQuery, restrictions);
		criteriaQuery.order(QUERY_SUPPORT_MAPPING.get(query.getSorting().getAttribute()),
				SortDirection.ASC.equals(query.getSorting().getDirection()));

		return criteriaQuery;
	}

	protected CriteriaQuery<ExpressData> applyingCollectedRestrictionsToCriteriaQuery(final CriteriaQuery<ExpressData> origQuery,
			final List<Restriction> restrictions)
	{
		CriteriaQuery<ExpressData> criteriaQuery = origQuery;
		if (!(restrictions.isEmpty()))
		{
			criteriaQuery = criteriaQuery.where(restrictions.remove(0));

			for (final Restriction restriction : restrictions)
			{
				criteriaQuery = criteriaQuery.and(restriction);
			}
		}

		return criteriaQuery;
	}
}
