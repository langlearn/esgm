package com.bdt.mapper;

import com.bdt.bean.WorkDiary;
import com.bdt.bean.WorkDiaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface WorkDiaryMapper {
    @SelectProvider(type=WorkDiarySqlProvider.class, method="countByExample")
    int countByExample(WorkDiaryExample example);

    @DeleteProvider(type=WorkDiarySqlProvider.class, method="deleteByExample")
    int deleteByExample(WorkDiaryExample example);

    @Delete({
        "delete from JEHR_work_diary",
        "where wd_id = #{wdId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer wdId);

    @Insert({
        "insert into JEHR_work_diary (wd_id, work_time, ",
        "user_id, task_id, ",
        "job_content, remark, ",
        "report_time, work_order_id, ",
        "work_type_code, work_hour)",
        "values (#{wdId,jdbcType=INTEGER}, #{workTime,jdbcType=TIMESTAMP}, ",
        "#{userId,jdbcType=INTEGER}, #{taskId,jdbcType=INTEGER}, ",
        "#{jobContent,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{reportTime,jdbcType=TIMESTAMP}, #{workOrderId,jdbcType=INTEGER}, ",
        "#{workTypeCode,jdbcType=VARCHAR}, #{workHour,jdbcType=DECIMAL})"
    })
    int insert(WorkDiary record);

    @InsertProvider(type=WorkDiarySqlProvider.class, method="insertSelective")
    int insertSelective(WorkDiary record);

    @SelectProvider(type=WorkDiarySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="wd_id", property="wdId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="work_time", property="workTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="task_id", property="taskId", jdbcType=JdbcType.INTEGER),
        @Result(column="job_content", property="jobContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="report_time", property="reportTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="work_order_id", property="workOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="work_type_code", property="workTypeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_hour", property="workHour", jdbcType=JdbcType.DECIMAL)
    })
    List<WorkDiary> selectByExample(WorkDiaryExample example);

    @Select({
        "select",
        "wd_id, work_time, user_id, task_id, job_content, remark, report_time, work_order_id, ",
        "work_type_code, work_hour",
        "from JEHR_work_diary",
        "where wd_id = #{wdId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="wd_id", property="wdId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="work_time", property="workTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="task_id", property="taskId", jdbcType=JdbcType.INTEGER),
        @Result(column="job_content", property="jobContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="report_time", property="reportTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="work_order_id", property="workOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="work_type_code", property="workTypeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_hour", property="workHour", jdbcType=JdbcType.DECIMAL)
    })
    WorkDiary selectByPrimaryKey(Integer wdId);

    @UpdateProvider(type=WorkDiarySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WorkDiary record, @Param("example") WorkDiaryExample example);

    @UpdateProvider(type=WorkDiarySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WorkDiary record, @Param("example") WorkDiaryExample example);

    @UpdateProvider(type=WorkDiarySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WorkDiary record);

    @Update({
        "update JEHR_work_diary",
        "set work_time = #{workTime,jdbcType=TIMESTAMP},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "task_id = #{taskId,jdbcType=INTEGER},",
          "job_content = #{jobContent,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "report_time = #{reportTime,jdbcType=TIMESTAMP},",
          "work_order_id = #{workOrderId,jdbcType=INTEGER},",
          "work_type_code = #{workTypeCode,jdbcType=VARCHAR},",
          "work_hour = #{workHour,jdbcType=DECIMAL}",
        "where wd_id = #{wdId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WorkDiary record);
}