package com.ebzhi.bangdan.service.impl;

import com.ebzhi.bangdan.entity.WeiboWeight;
import com.ebzhi.bangdan.entity.WeixinBangdan;
import com.ebzhi.bangdan.entity.WeixinWeight;
import com.ebzhi.bangdan.entity.base.WeixinBase;
import com.ebzhi.bangdan.service.WeightService;
import com.ebzhi.bangdan.service.WeixinBangdanService;
import com.ebzhi.bangdan.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightServiceImpl extends BaseService implements WeightService {

	@Override
	public int insertWeixinWeight(WeixinWeight weixinWeight) {
	 	return 	weixinWeightMapper.insert(weixinWeight);
	}

	@Override
	public int insertWeiboWeight(WeiboWeight weiboWeight) {
		return weiboWeightMapper.insert(weiboWeight);
	}
}