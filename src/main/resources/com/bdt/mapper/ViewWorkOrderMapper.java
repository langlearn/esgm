package com.bdt.mapper;

import com.bdt.bean.ViewWorkOrder;
import com.bdt.bean.ViewWorkOrderExample;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ViewWorkOrderMapper {
    @SelectProvider(type = ViewWorkOrderSqlProvider.class, method = "countByExample")
    int countByExample(ViewWorkOrderExample example);

    @SelectProvider(type = ViewWorkOrderSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({
            @Result(column = "wo_id", property = "woId", jdbcType = JdbcType.INTEGER),
            @Result(column = "task_id", property = "taskId", jdbcType = JdbcType.INTEGER),
            @Result(column = "work_order_title", property = "workOrderTitle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "expect_begin_time", property = "expectBeginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "expect_end_time", property = "expectEndTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "project_id", property = "projectId", jdbcType = JdbcType.INTEGER),
            @Result(column = "report_user_id", property = "reportUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "report_time", property = "reportTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "sponsor_user_id", property = "sponsorUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "accept_user_id", property = "acceptUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "confirm_status", property = "confirmStatus", jdbcType = JdbcType.TINYINT),
            @Result(column = "confirm_time", property = "confirmTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "accept_status", property = "acceptStatus", jdbcType = JdbcType.TINYINT),
            @Result(column = "accept_time", property = "acceptTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "check_receive_status", property = "checkReceiveStatus", jdbcType = JdbcType.TINYINT),
            @Result(column = "check_receive_time", property = "checkReceiveTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "invalid_reason", property = "invalidReason", jdbcType = JdbcType.VARCHAR),
            @Result(column = "report_user", property = "reportUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sponsor_user", property = "sponsorUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "accept_user", property = "acceptUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "work_order_content", property = "workOrderContent", jdbcType = JdbcType.CLOB)
    })
    List<ViewWorkOrder> selectByExampleWithBLOBs(ViewWorkOrderExample example);

    @SelectProvider(type = ViewWorkOrderSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "wo_id", property = "woId", jdbcType = JdbcType.INTEGER),
            @Result(column = "task_id", property = "taskId", jdbcType = JdbcType.INTEGER),
            @Result(column = "work_order_title", property = "workOrderTitle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "expect_begin_time", property = "expectBeginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "expect_end_time", property = "expectEndTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "project_id", property = "projectId", jdbcType = JdbcType.INTEGER),
            @Result(column = "report_user_id", property = "reportUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "report_time", property = "reportTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "sponsor_user_id", property = "sponsorUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "accept_user_id", property = "acceptUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "confirm_status", property = "confirmStatus", jdbcType = JdbcType.TINYINT),
            @Result(column = "confirm_time", property = "confirmTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "accept_status", property = "acceptStatus", jdbcType = JdbcType.TINYINT),
            @Result(column = "accept_time", property = "acceptTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "check_receive_status", property = "checkReceiveStatus", jdbcType = JdbcType.TINYINT),
            @Result(column = "check_receive_time", property = "checkReceiveTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "invalid_reason", property = "invalidReason", jdbcType = JdbcType.VARCHAR),
            @Result(column = "report_user", property = "reportUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sponsor_user", property = "sponsorUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "accept_user", property = "acceptUser", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR)
    })
    List<ViewWorkOrder> selectByExample(ViewWorkOrderExample example);

    List<ViewWorkOrder> selectByExample(ViewWorkOrderExample example, RowBounds rowBounds);
}