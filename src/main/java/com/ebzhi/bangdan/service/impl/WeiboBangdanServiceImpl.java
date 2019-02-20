package com.ebzhi.bangdan.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ebzhi.bangdan.entity.base.WeiboBase;
import com.ebzhi.bangdan.service.WeiboBangdanService;
import com.ebzhi.bangdan.service.base.BaseService;

@Service
public class WeiboBangdanServiceImpl extends BaseService implements WeiboBangdanService {

	@Override
	public WeiboBase getWeiboBaseByYearMonth(String yearMonth, List<Integer> idList) {
		return weiboBangdanMapper.getWeiboBaseByYearMonth(yearMonth, idList);
	}

}
