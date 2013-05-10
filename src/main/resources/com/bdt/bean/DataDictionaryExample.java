package com.bdt.bean;

import java.util.ArrayList;
import java.util.List;

public class DataDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDictionaryExample() {
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

        public Criteria andDdIdIsNull() {
            addCriterion("dd_id is null");
            return (Criteria) this;
        }

        public Criteria andDdIdIsNotNull() {
            addCriterion("dd_id is not null");
            return (Criteria) this;
        }

        public Criteria andDdIdEqualTo(Integer value) {
            addCriterion("dd_id =", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotEqualTo(Integer value) {
            addCriterion("dd_id <>", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThan(Integer value) {
            addCriterion("dd_id >", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dd_id >=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThan(Integer value) {
            addCriterion("dd_id <", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThanOrEqualTo(Integer value) {
            addCriterion("dd_id <=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdIn(List<Integer> values) {
            addCriterion("dd_id in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotIn(List<Integer> values) {
            addCriterion("dd_id not in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdBetween(Integer value1, Integer value2) {
            addCriterion("dd_id between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dd_id not between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIsNull() {
            addCriterion("dictionary_name is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIsNotNull() {
            addCriterion("dictionary_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameEqualTo(String value) {
            addCriterion("dictionary_name =", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotEqualTo(String value) {
            addCriterion("dictionary_name <>", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameGreaterThan(String value) {
            addCriterion("dictionary_name >", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_name >=", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLessThan(String value) {
            addCriterion("dictionary_name <", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLessThanOrEqualTo(String value) {
            addCriterion("dictionary_name <=", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLike(String value) {
            addCriterion("dictionary_name like", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotLike(String value) {
            addCriterion("dictionary_name not like", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIn(List<String> values) {
            addCriterion("dictionary_name in", values, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotIn(List<String> values) {
            addCriterion("dictionary_name not in", values, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameBetween(String value1, String value2) {
            addCriterion("dictionary_name between", value1, value2, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotBetween(String value1, String value2) {
            addCriterion("dictionary_name not between", value1, value2, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeIsNull() {
            addCriterion("dictionary_code is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeIsNotNull() {
            addCriterion("dictionary_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeEqualTo(String value) {
            addCriterion("dictionary_code =", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotEqualTo(String value) {
            addCriterion("dictionary_code <>", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeGreaterThan(String value) {
            addCriterion("dictionary_code >", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_code >=", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeLessThan(String value) {
            addCriterion("dictionary_code <", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeLessThanOrEqualTo(String value) {
            addCriterion("dictionary_code <=", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeLike(String value) {
            addCriterion("dictionary_code like", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotLike(String value) {
            addCriterion("dictionary_code not like", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeIn(List<String> values) {
            addCriterion("dictionary_code in", values, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotIn(List<String> values) {
            addCriterion("dictionary_code not in", values, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeBetween(String value1, String value2) {
            addCriterion("dictionary_code between", value1, value2, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotBetween(String value1, String value2) {
            addCriterion("dictionary_code not between", value1, value2, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("is_use is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("is_use is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Byte value) {
            addCriterion("is_use =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Byte value) {
            addCriterion("is_use <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Byte value) {
            addCriterion("is_use >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_use >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Byte value) {
            addCriterion("is_use <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Byte value) {
            addCriterion("is_use <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Byte> values) {
            addCriterion("is_use in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Byte> values) {
            addCriterion("is_use not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Byte value1, Byte value2) {
            addCriterion("is_use between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Byte value1, Byte value2) {
            addCriterion("is_use not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIsNull() {
            addCriterion("descriptions is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIsNotNull() {
            addCriterion("descriptions is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsEqualTo(String value) {
            addCriterion("descriptions =", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotEqualTo(String value) {
            addCriterion("descriptions <>", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThan(String value) {
            addCriterion("descriptions >", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThanOrEqualTo(String value) {
            addCriterion("descriptions >=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThan(String value) {
            addCriterion("descriptions <", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThanOrEqualTo(String value) {
            addCriterion("descriptions <=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLike(String value) {
            addCriterion("descriptions like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotLike(String value) {
            addCriterion("descriptions not like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIn(List<String> values) {
            addCriterion("descriptions in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotIn(List<String> values) {
            addCriterion("descriptions not in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsBetween(String value1, String value2) {
            addCriterion("descriptions between", value1, value2, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotBetween(String value1, String value2) {
            addCriterion("descriptions not between", value1, value2, "descriptions");
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