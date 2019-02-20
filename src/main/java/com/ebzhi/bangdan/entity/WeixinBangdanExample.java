package com.ebzhi.bangdan.entity;

import java.util.ArrayList;
import java.util.List;

public class WeixinBangdanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinBangdanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeIsNull() {
            addCriterion("year_month_time is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeIsNotNull() {
            addCriterion("year_month_time is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeEqualTo(String value) {
            addCriterion("year_month_time =", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeNotEqualTo(String value) {
            addCriterion("year_month_time <>", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeGreaterThan(String value) {
            addCriterion("year_month_time >", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeGreaterThanOrEqualTo(String value) {
            addCriterion("year_month_time >=", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeLessThan(String value) {
            addCriterion("year_month_time <", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeLessThanOrEqualTo(String value) {
            addCriterion("year_month_time <=", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeLike(String value) {
            addCriterion("year_month_time like", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeNotLike(String value) {
            addCriterion("year_month_time not like", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeIn(List<String> values) {
            addCriterion("year_month_time in", values, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeNotIn(List<String> values) {
            addCriterion("year_month_time not in", values, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeBetween(String value1, String value2) {
            addCriterion("year_month_time between", value1, value2, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeNotBetween(String value1, String value2) {
            addCriterion("year_month_time not between", value1, value2, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andWeixinNameIsNull() {
            addCriterion("weixin_name is null");
            return (Criteria) this;
        }

        public Criteria andWeixinNameIsNotNull() {
            addCriterion("weixin_name is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinNameEqualTo(String value) {
            addCriterion("weixin_name =", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameNotEqualTo(String value) {
            addCriterion("weixin_name <>", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameGreaterThan(String value) {
            addCriterion("weixin_name >", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_name >=", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameLessThan(String value) {
            addCriterion("weixin_name <", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameLessThanOrEqualTo(String value) {
            addCriterion("weixin_name <=", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameLike(String value) {
            addCriterion("weixin_name like", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameNotLike(String value) {
            addCriterion("weixin_name not like", value, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameIn(List<String> values) {
            addCriterion("weixin_name in", values, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameNotIn(List<String> values) {
            addCriterion("weixin_name not in", values, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameBetween(String value1, String value2) {
            addCriterion("weixin_name between", value1, value2, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNameNotBetween(String value1, String value2) {
            addCriterion("weixin_name not between", value1, value2, "weixinName");
            return (Criteria) this;
        }

        public Criteria andWeixinNumIsNull() {
            addCriterion("weixin_num is null");
            return (Criteria) this;
        }

        public Criteria andWeixinNumIsNotNull() {
            addCriterion("weixin_num is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinNumEqualTo(String value) {
            addCriterion("weixin_num =", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumNotEqualTo(String value) {
            addCriterion("weixin_num <>", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumGreaterThan(String value) {
            addCriterion("weixin_num >", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_num >=", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumLessThan(String value) {
            addCriterion("weixin_num <", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumLessThanOrEqualTo(String value) {
            addCriterion("weixin_num <=", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumLike(String value) {
            addCriterion("weixin_num like", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumNotLike(String value) {
            addCriterion("weixin_num not like", value, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumIn(List<String> values) {
            addCriterion("weixin_num in", values, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumNotIn(List<String> values) {
            addCriterion("weixin_num not in", values, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumBetween(String value1, String value2) {
            addCriterion("weixin_num between", value1, value2, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andWeixinNumNotBetween(String value1, String value2) {
            addCriterion("weixin_num not between", value1, value2, "weixinNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumIsNull() {
            addCriterion("article_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleNumIsNotNull() {
            addCriterion("article_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNumEqualTo(Integer value) {
            addCriterion("article_num =", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumNotEqualTo(Integer value) {
            addCriterion("article_num <>", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumGreaterThan(Integer value) {
            addCriterion("article_num >", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_num >=", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumLessThan(Integer value) {
            addCriterion("article_num <", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_num <=", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumIn(List<Integer> values) {
            addCriterion("article_num in", values, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumNotIn(List<Integer> values) {
            addCriterion("article_num not in", values, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumBetween(Integer value1, Integer value2) {
            addCriterion("article_num between", value1, value2, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_num not between", value1, value2, "articleNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumIsNull() {
            addCriterion("publish_num is null");
            return (Criteria) this;
        }

        public Criteria andPublishNumIsNotNull() {
            addCriterion("publish_num is not null");
            return (Criteria) this;
        }

        public Criteria andPublishNumEqualTo(Integer value) {
            addCriterion("publish_num =", value, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumNotEqualTo(Integer value) {
            addCriterion("publish_num <>", value, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumGreaterThan(Integer value) {
            addCriterion("publish_num >", value, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_num >=", value, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumLessThan(Integer value) {
            addCriterion("publish_num <", value, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumLessThanOrEqualTo(Integer value) {
            addCriterion("publish_num <=", value, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumIn(List<Integer> values) {
            addCriterion("publish_num in", values, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumNotIn(List<Integer> values) {
            addCriterion("publish_num not in", values, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumBetween(Integer value1, Integer value2) {
            addCriterion("publish_num between", value1, value2, "publishNum");
            return (Criteria) this;
        }

        public Criteria andPublishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_num not between", value1, value2, "publishNum");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalIsNull() {
            addCriterion("read_num_total is null");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalIsNotNull() {
            addCriterion("read_num_total is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalEqualTo(Integer value) {
            addCriterion("read_num_total =", value, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalNotEqualTo(Integer value) {
            addCriterion("read_num_total <>", value, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalGreaterThan(Integer value) {
            addCriterion("read_num_total >", value, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_num_total >=", value, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalLessThan(Integer value) {
            addCriterion("read_num_total <", value, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalLessThanOrEqualTo(Integer value) {
            addCriterion("read_num_total <=", value, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalIn(List<Integer> values) {
            addCriterion("read_num_total in", values, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalNotIn(List<Integer> values) {
            addCriterion("read_num_total not in", values, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalBetween(Integer value1, Integer value2) {
            addCriterion("read_num_total between", value1, value2, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("read_num_total not between", value1, value2, "readNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalIsNull() {
            addCriterion("dianzan_num_total is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalIsNotNull() {
            addCriterion("dianzan_num_total is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalEqualTo(Integer value) {
            addCriterion("dianzan_num_total =", value, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalNotEqualTo(Integer value) {
            addCriterion("dianzan_num_total <>", value, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalGreaterThan(Integer value) {
            addCriterion("dianzan_num_total >", value, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_total >=", value, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalLessThan(Integer value) {
            addCriterion("dianzan_num_total <", value, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_total <=", value, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalIn(List<Integer> values) {
            addCriterion("dianzan_num_total in", values, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalNotIn(List<Integer> values) {
            addCriterion("dianzan_num_total not in", values, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_total between", value1, value2, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_total not between", value1, value2, "dianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgIsNull() {
            addCriterion("read_num_avg is null");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgIsNotNull() {
            addCriterion("read_num_avg is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgEqualTo(Integer value) {
            addCriterion("read_num_avg =", value, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgNotEqualTo(Integer value) {
            addCriterion("read_num_avg <>", value, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgGreaterThan(Integer value) {
            addCriterion("read_num_avg >", value, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_num_avg >=", value, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgLessThan(Integer value) {
            addCriterion("read_num_avg <", value, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgLessThanOrEqualTo(Integer value) {
            addCriterion("read_num_avg <=", value, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgIn(List<Integer> values) {
            addCriterion("read_num_avg in", values, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgNotIn(List<Integer> values) {
            addCriterion("read_num_avg not in", values, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgBetween(Integer value1, Integer value2) {
            addCriterion("read_num_avg between", value1, value2, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("read_num_avg not between", value1, value2, "readNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgIsNull() {
            addCriterion("dianzan_num_avg is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgIsNotNull() {
            addCriterion("dianzan_num_avg is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgEqualTo(Integer value) {
            addCriterion("dianzan_num_avg =", value, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgNotEqualTo(Integer value) {
            addCriterion("dianzan_num_avg <>", value, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgGreaterThan(Integer value) {
            addCriterion("dianzan_num_avg >", value, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_avg >=", value, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgLessThan(Integer value) {
            addCriterion("dianzan_num_avg <", value, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_avg <=", value, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgIn(List<Integer> values) {
            addCriterion("dianzan_num_avg in", values, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgNotIn(List<Integer> values) {
            addCriterion("dianzan_num_avg not in", values, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_avg between", value1, value2, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_avg not between", value1, value2, "dianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumTopIsNull() {
            addCriterion("read_num_top is null");
            return (Criteria) this;
        }

        public Criteria andReadNumTopIsNotNull() {
            addCriterion("read_num_top is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumTopEqualTo(Integer value) {
            addCriterion("read_num_top =", value, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopNotEqualTo(Integer value) {
            addCriterion("read_num_top <>", value, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopGreaterThan(Integer value) {
            addCriterion("read_num_top >", value, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_num_top >=", value, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopLessThan(Integer value) {
            addCriterion("read_num_top <", value, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopLessThanOrEqualTo(Integer value) {
            addCriterion("read_num_top <=", value, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopIn(List<Integer> values) {
            addCriterion("read_num_top in", values, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopNotIn(List<Integer> values) {
            addCriterion("read_num_top not in", values, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopBetween(Integer value1, Integer value2) {
            addCriterion("read_num_top between", value1, value2, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumTopNotBetween(Integer value1, Integer value2) {
            addCriterion("read_num_top not between", value1, value2, "readNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopIsNull() {
            addCriterion("dianzan_num_top is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopIsNotNull() {
            addCriterion("dianzan_num_top is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopEqualTo(Integer value) {
            addCriterion("dianzan_num_top =", value, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopNotEqualTo(Integer value) {
            addCriterion("dianzan_num_top <>", value, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopGreaterThan(Integer value) {
            addCriterion("dianzan_num_top >", value, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_top >=", value, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopLessThan(Integer value) {
            addCriterion("dianzan_num_top <", value, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_top <=", value, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopIn(List<Integer> values) {
            addCriterion("dianzan_num_top in", values, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopNotIn(List<Integer> values) {
            addCriterion("dianzan_num_top not in", values, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_top between", value1, value2, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_top not between", value1, value2, "dianzanNumTop");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgIsNull() {
            addCriterion("read_num_day_avg is null");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgIsNotNull() {
            addCriterion("read_num_day_avg is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgEqualTo(Integer value) {
            addCriterion("read_num_day_avg =", value, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgNotEqualTo(Integer value) {
            addCriterion("read_num_day_avg <>", value, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgGreaterThan(Integer value) {
            addCriterion("read_num_day_avg >", value, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_num_day_avg >=", value, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgLessThan(Integer value) {
            addCriterion("read_num_day_avg <", value, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgLessThanOrEqualTo(Integer value) {
            addCriterion("read_num_day_avg <=", value, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgIn(List<Integer> values) {
            addCriterion("read_num_day_avg in", values, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgNotIn(List<Integer> values) {
            addCriterion("read_num_day_avg not in", values, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgBetween(Integer value1, Integer value2) {
            addCriterion("read_num_day_avg between", value1, value2, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andReadNumDayAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("read_num_day_avg not between", value1, value2, "readNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgIsNull() {
            addCriterion("dianzan_num_day_avg is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgIsNotNull() {
            addCriterion("dianzan_num_day_avg is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgEqualTo(Integer value) {
            addCriterion("dianzan_num_day_avg =", value, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgNotEqualTo(Integer value) {
            addCriterion("dianzan_num_day_avg <>", value, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgGreaterThan(Integer value) {
            addCriterion("dianzan_num_day_avg >", value, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_day_avg >=", value, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgLessThan(Integer value) {
            addCriterion("dianzan_num_day_avg <", value, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_day_avg <=", value, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgIn(List<Integer> values) {
            addCriterion("dianzan_num_day_avg in", values, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgNotIn(List<Integer> values) {
            addCriterion("dianzan_num_day_avg not in", values, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_day_avg between", value1, value2, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andDianzanNumDayAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_day_avg not between", value1, value2, "dianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalIsNull() {
            addCriterion("toutiao_read_num_total is null");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalIsNotNull() {
            addCriterion("toutiao_read_num_total is not null");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalEqualTo(Integer value) {
            addCriterion("toutiao_read_num_total =", value, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalNotEqualTo(Integer value) {
            addCriterion("toutiao_read_num_total <>", value, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalGreaterThan(Integer value) {
            addCriterion("toutiao_read_num_total >", value, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("toutiao_read_num_total >=", value, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalLessThan(Integer value) {
            addCriterion("toutiao_read_num_total <", value, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalLessThanOrEqualTo(Integer value) {
            addCriterion("toutiao_read_num_total <=", value, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalIn(List<Integer> values) {
            addCriterion("toutiao_read_num_total in", values, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalNotIn(List<Integer> values) {
            addCriterion("toutiao_read_num_total not in", values, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_read_num_total between", value1, value2, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_read_num_total not between", value1, value2, "toutiaoReadNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalIsNull() {
            addCriterion("toutiao_dianzan_num_total is null");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalIsNotNull() {
            addCriterion("toutiao_dianzan_num_total is not null");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_total =", value, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalNotEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_total <>", value, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalGreaterThan(Integer value) {
            addCriterion("toutiao_dianzan_num_total >", value, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_total >=", value, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalLessThan(Integer value) {
            addCriterion("toutiao_dianzan_num_total <", value, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalLessThanOrEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_total <=", value, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalIn(List<Integer> values) {
            addCriterion("toutiao_dianzan_num_total in", values, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalNotIn(List<Integer> values) {
            addCriterion("toutiao_dianzan_num_total not in", values, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_dianzan_num_total between", value1, value2, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_dianzan_num_total not between", value1, value2, "toutiaoDianzanNumTotal");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgIsNull() {
            addCriterion("toutiao_read_num_avg is null");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgIsNotNull() {
            addCriterion("toutiao_read_num_avg is not null");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgEqualTo(Integer value) {
            addCriterion("toutiao_read_num_avg =", value, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgNotEqualTo(Integer value) {
            addCriterion("toutiao_read_num_avg <>", value, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgGreaterThan(Integer value) {
            addCriterion("toutiao_read_num_avg >", value, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("toutiao_read_num_avg >=", value, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgLessThan(Integer value) {
            addCriterion("toutiao_read_num_avg <", value, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgLessThanOrEqualTo(Integer value) {
            addCriterion("toutiao_read_num_avg <=", value, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgIn(List<Integer> values) {
            addCriterion("toutiao_read_num_avg in", values, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgNotIn(List<Integer> values) {
            addCriterion("toutiao_read_num_avg not in", values, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_read_num_avg between", value1, value2, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_read_num_avg not between", value1, value2, "toutiaoReadNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgIsNull() {
            addCriterion("toutiao_dianzan_num_avg is null");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgIsNotNull() {
            addCriterion("toutiao_dianzan_num_avg is not null");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_avg =", value, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgNotEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_avg <>", value, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgGreaterThan(Integer value) {
            addCriterion("toutiao_dianzan_num_avg >", value, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_avg >=", value, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgLessThan(Integer value) {
            addCriterion("toutiao_dianzan_num_avg <", value, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgLessThanOrEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_avg <=", value, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgIn(List<Integer> values) {
            addCriterion("toutiao_dianzan_num_avg in", values, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgNotIn(List<Integer> values) {
            addCriterion("toutiao_dianzan_num_avg not in", values, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_dianzan_num_avg between", value1, value2, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_dianzan_num_avg not between", value1, value2, "toutiaoDianzanNumAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgIsNull() {
            addCriterion("toutiao_read_num_day_avg is null");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgIsNotNull() {
            addCriterion("toutiao_read_num_day_avg is not null");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgEqualTo(Integer value) {
            addCriterion("toutiao_read_num_day_avg =", value, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgNotEqualTo(Integer value) {
            addCriterion("toutiao_read_num_day_avg <>", value, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgGreaterThan(Integer value) {
            addCriterion("toutiao_read_num_day_avg >", value, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("toutiao_read_num_day_avg >=", value, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgLessThan(Integer value) {
            addCriterion("toutiao_read_num_day_avg <", value, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgLessThanOrEqualTo(Integer value) {
            addCriterion("toutiao_read_num_day_avg <=", value, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgIn(List<Integer> values) {
            addCriterion("toutiao_read_num_day_avg in", values, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgNotIn(List<Integer> values) {
            addCriterion("toutiao_read_num_day_avg not in", values, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_read_num_day_avg between", value1, value2, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoReadNumDayAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_read_num_day_avg not between", value1, value2, "toutiaoReadNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgIsNull() {
            addCriterion("toutiao_dianzan_num_day_avg is null");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgIsNotNull() {
            addCriterion("toutiao_dianzan_num_day_avg is not null");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_day_avg =", value, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgNotEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_day_avg <>", value, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgGreaterThan(Integer value) {
            addCriterion("toutiao_dianzan_num_day_avg >", value, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_day_avg >=", value, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgLessThan(Integer value) {
            addCriterion("toutiao_dianzan_num_day_avg <", value, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgLessThanOrEqualTo(Integer value) {
            addCriterion("toutiao_dianzan_num_day_avg <=", value, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgIn(List<Integer> values) {
            addCriterion("toutiao_dianzan_num_day_avg in", values, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgNotIn(List<Integer> values) {
            addCriterion("toutiao_dianzan_num_day_avg not in", values, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_dianzan_num_day_avg between", value1, value2, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andToutiaoDianzanNumDayAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("toutiao_dianzan_num_day_avg not between", value1, value2, "toutiaoDianzanNumDayAvg");
            return (Criteria) this;
        }

        public Criteria andOriginalNumIsNull() {
            addCriterion("original_num is null");
            return (Criteria) this;
        }

        public Criteria andOriginalNumIsNotNull() {
            addCriterion("original_num is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalNumEqualTo(Integer value) {
            addCriterion("original_num =", value, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumNotEqualTo(Integer value) {
            addCriterion("original_num <>", value, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumGreaterThan(Integer value) {
            addCriterion("original_num >", value, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_num >=", value, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumLessThan(Integer value) {
            addCriterion("original_num <", value, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumLessThanOrEqualTo(Integer value) {
            addCriterion("original_num <=", value, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumIn(List<Integer> values) {
            addCriterion("original_num in", values, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumNotIn(List<Integer> values) {
            addCriterion("original_num not in", values, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumBetween(Integer value1, Integer value2) {
            addCriterion("original_num between", value1, value2, "originalNum");
            return (Criteria) this;
        }

        public Criteria andOriginalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("original_num not between", value1, value2, "originalNum");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceIsNull() {
            addCriterion("unit_province is null");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceIsNotNull() {
            addCriterion("unit_province is not null");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceEqualTo(String value) {
            addCriterion("unit_province =", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceNotEqualTo(String value) {
            addCriterion("unit_province <>", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceGreaterThan(String value) {
            addCriterion("unit_province >", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("unit_province >=", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceLessThan(String value) {
            addCriterion("unit_province <", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceLessThanOrEqualTo(String value) {
            addCriterion("unit_province <=", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceLike(String value) {
            addCriterion("unit_province like", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceNotLike(String value) {
            addCriterion("unit_province not like", value, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceIn(List<String> values) {
            addCriterion("unit_province in", values, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceNotIn(List<String> values) {
            addCriterion("unit_province not in", values, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceBetween(String value1, String value2) {
            addCriterion("unit_province between", value1, value2, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitProvinceNotBetween(String value1, String value2) {
            addCriterion("unit_province not between", value1, value2, "unitProvince");
            return (Criteria) this;
        }

        public Criteria andUnitLevelIsNull() {
            addCriterion("unit_level is null");
            return (Criteria) this;
        }

        public Criteria andUnitLevelIsNotNull() {
            addCriterion("unit_level is not null");
            return (Criteria) this;
        }

        public Criteria andUnitLevelEqualTo(Integer value) {
            addCriterion("unit_level =", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelNotEqualTo(Integer value) {
            addCriterion("unit_level <>", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelGreaterThan(Integer value) {
            addCriterion("unit_level >", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_level >=", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelLessThan(Integer value) {
            addCriterion("unit_level <", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelLessThanOrEqualTo(Integer value) {
            addCriterion("unit_level <=", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelIn(List<Integer> values) {
            addCriterion("unit_level in", values, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelNotIn(List<Integer> values) {
            addCriterion("unit_level not in", values, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelBetween(Integer value1, Integer value2) {
            addCriterion("unit_level between", value1, value2, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_level not between", value1, value2, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionIsNull() {
            addCriterion("unit_function is null");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionIsNotNull() {
            addCriterion("unit_function is not null");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionEqualTo(String value) {
            addCriterion("unit_function =", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionNotEqualTo(String value) {
            addCriterion("unit_function <>", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionGreaterThan(String value) {
            addCriterion("unit_function >", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("unit_function >=", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionLessThan(String value) {
            addCriterion("unit_function <", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionLessThanOrEqualTo(String value) {
            addCriterion("unit_function <=", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionLike(String value) {
            addCriterion("unit_function like", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionNotLike(String value) {
            addCriterion("unit_function not like", value, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionIn(List<String> values) {
            addCriterion("unit_function in", values, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionNotIn(List<String> values) {
            addCriterion("unit_function not in", values, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionBetween(String value1, String value2) {
            addCriterion("unit_function between", value1, value2, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitFunctionNotBetween(String value1, String value2) {
            addCriterion("unit_function not between", value1, value2, "unitFunction");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}