package com.ebzhi.bangdan.entity;

public class BangdanScore {
	private Integer id;

	private Integer unitId;

	private String unitProvince;

	private String yearMonthTime;

	private Double weiboScore;

	private Double weixinScore;

	private Double totalScore;

	private Integer scoreIndex;

	private Integer scoreType;

	private WeixinBangdan weixinBangdan;

	private WeiboBangdan weiboBangdan;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getUnitProvince() {
		return unitProvince;
	}

	public void setUnitProvince(String unitProvince) {
		this.unitProvince = unitProvince == null ? null : unitProvince.trim();
	}

	public String getYearMonthTime() {
		return yearMonthTime;
	}

	public void setYearMonthTime(String yearMonthTime) {
		this.yearMonthTime = yearMonthTime == null ? null : yearMonthTime.trim();
	}

	public Double getWeiboScore() {
		return weiboScore;
	}

	public void setWeiboScore(Double weiboScore) {
		this.weiboScore = weiboScore;
	}

	public Double getWeixinScore() {
		return weixinScore;
	}

	public void setWeixinScore(Double weixinScore) {
		this.weixinScore = weixinScore;
	}

	public Double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}

	public Integer getScoreIndex() {
		return scoreIndex;
	}

	public void setScoreIndex(Integer scoreIndex) {
		this.scoreIndex = scoreIndex;
	}

	public Integer getScoreType() {
		return scoreType;
	}

	public void setScoreType(Integer scoreType) {
		this.scoreType = scoreType;
	}

	public WeixinBangdan getWeixinBangdan() {
		return weixinBangdan;
	}

	public void setWeixinBangdan(WeixinBangdan weixinBangdan) {
		this.weixinBangdan = weixinBangdan;
	}

	public WeiboBangdan getWeiboBangdan() {
		return weiboBangdan;
	}

	public void setWeiboBangdan(WeiboBangdan weiboBangdan) {
		this.weiboBangdan = weiboBangdan;
	}

}