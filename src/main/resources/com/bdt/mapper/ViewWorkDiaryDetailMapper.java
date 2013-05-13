package com.bdt.mapper;

import com.bdt.bean.ViewWorkDiaryDetail;
import com.bdt.bean.ViewWorkDiaryDetailExample;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ViewWorkDiaryDetailMapper {
    @SelectProvider(type = ViewWorkDiaryDetailSqlProvider.class, method = "countByExample")
    int countByExample(ViewWorkDiaryDetailExample example);

    @SelectProvider(type = ViewWorkDiaryDetailSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "wd_id", property = "wdId", jdbcType = JdbcType.INTEGER),
            @Result(column = "work_time", property = "workTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "task_id", property = "taskId", jdbcType = JdbcType.INTEGER),
            @Result(column = "job_content", property = "jobContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR),
            @Result(column = "report_time", property = "reportTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "work_order_id", property = "workOrderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "work_type_code", property = "workTypeCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "work_hour", property = "workHour", jdbcType = JdbcType.DECIMAL),
            @Result(column = "work_order_title", property = "workOrderTitle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dictionary_name", property = "dictionaryName", jdbcType = JdbcType.VARCHAR)
    })
    List<ViewWorkDiaryDetail> selectByExample(ViewWorkDiaryDetailExample example);

    List<ViewWorkDiaryDetail> selectByExample(ViewWorkDiaryDetailExample example, RowBounds rowBounds);
}