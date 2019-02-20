package com.ebzhi.bangdan.entity;

import java.util.ArrayList;
import java.util.List;

public class BangdanScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BangdanScoreExample() {
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

        public Criteria andWeiboScoreIsNull() {
            addCriterion("weibo_score is null");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreIsNotNull() {
            addCriterion("weibo_score is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreEqualTo(Double value) {
            addCriterion("weibo_score =", value, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreNotEqualTo(Double value) {
            addCriterion("weibo_score <>", value, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreGreaterThan(Double value) {
            addCriterion("weibo_score >", value, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("weibo_score >=", value, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreLessThan(Double value) {
            addCriterion("weibo_score <", value, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreLessThanOrEqualTo(Double value) {
            addCriterion("weibo_score <=", value, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreIn(List<Double> values) {
            addCriterion("weibo_score in", values, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreNotIn(List<Double> values) {
            addCriterion("weibo_score not in", values, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreBetween(Double value1, Double value2) {
            addCriterion("weibo_score between", value1, value2, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeiboScoreNotBetween(Double value1, Double value2) {
            addCriterion("weibo_score not between", value1, value2, "weiboScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreIsNull() {
            addCriterion("weixin_score is null");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreIsNotNull() {
            addCriterion("weixin_score is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreEqualTo(Double value) {
            addCriterion("weixin_score =", value, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreNotEqualTo(Double value) {
            addCriterion("weixin_score <>", value, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreGreaterThan(Double value) {
            addCriterion("weixin_score >", value, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("weixin_score >=", value, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreLessThan(Double value) {
            addCriterion("weixin_score <", value, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreLessThanOrEqualTo(Double value) {
            addCriterion("weixin_score <=", value, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreIn(List<Double> values) {
            addCriterion("weixin_score in", values, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreNotIn(List<Double> values) {
            addCriterion("weixin_score not in", values, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreBetween(Double value1, Double value2) {
            addCriterion("weixin_score between", value1, value2, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andWeixinScoreNotBetween(Double value1, Double value2) {
            addCriterion("weixin_score not between", value1, value2, "weixinScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Double value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Double value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Double value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Double value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Double value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Double> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Double> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Double value1, Double value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Double value1, Double value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andScoreIndexIsNull() {
            addCriterion("score_index is null");
            return (Criteria) this;
        }

        public Criteria andScoreIndexIsNotNull() {
            addCriterion("score_index is not null");
            return (Criteria) this;
        }

        public Criteria andScoreIndexEqualTo(Integer value) {
            addCriterion("score_index =", value, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexNotEqualTo(Integer value) {
            addCriterion("score_index <>", value, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexGreaterThan(Integer value) {
            addCriterion("score_index >", value, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_index >=", value, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexLessThan(Integer value) {
            addCriterion("score_index <", value, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexLessThanOrEqualTo(Integer value) {
            addCriterion("score_index <=", value, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexIn(List<Integer> values) {
            addCriterion("score_index in", values, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexNotIn(List<Integer> values) {
            addCriterion("score_index not in", values, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexBetween(Integer value1, Integer value2) {
            addCriterion("score_index between", value1, value2, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("score_index not between", value1, value2, "scoreIndex");
            return (Criteria) this;
        }

        public Criteria andScoreTypeIsNull() {
            addCriterion("score_type is null");
            return (Criteria) this;
        }

        public Criteria andScoreTypeIsNotNull() {
            addCriterion("score_type is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTypeEqualTo(Integer value) {
            addCriterion("score_type =", value, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeNotEqualTo(Integer value) {
            addCriterion("score_type <>", value, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeGreaterThan(Integer value) {
            addCriterion("score_type >", value, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_type >=", value, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeLessThan(Integer value) {
            addCriterion("score_type <", value, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeLessThanOrEqualTo(Integer value) {
            addCriterion("score_type <=", value, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeIn(List<Integer> values) {
            addCriterion("score_type in", values, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeNotIn(List<Integer> values) {
            addCriterion("score_type not in", values, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeBetween(Integer value1, Integer value2) {
            addCriterion("score_type between", value1, value2, "scoreType");
            return (Criteria) this;
        }

        public Criteria andScoreTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("score_type not between", value1, value2, "scoreType");
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