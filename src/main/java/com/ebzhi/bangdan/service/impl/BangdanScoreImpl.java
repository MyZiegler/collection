package com.ebzhi.bangdan.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ebzhi.bangdan.entity.*;
import org.springframework.stereotype.Service;

import com.ebzhi.bangdan.core.ScoreCompute;
import com.ebzhi.bangdan.entity.BangdanScoreExample.Criteria;
import com.ebzhi.bangdan.entity.base.WeiboBase;
import com.ebzhi.bangdan.entity.base.WeixinBase;
import com.ebzhi.bangdan.service.BangdanScoreService;
import com.ebzhi.bangdan.service.base.BaseService;
import com.github.pagehelper.PageHelper;

@Service
public class BangdanScoreImpl extends BaseService implements BangdanScoreService {

	@Override
	public void initScore(String yearMonth) {

		//查询当月上传的权重值
		WeixinWeight weixinWeight = weixinWeightMapper.selectByLocalMonth(yearMonth) ;
		WeiboWeight weiboWeight = weiboWeightMapper.selectByLocalMonth(yearMonth);
		// 计算微信分数
		WeixinBangdanExample weixinBangdanExample = new WeixinBangdanExample();
		weixinBangdanExample.createCriteria().andUnitProvinceNotEqualTo("中央").andYearMonthTimeEqualTo(yearMonth);
		List<WeixinBangdan> weixinBangdans = weixinBangdanMapper.selectByExample(weixinBangdanExample);
		if (null != weixinBangdans && weixinBangdans.size() > 0) {
			// 根据年月份获取微信算分基数
			WeixinBase weixinBase = weixinBangdanService.getWeixinBaseByYearMonth(yearMonth, null);
			for (WeixinBangdan weixinBangdan : weixinBangdans) {
				// 计算微信分数
				double weixinScore = ScoreCompute.weixinScore(weixinBangdan, weixinBase, weixinWeight);
				BangdanScore bangdanScore = new BangdanScore();
				bangdanScore.setUnitId(weixinBangdan.getUnitId());
				bangdanScore.setUnitProvince(weixinBangdan.getUnitProvince());
				bangdanScore.setYearMonthTime(weixinBangdan.getYearMonthTime());
				bangdanScore.setWeixinScore(weixinScore);
				bangdanScore.setWeiboScore(0.0);
				// 计算微信微博总分
				double totalScore = ScoreCompute.totalScore(weixinScore, null);
				bangdanScore.setTotalScore(totalScore);
				bangdanScore.setScoreType(0);	// 地方各自分数
				// 添加榜单分数
				bangdanScoreMapper.insertSelective(bangdanScore);
			}
		}
		// 计算微博分数
		WeiboBangdanExample weiboBangdanExample = new WeiboBangdanExample();
		weiboBangdanExample.createCriteria().andUnitProvinceNotEqualTo("中央").andYearMonthTimeEqualTo(yearMonth);
		List<WeiboBangdan> weiboBangdans = weiboBangdanMapper.selectByExample(weiboBangdanExample);
		if (null != weiboBangdans && weiboBangdans.size() > 0) {
			// 根据年月份获取微博算分基数
			WeiboBase weiboBase = weiboBangdanService.getWeiboBaseByYearMonth(yearMonth, null);
			for (WeiboBangdan weiboBangdan : weiboBangdans) {
				// 计算微博得分
				double weiboScore = ScoreCompute.weiboScore(weiboBangdan, weiboBase,weiboWeight);
				Integer unitId = weiboBangdan.getUnitId();
				String yearMonthTime = weiboBangdan.getYearMonthTime();
				BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
				Criteria criteria = bangdanScoreExample.createCriteria();
				criteria.andUnitIdEqualTo(unitId);
				criteria.andYearMonthTimeEqualTo(yearMonthTime);
				List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
				if (null != bangdanScores && bangdanScores.size() > 0) {
					BangdanScore bangdanScore = bangdanScores.get(0);
					bangdanScore.setWeiboScore(weiboScore);
					// 计算微信微博合计总分
					Double weixinScore = bangdanScore.getWeixinScore();
					double totalScore = ScoreCompute.totalScore(weixinScore, weiboScore);
					bangdanScore.setTotalScore(totalScore);
					bangdanScoreMapper.updateByPrimaryKeySelective(bangdanScore);
				}else {
					BangdanScore bangdanScore = new BangdanScore();
					bangdanScore.setUnitId(weiboBangdan.getUnitId());
					bangdanScore.setUnitProvince(weiboBangdan.getUnitProvince());
					bangdanScore.setYearMonthTime(weiboBangdan.getYearMonthTime());
					bangdanScore.setWeixinScore(0.0);
					bangdanScore.setWeiboScore(weiboScore);
					double totalScore = ScoreCompute.totalScore(null, weiboScore);
					bangdanScore.setTotalScore(totalScore);
					bangdanScore.setScoreType(0);	// 地方各自分数
					// 添加榜单分数
					bangdanScoreMapper.insertSelective(bangdanScore);
				}
			}
		}
		System.out.println("完成地方统计");
		provinceScore();
	}

