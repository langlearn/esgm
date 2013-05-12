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

import com.bdt.bean.WorkOrderCopy;
import com.bdt.bean.WorkOrderCopyExample.Criteria;
import com.bdt.bean.WorkOrderCopyExample.Criterion;
import com.bdt.bean.WorkOrderCopyExample;
import java.util.List;
import java.util.Map;

public class WorkOrderCopySqlProvider {

    public String countByExample(WorkOrderCopyExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("JEHR_work_order_copy");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(WorkOrderCopyExample example) {
        BEGIN();
        DELETE_FROM("JEHR_work_order_copy");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(WorkOrderCopy record) {
        BEGIN();
        INSERT_INTO("JEHR_work_order_copy");
        
        if (record.getWorkOrderId() != null) {
            VALUES("work_order_id", "#{workOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getCopyTime() != null) {
            VALUES("copy_time", "#{copyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCopyUserId() != null) {
            VALUES("copy_user_id", "#{copyUserId,jdbcType=INTEGER}");
        }
        
        if (record.getIsSignFor() != null) {
            VALUES("is_sign_for", "#{isSignFor,jdbcType=TINYINT}");
        }
        
        if (record.getSignForTime() != null) {
            VALUES("sign_for_time", "#{signForTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(WorkOrderCopyExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("woc_id");
        } else {
            SELECT("woc_id");
        }
        SELECT("work_order_id");
        SELECT("copy_time");
        SELECT("copy_user_id");
        SELECT("is_sign_for");
        SELECT("sign_for_time");
        FROM("JEHR_work_order_copy");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        WorkOrderCopy record = (WorkOrderCopy) parameter.get("record");
        WorkOrderCopyExample example = (WorkOrderCopyExample) parameter.get("example");
        
        BEGIN();
        UPDATE("JEHR_work_order_copy");
        
        if (record.getWocId() != null) {
            SET("woc_id = #{record.wocId,jdbcType=INTEGER}");
        }
        
        if (record.getWorkOrderId() != null) {
            SET("work_order_id = #{record.workOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getCopyTime() != null) {
            SET("copy_time = #{record.copyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCopyUserId() != null) {
            SET("copy_user_id = #{record.copyUserId,jdbcType=INTEGER}");
        }
        
        if (record.getIsSignFor() != null) {
            SET("is_sign_for = #{record.isSignFor,jdbcType=TINYINT}");
        }
        
        if (record.getSignForTime() != null) {
            SET("sign_for_time = #{record.signForTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("JEHR_work_order_copy");
        
        SET("woc_id = #{record.wocId,jdbcType=INTEGER}");
        SET("work_order_id = #{record.workOrderId,jdbcType=INTEGER}");
        SET("copy_time = #{record.copyTime,jdbcType=TIMESTAMP}");
        SET("copy_user_id = #{record.copyUserId,jdbcType=INTEGER}");
        SET("is_sign_for = #{record.isSignFor,jdbcType=TINYINT}");
        SET("sign_for_time = #{record.signForTime,jdbcType=TIMESTAMP}");
        
        WorkOrderCopyExample example = (WorkOrderCopyExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(WorkOrderCopy record) {
        BEGIN();
        UPDATE("JEHR_work_order_copy");
        
        if (record.getWorkOrderId() != null) {
            SET("work_order_id = #{workOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getCopyTime() != null) {
            SET("copy_time = #{copyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCopyUserId() != null) {
            SET("copy_user_id = #{copyUserId,jdbcType=INTEGER}");
        }
        
        if (record.getIsSignFor() != null) {
            SET("is_sign_for = #{isSignFor,jdbcType=TINYINT}");
        }
        
        if (record.getSignForTime() != null) {
            SET("sign_for_time = #{signForTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("woc_id = #{wocId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(WorkOrderCopyExample example, boolean includeExamplePhrase) {
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