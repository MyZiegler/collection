package com.ebzhi.bangdan.entity;

import java.util.ArrayList;
import java.util.List;

public class WeiboBangdanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeiboBangdanExample() {
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andFunsNumIsNull() {
            addCriterion("funs_num is null");
            return (Criteria) this;
        }

        public Criteria andFunsNumIsNotNull() {
            addCriterion("funs_num is not null");
            return (Criteria) this;
        }

        public Criteria andFunsNumEqualTo(Integer value) {
            addCriterion("funs_num =", value, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumNotEqualTo(Integer value) {
            addCriterion("funs_num <>", value, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumGreaterThan(Integer value) {
            addCriterion("funs_num >", value, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("funs_num >=", value, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumLessThan(Integer value) {
            addCriterion("funs_num <", value, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumLessThanOrEqualTo(Integer value) {
            addCriterion("funs_num <=", value, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumIn(List<Integer> values) {
            addCriterion("funs_num in", values, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumNotIn(List<Integer> values) {
            addCriterion("funs_num not in", values, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumBetween(Integer value1, Integer value2) {
            addCriterion("funs_num between", value1, value2, "funsNum");
            return (Criteria) this;
        }

        public Criteria andFunsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("funs_num not between", value1, value2, "funsNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumIsNull() {
            addCriterion("guanzhu_num is null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumIsNotNull() {
            addCriterion("guanzhu_num is not null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumEqualTo(Integer value) {
            addCriterion("guanzhu_num =", value, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumNotEqualTo(Integer value) {
            addCriterion("guanzhu_num <>", value, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumGreaterThan(Integer value) {
            addCriterion("guanzhu_num >", value, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("guanzhu_num >=", value, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumLessThan(Integer value) {
            addCriterion("guanzhu_num <", value, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumLessThanOrEqualTo(Integer value) {
            addCriterion("guanzhu_num <=", value, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumIn(List<Integer> values) {
            addCriterion("guanzhu_num in", values, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumNotIn(List<Integer> values) {
            addCriterion("guanzhu_num not in", values, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumBetween(Integer value1, Integer value2) {
            addCriterion("guanzhu_num between", value1, value2, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andGuanzhuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("guanzhu_num not between", value1, value2, "guanzhuNum");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIsNull() {
            addCriterion("publish_total is null");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIsNotNull() {
            addCriterion("publish_total is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTotalEqualTo(Integer value) {
            addCriterion("publish_total =", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotEqualTo(Integer value) {
            addCriterion("publish_total <>", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalGreaterThan(Integer value) {
            addCriterion("publish_total >", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_total >=", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalLessThan(Integer value) {
            addCriterion("publish_total <", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalLessThanOrEqualTo(Integer value) {
            addCriterion("publish_total <=", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIn(List<Integer> values) {
            addCriterion("publish_total in", values, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotIn(List<Integer> values) {
            addCriterion("publish_total not in", values, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalBetween(Integer value1, Integer value2) {
            addCriterion("publish_total between", value1, value2, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_total not between", value1, value2, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalIsNull() {
            addCriterion("period_publish_total is null");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalIsNotNull() {
            addCriterion("period_publish_total is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalEqualTo(Integer value) {
            addCriterion("period_publish_total =", value, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalNotEqualTo(Integer value) {
            addCriterion("period_publish_total <>", value, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalGreaterThan(Integer value) {
            addCriterion("period_publish_total >", value, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_publish_total >=", value, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalLessThan(Integer value) {
            addCriterion("period_publish_total <", value, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalLessThanOrEqualTo(Integer value) {
            addCriterion("period_publish_total <=", value, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalIn(List<Integer> values) {
            addCriterion("period_publish_total in", values, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalNotIn(List<Integer> values) {
            addCriterion("period_publish_total not in", values, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalBetween(Integer value1, Integer value2) {
            addCriterion("period_publish_total between", value1, value2, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andPeriodPublishTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("period_publish_total not between", value1, value2, "periodPublishTotal");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumIsNull() {
            addCriterion("zhuanfa_num is null");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumIsNotNull() {
            addCriterion("zhuanfa_num is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumEqualTo(Integer value) {
            addCriterion("zhuanfa_num =", value, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumNotEqualTo(Integer value) {
            addCriterion("zhuanfa_num <>", value, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumGreaterThan(Integer value) {
            addCriterion("zhuanfa_num >", value, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuanfa_num >=", value, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumLessThan(Integer value) {
            addCriterion("zhuanfa_num <", value, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumLessThanOrEqualTo(Integer value) {
            addCriterion("zhuanfa_num <=", value, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumIn(List<Integer> values) {
            addCriterion("zhuanfa_num in", values, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumNotIn(List<Integer> values) {
            addCriterion("zhuanfa_num not in", values, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumBetween(Integer value1, Integer value2) {
            addCriterion("zhuanfa_num between", value1, value2, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuanfa_num not between", value1, value2, "zhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumIsNull() {
            addCriterion("pinglun_num is null");
            return (Criteria) this;
        }

        public Criteria andPinglunNumIsNotNull() {
            addCriterion("pinglun_num is not null");
            return (Criteria) this;
        }

        public Criteria andPinglunNumEqualTo(Integer value) {
            addCriterion("pinglun_num =", value, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumNotEqualTo(Integer value) {
            addCriterion("pinglun_num <>", value, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumGreaterThan(Integer value) {
            addCriterion("pinglun_num >", value, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pinglun_num >=", value, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumLessThan(Integer value) {
            addCriterion("pinglun_num <", value, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumLessThanOrEqualTo(Integer value) {
            addCriterion("pinglun_num <=", value, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumIn(List<Integer> values) {
            addCriterion("pinglun_num in", values, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumNotIn(List<Integer> values) {
            addCriterion("pinglun_num not in", values, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumBetween(Integer value1, Integer value2) {
            addCriterion("pinglun_num between", value1, value2, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andPinglunNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pinglun_num not between", value1, value2, "pinglunNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumIsNull() {
            addCriterion("dianzan_num is null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumIsNotNull() {
            addCriterion("dianzan_num is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanNumEqualTo(Integer value) {
            addCriterion("dianzan_num =", value, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumNotEqualTo(Integer value) {
            addCriterion("dianzan_num <>", value, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumGreaterThan(Integer value) {
            addCriterion("dianzan_num >", value, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num >=", value, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumLessThan(Integer value) {
            addCriterion("dianzan_num <", value, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumLessThanOrEqualTo(Integer value) {
            addCriterion("dianzan_num <=", value, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumIn(List<Integer> values) {
            addCriterion("dianzan_num in", values, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumNotIn(List<Integer> values) {
            addCriterion("dianzan_num not in", values, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num between", value1, value2, "dianzanNum");
            return (Criteria) this;
        }

        public Criteria andDianzanNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dianzan_num not between", value1, value2, "dianzanNum");
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

        public Criteria andOriginalZhuanfaNumIsNull() {
            addCriterion("original_zhuanfa_num is null");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumIsNotNull() {
            addCriterion("original_zhuanfa_num is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumEqualTo(Integer value) {
            addCriterion("original_zhuanfa_num =", value, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumNotEqualTo(Integer value) {
            addCriterion("original_zhuanfa_num <>", value, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumGreaterThan(Integer value) {
            addCriterion("original_zhuanfa_num >", value, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_zhuanfa_num >=", value, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumLessThan(Integer value) {
            addCriterion("original_zhuanfa_num <", value, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumLessThanOrEqualTo(Integer value) {
            addCriterion("original_zhuanfa_num <=", value, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumIn(List<Integer> values) {
            addCriterion("original_zhuanfa_num in", values, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumNotIn(List<Integer> values) {
            addCriterion("original_zhuanfa_num not in", values, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumBetween(Integer value1, Integer value2) {
            addCriterion("original_zhuanfa_num between", value1, value2, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalZhuanfaNumNotBetween(Integer value1, Integer value2) {
            addCriterion("original_zhuanfa_num not between", value1, value2, "originalZhuanfaNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumIsNull() {
            addCriterion("original_pinglun_num is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumIsNotNull() {
            addCriterion("original_pinglun_num is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumEqualTo(Integer value) {
            addCriterion("original_pinglun_num =", value, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumNotEqualTo(Integer value) {
            addCriterion("original_pinglun_num <>", value, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumGreaterThan(Integer value) {
            addCriterion("original_pinglun_num >", value, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_pinglun_num >=", value, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumLessThan(Integer value) {
            addCriterion("original_pinglun_num <", value, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumLessThanOrEqualTo(Integer value) {
            addCriterion("original_pinglun_num <=", value, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumIn(List<Integer> values) {
            addCriterion("original_pinglun_num in", values, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumNotIn(List<Integer> values) {
            addCriterion("original_pinglun_num not in", values, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumBetween(Integer value1, Integer value2) {
            addCriterion("original_pinglun_num between", value1, value2, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPinglunNumNotBetween(Integer value1, Integer value2) {
            addCriterion("original_pinglun_num not between", value1, value2, "originalPinglunNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumIsNull() {
            addCriterion("original_dianzan_num is null");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumIsNotNull() {
            addCriterion("original_dianzan_num is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumEqualTo(Integer value) {
            addCriterion("original_dianzan_num =", value, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumNotEqualTo(Integer value) {
            addCriterion("original_dianzan_num <>", value, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumGreaterThan(Integer value) {
            addCriterion("original_dianzan_num >", value, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_dianzan_num >=", value, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumLessThan(Integer value) {
            addCriterion("original_dianzan_num <", value, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumLessThanOrEqualTo(Integer value) {
            addCriterion("original_dianzan_num <=", value, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumIn(List<Integer> values) {
            addCriterion("original_dianzan_num in", values, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumNotIn(List<Integer> values) {
            addCriterion("original_dianzan_num not in", values, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumBetween(Integer value1, Integer value2) {
            addCriterion("original_dianzan_num between", value1, value2, "originalDianzanNum");
            return (Criteria) this;
        }

        public Criteria andOriginalDianzanNumNotBetween(Integer value1, Integer value2) {
            addCriterion("original_dianzan_num not between", value1, value2, "originalDianzanNum");
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