package com.bdt.mapper;

import com.bdt.bean.WorkOrderCopy;
import com.bdt.bean.WorkOrderCopyExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface WorkOrderCopyMapper {
    @SelectProvider(type = WorkOrderCopySqlProvider.class, method = "countByExample")
    int countByExample(WorkOrderCopyExample example);

    @DeleteProvider(type = WorkOrderCopySqlProvider.class, method = "deleteByExample")
    int deleteByExample(WorkOrderCopyExample example);

    @Delete({
            "delete from JEHR_work_order_copy",
            "where woc_id = #{wocId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer wocId);

    @Insert({
            "insert into JEHR_work_order_copy (work_order_id, copy_time, ",
            "copy_user_id, is_sign_for, ",
            "sign_for_time)",
            "values (#{workOrderId,jdbcType=INTEGER}, #{copyTime,jdbcType=TIMESTAMP}, ",
            "#{copyUserId,jdbcType=INTEGER}, #{isSignFor,jdbcType=TINYINT}, ",
            "#{signForTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement = "SELECT SCOPE_IDENTITY()", keyProperty = "wocId", before = false, resultType = Integer.class)
    int insert(WorkOrderCopy record);

    @InsertProvider(type = WorkOrderCopySqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT SCOPE_IDENTITY()", keyProperty = "wocId", before = false, resultType = Integer.class)
    int insertSelective(WorkOrderCopy record);

    @SelectProvider(type = WorkOrderCopySqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "woc_id", property = "wocId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "work_order_id", property = "workOrderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "copy_time", property = "copyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "copy_user_id", property = "copyUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_sign_for", property = "isSignFor", jdbcType = JdbcType.TINYINT),
            @Result(column = "sign_for_time", property = "signForTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<WorkOrderCopy> selectByExample(WorkOrderCopyExample example);

    @Select({
            "select",
            "woc_id, work_order_id, copy_time, copy_user_id, is_sign_for, sign_for_time",
            "from JEHR_work_order_copy",
            "where woc_id = #{wocId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "woc_id", property = "wocId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "work_order_id", property = "workOrderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "copy_time", property = "copyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "copy_user_id", property = "copyUserId", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_sign_for", property = "isSignFor", jdbcType = JdbcType.TINYINT),
            @Result(column = "sign_for_time", property = "signForTime", jdbcType = JdbcType.TIMESTAMP)
    })
    WorkOrderCopy selectByPrimaryKey(Integer wocId);

    @UpdateProvider(type = WorkOrderCopySqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WorkOrderCopy record, @Param("example") WorkOrderCopyExample example);

    @UpdateProvider(type = WorkOrderCopySqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") WorkOrderCopy record, @Param("example") WorkOrderCopyExample example);

    @UpdateProvider(type = WorkOrderCopySqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WorkOrderCopy record);

    @Update({
            "update JEHR_work_order_copy",
            "set work_order_id = #{workOrderId,jdbcType=INTEGER},",
            "copy_time = #{copyTime,jdbcType=TIMESTAMP},",
            "copy_user_id = #{copyUserId,jdbcType=INTEGER},",
            "is_sign_for = #{isSignFor,jdbcType=TINYINT},",
            "sign_for_time = #{signForTime,jdbcType=TIMESTAMP}",
            "where woc_id = #{wocId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WorkOrderCopy record);
}