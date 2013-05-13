package com.bdt.mapper;

import com.bdt.bean.Project;
import com.bdt.bean.ProjectExample;
import com.bdt.bean.ProjectExample.Criteria;
import com.bdt.bean.ProjectExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class ProjectSqlProvider {

    public String countByExample(ProjectExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("JEHR_project");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ProjectExample example) {
        BEGIN();
        DELETE_FROM("JEHR_project");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Project record) {
        BEGIN();
        INSERT_INTO("JEHR_project");

        if (record.getBusinessTypeId() != null) {
            VALUES("business_type_id", "#{businessTypeId,jdbcType=INTEGER}");
        }

        if (record.getProjectName() != null) {
            VALUES("project_name", "#{projectName,jdbcType=VARCHAR}");
        }

        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }

        if (record.getBusinessTypeCode() != null) {
            VALUES("business_type_code", "#{businessTypeCode,jdbcType=VARCHAR}");
        }

        return SQL();
    }

    public String selectByExample(ProjectExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("p_id");
        } else {
            SELECT("p_id");
        }
        SELECT("business_type_id");
        SELECT("project_name");
        SELECT("remark");
        SELECT("business_type_code");
        FROM("JEHR_project");
        applyWhere(example, false);

        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }

        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Project record = (Project) parameter.get("record");
        ProjectExample example = (ProjectExample) parameter.get("example");

        BEGIN();
        UPDATE("JEHR_project");

        if (record.getpId() != null) {
            SET("p_id = #{record.pId,jdbcType=INTEGER}");
        }

        if (record.getBusinessTypeId() != null) {
            SET("business_type_id = #{record.businessTypeId,jdbcType=INTEGER}");
        }

        if (record.getProjectName() != null) {
            SET("project_name = #{record.projectName,jdbcType=VARCHAR}");
        }

        if (record.getRemark() != null) {
            SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }

        if (record.getBusinessTypeCode() != null) {
            SET("business_type_code = #{record.businessTypeCode,jdbcType=VARCHAR}");
        }

        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("JEHR_project");

        SET("p_id = #{record.pId,jdbcType=INTEGER}");
        SET("business_type_id = #{record.businessTypeId,jdbcType=INTEGER}");
        SET("project_name = #{record.projectName,jdbcType=VARCHAR}");
        SET("remark = #{record.remark,jdbcType=VARCHAR}");
        SET("business_type_code = #{record.businessTypeCode,jdbcType=VARCHAR}");

        ProjectExample example = (ProjectExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Project record) {
        BEGIN();
        UPDATE("JEHR_project");

        if (record.getBusinessTypeId() != null) {
            SET("business_type_id = #{businessTypeId,jdbcType=INTEGER}");
        }

        if (record.getProjectName() != null) {
            SET("project_name = #{projectName,jdbcType=VARCHAR}");
        }

        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
        }

        if (record.getBusinessTypeCode() != null) {
            SET("business_type_code = #{businessTypeCode,jdbcType=VARCHAR}");
        }

        WHERE("p_id = #{pId,jdbcType=INTEGER}");

        return SQL();
    }

    protected void applyWhere(ProjectExample example, boolean includeExamplePhrase) {
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