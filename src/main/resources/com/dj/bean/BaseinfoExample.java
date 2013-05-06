package com.dj.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseinfoExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andCcodeIsNull() {
            addCriterion("ccode is null");
            return (Criteria) this;
        }

        public Criteria andCcodeIsNotNull() {
            addCriterion("ccode is not null");
            return (Criteria) this;
        }

        public Criteria andCcodeEqualTo(String value) {
            addCriterion("ccode =", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotEqualTo(String value) {
            addCriterion("ccode <>", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeGreaterThan(String value) {
            addCriterion("ccode >", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ccode >=", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLessThan(String value) {
            addCriterion("ccode <", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLessThanOrEqualTo(String value) {
            addCriterion("ccode <=", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLike(String value) {
            addCriterion("ccode like", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotLike(String value) {
            addCriterion("ccode not like", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeIn(List<String> values) {
            addCriterion("ccode in", values, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotIn(List<String> values) {
            addCriterion("ccode not in", values, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeBetween(String value1, String value2) {
            addCriterion("ccode between", value1, value2, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotBetween(String value1, String value2) {
            addCriterion("ccode not between", value1, value2, "ccode");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCsortIsNull() {
            addCriterion("csort is null");
            return (Criteria) this;
        }

        public Criteria andCsortIsNotNull() {
            addCriterion("csort is not null");
            return (Criteria) this;
        }

        public Criteria andCsortEqualTo(String value) {
            addCriterion("csort =", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortNotEqualTo(String value) {
            addCriterion("csort <>", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortGreaterThan(String value) {
            addCriterion("csort >", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortGreaterThanOrEqualTo(String value) {
            addCriterion("csort >=", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortLessThan(String value) {
            addCriterion("csort <", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortLessThanOrEqualTo(String value) {
            addCriterion("csort <=", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortLike(String value) {
            addCriterion("csort like", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortNotLike(String value) {
            addCriterion("csort not like", value, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortIn(List<String> values) {
            addCriterion("csort in", values, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortNotIn(List<String> values) {
            addCriterion("csort not in", values, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortBetween(String value1, String value2) {
            addCriterion("csort between", value1, value2, "csort");
            return (Criteria) this;
        }

        public Criteria andCsortNotBetween(String value1, String value2) {
            addCriterion("csort not between", value1, value2, "csort");
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