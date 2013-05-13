package com.bdt.mapper;

import com.bdt.bean.WorkOrder;
import com.bdt.bean.WorkOrderExample;
import com.bdt.bean.WorkOrderExample.Criteria;
import com.bdt.bean.WorkOrderExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class WorkOrderSqlProvider {

    public String countByExample(WorkOrderExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("JEHR_work_order");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(WorkOrderExample example) {
        BEGIN();
        DELETE_FROM("JEHR_work_order");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(WorkOrder record) {
        BEGIN();
        INSERT_INTO("JEHR_work_order");

        if (record.getTaskId() != null) {
            VALUES("task_id", "#{taskId,jdbcType=INTEGER}");
        }

        if (record.getWorkOrderTitle() != null) {
            VALUES("work_order_title", "#{workOrderTitle,jdbcType=VARCHAR}");
        }

        if (record.getExpectBeginTime() != null) {
            VALUES("expect_begin_time", "#{expectBeginTime,jdbcType=TIMESTAMP}");
        }

        if (record.getExpectEndTime() != null) {
            VALUES("expect_end_time", "#{expectEndTime,jdbcType=TIMESTAMP}");
        }

        if (record.getProjectId() != null) {
            VALUES("project_id", "#{projectId,jdbcType=INTEGER}");
        }

        if (record.getReportUserId() != null) {
            VALUES("report_user_id", "#{reportUserId,jdbcType=INTEGER}");
        }

        if (record.getReportTime() != null) {
            VALUES("report_time", "#{reportTime,jdbcType=TIMESTAMP}");
        }

        if (record.getSponsorUserId() != null) {
            VALUES("sponsor_user_id", "#{sponsorUserId,jdbcType=INTEGER}");
        }

        if (record.getAcceptUserId() != null) {
            VALUES("accept_user_id", "#{acceptUserId,jdbcType=INTEGER}");
        }

        if (record.getConfirmStatus() != null) {
            VALUES("confirm_status", "#{confirmStatus,jdbcType=TINYINT}");
        }

        if (record.getConfirmTime() != null) {
            VALUES("confirm_time", "#{confirmTime,jdbcType=TIMESTAMP}");
        }

        if (record.getAcceptStatus() != null) {
            VALUES("accept_status", "#{acceptStatus,jdbcType=TINYINT}");
        }

        if (record.getAcceptTime() != null) {
            VALUES("accept_time", "#{acceptTime,jdbcType=TIMESTAMP}");
        }

        if (record.getCheckReceiveStatus() != null) {
            VALUES("check_receive_status", "#{checkReceiveStatus,jdbcType=TINYINT}");
        }

        if (record.getCheckReceiveTime() != null) {
            VALUES("check_receive_time", "#{checkReceiveTime,jdbcType=TIMESTAMP}");
        }

        if (record.getInvalidReason() != null) {
            VALUES("invalid_reason", "#{invalidReason,jdbcType=VARCHAR}");
        }

        if (record.getWorkOrderContent() != null) {
            VALUES("work_order_content", "#{workOrderContent,jdbcType=CLOB}");
        }

        return SQL();
    }

    public String selectByExampleWithBLOBs(WorkOrderExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("wo_id");
        } else {
            SELECT("wo_id");
        }
        SELECT("task_id");
        SELECT("work_order_title");
        SELECT("expect_begin_time");
        SELECT("expect_end_time");
        SELECT("project_id");
        SELECT("report_user_id");
        SELECT("report_time");
        SELECT("sponsor_user_id");
        SELECT("accept_user_id");
        SELECT("confirm_status");
        SELECT("confirm_time");
        SELECT("accept_status");
        SELECT("accept_time");
        SELECT("check_receive_status");
        SELECT("check_receive_time");
        SELECT("invalid_reason");
        SELECT("work_order_content");
        FROM("JEHR_work_order");
        applyWhere(example, false);

        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }

        return SQL();
    }

    public String selectByExample(WorkOrderExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("wo_id");
        } else {
            SELECT("wo_id");
        }
        SELECT("task_id");
        SELECT("work_order_title");
        SELECT("expect_begin_time");
        SELECT("expect_end_time");
        SELECT("project_id");
        SELECT("report_user_id");
        SELECT("report_time");
        SELECT("sponsor_user_id");
        SELECT("accept_user_id");
        SELECT("confirm_status");
        SELECT("confirm_time");
        SELECT("accept_status");
        SELECT("accept_time");
        SELECT("check_receive_status");
        SELECT("check_receive_time");
        SELECT("invalid_reason");
        FROM("JEHR_work_order");
        applyWhere(example, false);

        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }

        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        WorkOrder record = (WorkOrder) parameter.get("record");
        WorkOrderExample example = (WorkOrderExample) parameter.get("example");

        BEGIN();
        UPDATE("JEHR_work_order");

        if (record.getWoId() != null) {
            SET("wo_id = #{record.woId,jdbcType=INTEGER}");
        }

        if (record.getTaskId() != null) {
            SET("task_id = #{record.taskId,jdbcType=INTEGER}");
        }

        if (record.getWorkOrderTitle() != null) {
            SET("work_order_title = #{record.workOrderTitle,jdbcType=VARCHAR}");
        }

        if (record.getExpectBeginTime() != null) {
            SET("expect_begin_time = #{record.expectBeginTime,jdbcType=TIMESTAMP}");
        }

        if (record.getExpectEndTime() != null) {
            SET("expect_end_time = #{record.expectEndTime,jdbcType=TIMESTAMP}");
        }

        if (record.getProjectId() != null) {
            SET("project_id = #{record.projectId,jdbcType=INTEGER}");
        }

        if (record.getReportUserId() != null) {
            SET("report_user_id = #{record.reportUserId,jdbcType=INTEGER}");
        }

        if (record.getReportTime() != null) {
            SET("report_time = #{record.reportTime,jdbcType=TIMESTAMP}");
        }

        if (record.getSponsorUserId() != null) {
            SET("sponsor_user_id = #{record.sponsorUserId,jdbcType=INTEGER}");
        }

        if (record.getAcceptUserId() != null) {
            SET("accept_user_id = #{record.acceptUserId,jdbcType=INTEGER}");
        }

        if (record.getConfirmStatus() != null) {
            SET("confirm_status = #{record.confirmStatus,jdbcType=TINYINT}");
        }

        if (record.getConfirmTime() != null) {
            SET("confirm_time = #{record.confirmTime,jdbcType=TIMESTAMP}");
        }

        if (record.getAcceptStatus() != null) {
            SET("accept_status = #{record.acceptStatus,jdbcType=TINYINT}");
        }

        if (record.getAcceptTime() != null) {
            SET("accept_time = #{record.acceptTime,jdbcType=TIMESTAMP}");
        }

        if (record.getCheckReceiveStatus() != null) {
            SET("check_receive_status = #{record.checkReceiveStatus,jdbcType=TINYINT}");
        }

        if (record.getCheckReceiveTime() != null) {
            SET("check_receive_time = #{record.checkReceiveTime,jdbcType=TIMESTAMP}");
        }

        if (record.getInvalidReason() != null) {
            SET("invalid_reason = #{record.invalidReason,jdbcType=VARCHAR}");
        }

        if (record.getWorkOrderContent() != null) {
            SET("work_order_content = #{record.workOrderContent,jdbcType=CLOB}");
        }

        applyWhere(example, true);
        return SQL();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("JEHR_work_order");

        SET("wo_id = #{record.woId,jdbcType=INTEGER}");
        SET("task_id = #{record.taskId,jdbcType=INTEGER}");
        SET("work_order_title = #{record.workOrderTitle,jdbcType=VARCHAR}");
        SET("expect_begin_time = #{record.expectBeginTime,jdbcType=TIMESTAMP}");
        SET("expect_end_time = #{record.expectEndTime,jdbcType=TIMESTAMP}");
        SET("project_id = #{record.projectId,jdbcType=INTEGER}");
        SET("report_user_id = #{record.reportUserId,jdbcType=INTEGER}");
        SET("report_time = #{record.reportTime,jdbcType=TIMESTAMP}");
        SET("sponsor_user_id = #{record.sponsorUserId,jdbcType=INTEGER}");
        SET("accept_user_id = #{record.acceptUserId,jdbcType=INTEGER}");
        SET("confirm_status = #{record.confirmStatus,jdbcType=TINYINT}");
        SET("confirm_time = #{record.confirmTime,jdbcType=TIMESTAMP}");
        SET("accept_status = #{record.acceptStatus,jdbcType=TINYINT}");
        SET("accept_time = #{record.acceptTime,jdbcType=TIMESTAMP}");
        SET("check_receive_status = #{record.checkReceiveStatus,jdbcType=TINYINT}");
        SET("check_receive_time = #{record.checkReceiveTime,jdbcType=TIMESTAMP}");
        SET("invalid_reason = #{record.invalidReason,jdbcType=VARCHAR}");
        SET("work_order_content = #{record.workOrderContent,jdbcType=CLOB}");

        WorkOrderExample example = (WorkOrderExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("JEHR_work_order");

        SET("wo_id = #{record.woId,jdbcType=INTEGER}");
        SET("task_id = #{record.taskId,jdbcType=INTEGER}");
        SET("work_order_title = #{record.workOrderTitle,jdbcType=VARCHAR}");
        SET("expect_begin_time = #{record.expectBeginTime,jdbcType=TIMESTAMP}");
        SET("expect_end_time = #{record.expectEndTime,jdbcType=TIMESTAMP}");
        SET("project_id = #{record.projectId,jdbcType=INTEGER}");
        SET("report_user_id = #{record.reportUserId,jdbcType=INTEGER}");
        SET("report_time = #{record.reportTime,jdbcType=TIMESTAMP}");
        SET("sponsor_user_id = #{record.sponsorUserId,jdbcType=INTEGER}");
        SET("accept_user_id = #{record.acceptUserId,jdbcType=INTEGER}");
        SET("confirm_status = #{record.confirmStatus,jdbcType=TINYINT}");
        SET("confirm_time = #{record.confirmTime,jdbcType=TIMESTAMP}");
        SET("accept_status = #{record.acceptStatus,jdbcType=TINYINT}");
        SET("accept_time = #{record.acceptTime,jdbcType=TIMESTAMP}");
        SET("check_receive_status = #{record.checkReceiveStatus,jdbcType=TINYINT}");
        SET("check_receive_time = #{record.checkReceiveTime,jdbcType=TIMESTAMP}");
        SET("invalid_reason = #{record.invalidReason,jdbcType=VARCHAR}");

        WorkOrderExample example = (WorkOrderExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(WorkOrder record) {
        BEGIN();
        UPDATE("JEHR_work_order");

        if (record.getTaskId() != null) {
            SET("task_id = #{taskId,jdbcType=INTEGER}");
        }

        if (record.getWorkOrderTitle() != null) {
            SET("work_order_title = #{workOrderTitle,jdbcType=VARCHAR}");
        }

        if (record.getExpectBeginTime() != null) {
            SET("expect_begin_time = #{expectBeginTime,jdbcType=TIMESTAMP}");
        }

        if (record.getExpectEndTime() != null) {
            SET("expect_end_time = #{expectEndTime,jdbcType=TIMESTAMP}");
        }

        if (record.getProjectId() != null) {
            SET("project_id = #{projectId,jdbcType=INTEGER}");
        }

        if (record.getReportUserId() != null) {
            SET("report_user_id = #{reportUserId,jdbcType=INTEGER}");
        }

        if (record.getReportTime() != null) {
            SET("report_time = #{reportTime,jdbcType=TIMESTAMP}");
        }

        if (record.getSponsorUserId() != null) {
            SET("sponsor_user_id = #{sponsorUserId,jdbcType=INTEGER}");
        }

        if (record.getAcceptUserId() != null) {
            SET("accept_user_id = #{acceptUserId,jdbcType=INTEGER}");
        }

        if (record.getConfirmStatus() != null) {
            SET("confirm_status = #{confirmStatus,jdbcType=TINYINT}");
        }

        if (record.getConfirmTime() != null) {
            SET("confirm_time = #{confirmTime,jdbcType=TIMESTAMP}");
        }

        if (record.getAcceptStatus() != null) {
            SET("accept_status = #{acceptStatus,jdbcType=TINYINT}");
        }

        if (record.getAcceptTime() != null) {
            SET("accept_time = #{acceptTime,jdbcType=TIMESTAMP}");
        }

        if (record.getCheckReceiveStatus() != null) {
            SET("check_receive_status = #{checkReceiveStatus,jdbcType=TINYINT}");
        }

        if (record.getCheckReceiveTime() != null) {
            SET("check_receive_time = #{checkReceiveTime,jdbcType=TIMESTAMP}");
        }

        if (record.getInvalidReason() != null) {
            SET("invalid_reason = #{invalidReason,jdbcType=VARCHAR}");
        }

        if (record.getWorkOrderContent() != null) {
            SET("work_order_content = #{workOrderContent,jdbcType=CLOB}");
        }

        WHERE("wo_id = #{woId,jdbcType=INTEGER}");

        return SQL();
    }

    protected void applyWhere(WorkOrderExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }

        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }

        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }

                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }

                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }

        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}