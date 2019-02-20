package com.ebzhi.bangdan.entity;

import java.util.ArrayList;
import java.util.List;

public class WeixinWeightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinWeightExample() {
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

        public Criteria andArticleNumWeightIsNull() {
            addCriterion("article_num_weight is null");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightIsNotNull() {
            addCriterion("article_num_weight is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightEqualTo(Integer value) {
            addCriterion("article_num_weight =", value, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightNotEqualTo(Integer value) {
            addCriterion("article_num_weight <>", value, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightGreaterThan(Integer value) {
            addCriterion("article_num_weight >", value, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_num_weight >=", value, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightLessThan(Integer value) {
            addCriterion("article_num_weight <", value, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightLessThanOrEqualTo(Integer value) {
            addCriterion("article_num_weight <=", value, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightIn(List<Integer> values) {
            addCriterion("article_num_weight in", values, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightNotIn(List<Integer> values) {
            addCriterion("article_num_weight not in", values, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightBetween(Integer value1, Integer value2) {
            addCriterion("article_num_weight between", value1, value2, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andArticleNumWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("article_num_weight not between", value1, value2, "articleNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightIsNull() {
            addCriterion("publish_num_weight is null");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightIsNotNull() {
            addCriterion("publish_num_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightEqualTo(Integer value) {
            addCriterion("publish_num_weight =", value, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightNotEqualTo(Integer value) {
            addCriterion("publish_num_weight <>", value, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightGreaterThan(Integer value) {
            addCriterion("publish_num_weight >", value, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_num_weight >=", value, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightLessThan(Integer value) {
            addCriterion("publish_num_weight <", value, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightLessThanOrEqualTo(Integer value) {
            addCriterion("publish_num_weight <=", value, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightIn(List<Integer> values) {
            addCriterion("publish_num_weight in", values, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightNotIn(List<Integer> values) {
            addCriterion("publish_num_weight not in", values, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightBetween(Integer value1, Integer value2) {
            addCriterion("publish_num_weight between", value1, value2, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andPublishNumWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_num_weight not between", value1, value2, "publishNumWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightIsNull() {
            addCriterion("read_num_avg_weight is null");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightIsNotNull() {
            addCriterion("read_num_avg_weight is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightEqualTo(Integer value) {
            addCriterion("read_num_avg_weight =", value, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightNotEqualTo(Integer value) {
            addCriterion("read_num_avg_weight <>", value, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightGreaterThan(Integer value) {
            addCriterion("read_num_avg_weight >", value, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_num_avg_weight >=", value, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightLessThan(Integer value) {
            addCriterion("read_num_avg_weight <", value, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightLessThanOrEqualTo(Integer value) {
            addCriterion("read_num_avg_weight <=", value, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightIn(List<Integer> values) {
            addCriterion("read_num_avg_weight in", values, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightNotIn(List<Integer> values) {
            addCriterion("read_num_avg_weight not in", values, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightBetween(Integer value1, Integer value2) {
            addCriterion("read_num_avg_weight between", value1, value2, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumAvgWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("read_num_avg_weight not between", value1, value2, "readNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightIsNull() {
            addCriterion("dianzan_num_avg_weight is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightIsNotNull() {
            addCriterion("dianzan_num_avg_weight is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightEqualTo(Integer value) {
            addCriterion("dianzan_num_avg_weight =", value, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightNotEqualTo(Integer value) {
            addCriterion("dianzan_num_avg_weight <>", value, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightGreaterThan(Integer value) {
            addCriterion("dianzan_num_avg_weight >", value, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_avg_weight >=", value, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightLessThan(Integer value) {
            addCriterion("dianzan_num_avg_weight <", value, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_avg_weight <=", value, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightIn(List<Integer> values) {
            addCriterion("dianzan_num_avg_weight in", values, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightNotIn(List<Integer> values) {
            addCriterion("dianzan_num_avg_weight not in", values, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_avg_weight between", value1, value2, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumAvgWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_avg_weight not between", value1, value2, "dianzanNumAvgWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightIsNull() {
            addCriterion("read_num_top_weight is null");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightIsNotNull() {
            addCriterion("read_num_top_weight is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightEqualTo(Integer value) {
            addCriterion("read_num_top_weight =", value, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightNotEqualTo(Integer value) {
            addCriterion("read_num_top_weight <>", value, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightGreaterThan(Integer value) {
            addCriterion("read_num_top_weight >", value, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_num_top_weight >=", value, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightLessThan(Integer value) {
            addCriterion("read_num_top_weight <", value, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightLessThanOrEqualTo(Integer value) {
            addCriterion("read_num_top_weight <=", value, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightIn(List<Integer> values) {
            addCriterion("read_num_top_weight in", values, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightNotIn(List<Integer> values) {
            addCriterion("read_num_top_weight not in", values, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightBetween(Integer value1, Integer value2) {
            addCriterion("read_num_top_weight between", value1, value2, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andReadNumTopWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("read_num_top_weight not between", value1, value2, "readNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightIsNull() {
            addCriterion("dianzan_num_top_weight is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightIsNotNull() {
            addCriterion("dianzan_num_top_weight is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightEqualTo(Integer value) {
            addCriterion("dianzan_num_top_weight =", value, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightNotEqualTo(Integer value) {
            addCriterion("dianzan_num_top_weight <>", value, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightGreaterThan(Integer value) {
            addCriterion("dianzan_num_top_weight >", value, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_top_weight >=", value, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightLessThan(Integer value) {
            addCriterion("dianzan_num_top_weight <", value, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num_top_weight <=", value, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightIn(List<Integer> values) {
            addCriterion("dianzan_num_top_weight in", values, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightNotIn(List<Integer> values) {
            addCriterion("dianzan_num_top_weight not in", values, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_top_weight between", value1, value2, "dianzanNumTopWeight");
            return (Criteria) this;
        }

        public Criteria andDianzanNumTopWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num_top_weight not between", value1, value2, "dianzanNumTopWeight");
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