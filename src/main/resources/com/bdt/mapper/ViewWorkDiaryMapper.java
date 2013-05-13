package com.bdt.mapper;

import com.bdt.bean.ViewWorkDiary;
import com.bdt.bean.ViewWorkDiaryExample;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ViewWorkDiaryMapper {
    @SelectProvider(type = ViewWorkDiarySqlProvider.class, method = "countByExample")
    int countByExample(ViewWorkDiaryExample example);

    @SelectProvider(type = ViewWorkDiarySqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department", property = "department", jdbcType = JdbcType.VARCHAR),
            @Result(column = "is_public_work_diary", property = "isPublicWorkDiary", jdbcType = JdbcType.TINYINT),
            @Result(column = "work_time", property = "workTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "total_hour", property = "totalHour", jdbcType = JdbcType.DECIMAL)
    })
    List<ViewWorkDiary> selectByExample(ViewWorkDiaryExample example);

    List<ViewWorkDiary> selectByExample(ViewWorkDiaryExample example, RowBounds rowBounds);
}