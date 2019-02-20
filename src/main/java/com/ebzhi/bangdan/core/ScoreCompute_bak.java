package com.ebzhi.bangdan.core;

import com.ebzhi.bangdan.entity.WeiboBangdan;
import com.ebzhi.bangdan.entity.WeixinBangdan;

public class ScoreCompute_bak {

	public static double weixinScore(WeixinBangdan weixinBangdan) {
		return 90.00;
	}
	
	public static double weiboScore(WeiboBangdan weiboBangdan) {
		return 80.00;
	}
	
	public static double totalScore(Double weixinScore, Double weiboScore) {
		if (null != weixinScore && weixinScore != 0) {
			if (null != weiboScore && weiboScore != 0) {
				return 0.5 * weixinScore + 0.5 * weiboScore;
			}else{
				return weixinScore;
			}
		}else{
			if (null != weiboScore && weiboScore != 0) {
				return weiboScore;
			}else{
				return 0;
			}
		}
	}
}
