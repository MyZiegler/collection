package com.ebzhi.bangdan.service;

import java.util.List;

import com.ebzhi.bangdan.entity.BangdanScore;
import com.ebzhi.bangdan.entity.WeixinWeight;

public interface BangdanScoreService {

	void initScore(String yearMonth);
	
	void provinceScore();
	
	// 获取省域总榜排名前20名
	List<BangdanScore> provinceRankTop20();
	
	// 获取省域微信排名前20名
	List<BangdanScore> provinceWeixinRankTop20();
	
	// 获取省域微博排名前20名
	List<BangdanScore> provinceWeiboRankTop20();
	
	// 获取地方总榜排名前20名
	List<BangdanScore> regionRankTop20();
	
	// 获取地方微信排名前20名
	List<BangdanScore> regionWeixinRankTop20();
	
	// 获取地方微博排名前20名
	List<BangdanScore> regionWeiboRankTop20();
	
	// 获取天津各院总分内部排名+全国排名
	List<BangdanScore> tianjinRank();
	
	// 获取天津各院微信内部排名+全国排名
	List<BangdanScore> tianjinWeixinRank();
	
	// 获取天津各院微博内部排名+全国排名
	List<BangdanScore> tianjinWeiboRank();
}
