package com.ebzhi.bangdan.entity;

import java.util.ArrayList;
import java.util.List;

public class JianchaUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JianchaUnitExample() {
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

        public Criteria andUnitTypeIsNull() {
            addCriterion("unit_type is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(Integer value) {
            addCriterion("unit_type =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(Integer value) {
            addCriterion("unit_type <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(Integer value) {
            addCriterion("unit_type >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_type >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(Integer value) {
            addCriterion("unit_type <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("unit_type <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<Integer> values) {
            addCriterion("unit_type in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<Integer> values) {
            addCriterion("unit_type not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(Integer value1, Integer value2) {
            addCriterion("unit_type between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_type not between", value1, value2, "unitType");
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

        public Criteria andWeiboUidIsNull() {
            addCriterion("weibo_uid is null");
            return (Criteria) this;
        }

        public Criteria andWeiboUidIsNotNull() {
            addCriterion("weibo_uid is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboUidEqualTo(Long value) {
            addCriterion("weibo_uid =", value, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidNotEqualTo(Long value) {
            addCriterion("weibo_uid <>", value, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidGreaterThan(Long value) {
            addCriterion("weibo_uid >", value, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidGreaterThanOrEqualTo(Long value) {
            addCriterion("weibo_uid >=", value, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidLessThan(Long value) {
            addCriterion("weibo_uid <", value, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidLessThanOrEqualTo(Long value) {
            addCriterion("weibo_uid <=", value, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidIn(List<Long> values) {
            addCriterion("weibo_uid in", values, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidNotIn(List<Long> values) {
            addCriterion("weibo_uid not in", values, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidBetween(Long value1, Long value2) {
            addCriterion("weibo_uid between", value1, value2, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboUidNotBetween(Long value1, Long value2) {
            addCriterion("weibo_uid not between", value1, value2, "weiboUid");
            return (Criteria) this;
        }

        public Criteria andWeiboNickIsNull() {
            addCriterion("weibo_nick is null");
            return (Criteria) this;
        }

        public Criteria andWeiboNickIsNotNull() {
            addCriterion("weibo_nick is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboNickEqualTo(String value) {
            addCriterion("weibo_nick =", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickNotEqualTo(String value) {
            addCriterion("weibo_nick <>", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickGreaterThan(String value) {
            addCriterion("weibo_nick >", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_nick >=", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickLessThan(String value) {
            addCriterion("weibo_nick <", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickLessThanOrEqualTo(String value) {
            addCriterion("weibo_nick <=", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickLike(String value) {
            addCriterion("weibo_nick like", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickNotLike(String value) {
            addCriterion("weibo_nick not like", value, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickIn(List<String> values) {
            addCriterion("weibo_nick in", values, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickNotIn(List<String> values) {
            addCriterion("weibo_nick not in", values, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickBetween(String value1, String value2) {
            addCriterion("weibo_nick between", value1, value2, "weiboNick");
            return (Criteria) this;
        }

        public Criteria andWeiboNickNotBetween(String value1, String value2) {
            addCriterion("weibo_nick not between", value1, value2, "weiboNick");
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