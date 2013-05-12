package com.bdt.mapper;

import com.bdt.bean.WorkOrder;
import com.bdt.bean.WorkOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface WorkOrderMapper {
    @SelectProvider(type=WorkOrderSqlProvider.class, method="countByExample")
    int countByExample(WorkOrderExample example);

    @DeleteProvider(type=WorkOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(WorkOrderExample example);

    @Delete({
        "delete from JEHR_work_order",
        "where wo_id = #{woId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer woId);

    @Insert({
        "insert into JEHR_work_order (task_id, work_order_title, ",
        "expect_begin_time, expect_end_time, ",
        "project_id, report_user_id, ",
        "report_time, sponsor_user_id, ",
        "accept_user_id, confirm_status, ",
        "confirm_time, accept_status, ",
        "accept_time, check_receive_status, ",
        "check_receive_time, invalid_reason, ",
        "work_order_content)",
        "values (#{taskId,jdbcType=INTEGER}, #{workOrderTitle,jdbcType=VARCHAR}, ",
        "#{expectBeginTime,jdbcType=TIMESTAMP}, #{expectEndTime,jdbcType=TIMESTAMP}, ",
        "#{projectId,jdbcType=INTEGER}, #{reportUserId,jdbcType=INTEGER}, ",
        "#{reportTime,jdbcType=TIMESTAMP}, #{sponsorUserId,jdbcType=INTEGER}, ",
        "#{acceptUserId,jdbcType=INTEGER}, #{confirmStatus,jdbcType=TINYINT}, ",
        "#{confirmTime,jdbcType=TIMESTAMP}, #{acceptStatus,jdbcType=TINYINT}, ",
        "#{acceptTime,jdbcType=TIMESTAMP}, #{checkReceiveStatus,jdbcType=TINYINT}, ",
        "#{checkReceiveTime,jdbcType=TIMESTAMP}, #{invalidReason,jdbcType=VARCHAR}, ",
        "#{workOrderContent,jdbcType=CLOB})"
    })
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="woId", before=false, resultType=Integer.class)
    int insert(WorkOrder record);

    @InsertProvider(type=WorkOrderSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="woId", before=false, resultType=Integer.class)
    int insertSelective(WorkOrder record);

    @SelectProvider(type=WorkOrderSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="wo_id", property="woId", jdbcType=JdbcType.INTEGER, id=true),
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
        @Result(column="work_order_content", property="workOrderContent", jdbcType=JdbcType.CLOB)
    })
    List<WorkOrder> selectByExampleWithBLOBs(WorkOrderExample example);

    @SelectProvider(type=WorkOrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="wo_id", property="woId", jdbcType=JdbcType.INTEGER, id=true),
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
        @Result(column="invalid_reason", property="invalidReason", jdbcType=JdbcType.VARCHAR)
    })
    List<WorkOrder> selectByExample(WorkOrderExample example);

    @Select({
        "select",
        "wo_id, task_id, work_order_title, expect_begin_time, expect_end_time, project_id, ",
        "report_user_id, report_time, sponsor_user_id, accept_user_id, confirm_status, ",
        "confirm_time, accept_status, accept_time, check_receive_status, check_receive_time, ",
        "invalid_reason, work_order_content",
        "from JEHR_work_order",
        "where wo_id = #{woId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="wo_id", property="woId", jdbcType=JdbcType.INTEGER, id=true),
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
        @Result(column="work_order_content", property="workOrderContent", jdbcType=JdbcType.CLOB)
    })
    WorkOrder selectByPrimaryKey(Integer woId);

    @UpdateProvider(type=WorkOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    @UpdateProvider(type=WorkOrderSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    @UpdateProvider(type=WorkOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    @UpdateProvider(type=WorkOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WorkOrder record);

    @Update({
        "update JEHR_work_order",
        "set task_id = #{taskId,jdbcType=INTEGER},",
          "work_order_title = #{workOrderTitle,jdbcType=VARCHAR},",
          "expect_begin_time = #{expectBeginTime,jdbcType=TIMESTAMP},",
          "expect_end_time = #{expectEndTime,jdbcType=TIMESTAMP},",
          "project_id = #{projectId,jdbcType=INTEGER},",
          "report_user_id = #{reportUserId,jdbcType=INTEGER},",
          "report_time = #{reportTime,jdbcType=TIMESTAMP},",
          "sponsor_user_id = #{sponsorUserId,jdbcType=INTEGER},",
          "accept_user_id = #{acceptUserId,jdbcType=INTEGER},",
          "confirm_status = #{confirmStatus,jdbcType=TINYINT},",
          "confirm_time = #{confirmTime,jdbcType=TIMESTAMP},",
          "accept_status = #{acceptStatus,jdbcType=TINYINT},",
          "accept_time = #{acceptTime,jdbcType=TIMESTAMP},",
          "check_receive_status = #{checkReceiveStatus,jdbcType=TINYINT},",
          "check_receive_time = #{checkReceiveTime,jdbcType=TIMESTAMP},",
          "invalid_reason = #{invalidReason,jdbcType=VARCHAR},",
          "work_order_content = #{workOrderContent,jdbcType=CLOB}",
        "where wo_id = #{woId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(WorkOrder record);

    @Update({
        "update JEHR_work_order",
        "set task_id = #{taskId,jdbcType=INTEGER},",
          "work_order_title = #{workOrderTitle,jdbcType=VARCHAR},",
          "expect_begin_time = #{expectBeginTime,jdbcType=TIMESTAMP},",
          "expect_end_time = #{expectEndTime,jdbcType=TIMESTAMP},",
          "project_id = #{projectId,jdbcType=INTEGER},",
          "report_user_id = #{reportUserId,jdbcType=INTEGER},",
          "report_time = #{reportTime,jdbcType=TIMESTAMP},",
          "sponsor_user_id = #{sponsorUserId,jdbcType=INTEGER},",
          "accept_user_id = #{acceptUserId,jdbcType=INTEGER},",
          "confirm_status = #{confirmStatus,jdbcType=TINYINT},",
          "confirm_time = #{confirmTime,jdbcType=TIMESTAMP},",
          "accept_status = #{acceptStatus,jdbcType=TINYINT},",
          "accept_time = #{acceptTime,jdbcType=TIMESTAMP},",
          "check_receive_status = #{checkReceiveStatus,jdbcType=TINYINT},",
          "check_receive_time = #{checkReceiveTime,jdbcType=TIMESTAMP},",
          "invalid_reason = #{invalidReason,jdbcType=VARCHAR}",
        "where wo_id = #{woId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WorkOrder record);

}