	@Override
	public void provinceScore() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.createCriteria().andUnitProvinceNotEqualTo("中央");
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		if (null != bangdanScores && bangdanScores.size() > 0) {
			// 查询所有省份信息
			JianchaUnitExample jianchaUnitExample = new JianchaUnitExample();
			jianchaUnitExample.createCriteria().andUnitLevelEqualTo(1);
			List<JianchaUnit> jianchaUnits = jianchaUnitMapper.selectByExample(jianchaUnitExample);
			Map<String, Integer> unitMap = new HashMap<>();
			for (JianchaUnit jianchaUnit : jianchaUnits) {
				unitMap.put(jianchaUnit.getUnitProvince(), jianchaUnit.getId());
			}
			Map<String, List<BangdanScore>> provinceMap = new HashMap<>();
			for (BangdanScore bangdanScore : bangdanScores) {
				String unitProvince = bangdanScore.getUnitProvince();
				if (provinceMap.containsKey(unitProvince)) {
					provinceMap.get(unitProvince).add(bangdanScore);
				}else{
					List<BangdanScore> scoreList = new ArrayList<>();
					scoreList.add(bangdanScore);
					provinceMap.put(unitProvince, scoreList);
				}
			}
			// 遍历所有省份
			for (Entry<String, List<BangdanScore>> entry : provinceMap.entrySet()) {
				String unitProvince = entry.getKey();
				Double weixinScoreTotal = 0.0;
				Double weiboScoreTotal = 0.0;
				int weixinCount = 0;
				int weiboCount = 0;
				List<BangdanScore> scoreList = entry.getValue();
				for (BangdanScore bangdanScore : scoreList) {
					Double weixinScore = bangdanScore.getWeixinScore();
					if (null != weixinScore) {
						weixinScoreTotal += weixinScore;
						weixinCount ++;
					}
					Double weiboScore = bangdanScore.getWeiboScore();
					if (null != weiboScore) {
						weiboScoreTotal += weiboScore;
						weiboCount ++;
					}
				}
				// 计算微信分数
				Double weixinScore = 0.0;
				if (weixinCount > 0) {
					weixinScore = weixinScoreTotal / weixinCount;
				}
				// 计算微博分数
				Double weiboScore = 0.0;
				if (weiboCount > 0) {
					weiboScore = weiboScoreTotal / weiboCount;
				}
				// 添加
				BangdanScore bangdanScore = new BangdanScore();
				bangdanScore.setUnitId(unitMap.get(unitProvince));
				bangdanScore.setUnitProvince(unitProvince);
				bangdanScore.setYearMonthTime(scoreList.get(0).getYearMonthTime());
				bangdanScore.setWeixinScore(ScoreCompute.decimalTwo(weixinScore));
				bangdanScore.setWeiboScore(ScoreCompute.decimalTwo(weiboScore));
				double totalScore = ScoreCompute.totalScore(weixinScore, weiboScore);
				bangdanScore.setTotalScore(totalScore);
				bangdanScore.setScoreType(1);	// 地方各自分数
				// 添加榜单分数
				bangdanScoreMapper.insertSelective(bangdanScore);
			}		
		}
		System.out.println("完成省级统计");
	}

	@Override
	public List<BangdanScore> provinceRankTop20() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("total_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(1);
		PageHelper.offsetPage(0, 20);
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		return bangdanScores;
	}

	@Override
	public List<BangdanScore> provinceWeixinRankTop20() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("weixin_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(1);
		PageHelper.offsetPage(0, 20);
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		if (null != bangdanScores && bangdanScores.size() > 0) {
			for (BangdanScore bangdanScore : bangdanScores) {
				WeixinBangdanExample weixinBangdanExample = new WeixinBangdanExample(); 
				weixinBangdanExample.createCriteria().andUnitIdEqualTo(bangdanScore.getId());
				List<WeixinBangdan> weixinBangdans = weixinBangdanMapper.selectByExample(weixinBangdanExample);
				if (null != weixinBangdans && weixinBangdans.size() > 0) {
					bangdanScore.setWeixinBangdan(weixinBangdans.get(0));
				}
			}
		}
		return bangdanScores;
	}

	@Override
	public List<BangdanScore> provinceWeiboRankTop20() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("weibo_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(1);
		PageHelper.offsetPage(0, 20);
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		if (null != bangdanScores && bangdanScores.size() > 0) {
			for (BangdanScore bangdanScore : bangdanScores) {
				WeiboBangdanExample weiboBangdanExample = new WeiboBangdanExample(); 
				weiboBangdanExample.createCriteria().andUnitIdEqualTo(bangdanScore.getId());
				List<WeiboBangdan> weiboBangdans = weiboBangdanMapper.selectByExample(weiboBangdanExample);
				if (null != weiboBangdans && weiboBangdans.size() > 0) {
					bangdanScore.setWeiboBangdan(weiboBangdans.get(0));
				}
			}
		}
		return bangdanScores;
	}

	@Override
	public List<BangdanScore> regionRankTop20() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("total_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(0);
		PageHelper.offsetPage(0, 20);
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		return bangdanScores;
	}

	@Override
	public List<BangdanScore> regionWeixinRankTop20() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("weixin_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(0);
		PageHelper.offsetPage(0, 20);
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		if (null != bangdanScores && bangdanScores.size() > 0) {
			for (BangdanScore bangdanScore : bangdanScores) {
				WeixinBangdanExample weixinBangdanExample = new WeixinBangdanExample(); 
				weixinBangdanExample.createCriteria().andUnitIdEqualTo(bangdanScore.getId());
				List<WeixinBangdan> weixinBangdans = weixinBangdanMapper.selectByExample(weixinBangdanExample);
				if (null != weixinBangdans && weixinBangdans.size() > 0) {
					bangdanScore.setWeixinBangdan(weixinBangdans.get(0));
				}
			}
		}
		return bangdanScores;
	}

	@Override
	public List<BangdanScore> regionWeiboRankTop20() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("weibo_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(0);
		PageHelper.offsetPage(0, 20);
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		if (null != bangdanScores && bangdanScores.size() > 0) {
			for (BangdanScore bangdanScore : bangdanScores) {
				WeiboBangdanExample weiboBangdanExample = new WeiboBangdanExample(); 
				weiboBangdanExample.createCriteria().andUnitIdEqualTo(bangdanScore.getId());
				List<WeiboBangdan> weiboBangdans = weiboBangdanMapper.selectByExample(weiboBangdanExample);
				if (null != weiboBangdans && weiboBangdans.size() > 0) {
					bangdanScore.setWeiboBangdan(weiboBangdans.get(0));
				}
			}
		}
		return bangdanScores;
	}

	// 获取天津各院总分内部排名+全国排名
	@Override
	public List<BangdanScore> tianjinRank() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("total_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(0).andUnitProvinceEqualTo("天津");
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		return bangdanScores;
	}

	// 获取天津各院微信内部排名+全国排名
	@Override
	public List<BangdanScore> tianjinWeixinRank() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("weixin_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(0).andUnitProvinceEqualTo("天津");
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		if (null != bangdanScores && bangdanScores.size() > 0) {
			for (BangdanScore bangdanScore : bangdanScores) {
				WeixinBangdanExample weixinBangdanExample = new WeixinBangdanExample(); 
				weixinBangdanExample.createCriteria().andUnitIdEqualTo(bangdanScore.getId());
				List<WeixinBangdan> weixinBangdans = weixinBangdanMapper.selectByExample(weixinBangdanExample);
				if (null != weixinBangdans && weixinBangdans.size() > 0) {
					bangdanScore.setWeixinBangdan(weixinBangdans.get(0));
				}
			}
		}
		return bangdanScores;
	}

	// 获取天津各院微博内部排名+全国排名
	@Override
	public List<BangdanScore> tianjinWeiboRank() {
		BangdanScoreExample bangdanScoreExample = new BangdanScoreExample(); 
		bangdanScoreExample.setOrderByClause("weibo_score desc");
		bangdanScoreExample.createCriteria().andScoreTypeEqualTo(0).andUnitProvinceEqualTo("天津");
		List<BangdanScore> bangdanScores = bangdanScoreMapper.selectByExample(bangdanScoreExample);
		if (null != bangdanScores && bangdanScores.size() > 0) {
			for (BangdanScore bangdanScore : bangdanScores) {
				WeiboBangdanExample weiboBangdanExample = new WeiboBangdanExample(); 
				weiboBangdanExample.createCriteria().andUnitIdEqualTo(bangdanScore.getId());
				List<WeiboBangdan> weiboBangdans = weiboBangdanMapper.selectByExample(weiboBangdanExample);
				if (null != weiboBangdans && weiboBangdans.size() > 0) {
					bangdanScore.setWeiboBangdan(weiboBangdans.get(0));
				}
			}
		}
		return bangdanScores;
	}
}
