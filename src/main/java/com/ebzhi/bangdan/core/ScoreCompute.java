package com.ebzhi.bangdan.core;
import java.math.BigDecimal;

import com.ebzhi.bangdan.entity.WeiboBangdan;
import com.ebzhi.bangdan.entity.WeiboWeight;
import com.ebzhi.bangdan.entity.WeixinBangdan;
import com.ebzhi.bangdan.entity.WeixinWeight;
import com.ebzhi.bangdan.entity.base.WeiboBase;
import com.ebzhi.bangdan.entity.base.WeixinBase;

public class ScoreCompute {
	
	public static double decimalTwo(double score) {
		BigDecimal bigDecimal = new BigDecimal(score);
		score = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
		return score;
	}
	
	public static double weixinScore(WeixinBangdan weixinbangdan){
		double weixinScore = 0;
		if (null != weixinbangdan.getArticleNum() && !weixinbangdan.getArticleNum().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getArticleNum()) / Math.log(325) * 15;
		}
		if (null != weixinbangdan.getPublishNum() && !weixinbangdan.getPublishNum().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getPublishNum()) / Math.log(148) * 15;
		}
		if (null != weixinbangdan.getReadNumAvg() && !weixinbangdan.getReadNumAvg().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getReadNumAvg()) / Math.log(93252) * 20;
		}
		if (null != weixinbangdan.getDianzanNumAvg() && !weixinbangdan.getDianzanNumAvg().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getDianzanNumAvg()) / Math.log(523) * 15;
		}
		if (null != weixinbangdan.getReadNumTop() && !weixinbangdan.getReadNumTop().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getReadNumTop()) / Math.log(100001) * 20;
		}
		if (null != weixinbangdan.getDianzanNumTop() && !weixinbangdan.getDianzanNumTop().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getDianzanNumTop()) / Math.log(7798) * 15;
		}
		weixinScore = decimalTwo(weixinScore * 0.5);
		return weixinScore;
	}
	
	public static double weiboScore(WeiboBangdan weibobangdan){
		double weiboScore = 0;
		if (null != weibobangdan.getFunsNum() && !weibobangdan.getFunsNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getFunsNum())/Math.log(29312346) * 25;
		}
		if (null != weibobangdan.getPeriodPublishTotal() && !weibobangdan.getPeriodPublishTotal().equals(0)) {
			weiboScore += Math.log(weibobangdan.getPeriodPublishTotal())/Math.log(4035) * 5;
		}
		if (null != weibobangdan.getOriginalNum() && !weibobangdan.getOriginalNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getOriginalNum())/Math.log(1552) * 15;
		}
		if (null != weibobangdan.getPinglunNum() && !weibobangdan.getPinglunNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getPinglunNum())/Math.log(98260) * 15;
		}
		if (null != weibobangdan.getZhuanfaNum() && !weibobangdan.getZhuanfaNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getZhuanfaNum())/Math.log(192265) * 20;
		}
		if (null != weibobangdan.getDianzanNum() && !weibobangdan.getDianzanNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getDianzanNum())/Math.log(462960) * 20;
		}
		weiboScore = decimalTwo(weiboScore * 0.5);
		return weiboScore;
	}
	
	public static double weixinScore(WeixinBangdan weixinbangdan, WeixinBase weixinBase, WeixinWeight weixinweight){
		double weixinScore = 0;
		if (null != weixinbangdan.getArticleNum() && !weixinbangdan.getArticleNum().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getArticleNum()) / Math.log(weixinBase.getMaxArticleNum() + 1) * weixinweight.getArticleNumWeight();
		}
		if (null != weixinbangdan.getPublishNum() && !weixinbangdan.getPublishNum().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getPublishNum()) / Math.log(weixinBase.getMaxPublishNum() + 1) * weixinweight.getPublishNumWeight();
		}
		if (null != weixinbangdan.getReadNumAvg() && !weixinbangdan.getReadNumAvg().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getReadNumAvg()) / Math.log(weixinBase.getMaxReadNumAvg() + 1) * weixinweight.getReadNumAvgWeight();
		}
		if (null != weixinbangdan.getDianzanNumAvg() && !weixinbangdan.getDianzanNumAvg().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getDianzanNumAvg()) / Math.log(weixinBase.getMaxDianzanNumAvg() + 1) * weixinweight.getDianzanNumAvgWeight();
		}
		if (null != weixinbangdan.getReadNumTop() && !weixinbangdan.getReadNumTop().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getReadNumTop()) / Math.log(weixinBase.getMaxReadNumTop() + 1) * weixinweight.getReadNumTopWeight();
		}
		if (null != weixinbangdan.getDianzanNumTop() && !weixinbangdan.getDianzanNumTop().equals(0)) {
			weixinScore += Math.log(weixinbangdan.getDianzanNumTop()) / Math.log(weixinBase.getMaxDianzanNumTop() + 1) * weixinweight.getDianzanNumTopWeight();
		}
		weixinScore = decimalTwo(weixinScore * 0.5);
		return weixinScore;
	}
	
	public static double weiboScore(WeiboBangdan weibobangdan, WeiboBase weiboBase, WeiboWeight weiboweight){
		double weiboScore = 0;
		if (null != weibobangdan.getFunsNum() && !weibobangdan.getFunsNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getFunsNum())/Math.log(weiboBase.getMaxFunsNum() + 1) * weiboweight.getFunsNumWeight();
		}
		if (null != weibobangdan.getPeriodPublishTotal() && !weibobangdan.getPeriodPublishTotal().equals(0)) {
			weiboScore += Math.log(weibobangdan.getPeriodPublishTotal())/Math.log(weiboBase.getMaxPeriodPublishTotal() + 1) * weiboweight.getPeriodPublishTotalWeight();
		}
		if (null != weibobangdan.getOriginalNum() && !weibobangdan.getOriginalNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getOriginalNum())/Math.log(weiboBase.getMaxOriginalNum() + 1) * weiboweight.getOriginalNumWeight();
		}
		if (null != weibobangdan.getPinglunNum() && !weibobangdan.getPinglunNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getPinglunNum())/Math.log(weiboBase.getMaxPinglunNum() + 1) * weiboweight.getPinglunNumWeight();
		}
		if (null != weibobangdan.getZhuanfaNum() && !weibobangdan.getZhuanfaNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getZhuanfaNum())/Math.log(weiboBase.getMaxZhuanfaNum() + 1) * weiboweight.getZhuanfaNumWeight();
		}
		if (null != weibobangdan.getDianzanNum() && !weibobangdan.getDianzanNum().equals(0)) {
			weiboScore += Math.log(weibobangdan.getDianzanNum())/Math.log(weiboBase.getMaxDianzanNum() + 1) * weiboweight.getDianzanNumWeight();
		}
		weiboScore = decimalTwo(weiboScore * 0.5);
		return weiboScore;
	}
	
