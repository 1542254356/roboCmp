package com.hjwblog.robo_cmp.model.mapper;

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

import com.hjwblog.robo_cmp.model.CmpResult;
import com.hjwblog.robo_cmp.model.CmpResultCriteria.Criteria;
import com.hjwblog.robo_cmp.model.CmpResultCriteria.Criterion;
import com.hjwblog.robo_cmp.model.CmpResultCriteria;
import java.util.List;
import java.util.Map;

public class CmpResultSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String countByExample(CmpResultCriteria example) {
        BEGIN();
        SELECT("count(*)");
        FROM("t_cmp_result");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String deleteByExample(CmpResultCriteria example) {
        BEGIN();
        DELETE_FROM("t_cmp_result");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String insertSelective(CmpResult record) {
        BEGIN();
        INSERT_INTO("t_cmp_result");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getService() != null) {
            VALUES("service", "#{service,jdbcType=VARCHAR}");
        }
        
        if (record.getContainer() != null) {
            VALUES("container", "#{container,jdbcType=VARCHAR}");
        }
        
        if (record.getParams() != null) {
            VALUES("params", "#{params,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getResult() != null) {
            VALUES("result", "#{result,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String selectByExampleWithBLOBs(CmpResultCriteria example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("service");
        SELECT("container");
        SELECT("params");
        SELECT("result");
        FROM("t_cmp_result");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String selectByExample(CmpResultCriteria example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("service");
        SELECT("container");
        FROM("t_cmp_result");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CmpResult record = (CmpResult) parameter.get("record");
        CmpResultCriteria example = (CmpResultCriteria) parameter.get("example");
        
        BEGIN();
        UPDATE("t_cmp_result");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getService() != null) {
            SET("service = #{record.service,jdbcType=VARCHAR}");
        }
        
        if (record.getContainer() != null) {
            SET("container = #{record.container,jdbcType=VARCHAR}");
        }
        
        if (record.getParams() != null) {
            SET("params = #{record.params,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getResult() != null) {
            SET("result = #{record.result,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("t_cmp_result");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("service = #{record.service,jdbcType=VARCHAR}");
        SET("container = #{record.container,jdbcType=VARCHAR}");
        SET("params = #{record.params,jdbcType=LONGVARCHAR}");
        SET("result = #{record.result,jdbcType=LONGVARCHAR}");
        
        CmpResultCriteria example = (CmpResultCriteria) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("t_cmp_result");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("service = #{record.service,jdbcType=VARCHAR}");
        SET("container = #{record.container,jdbcType=VARCHAR}");
        
        CmpResultCriteria example = (CmpResultCriteria) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(CmpResult record) {
        BEGIN();
        UPDATE("t_cmp_result");
        
        if (record.getService() != null) {
            SET("service = #{service,jdbcType=VARCHAR}");
        }
        
        if (record.getContainer() != null) {
            SET("container = #{container,jdbcType=VARCHAR}");
        }
        
        if (record.getParams() != null) {
            SET("params = #{params,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getResult() != null) {
            SET("result = #{result,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cmp_result
     *
     * @mbggenerated
     */
    protected void applyWhere(CmpResultCriteria example, boolean includeExamplePhrase) {
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