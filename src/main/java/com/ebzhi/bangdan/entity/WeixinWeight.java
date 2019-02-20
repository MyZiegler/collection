package com.ebzhi.bangdan.entity;

public class WeixinWeight {
    private Integer id;

    private Integer articleNumWeight;

    private Integer publishNumWeight;

    private Integer readNumAvgWeight;

    private Integer dianzanNumAvgWeight;

    private Integer readNumTopWeight;

    private Integer dianzanNumTopWeight;

    private String createTime;

    private Integer inUse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleNumWeight() {
        return articleNumWeight;
    }

    public void setArticleNumWeight(Integer articleNumWeight) {
        this.articleNumWeight = articleNumWeight;
    }

    public Integer getPublishNumWeight() {
        return publishNumWeight;
    }

    public void setPublishNumWeight(Integer publishNumWeight) {
        this.publishNumWeight = publishNumWeight;
    }

    public Integer getReadNumAvgWeight() {
        return readNumAvgWeight;
    }

    public void setReadNumAvgWeight(Integer readNumAvgWeight) {
        this.readNumAvgWeight = readNumAvgWeight;
    }

    public Integer getDianzanNumAvgWeight() {
        return dianzanNumAvgWeight;
    }

    public void setDianzanNumAvgWeight(Integer dianzanNumAvgWeight) {
        this.dianzanNumAvgWeight = dianzanNumAvgWeight;
    }

    public Integer getReadNumTopWeight() {
        return readNumTopWeight;
    }

    public void setReadNumTopWeight(Integer readNumTopWeight) {
        this.readNumTopWeight = readNumTopWeight;
    }

    public Integer getDianzanNumTopWeight() {
        return dianzanNumTopWeight;
    }

    public void setDianzanNumTopWeight(Integer dianzanNumTopWeight) {
        this.dianzanNumTopWeight = dianzanNumTopWeight;
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