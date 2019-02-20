package com.ebzhi.bangdan.service;

import java.util.List;

import com.ebzhi.bangdan.entity.WeixinBangdan;
import com.ebzhi.bangdan.entity.base.WeixinBase;

public interface WeixinBangdanService {

	List<WeixinBangdan> listAll();
	
	/**
	 * @param yearMonth 年月份
	 * @param idList id集合,可以为空
	 * @return
	 * 根据年月份和id集合获取微信算分基数
	 */
	WeixinBase getWeixinBaseByYearMonth(String yearMonth, List<Integer> idList);
}
