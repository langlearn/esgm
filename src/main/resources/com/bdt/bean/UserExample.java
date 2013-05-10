package com.bdt.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUrIdIsNull() {
            addCriterion("ur_id is null");
            return (Criteria) this;
        }

        public Criteria andUrIdIsNotNull() {
            addCriterion("ur_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrIdEqualTo(Integer value) {
            addCriterion("ur_id =", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotEqualTo(Integer value) {
            addCriterion("ur_id <>", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdGreaterThan(Integer value) {
            addCriterion("ur_id >", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ur_id >=", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdLessThan(Integer value) {
            addCriterion("ur_id <", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdLessThanOrEqualTo(Integer value) {
            addCriterion("ur_id <=", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdIn(List<Integer> values) {
            addCriterion("ur_id in", values, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotIn(List<Integer> values) {
            addCriterion("ur_id not in", values, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdBetween(Integer value1, Integer value2) {
            addCriterion("ur_id between", value1, value2, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ur_id not between", value1, value2, "urId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportIsNull() {
            addCriterion("is_able_work_order_report is null");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportIsNotNull() {
            addCriterion("is_able_work_order_report is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportEqualTo(Byte value) {
            addCriterion("is_able_work_order_report =", value, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportNotEqualTo(Byte value) {
            addCriterion("is_able_work_order_report <>", value, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportGreaterThan(Byte value) {
            addCriterion("is_able_work_order_report >", value, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_able_work_order_report >=", value, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportLessThan(Byte value) {
            addCriterion("is_able_work_order_report <", value, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportLessThanOrEqualTo(Byte value) {
            addCriterion("is_able_work_order_report <=", value, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportIn(List<Byte> values) {
            addCriterion("is_able_work_order_report in", values, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportNotIn(List<Byte> values) {
            addCriterion("is_able_work_order_report not in", values, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportBetween(Byte value1, Byte value2) {
            addCriterion("is_able_work_order_report between", value1, value2, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderReportNotBetween(Byte value1, Byte value2) {
            addCriterion("is_able_work_order_report not between", value1, value2, "isAbleWorkOrderReport");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorIsNull() {
            addCriterion("is_able_work_order_sponsor is null");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorIsNotNull() {
            addCriterion("is_able_work_order_sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorEqualTo(Byte value) {
            addCriterion("is_able_work_order_sponsor =", value, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorNotEqualTo(Byte value) {
            addCriterion("is_able_work_order_sponsor <>", value, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorGreaterThan(Byte value) {
            addCriterion("is_able_work_order_sponsor >", value, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_able_work_order_sponsor >=", value, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorLessThan(Byte value) {
            addCriterion("is_able_work_order_sponsor <", value, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorLessThanOrEqualTo(Byte value) {
            addCriterion("is_able_work_order_sponsor <=", value, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorIn(List<Byte> values) {
            addCriterion("is_able_work_order_sponsor in", values, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorNotIn(List<Byte> values) {
            addCriterion("is_able_work_order_sponsor not in", values, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorBetween(Byte value1, Byte value2) {
            addCriterion("is_able_work_order_sponsor between", value1, value2, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderSponsorNotBetween(Byte value1, Byte value2) {
            addCriterion("is_able_work_order_sponsor not between", value1, value2, "isAbleWorkOrderSponsor");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptIsNull() {
            addCriterion("is_able_work_order_accept is null");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptIsNotNull() {
            addCriterion("is_able_work_order_accept is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptEqualTo(Byte value) {
            addCriterion("is_able_work_order_accept =", value, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptNotEqualTo(Byte value) {
            addCriterion("is_able_work_order_accept <>", value, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptGreaterThan(Byte value) {
            addCriterion("is_able_work_order_accept >", value, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_able_work_order_accept >=", value, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptLessThan(Byte value) {
            addCriterion("is_able_work_order_accept <", value, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptLessThanOrEqualTo(Byte value) {
            addCriterion("is_able_work_order_accept <=", value, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptIn(List<Byte> values) {
            addCriterion("is_able_work_order_accept in", values, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptNotIn(List<Byte> values) {
            addCriterion("is_able_work_order_accept not in", values, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptBetween(Byte value1, Byte value2) {
            addCriterion("is_able_work_order_accept between", value1, value2, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsAbleWorkOrderAcceptNotBetween(Byte value1, Byte value2) {
            addCriterion("is_able_work_order_accept not between", value1, value2, "isAbleWorkOrderAccept");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryIsNull() {
            addCriterion("is_public_work_diary is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryIsNotNull() {
            addCriterion("is_public_work_diary is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryEqualTo(Byte value) {
            addCriterion("is_public_work_diary =", value, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryNotEqualTo(Byte value) {
            addCriterion("is_public_work_diary <>", value, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryGreaterThan(Byte value) {
            addCriterion("is_public_work_diary >", value, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_public_work_diary >=", value, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryLessThan(Byte value) {
            addCriterion("is_public_work_diary <", value, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryLessThanOrEqualTo(Byte value) {
            addCriterion("is_public_work_diary <=", value, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryIn(List<Byte> values) {
            addCriterion("is_public_work_diary in", values, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryNotIn(List<Byte> values) {
            addCriterion("is_public_work_diary not in", values, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryBetween(Byte value1, Byte value2) {
            addCriterion("is_public_work_diary between", value1, value2, "isPublicWorkDiary");
            return (Criteria) this;
        }

        public Criteria andIsPublicWorkDiaryNotBetween(Byte value1, Byte value2) {
            addCriterion("is_public_work_diary not between", value1, value2, "isPublicWorkDiary");
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