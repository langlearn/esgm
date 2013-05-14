package com.bdt.mapper;

import com.bdt.bean.ViewWorkOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-5-13
 * Time: 上午11:50
 * To change this template use File | Settings | File Templates.
 */
public interface AddedMapper {
    List<Map> selectProject();

    List<Map> selectWorkOrderCopy(@Param("woId") Integer woId);

    @Results({
            @Result(column="wo_id", property="woId", jdbcType= JdbcType.INTEGER),
            @Result(column="task_id", property="taskId", jdbcType=JdbcType.INTEGER),
            @Result(column="work_order_title", property="workOrderTitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="expect_begin_time", property="expectBeginTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="expect_end_time", property="expectEndTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
            @Result(column="report_user_id", property="reportUserId", jdbcType=JdbcType.INTEGER),
            @Result(column="report_time", property="reportTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="sponsor_user_id", property="sponsorUserId", jdbcType=JdbcType.INTEGER),
            @Result(column="accept_user_id", property="acceptUserId", jdbcType=JdbcType.INTEGER),
            @Result(column="confirm_status", property="confirmStatus", jdbcType=JdbcType.TINYINT),
            @Result(column="confirm_time", property="confirmTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="accept_status", property="acceptStatus", jdbcType=JdbcType.TINYINT),
            @Result(column="accept_time", property="acceptTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="check_receive_status", property="checkReceiveStatus", jdbcType=JdbcType.TINYINT),
            @Result(column="check_receive_time", property="checkReceiveTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="invalid_reason", property="invalidReason", jdbcType=JdbcType.VARCHAR),
            @Result(column="report_user", property="reportUser", jdbcType=JdbcType.VARCHAR),
            @Result(column="sponsor_user", property="sponsorUser", jdbcType=JdbcType.VARCHAR),
            @Result(column="accept_user", property="acceptUser", jdbcType=JdbcType.VARCHAR),
            @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
            @Result(column="work_order_content", property="workOrderContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    @Select({
            "select r.* from JEHR_work_order_copy y",
            "inner join view_JEHR_work_order r on(y.work_order_id=r.wo_id)",
            "where y.copy_user_id=#{userId,jdbcType=INTEGER} and y.is_sign_for=#{isSignFor,jdbcType=TINYINT}"
    })
    List<ViewWorkOrder> selectWorkOrderForCopy(
            @Param("userId") Integer userId,@Param("isSignFor") Byte isSignFor);

    @Select({
            "select count(*) from JEHR_work_order_copy y",
            "inner join view_JEHR_work_order r on(y.work_order_id=r.wo_id)",
            "where y.copy_user_id=#{userId,jdbcType=INTEGER} and y.is_sign_for=#{isSignFor,jdbcType=TINYINT}"
    })
    int countWorkOrderForCopy(
            @Param("userId") Integer userId,@Param("isSignFor") Byte isSignFor);

    List<ViewWorkOrder> selectWorkOrderForCopy(@Param("userId") Integer userId,@Param("isSignFor") Byte isSignFor, RowBounds rowBounds);
}
