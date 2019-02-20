package com.ebzhi.bangdan.service;

import java.util.List;

import com.ebzhi.bangdan.entity.base.WeiboBase;

public interface WeiboBangdanService {

	/**
	 * @param yearMonth 年月份
	 * @param idList id集合,可以为空
	 * @return
	 * 根据年月份和id集合获取微博算分基数
	 */
	WeiboBase getWeiboBaseByYearMonth(String yearMonth, List<Integer> idList);

}
