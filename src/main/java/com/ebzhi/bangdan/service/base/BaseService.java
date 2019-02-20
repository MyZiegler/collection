package com.ebzhi.bangdan.service.base;

import com.ebzhi.bangdan.entity.WeiboWeight;
import com.ebzhi.bangdan.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.ebzhi.bangdan.core.BaseInterface;

public class BaseService extends BaseInterface {

	@Autowired
	protected WeiboBangdanMapper weiboBangdanMapper;
	
	@Autowired
	protected WeixinBangdanMapper weixinBangdanMapper;
	
	@Autowired
	protected BangdanScoreMapper bangdanScoreMapper;
	
	@Autowired
	protected JianchaUnitMapper jianchaUnitMapper;

	@Autowired
	protected WeixinWeightMapper weixinWeightMapper;

	@Autowired
	protected WeiboWeightMapper weiboWeightMapper;
	
}
