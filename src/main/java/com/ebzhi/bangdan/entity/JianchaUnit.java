package com.ebzhi.bangdan.entity;

public class JianchaUnit {
    private Integer id;

    private String unitName;

    private Integer unitType;

    private String unitFunction;

    private String unitProvince;

    private Integer unitLevel;

    private String weixinName;

    private String weixinNum;

    private Long weiboUid;

    private String weiboNick;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public String getUnitFunction() {
        return unitFunction;
    }

    public void setUnitFunction(String unitFunction) {
        this.unitFunction = unitFunction == null ? null : unitFunction.trim();
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

    public Long getWeiboUid() {
        return weiboUid;
    }

    public void setWeiboUid(Long weiboUid) {
        this.weiboUid = weiboUid;
    }

    public String getWeiboNick() {
        return weiboNick;
    }

    public void setWeiboNick(String weiboNick) {
        this.weiboNick = weiboNick == null ? null : weiboNick.trim();
    }
}