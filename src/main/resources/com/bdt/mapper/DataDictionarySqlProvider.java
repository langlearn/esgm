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

import com.bdt.bean.DataDictionary;
import com.bdt.bean.DataDictionaryExample.Criteria;
import com.bdt.bean.DataDictionaryExample.Criterion;
import com.bdt.bean.DataDictionaryExample;
import java.util.List;
import java.util.Map;

public class DataDictionarySqlProvider {

    public String countByExample(DataDictionaryExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("JEHR_data_dictionary");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(DataDictionaryExample example) {
        BEGIN();
        DELETE_FROM("JEHR_data_dictionary");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(DataDictionary record) {
        BEGIN();
        INSERT_INTO("JEHR_data_dictionary");
        
        if (record.getDictionaryName() != null) {
            VALUES("dictionary_name", "#{dictionaryName,jdbcType=VARCHAR}");
        }
        
        if (record.getDictionaryCode() != null) {
            VALUES("dictionary_code", "#{dictionaryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParentCode() != null) {
            VALUES("parent_code", "#{parentCode,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUse() != null) {
            VALUES("is_use", "#{isUse,jdbcType=TINYINT}");
        }
        
        if (record.getDescriptions() != null) {
            VALUES("descriptions", "#{descriptions,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(DataDictionaryExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("dd_id");
        } else {
            SELECT("dd_id");
        }
        SELECT("dictionary_name");
        SELECT("dictionary_code");
        SELECT("parent_code");
        SELECT("is_use");
        SELECT("descriptions");
        FROM("JEHR_data_dictionary");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DataDictionary record = (DataDictionary) parameter.get("record");
        DataDictionaryExample example = (DataDictionaryExample) parameter.get("example");
        
        BEGIN();
        UPDATE("JEHR_data_dictionary");
        
        if (record.getDdId() != null) {
            SET("dd_id = #{record.ddId,jdbcType=INTEGER}");
        }
        
        if (record.getDictionaryName() != null) {
            SET("dictionary_name = #{record.dictionaryName,jdbcType=VARCHAR}");
        }
        
        if (record.getDictionaryCode() != null) {
            SET("dictionary_code = #{record.dictionaryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParentCode() != null) {
            SET("parent_code = #{record.parentCode,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUse() != null) {
            SET("is_use = #{record.isUse,jdbcType=TINYINT}");
        }
        
        if (record.getDescriptions() != null) {
            SET("descriptions = #{record.descriptions,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("JEHR_data_dictionary");
        
        SET("dd_id = #{record.ddId,jdbcType=INTEGER}");
        SET("dictionary_name = #{record.dictionaryName,jdbcType=VARCHAR}");
        SET("dictionary_code = #{record.dictionaryCode,jdbcType=VARCHAR}");
        SET("parent_code = #{record.parentCode,jdbcType=VARCHAR}");
        SET("is_use = #{record.isUse,jdbcType=TINYINT}");
        SET("descriptions = #{record.descriptions,jdbcType=VARCHAR}");
        
        DataDictionaryExample example = (DataDictionaryExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(DataDictionary record) {
        BEGIN();
        UPDATE("JEHR_data_dictionary");
        
        if (record.getDictionaryName() != null) {
            SET("dictionary_name = #{dictionaryName,jdbcType=VARCHAR}");
        }
        
        if (record.getDictionaryCode() != null) {
            SET("dictionary_code = #{dictionaryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParentCode() != null) {
            SET("parent_code = #{parentCode,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUse() != null) {
            SET("is_use = #{isUse,jdbcType=TINYINT}");
        }
        
        if (record.getDescriptions() != null) {
            SET("descriptions = #{descriptions,jdbcType=VARCHAR}");
        }
        
        WHERE("dd_id = #{ddId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(DataDictionaryExample example, boolean includeExamplePhrase) {
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