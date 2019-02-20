package com.ebzhi.bangdan.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ebzhi.bangdan.entity.WeixinBangdan;
import com.ebzhi.bangdan.entity.base.WeixinBase;
import com.ebzhi.bangdan.service.WeixinBangdanService;
import com.ebzhi.bangdan.service.base.BaseService;

@Service
public class WeixinBangdanServiceImpl extends BaseService implements WeixinBangdanService {

	@Override
	public List<WeixinBangdan> listAll() {
		return null;
	}

	/**
	 * @param yearMonth
	 * @return
	 * 根据年月份获取微信算分基数
	 */
	@Override
	public WeixinBase getWeixinBaseByYearMonth(String yearMonth, List<Integer> idList) {
		return weixinBangdanMapper.getWeixinBaseByYearMonth(yearMonth, idList);
	}

}