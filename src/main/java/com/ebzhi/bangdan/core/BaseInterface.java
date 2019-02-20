package com.ebzhi.bangdan.core;

import org.springframework.beans.factory.annotation.Autowired;

import com.ebzhi.bangdan.service.BangdanScoreService;
import com.ebzhi.bangdan.service.JianchaUnitService;
import com.ebzhi.bangdan.service.WeiboBangdanService;
import com.ebzhi.bangdan.service.WeixinBangdanService;

/**
 *	项目Service接口集合
 */
public class
BaseInterface {
	
	@Autowired
	protected WeiboBangdanService weiboBangdanService;
	
	@Autowired
	protected WeixinBangdanService weixinBangdanService;
	
	@Autowired
	protected BangdanScoreService bangdanScoreService;
	
	@Autowired
	protected JianchaUnitService jianchaUnitService;
	
}
