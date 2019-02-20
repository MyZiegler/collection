package com.ebzhi.bangdan.service;

import com.ebzhi.bangdan.entity.WeiboWeight;
import com.ebzhi.bangdan.entity.WeixinBangdan;
import com.ebzhi.bangdan.entity.WeixinWeight;
import com.ebzhi.bangdan.entity.base.WeixinBase;

import java.util.List;

public interface WeightService {

	int insertWeixinWeight(WeixinWeight weixinWeight);

	int insertWeiboWeight(WeiboWeight weiboWeight);

}
