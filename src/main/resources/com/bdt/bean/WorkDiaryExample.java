package com.bdt.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkDiaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkDiaryExample() {
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

        public Criteria andWdIdIsNull() {
            addCriterion("wd_id is null");
            return (Criteria) this;
        }

        public Criteria andWdIdIsNotNull() {
            addCriterion("wd_id is not null");
            return (Criteria) this;
        }

        public Criteria andWdIdEqualTo(Integer value) {
            addCriterion("wd_id =", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotEqualTo(Integer value) {
            addCriterion("wd_id <>", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdGreaterThan(Integer value) {
            addCriterion("wd_id >", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_id >=", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdLessThan(Integer value) {
            addCriterion("wd_id <", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdLessThanOrEqualTo(Integer value) {
            addCriterion("wd_id <=", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdIn(List<Integer> values) {
            addCriterion("wd_id in", values, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotIn(List<Integer> values) {
            addCriterion("wd_id not in", values, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdBetween(Integer value1, Integer value2) {
            addCriterion("wd_id between", value1, value2, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_id not between", value1, value2, "wdId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
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

        public Criteria andJobContentIsNull() {
            addCriterion("job_content is null");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNotNull() {
            addCriterion("job_content is not null");
            return (Criteria) this;
        }

        public Criteria andJobContentEqualTo(String value) {
            addCriterion("job_content =", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotEqualTo(String value) {
            addCriterion("job_content <>", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThan(String value) {
            addCriterion("job_content >", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThanOrEqualTo(String value) {
            addCriterion("job_content >=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThan(String value) {
            addCriterion("job_content <", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThanOrEqualTo(String value) {
            addCriterion("job_content <=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLike(String value) {
            addCriterion("job_content like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotLike(String value) {
            addCriterion("job_content not like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentIn(List<String> values) {
            addCriterion("job_content in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotIn(List<String> values) {
            addCriterion("job_content not in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentBetween(String value1, String value2) {
            addCriterion("job_content between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotBetween(String value1, String value2) {
            addCriterion("job_content not between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andWorkTypeCodeIsNull() {
            addCriterion("work_type_code is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeIsNotNull() {
            addCriterion("work_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeEqualTo(String value) {
            addCriterion("work_type_code =", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotEqualTo(String value) {
            addCriterion("work_type_code <>", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeGreaterThan(String value) {
            addCriterion("work_type_code >", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("work_type_code >=", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeLessThan(String value) {
            addCriterion("work_type_code <", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("work_type_code <=", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeLike(String value) {
            addCriterion("work_type_code like", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotLike(String value) {
            addCriterion("work_type_code not like", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeIn(List<String> values) {
            addCriterion("work_type_code in", values, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotIn(List<String> values) {
            addCriterion("work_type_code not in", values, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeBetween(String value1, String value2) {
            addCriterion("work_type_code between", value1, value2, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotBetween(String value1, String value2) {
            addCriterion("work_type_code not between", value1, value2, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkHourIsNull() {
            addCriterion("work_hour is null");
            return (Criteria) this;
        }

        public Criteria andWorkHourIsNotNull() {
            addCriterion("work_hour is not null");
            return (Criteria) this;
        }

        public Criteria andWorkHourEqualTo(BigDecimal value) {
            addCriterion("work_hour =", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourNotEqualTo(BigDecimal value) {
            addCriterion("work_hour <>", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourGreaterThan(BigDecimal value) {
            addCriterion("work_hour >", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("work_hour >=", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourLessThan(BigDecimal value) {
            addCriterion("work_hour <", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("work_hour <=", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourIn(List<BigDecimal> values) {
            addCriterion("work_hour in", values, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourNotIn(List<BigDecimal> values) {
            addCriterion("work_hour not in", values, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("work_hour between", value1, value2, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("work_hour not between", value1, value2, "workHour");
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