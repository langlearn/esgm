package com.bdt.mapper;

import com.bdt.bean.ViewWorkOrderExample;
import com.bdt.bean.ViewWorkOrderExample.Criteria;
import com.bdt.bean.ViewWorkOrderExample.Criterion;

import java.util.List;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class ViewWorkOrderSqlProvider {

    public String countByExample(ViewWorkOrderExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("view_JEHR_work_order");
        applyWhere(example, false);
        return SQL();
    }

    public String selectByExampleWithBLOBs(ViewWorkOrderExample example) {
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
        SELECT("report_user");
        SELECT("sponsor_user");
        SELECT("accept_user");
        SELECT("project_name");
        SELECT("work_order_content");
        FROM("view_JEHR_work_order");
        applyWhere(example, false);

        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }

        return SQL();
    }

    public String selectByExample(ViewWorkOrderExample example) {
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
        SELECT("report_user");
        SELECT("sponsor_user");
        SELECT("accept_user");
        SELECT("project_name");
        FROM("view_JEHR_work_order");
        applyWhere(example, false);

        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }

        return SQL();
    }

    protected void applyWhere(ViewWorkOrderExample example, boolean includeExamplePhrase) {
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