package com.bdt.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkOrderCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkOrderCopyExample() {
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

        public Criteria andWocIdIsNull() {
            addCriterion("woc_id is null");
            return (Criteria) this;
        }

        public Criteria andWocIdIsNotNull() {
            addCriterion("woc_id is not null");
            return (Criteria) this;
        }

        public Criteria andWocIdEqualTo(Integer value) {
            addCriterion("woc_id =", value, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdNotEqualTo(Integer value) {
            addCriterion("woc_id <>", value, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdGreaterThan(Integer value) {
            addCriterion("woc_id >", value, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("woc_id >=", value, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdLessThan(Integer value) {
            addCriterion("woc_id <", value, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdLessThanOrEqualTo(Integer value) {
            addCriterion("woc_id <=", value, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdIn(List<Integer> values) {
            addCriterion("woc_id in", values, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdNotIn(List<Integer> values) {
            addCriterion("woc_id not in", values, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdBetween(Integer value1, Integer value2) {
            addCriterion("woc_id between", value1, value2, "wocId");
            return (Criteria) this;
        }

        public Criteria andWocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("woc_id not between", value1, value2, "wocId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNull() {
            addCriterion("work_order_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNotNull() {
            addCriterion("work_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdEqualTo(Integer value) {
            addCriterion("work_order_id =", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotEqualTo(Integer value) {
            addCriterion("work_order_id <>", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThan(Integer value) {
            addCriterion("work_order_id >", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_order_id >=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThan(Integer value) {
            addCriterion("work_order_id <", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_order_id <=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIn(List<Integer> values) {
            addCriterion("work_order_id in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotIn(List<Integer> values) {
            addCriterion("work_order_id not in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("work_order_id between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_order_id not between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andCopyTimeIsNull() {
            addCriterion("copy_time is null");
            return (Criteria) this;
        }

        public Criteria andCopyTimeIsNotNull() {
            addCriterion("copy_time is not null");
            return (Criteria) this;
        }

        public Criteria andCopyTimeEqualTo(Date value) {
            addCriterion("copy_time =", value, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeNotEqualTo(Date value) {
            addCriterion("copy_time <>", value, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeGreaterThan(Date value) {
            addCriterion("copy_time >", value, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("copy_time >=", value, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeLessThan(Date value) {
            addCriterion("copy_time <", value, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeLessThanOrEqualTo(Date value) {
            addCriterion("copy_time <=", value, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeIn(List<Date> values) {
            addCriterion("copy_time in", values, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeNotIn(List<Date> values) {
            addCriterion("copy_time not in", values, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeBetween(Date value1, Date value2) {
            addCriterion("copy_time between", value1, value2, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyTimeNotBetween(Date value1, Date value2) {
            addCriterion("copy_time not between", value1, value2, "copyTime");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdIsNull() {
            addCriterion("copy_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdIsNotNull() {
            addCriterion("copy_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdEqualTo(Integer value) {
            addCriterion("copy_user_id =", value, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdNotEqualTo(Integer value) {
            addCriterion("copy_user_id <>", value, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdGreaterThan(Integer value) {
            addCriterion("copy_user_id >", value, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_user_id >=", value, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdLessThan(Integer value) {
            addCriterion("copy_user_id <", value, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("copy_user_id <=", value, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdIn(List<Integer> values) {
            addCriterion("copy_user_id in", values, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdNotIn(List<Integer> values) {
            addCriterion("copy_user_id not in", values, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("copy_user_id between", value1, value2, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andCopyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_user_id not between", value1, value2, "copyUserId");
            return (Criteria) this;
        }

        public Criteria andIsSignForIsNull() {
            addCriterion("is_sign_for is null");
            return (Criteria) this;
        }

        public Criteria andIsSignForIsNotNull() {
            addCriterion("is_sign_for is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignForEqualTo(Byte value) {
            addCriterion("is_sign_for =", value, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForNotEqualTo(Byte value) {
            addCriterion("is_sign_for <>", value, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForGreaterThan(Byte value) {
            addCriterion("is_sign_for >", value, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_sign_for >=", value, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForLessThan(Byte value) {
            addCriterion("is_sign_for <", value, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForLessThanOrEqualTo(Byte value) {
            addCriterion("is_sign_for <=", value, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForIn(List<Byte> values) {
            addCriterion("is_sign_for in", values, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForNotIn(List<Byte> values) {
            addCriterion("is_sign_for not in", values, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForBetween(Byte value1, Byte value2) {
            addCriterion("is_sign_for between", value1, value2, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andIsSignForNotBetween(Byte value1, Byte value2) {
            addCriterion("is_sign_for not between", value1, value2, "isSignFor");
            return (Criteria) this;
        }

        public Criteria andSignForTimeIsNull() {
            addCriterion("sign_for_time is null");
            return (Criteria) this;
        }

        public Criteria andSignForTimeIsNotNull() {
            addCriterion("sign_for_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignForTimeEqualTo(Date value) {
            addCriterion("sign_for_time =", value, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeNotEqualTo(Date value) {
            addCriterion("sign_for_time <>", value, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeGreaterThan(Date value) {
            addCriterion("sign_for_time >", value, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_for_time >=", value, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeLessThan(Date value) {
            addCriterion("sign_for_time <", value, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_for_time <=", value, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeIn(List<Date> values) {
            addCriterion("sign_for_time in", values, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeNotIn(List<Date> values) {
            addCriterion("sign_for_time not in", values, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeBetween(Date value1, Date value2) {
            addCriterion("sign_for_time between", value1, value2, "signForTime");
            return (Criteria) this;
        }

        public Criteria andSignForTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_for_time not between", value1, value2, "signForTime");
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