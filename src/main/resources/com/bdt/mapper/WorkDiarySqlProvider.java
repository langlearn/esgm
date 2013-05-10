package com.bdt.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.bdt.bean.WorkDiary;
import com.bdt.bean.WorkDiaryExample.Criteria;
import com.bdt.bean.WorkDiaryExample.Criterion;
import com.bdt.bean.WorkDiaryExample;
import java.util.List;
import java.util.Map;

public class WorkDiarySqlProvider {

    public String countByExample(WorkDiaryExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("JEHR_work_diary");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(WorkDiaryExample example) {
        BEGIN();
        DELETE_FROM("JEHR_work_diary");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(WorkDiary record) {
        BEGIN();
        INSERT_INTO("JEHR_work_diary");
        
        if (record.getWdId() != null) {
            VALUES("wd_id", "#{wdId,jdbcType=INTEGER}");
        }
        
        if (record.getWorkTime() != null) {
            VALUES("work_time", "#{workTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getTaskId() != null) {
            VALUES("task_id", "#{taskId,jdbcType=INTEGER}");
        }
        
        if (record.getJobContent() != null) {
            VALUES("job_content", "#{jobContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getReportTime() != null) {
            VALUES("report_time", "#{reportTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWorkOrderId() != null) {
            VALUES("work_order_id", "#{workOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getWorkTypeCode() != null) {
            VALUES("work_type_code", "#{workTypeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkHour() != null) {
            VALUES("work_hour", "#{workHour,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    public String selectByExample(WorkDiaryExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("wd_id");
        } else {
            SELECT("wd_id");
        }
        SELECT("work_time");
        SELECT("user_id");
        SELECT("task_id");
        SELECT("job_content");
        SELECT("remark");
        SELECT("report_time");
        SELECT("work_order_id");
        SELECT("work_type_code");
        SELECT("work_hour");
        FROM("JEHR_work_diary");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        WorkDiary record = (WorkDiary) parameter.get("record");
        WorkDiaryExample example = (WorkDiaryExample) parameter.get("example");
        
        BEGIN();
        UPDATE("JEHR_work_diary");
        
        if (record.getWdId() != null) {
            SET("wd_id = #{record.wdId,jdbcType=INTEGER}");
        }
        
        if (record.getWorkTime() != null) {
            SET("work_time = #{record.workTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getTaskId() != null) {
            SET("task_id = #{record.taskId,jdbcType=INTEGER}");
        }
        
        if (record.getJobContent() != null) {
            SET("job_content = #{record.jobContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getReportTime() != null) {
            SET("report_time = #{record.reportTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWorkOrderId() != null) {
            SET("work_order_id = #{record.workOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getWorkTypeCode() != null) {
            SET("work_type_code = #{record.workTypeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkHour() != null) {
            SET("work_hour = #{record.workHour,jdbcType=DECIMAL}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("JEHR_work_diary");
        
        SET("wd_id = #{record.wdId,jdbcType=INTEGER}");
        SET("work_time = #{record.workTime,jdbcType=TIMESTAMP}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("task_id = #{record.taskId,jdbcType=INTEGER}");
        SET("job_content = #{record.jobContent,jdbcType=VARCHAR}");
        SET("remark = #{record.remark,jdbcType=VARCHAR}");
        SET("report_time = #{record.reportTime,jdbcType=TIMESTAMP}");
        SET("work_order_id = #{record.workOrderId,jdbcType=INTEGER}");
        SET("work_type_code = #{record.workTypeCode,jdbcType=VARCHAR}");
        SET("work_hour = #{record.workHour,jdbcType=DECIMAL}");
        
        WorkDiaryExample example = (WorkDiaryExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(WorkDiary record) {
        BEGIN();
        UPDATE("JEHR_work_diary");
        
        if (record.getWorkTime() != null) {
            SET("work_time = #{workTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getTaskId() != null) {
            SET("task_id = #{taskId,jdbcType=INTEGER}");
        }
        
        if (record.getJobContent() != null) {
            SET("job_content = #{jobContent,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getReportTime() != null) {
            SET("report_time = #{reportTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWorkOrderId() != null) {
            SET("work_order_id = #{workOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getWorkTypeCode() != null) {
            SET("work_type_code = #{workTypeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkHour() != null) {
            SET("work_hour = #{workHour,jdbcType=DECIMAL}");
        }
        
        WHERE("wd_id = #{wdId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(WorkDiaryExample example, boolean includeExamplePhrase) {
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
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
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