package com.ebzhi.bangdan.entity;

import java.util.ArrayList;
import java.util.List;

public class WeiboWeightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeiboWeightExample() {
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

        public Criteria andFunsNumWeightIsNull() {
            addCriterion("funs_num_weight is null");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightIsNotNull() {
            addCriterion("funs_num_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightEqualTo(Integer value) {
            addCriterion("funs_num_weight =", value, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightNotEqualTo(Integer value) {
            addCriterion("funs_num_weight <>", value, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightGreaterThan(Integer value) {
            addCriterion("funs_num_weight >", value, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("funs_num_weight >=", value, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightLessThan(Integer value) {
            addCriterion("funs_num_weight <", value, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightLessThanOrEqualTo(Integer value) {
            addCriterion("funs_num_weight <=", value, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightIn(List<Integer> values) {
            addCriterion("funs_num_weight in", values, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightNotIn(List<Integer> values) {
            addCriterion("funs_num_weight not in", values, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightBetween(Integer value1, Integer value2) {
            addCriterion("funs_num_weight between", value1, value2, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andFunsNumWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("funs_num_weight not between", value1, value2, "funsNumWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightIsNull() {
            addCriterion("period_publish_total_weight is null");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightIsNotNull() {
            addCriterion("period_publish_total_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightEqualTo(Integer value) {
            addCriterion("period_publish_total_weight =", value, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightNotEqualTo(Integer value) {
            addCriterion("period_publish_total_weight <>", value, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightGreaterThan(Integer value) {
            addCriterion("period_publish_total_weight >", value, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_publish_total_weight >=", value, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightLessThan(Integer value) {
            addCriterion("period_publish_total_weight <", value, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightLessThanOrEqualTo(Integer value) {
            addCriterion("period_publish_total_weight <=", value, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightIn(List<Integer> values) {
            addCriterion("period_publish_total_weight in", values, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightNotIn(List<Integer> values) {
            addCriterion("period_publish_total_weight not in", values, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightBetween(Integer value1, Integer value2) {
            addCriterion("period_publish_total_weight between", value1, value2, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("period_publish_total_weight not between", value1, value2, "periodPublishTotalWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightIsNull() {
            addCriterion("original_num_weight is null");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightIsNotNull() {
            addCriterion("original_num_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightEqualTo(Integer value) {
            addCriterion("original_num_weight =", value, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightNotEqualTo(Integer value) {
            addCriterion("original_num_weight <>", value, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightGreaterThan(Integer value) {
            addCriterion("original_num_weight >", value, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_num_weight >=", value, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightLessThan(Integer value) {
            addCriterion("original_num_weight <", value, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightLessThanOrEqualTo(Integer value) {
            addCriterion("original_num_weight <=", value, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightIn(List<Integer> values) {
            addCriterion("original_num_weight in", values, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightNotIn(List<Integer> values) {
            addCriterion("original_num_weight not in", values, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightBetween(Integer value1, Integer value2) {
            addCriterion("original_num_weight between", value1, value2, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andOriginalNumWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("original_num_weight not between", value1, value2, "originalNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightIsNull() {
            addCriterion("pinglun_num_weight is null");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightIsNotNull() {
            addCriterion("pinglun_num_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightEqualTo(Integer value) {
            addCriterion("pinglun_num_weight =", value, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightNotEqualTo(Integer value) {
            addCriterion("pinglun_num_weight <>", value, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightGreaterThan(Integer value) {
            addCriterion("pinglun_num_weight >", value, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("pinglun_num_weight >=", value, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightLessThan(Integer value) {
            addCriterion("pinglun_num_weight <", value, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightLessThanOrEqualTo(Integer value) {
            addCriterion("pinglun_num_weight <=", value, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightIn(List<Integer> values) {
            addCriterion("pinglun_num_weight in", values, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightNotIn(List<Integer> values) {
            addCriterion("pinglun_num_weight not in", values, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightBetween(Integer value1, Integer value2) {
            addCriterion("pinglun_num_weight between", value1, value2, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andPinglunNumWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("pinglun_num_weight not between", value1, value2, "pinglunNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightIsNull() {
            addCriterion("zhuanfa_num_weight is null");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightIsNotNull() {
            addCriterion("zhuanfa_num_weight is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightEqualTo(Integer value) {
            addCriterion("zhuanfa_num_weight =", value, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightNotEqualTo(Integer value) {
            addCriterion("zhuanfa_num_weight <>", value, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightGreaterThan(Integer value) {
            addCriterion("zhuanfa_num_weight >", value, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuanfa_num_weight >=", value, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightLessThan(Integer value) {
            addCriterion("zhuanfa_num_weight <", value, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightLessThanOrEqualTo(Integer value) {
            addCriterion("zhuanfa_num_weight <=", value, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightIn(List<Integer> values) {
            addCriterion("zhuanfa_num_weight in", values, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightNotIn(List<Integer> values) {
            addCriterion("zhuanfa_num_weight not in", values, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightBetween(Integer value1, Integer value2) {
            addCriterion("zhuanfa_num_weight between", value1, value2, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuanfa_num_weight not between", value1, value2, "zhuanfaNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightIsNull() {
            addCriterion("dianzan_num_weight is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightIsNotNull() {
            addCriterion("dianzan_num_weight is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightEqualTo(Integer value) {
            addCriterion("dianzan_num_weight =", value, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightNotEqualTo(Integer value) {
            addCriterion("dianzan_num_weight <>", value, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightGreaterThan(Integer value) {
            addCriterion("dianzan_num_weight >", value, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_weight >=", value, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightLessThan(Integer value) {
            addCriterion("dianzan_num_weight <", value, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_weight <=", value, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightIn(List<Integer> values) {
            addCriterion("dianzan_num_weight in", values, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightNotIn(List<Integer> values) {
            addCriterion("dianzan_num_weight not in", values, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_weight between", value1, value2, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_weight not between", value1, value2, "dianzanNumWeight");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andInUseIsNull() {
            addCriterion("in_use is null");
            return (Criteria) this;
        }

        public Criteria andInUseIsNotNull() {
            addCriterion("in_use is not null");
            return (Criteria) this;
        }

        public Criteria andInUseEqualTo(Integer value) {
            addCriterion("in_use =", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseNotEqualTo(Integer value) {
            addCriterion("in_use <>", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseGreaterThan(Integer value) {
            addCriterion("in_use >", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_use >=", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseLessThan(Integer value) {
            addCriterion("in_use <", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseLessThanOrEqualTo(Integer value) {
            addCriterion("in_use <=", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseIn(List<Integer> values) {
            addCriterion("in_use in", values, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseNotIn(List<Integer> values) {
            addCriterion("in_use not in", values, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseBetween(Integer value1, Integer value2) {
            addCriterion("in_use between", value1, value2, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseNotBetween(Integer value1, Integer value2) {
            addCriterion("in_use not between", value1, value2, "inUse");
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