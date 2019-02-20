package com.ebzhi.bangdan.entity;

public class WeiboWeight {
    private Integer id;

    private Integer funsNumWeight;

    private Integer periodPublishTotalWeight;

    private Integer originalNumWeight;

    private Integer pinglunNumWeight;

    private Integer zhuanfaNumWeight;

    private Integer dianzanNumWeight;

    private String createTime;

    private Integer inUse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFunsNumWeight() {
        return funsNumWeight;
    }

    public void setFunsNumWeight(Integer funsNumWeight) {
        this.funsNumWeight = funsNumWeight;
    }

    public Integer getPeriodPublishTotalWeight() {
        return periodPublishTotalWeight;
    }

    public void setPeriodPublishTotalWeight(Integer periodPublishTotalWeight) {
        this.periodPublishTotalWeight = periodPublishTotalWeight;
    }

    public Integer getOriginalNumWeight() {
        return originalNumWeight;
    }

    public void setOriginalNumWeight(Integer originalNumWeight) {
        this.originalNumWeight = originalNumWeight;
    }

    public Integer getPinglunNumWeight() {
        return pinglunNumWeight;
    }

    public void setPinglunNumWeight(Integer pinglunNumWeight) {
        this.pinglunNumWeight = pinglunNumWeight;
    }

    public Integer getZhuanfaNumWeight() {
        return zhuanfaNumWeight;
    }

    public void setZhuanfaNumWeight(Integer zhuanfaNumWeight) {
        this.zhuanfaNumWeight = zhuanfaNumWeight;
    }

    public Integer getDianzanNumWeight() {
        return dianzanNumWeight;
    }

    public void setDianzanNumWeight(Integer dianzanNumWeight) {
        this.dianzanNumWeight = dianzanNumWeight;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getInUse() {
        return inUse;
    }

    public void setInUse(Integer inUse) {
        this.inUse = inUse;
    }
}