/*	public static double weixinScore(WeixinBangdan weixinbangdan, WeixinBase weixinBase,WeixinWeight weixinweight){
		return Math.log(weixinbangdan.getArticleNum())/Math.log(75)*weixinweight.getArticleNumWeight()+
				Math.log(weixinbangdan.getPublishNum())/Math.log(30)*weixinweight.getPublishNumWeight()+
				Math.log(weixinbangdan.getReadNumAvg())/Math.log(1500)*weixinweight.getReadNumAvgWeight()+
				Math.log(weixinbangdan.getDianzanNumAvg())/Math.log(140)*weixinweight.getDianzanNumAvgWeight()+
				Math.log(weixinbangdan.getReadNumTop())/Math.log(13000)*weixinweight.getReadNumTopWeight()+
				Math.log(weixinbangdan.getDianzanNumTop())/Math.log(1300)*weixinweight.getDianzanNumTopWeight();
	}*/
	
	public static double weiboScore(WeiboBangdan weibobangdan, WeiboWeight weiboweight){
		return Math.log(weibobangdan.getFunsNum())/Math.log(1200000)*weiboweight.getFunsNumWeight()+
				Math.log(weibobangdan.getPublishTotal())/Math.log(250)*weiboweight.getPeriodPublishTotalWeight()+
				Math.log(weibobangdan.getPeriodPublishTotal())/Math.log(210)*weiboweight.getOriginalNumWeight()+
				Math.log(weibobangdan.getPinglunNum())/Math.log(55)*weiboweight.getPinglunNumWeight()+
				Math.log(weibobangdan.getZhuanfaNum())/Math.log(180)*weiboweight.getZhuanfaNumWeight()+
				Math.log(weibobangdan.getDianzanNum())/Math.log(700)*weiboweight.getDianzanNumWeight();
	}
	
	public static double totalScore(Double weixinScore, Double weiboScore) {
		double totalScore = 0;
		if (null != weixinScore && weixinScore != 0) {
			if (null != weiboScore && weiboScore != 0) {
				totalScore = weixinScore + weiboScore;
			}else{
				totalScore = weixinScore;
			}
		}else{
			if (null != weiboScore && weiboScore != 0) {
				totalScore = weiboScore;
			}
		}
		totalScore = decimalTwo(totalScore);
		return totalScore;
	}
	
	/*public static void main(String[] args) {
		
		
		WeixinBangdan weixinBangdan = new WeixinBangdan(20, 12, 114, 4, 1280, 53);
		WeixinBangdan weixinBangdan = new WeixinBangdan(11, 6, 80, 0, 314, 2);
		double weixinScore = weixinScore(weixinBangdan);
		System.out.println(weixinScore);
		WeiboBangdan weiboBangdan = new WeiboBangdan(62340, 100, 54, 54, 171, 680);
		WeiboWeight weiboWeight = new WeiboWeight(25, 5, 15, 15, 20, 20);
		Test.WbScore(weiboBangdan,weiboWeight);
		
	}*/
}
