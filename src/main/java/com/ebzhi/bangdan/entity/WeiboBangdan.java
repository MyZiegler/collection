package com.ebzhi.bangdan.entity;

public class WeiboBangdan {
    private Integer id;

    private String yearMonthTime;

    private Integer unitId;

    private Long weiboUid;

    private String nickName;

    private Integer funsNum;

    private Integer guanzhuNum;

    private Integer publishTotal;

    private Integer periodPublishTotal;

    private Integer zhuanfaNum;

    private Integer pinglunNum;

    private Integer dianzanNum;

    private Integer originalNum;

    private Integer originalZhuanfaNum;

    private Integer originalPinglunNum;

    private Integer originalDianzanNum;

    private String unitProvince;

    private Integer unitLevel;

    private String unitFunction;

    private String unitName;

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

    public Long getWeiboUid() {
        return weiboUid;
    }

    public void setWeiboUid(Long weiboUid) {
        this.weiboUid = weiboUid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Integer getFunsNum() {
        return funsNum;
    }

    public void setFunsNum(Integer funsNum) {
        this.funsNum = funsNum;
    }

    public Integer getGuanzhuNum() {
        return guanzhuNum;
    }

    public void setGuanzhuNum(Integer guanzhuNum) {
        this.guanzhuNum = guanzhuNum;
    }

    public Integer getPublishTotal() {
        return publishTotal;
    }

    public void setPublishTotal(Integer publishTotal) {
        this.publishTotal = publishTotal;
    }

    public Integer getPeriodPublishTotal() {
        return periodPublishTotal;
    }

    public void setPeriodPublishTotal(Integer periodPublishTotal) {
        this.periodPublishTotal = periodPublishTotal;
    }

    public Integer getZhuanfaNum() {
        return zhuanfaNum;
    }

    public void setZhuanfaNum(Integer zhuanfaNum) {
        this.zhuanfaNum = zhuanfaNum;
    }

    public Integer getPinglunNum() {
        return pinglunNum;
    }

    public void setPinglunNum(Integer pinglunNum) {
        this.pinglunNum = pinglunNum;
    }

    public Integer getDianzanNum() {
        return dianzanNum;
    }

    public void setDianzanNum(Integer dianzanNum) {
        this.dianzanNum = dianzanNum;
    }

    public Integer getOriginalNum() {
        return originalNum;
    }

    public void setOriginalNum(Integer originalNum) {
        this.originalNum = originalNum;
    }

    public Integer getOriginalZhuanfaNum() {
        return originalZhuanfaNum;
    }

    public void setOriginalZhuanfaNum(Integer originalZhuanfaNum) {
        this.originalZhuanfaNum = originalZhuanfaNum;
    }

    public Integer getOriginalPinglunNum() {
        return originalPinglunNum;
    }

    public void setOriginalPinglunNum(Integer originalPinglunNum) {
        this.originalPinglunNum = originalPinglunNum;
    }

    public Integer getOriginalDianzanNum() {
        return originalDianzanNum;
    }

    public void setOriginalDianzanNum(Integer originalDianzanNum) {
        this.originalDianzanNum = originalDianzanNum;
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