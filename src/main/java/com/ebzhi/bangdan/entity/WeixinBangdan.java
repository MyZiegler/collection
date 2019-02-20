package com.ebzhi.bangdan.entity;

public class WeixinBangdan {
    private Integer id;

    private String yearMonthTime;

    private Integer unitId;

    private String weixinName;

    private String weixinNum;

    private Integer articleNum;

    private Integer publishNum;

    private Integer readNumTotal;

    private Integer dianzanNumTotal;

    private Integer readNumAvg;

    private Integer dianzanNumAvg;

    private Integer readNumTop;

    private Integer dianzanNumTop;

    private Integer readNumDayAvg;

    private Integer dianzanNumDayAvg;

    private Integer toutiaoReadNumTotal;

    private Integer toutiaoDianzanNumTotal;

    private Integer toutiaoReadNumAvg;

    private Integer toutiaoDianzanNumAvg;

    private Integer toutiaoReadNumDayAvg;

    private Integer toutiaoDianzanNumDayAvg;

    private Integer originalNum;

    private String unitProvince;

    private Integer unitLevel;

    private String unitFunction;

    private String unitName;
    
    

    public WeixinBangdan() {
		super();
	}
    
    

	public WeixinBangdan(Integer articleNum, Integer publishNum, Integer readNumAvg, Integer dianzanNumAvg,
			Integer readNumTop, Integer dianzanNumTop) {
		super();
		this.articleNum = articleNum;
		this.publishNum = publishNum;
		this.readNumAvg = readNumAvg;
		this.dianzanNumAvg = dianzanNumAvg;
		this.readNumTop = readNumTop;
		this.dianzanNumTop = dianzanNumTop;
	}



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYearMonthTime() {
        return yearMonthTime;
    }

    public void setYearMonthTime(String yearMonthTime) {
        this.yearMonthTime = yearMonthTime == null ? null : yearMonthTime.trim();
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getWeixinName() {
        return weixinName;
    }

    public void setWeixinName(String weixinName) {
        this.weixinName = weixinName == null ? null : weixinName.trim();
    }

    public String getWeixinNum() {
        return weixinNum;
    }

    public void setWeixinNum(String weixinNum) {
        this.weixinNum = weixinNum == null ? null : weixinNum.trim();
    }

    public Integer getArticleNum() {
        return articleNum;
    }

    public void setArticleNum(Integer articleNum) {
        this.articleNum = articleNum;
    }

    public Integer getPublishNum() {
        return publishNum;
    }

    public void setPublishNum(Integer publishNum) {
        this.publishNum = publishNum;
    }

    public Integer getReadNumTotal() {
        return readNumTotal;
    }

    public void setReadNumTotal(Integer readNumTotal) {
        this.readNumTotal = readNumTotal;
    }

    public Integer getDianzanNumTotal() {
        return dianzanNumTotal;
    }

    public void setDianzanNumTotal(Integer dianzanNumTotal) {
        this.dianzanNumTotal = dianzanNumTotal;
    }

    public Integer getReadNumAvg() {
        return readNumAvg;
    }

    public void setReadNumAvg(Integer readNumAvg) {
        this.readNumAvg = readNumAvg;
    }

    public Integer getDianzanNumAvg() {
        return dianzanNumAvg;
    }

    public void setDianzanNumAvg(Integer dianzanNumAvg) {
        this.dianzanNumAvg = dianzanNumAvg;
    }

    public Integer getReadNumTop() {
        return readNumTop;
    }

    public void setReadNumTop(Integer readNumTop) {
        this.readNumTop = readNumTop;
    }

    public Integer getDianzanNumTop() {
        return dianzanNumTop;
    }

    public void setDianzanNumTop(Integer dianzanNumTop) {
        this.dianzanNumTop = dianzanNumTop;
    }

    public Integer getReadNumDayAvg() {
        return readNumDayAvg;
    }

    public void setReadNumDayAvg(Integer readNumDayAvg) {
        this.readNumDayAvg = readNumDayAvg;
    }

    public Integer getDianzanNumDayAvg() {
        return dianzanNumDayAvg;
    }

    public void setDianzanNumDayAvg(Integer dianzanNumDayAvg) {
        this.dianzanNumDayAvg = dianzanNumDayAvg;
    }

    public Integer getToutiaoReadNumTotal() {
        return toutiaoReadNumTotal;
    }

    public void setToutiaoReadNumTotal(Integer toutiaoReadNumTotal) {
        this.toutiaoReadNumTotal = toutiaoReadNumTotal;
    }

    public Integer getToutiaoDianzanNumTotal() {
        return toutiaoDianzanNumTotal;
    }

    public void setToutiaoDianzanNumTotal(Integer toutiaoDianzanNumTotal) {
        this.toutiaoDianzanNumTotal = toutiaoDianzanNumTotal;
    }

    public Integer getToutiaoReadNumAvg() {
        return toutiaoReadNumAvg;
    }

    public void setToutiaoReadNumAvg(Integer toutiaoReadNumAvg) {
        this.toutiaoReadNumAvg = toutiaoReadNumAvg;
    }

    public Integer getToutiaoDianzanNumAvg() {
        return toutiaoDianzanNumAvg;
    }

    public void setToutiaoDianzanNumAvg(Integer toutiaoDianzanNumAvg) {
        this.toutiaoDianzanNumAvg = toutiaoDianzanNumAvg;
    }

    public Integer getToutiaoReadNumDayAvg() {
        return toutiaoReadNumDayAvg;
    }

    public void setToutiaoReadNumDayAvg(Integer toutiaoReadNumDayAvg) {
        this.toutiaoReadNumDayAvg = toutiaoReadNumDayAvg;
    }

    public Integer getToutiaoDianzanNumDayAvg() {
        return toutiaoDianzanNumDayAvg;
    }

    public void setToutiaoDianzanNumDayAvg(Integer toutiaoDianzanNumDayAvg) {
        this.toutiaoDianzanNumDayAvg = toutiaoDianzanNumDayAvg;
    }

    public Integer getOriginalNum() {
        return originalNum;
    }

    public void setOriginalNum(Integer originalNum) {
        this.originalNum = originalNum;
    }

    public String getUnitProvince() {
        return unitProvince;
    }

    public void setUnitProvince(String unitProvince) {
        this.unitProvince = unitProvince == null ? null : unitProvince.trim();
    }

    public Integer getUnitLevel() {
        return unitLevel;
    }

    public void setUnitLevel(Integer unitLevel) {
        this.unitLevel = unitLevel;
    }

    public String getUnitFunction() {
        return unitFunction;
    }

    public void setUnitFunction(String unitFunction) {
        this.unitFunction = unitFunction == null ? null : unitFunction.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }
}