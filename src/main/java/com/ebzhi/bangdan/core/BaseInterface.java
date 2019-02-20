package com.ebzhi.bangdan.core;

import com.ebzhi.bangdan.service.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *	项目Service接口集合
 */
public class BaseInterface {
	
	@Autowired
	protected WeiboBangdanService weiboBangdanService;
	
	@Autowired
	protected WeixinBangdanService weixinBangdanService;
	
	@Autowired
	protected BangdanScoreService bangdanScoreService;
	
	@Autowired
	protected JianchaUnitService jianchaUnitService;

	@Autowired
	protected WeightService weightService;
	
}
