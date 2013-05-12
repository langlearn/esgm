package com.bdt.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewWorkOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewWorkOrderExample() {
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

        public Criteria andWoIdIsNull() {
            addCriterion("wo_id is null");
            return (Criteria) this;
        }

        public Criteria andWoIdIsNotNull() {
            addCriterion("wo_id is not null");
            return (Criteria) this;
        }

        public Criteria andWoIdEqualTo(Integer value) {
            addCriterion("wo_id =", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotEqualTo(Integer value) {
            addCriterion("wo_id <>", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdGreaterThan(Integer value) {
            addCriterion("wo_id >", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wo_id >=", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdLessThan(Integer value) {
            addCriterion("wo_id <", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdLessThanOrEqualTo(Integer value) {
            addCriterion("wo_id <=", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdIn(List<Integer> values) {
            addCriterion("wo_id in", values, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotIn(List<Integer> values) {
            addCriterion("wo_id not in", values, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdBetween(Integer value1, Integer value2) {
            addCriterion("wo_id between", value1, value2, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wo_id not between", value1, value2, "woId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleIsNull() {
            addCriterion("work_order_title is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleIsNotNull() {
            addCriterion("work_order_title is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleEqualTo(String value) {
            addCriterion("work_order_title =", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleNotEqualTo(String value) {
            addCriterion("work_order_title <>", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleGreaterThan(String value) {
            addCriterion("work_order_title >", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleGreaterThanOrEqualTo(String value) {
            addCriterion("work_order_title >=", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleLessThan(String value) {
            addCriterion("work_order_title <", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleLessThanOrEqualTo(String value) {
            addCriterion("work_order_title <=", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleLike(String value) {
            addCriterion("work_order_title like", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleNotLike(String value) {
            addCriterion("work_order_title not like", value, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleIn(List<String> values) {
            addCriterion("work_order_title in", values, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleNotIn(List<String> values) {
            addCriterion("work_order_title not in", values, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleBetween(String value1, String value2) {
            addCriterion("work_order_title between", value1, value2, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTitleNotBetween(String value1, String value2) {
            addCriterion("work_order_title not between", value1, value2, "workOrderTitle");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeIsNull() {
            addCriterion("expect_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeIsNotNull() {
            addCriterion("expect_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeEqualTo(Date value) {
            addCriterion("expect_begin_time =", value, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeNotEqualTo(Date value) {
            addCriterion("expect_begin_time <>", value, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeGreaterThan(Date value) {
            addCriterion("expect_begin_time >", value, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_begin_time >=", value, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeLessThan(Date value) {
            addCriterion("expect_begin_time <", value, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_begin_time <=", value, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeIn(List<Date> values) {
            addCriterion("expect_begin_time in", values, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeNotIn(List<Date> values) {
            addCriterion("expect_begin_time not in", values, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeBetween(Date value1, Date value2) {
            addCriterion("expect_begin_time between", value1, value2, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_begin_time not between", value1, value2, "expectBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeIsNull() {
            addCriterion("expect_end_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeIsNotNull() {
            addCriterion("expect_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeEqualTo(Date value) {
            addCriterion("expect_end_time =", value, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeNotEqualTo(Date value) {
            addCriterion("expect_end_time <>", value, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeGreaterThan(Date value) {
            addCriterion("expect_end_time >", value, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_end_time >=", value, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeLessThan(Date value) {
            addCriterion("expect_end_time <", value, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_end_time <=", value, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeIn(List<Date> values) {
            addCriterion("expect_end_time in", values, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeNotIn(List<Date> values) {
            addCriterion("expect_end_time not in", values, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeBetween(Date value1, Date value2) {
            addCriterion("expect_end_time between", value1, value2, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andExpectEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_end_time not between", value1, value2, "expectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdIsNull() {
            addCriterion("report_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReportUserIdIsNotNull() {
            addCriterion("report_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportUserIdEqualTo(Integer value) {
            addCriterion("report_user_id =", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdNotEqualTo(Integer value) {
            addCriterion("report_user_id <>", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdGreaterThan(Integer value) {
            addCriterion("report_user_id >", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_user_id >=", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdLessThan(Integer value) {
            addCriterion("report_user_id <", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("report_user_id <=", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdIn(List<Integer> values) {
            addCriterion("report_user_id in", values, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdNotIn(List<Integer> values) {
            addCriterion("report_user_id not in", values, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdBetween(Integer value1, Integer value2) {
            addCriterion("report_user_id between", value1, value2, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("report_user_id not between", value1, value2, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdIsNull() {
            addCriterion("sponsor_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdIsNotNull() {
            addCriterion("sponsor_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdEqualTo(Integer value) {
            addCriterion("sponsor_user_id =", value, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdNotEqualTo(Integer value) {
            addCriterion("sponsor_user_id <>", value, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdGreaterThan(Integer value) {
            addCriterion("sponsor_user_id >", value, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sponsor_user_id >=", value, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdLessThan(Integer value) {
            addCriterion("sponsor_user_id <", value, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sponsor_user_id <=", value, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdIn(List<Integer> values) {
            addCriterion("sponsor_user_id in", values, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdNotIn(List<Integer> values) {
            addCriterion("sponsor_user_id not in", values, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sponsor_user_id between", value1, value2, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sponsor_user_id not between", value1, value2, "sponsorUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIsNull() {
            addCriterion("accept_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIsNotNull() {
            addCriterion("accept_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdEqualTo(Integer value) {
            addCriterion("accept_user_id =", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotEqualTo(Integer value) {
            addCriterion("accept_user_id <>", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdGreaterThan(Integer value) {
            addCriterion("accept_user_id >", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accept_user_id >=", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdLessThan(Integer value) {
            addCriterion("accept_user_id <", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("accept_user_id <=", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIn(List<Integer> values) {
            addCriterion("accept_user_id in", values, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotIn(List<Integer> values) {
            addCriterion("accept_user_id not in", values, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdBetween(Integer value1, Integer value2) {
            addCriterion("accept_user_id between", value1, value2, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accept_user_id not between", value1, value2, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNull() {
            addCriterion("confirm_status is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNotNull() {
            addCriterion("confirm_status is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusEqualTo(Byte value) {
            addCriterion("confirm_status =", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotEqualTo(Byte value) {
            addCriterion("confirm_status <>", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThan(Byte value) {
            addCriterion("confirm_status >", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("confirm_status >=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThan(Byte value) {
            addCriterion("confirm_status <", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("confirm_status <=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIn(List<Byte> values) {
            addCriterion("confirm_status in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotIn(List<Byte> values) {
            addCriterion("confirm_status not in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusBetween(Byte value1, Byte value2) {
            addCriterion("confirm_status between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("confirm_status not between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusIsNull() {
            addCriterion("accept_status is null");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusIsNotNull() {
            addCriterion("accept_status is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusEqualTo(Byte value) {
            addCriterion("accept_status =", value, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusNotEqualTo(Byte value) {
            addCriterion("accept_status <>", value, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusGreaterThan(Byte value) {
            addCriterion("accept_status >", value, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("accept_status >=", value, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusLessThan(Byte value) {
            addCriterion("accept_status <", value, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusLessThanOrEqualTo(Byte value) {
            addCriterion("accept_status <=", value, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusIn(List<Byte> values) {
            addCriterion("accept_status in", values, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusNotIn(List<Byte> values) {
            addCriterion("accept_status not in", values, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusBetween(Byte value1, Byte value2) {
            addCriterion("accept_status between", value1, value2, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("accept_status not between", value1, value2, "acceptStatus");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNull() {
            addCriterion("accept_time is null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNotNull() {
            addCriterion("accept_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeEqualTo(Date value) {
            addCriterion("accept_time =", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotEqualTo(Date value) {
            addCriterion("accept_time <>", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThan(Date value) {
            addCriterion("accept_time >", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accept_time >=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThan(Date value) {
            addCriterion("accept_time <", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThanOrEqualTo(Date value) {
            addCriterion("accept_time <=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIn(List<Date> values) {
            addCriterion("accept_time in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotIn(List<Date> values) {
            addCriterion("accept_time not in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeBetween(Date value1, Date value2) {
            addCriterion("accept_time between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotBetween(Date value1, Date value2) {
            addCriterion("accept_time not between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusIsNull() {
            addCriterion("check_receive_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusIsNotNull() {
            addCriterion("check_receive_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusEqualTo(Byte value) {
            addCriterion("check_receive_status =", value, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusNotEqualTo(Byte value) {
            addCriterion("check_receive_status <>", value, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusGreaterThan(Byte value) {
            addCriterion("check_receive_status >", value, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_receive_status >=", value, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusLessThan(Byte value) {
            addCriterion("check_receive_status <", value, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusLessThanOrEqualTo(Byte value) {
            addCriterion("check_receive_status <=", value, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusIn(List<Byte> values) {
            addCriterion("check_receive_status in", values, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusNotIn(List<Byte> values) {
            addCriterion("check_receive_status not in", values, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusBetween(Byte value1, Byte value2) {
            addCriterion("check_receive_status between", value1, value2, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("check_receive_status not between", value1, value2, "checkReceiveStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeIsNull() {
            addCriterion("check_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeIsNotNull() {
            addCriterion("check_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeEqualTo(Date value) {
            addCriterion("check_receive_time =", value, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeNotEqualTo(Date value) {
            addCriterion("check_receive_time <>", value, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeGreaterThan(Date value) {
            addCriterion("check_receive_time >", value, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_receive_time >=", value, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeLessThan(Date value) {
            addCriterion("check_receive_time <", value, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_receive_time <=", value, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeIn(List<Date> values) {
            addCriterion("check_receive_time in", values, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeNotIn(List<Date> values) {
            addCriterion("check_receive_time not in", values, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("check_receive_time between", value1, value2, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andCheckReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_receive_time not between", value1, value2, "checkReceiveTime");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonIsNull() {
            addCriterion("invalid_reason is null");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonIsNotNull() {
            addCriterion("invalid_reason is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonEqualTo(String value) {
            addCriterion("invalid_reason =", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonNotEqualTo(String value) {
            addCriterion("invalid_reason <>", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonGreaterThan(String value) {
            addCriterion("invalid_reason >", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonGreaterThanOrEqualTo(String value) {
            addCriterion("invalid_reason >=", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonLessThan(String value) {
            addCriterion("invalid_reason <", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonLessThanOrEqualTo(String value) {
            addCriterion("invalid_reason <=", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonLike(String value) {
            addCriterion("invalid_reason like", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonNotLike(String value) {
            addCriterion("invalid_reason not like", value, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonIn(List<String> values) {
            addCriterion("invalid_reason in", values, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonNotIn(List<String> values) {
            addCriterion("invalid_reason not in", values, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonBetween(String value1, String value2) {
            addCriterion("invalid_reason between", value1, value2, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andInvalidReasonNotBetween(String value1, String value2) {
            addCriterion("invalid_reason not between", value1, value2, "invalidReason");
            return (Criteria) this;
        }

        public Criteria andReportUserIsNull() {
            addCriterion("report_user is null");
            return (Criteria) this;
        }

        public Criteria andReportUserIsNotNull() {
            addCriterion("report_user is not null");
            return (Criteria) this;
        }

        public Criteria andReportUserEqualTo(String value) {
            addCriterion("report_user =", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserNotEqualTo(String value) {
            addCriterion("report_user <>", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserGreaterThan(String value) {
            addCriterion("report_user >", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserGreaterThanOrEqualTo(String value) {
            addCriterion("report_user >=", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserLessThan(String value) {
            addCriterion("report_user <", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserLessThanOrEqualTo(String value) {
            addCriterion("report_user <=", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserLike(String value) {
            addCriterion("report_user like", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserNotLike(String value) {
            addCriterion("report_user not like", value, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserIn(List<String> values) {
            addCriterion("report_user in", values, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserNotIn(List<String> values) {
            addCriterion("report_user not in", values, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserBetween(String value1, String value2) {
            addCriterion("report_user between", value1, value2, "reportUser");
            return (Criteria) this;
        }

        public Criteria andReportUserNotBetween(String value1, String value2) {
            addCriterion("report_user not between", value1, value2, "reportUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIsNull() {
            addCriterion("sponsor_user is null");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIsNotNull() {
            addCriterion("sponsor_user is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorUserEqualTo(String value) {
            addCriterion("sponsor_user =", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserNotEqualTo(String value) {
            addCriterion("sponsor_user <>", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserGreaterThan(String value) {
            addCriterion("sponsor_user >", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor_user >=", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserLessThan(String value) {
            addCriterion("sponsor_user <", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserLessThanOrEqualTo(String value) {
            addCriterion("sponsor_user <=", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserLike(String value) {
            addCriterion("sponsor_user like", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserNotLike(String value) {
            addCriterion("sponsor_user not like", value, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserIn(List<String> values) {
            addCriterion("sponsor_user in", values, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserNotIn(List<String> values) {
            addCriterion("sponsor_user not in", values, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserBetween(String value1, String value2) {
            addCriterion("sponsor_user between", value1, value2, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andSponsorUserNotBetween(String value1, String value2) {
            addCriterion("sponsor_user not between", value1, value2, "sponsorUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIsNull() {
            addCriterion("accept_user is null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIsNotNull() {
            addCriterion("accept_user is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserEqualTo(String value) {
            addCriterion("accept_user =", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNotEqualTo(String value) {
            addCriterion("accept_user <>", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserGreaterThan(String value) {
            addCriterion("accept_user >", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserGreaterThanOrEqualTo(String value) {
            addCriterion("accept_user >=", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserLessThan(String value) {
            addCriterion("accept_user <", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserLessThanOrEqualTo(String value) {
            addCriterion("accept_user <=", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserLike(String value) {
            addCriterion("accept_user like", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNotLike(String value) {
            addCriterion("accept_user not like", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIn(List<String> values) {
            addCriterion("accept_user in", values, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNotIn(List<String> values) {
            addCriterion("accept_user not in", values, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserBetween(String value1, String value2) {
            addCriterion("accept_user between", value1, value2, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNotBetween(String value1, String value2) {
            addCriterion("accept_user not between", value1, value2, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
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