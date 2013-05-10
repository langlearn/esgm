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

import com.bdt.bean.User;
import com.bdt.bean.UserExample.Criteria;
import com.bdt.bean.UserExample.Criterion;
import com.bdt.bean.UserExample;
import java.util.List;
import java.util.Map;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("JEHR_user");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserExample example) {
        BEGIN();
        DELETE_FROM("JEHR_user");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("JEHR_user");
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getIsAbleWorkOrderReport() != null) {
            VALUES("is_able_work_order_report", "#{isAbleWorkOrderReport,jdbcType=TINYINT}");
        }
        
        if (record.getIsAbleWorkOrderSponsor() != null) {
            VALUES("is_able_work_order_sponsor", "#{isAbleWorkOrderSponsor,jdbcType=TINYINT}");
        }
        
        if (record.getIsAbleWorkOrderAccept() != null) {
            VALUES("is_able_work_order_accept", "#{isAbleWorkOrderAccept,jdbcType=TINYINT}");
        }
        
        if (record.getIsPublicWorkDiary() != null) {
            VALUES("is_public_work_diary", "#{isPublicWorkDiary,jdbcType=TINYINT}");
        }
        
        return SQL();
    }

    public String selectByExample(UserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ur_id");
        } else {
            SELECT("ur_id");
        }
        SELECT("user_id");
        SELECT("is_able_work_order_report");
        SELECT("is_able_work_order_sponsor");
        SELECT("is_able_work_order_accept");
        SELECT("is_public_work_diary");
        FROM("JEHR_user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("JEHR_user");
        
        if (record.getUrId() != null) {
            SET("ur_id = #{record.urId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getIsAbleWorkOrderReport() != null) {
            SET("is_able_work_order_report = #{record.isAbleWorkOrderReport,jdbcType=TINYINT}");
        }
        
        if (record.getIsAbleWorkOrderSponsor() != null) {
            SET("is_able_work_order_sponsor = #{record.isAbleWorkOrderSponsor,jdbcType=TINYINT}");
        }
        
        if (record.getIsAbleWorkOrderAccept() != null) {
            SET("is_able_work_order_accept = #{record.isAbleWorkOrderAccept,jdbcType=TINYINT}");
        }
        
        if (record.getIsPublicWorkDiary() != null) {
            SET("is_public_work_diary = #{record.isPublicWorkDiary,jdbcType=TINYINT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("JEHR_user");
        
        SET("ur_id = #{record.urId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("is_able_work_order_report = #{record.isAbleWorkOrderReport,jdbcType=TINYINT}");
        SET("is_able_work_order_sponsor = #{record.isAbleWorkOrderSponsor,jdbcType=TINYINT}");
        SET("is_able_work_order_accept = #{record.isAbleWorkOrderAccept,jdbcType=TINYINT}");
        SET("is_public_work_diary = #{record.isPublicWorkDiary,jdbcType=TINYINT}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("JEHR_user");
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getIsAbleWorkOrderReport() != null) {
            SET("is_able_work_order_report = #{isAbleWorkOrderReport,jdbcType=TINYINT}");
        }
        
        if (record.getIsAbleWorkOrderSponsor() != null) {
            SET("is_able_work_order_sponsor = #{isAbleWorkOrderSponsor,jdbcType=TINYINT}");
        }
        
        if (record.getIsAbleWorkOrderAccept() != null) {
            SET("is_able_work_order_accept = #{isAbleWorkOrderAccept,jdbcType=TINYINT}");
        }
        
        if (record.getIsPublicWorkDiary() != null) {
            SET("is_public_work_diary = #{isPublicWorkDiary,jdbcType=TINYINT}");
        }
        
        WHERE("ur_id = #{urId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(UserExample example, boolean includeExamplePhrase) {
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