package com.bdt.bean;

import java.util.ArrayList;
import java.util.List;

public class ViewUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("UserPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("UserPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("UserPwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("UserPwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("UserPwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("UserPwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("UserPwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("UserPwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("UserPwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("UserPwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("UserPwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("UserPwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("UserPwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("UserPwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("TrueName is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("TrueName is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("TrueName =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("TrueName <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("TrueName >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("TrueName >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("TrueName <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("TrueName <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("TrueName like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("TrueName not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("TrueName in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("TrueName not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("TrueName between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("TrueName not between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("Department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("Department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("Department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("Department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("Department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("Department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("Department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("Department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("Department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("Department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("Department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("Department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("Department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andZhiweiIsNull() {
            addCriterion("ZhiWei is null");
            return (Criteria) this;
        }

        public Criteria andZhiweiIsNotNull() {
            addCriterion("ZhiWei is not null");
            return (Criteria) this;
        }

        public Criteria andZhiweiEqualTo(String value) {
            addCriterion("ZhiWei =", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotEqualTo(String value) {
            addCriterion("ZhiWei <>", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiGreaterThan(String value) {
            addCriterion("ZhiWei >", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiWei >=", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLessThan(String value) {
            addCriterion("ZhiWei <", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLessThanOrEqualTo(String value) {
            addCriterion("ZhiWei <=", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLike(String value) {
            addCriterion("ZhiWei like", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotLike(String value) {
            addCriterion("ZhiWei not like", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiIn(List<String> values) {
            addCriterion("ZhiWei in", values, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotIn(List<String> values) {
            addCriterion("ZhiWei not in", values, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiBetween(String value1, String value2) {
            addCriterion("ZhiWei between", value1, value2, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotBetween(String value1, String value2) {
            addCriterion("ZhiWei not between", value1, value2, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZaigangIsNull() {
            addCriterion("ZaiGang is null");
            return (Criteria) this;
        }

        public Criteria andZaigangIsNotNull() {
            addCriterion("ZaiGang is not null");
            return (Criteria) this;
        }

        public Criteria andZaigangEqualTo(String value) {
            addCriterion("ZaiGang =", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangNotEqualTo(String value) {
            addCriterion("ZaiGang <>", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangGreaterThan(String value) {
            addCriterion("ZaiGang >", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangGreaterThanOrEqualTo(String value) {
            addCriterion("ZaiGang >=", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangLessThan(String value) {
            addCriterion("ZaiGang <", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangLessThanOrEqualTo(String value) {
            addCriterion("ZaiGang <=", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangLike(String value) {
            addCriterion("ZaiGang like", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangNotLike(String value) {
            addCriterion("ZaiGang not like", value, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangIn(List<String> values) {
            addCriterion("ZaiGang in", values, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangNotIn(List<String> values) {
            addCriterion("ZaiGang not in", values, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangBetween(String value1, String value2) {
            addCriterion("ZaiGang between", value1, value2, "zaigang");
            return (Criteria) this;
        }

        public Criteria andZaigangNotBetween(String value1, String value2) {
            addCriterion("ZaiGang not between", value1, value2, "zaigang");
            return (Criteria) this;
        }

        public Criteria andEmailstrIsNull() {
            addCriterion("EmailStr is null");
            return (Criteria) this;
        }

        public Criteria andEmailstrIsNotNull() {
            addCriterion("EmailStr is not null");
            return (Criteria) this;
        }

        public Criteria andEmailstrEqualTo(String value) {
            addCriterion("EmailStr =", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrNotEqualTo(String value) {
            addCriterion("EmailStr <>", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrGreaterThan(String value) {
            addCriterion("EmailStr >", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrGreaterThanOrEqualTo(String value) {
            addCriterion("EmailStr >=", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrLessThan(String value) {
            addCriterion("EmailStr <", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrLessThanOrEqualTo(String value) {
            addCriterion("EmailStr <=", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrLike(String value) {
            addCriterion("EmailStr like", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrNotLike(String value) {
            addCriterion("EmailStr not like", value, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrIn(List<String> values) {
            addCriterion("EmailStr in", values, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrNotIn(List<String> values) {
            addCriterion("EmailStr not in", values, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrBetween(String value1, String value2) {
            addCriterion("EmailStr between", value1, value2, "emailstr");
            return (Criteria) this;
        }

        public Criteria andEmailstrNotBetween(String value1, String value2) {
            addCriterion("EmailStr not between", value1, value2, "emailstr");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
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