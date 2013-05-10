package com.bdt.mapper;

import com.bdt.bean.ViewUser;
import com.bdt.bean.ViewUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface ViewUserMapper {
    @SelectProvider(type=ViewUserSqlProvider.class, method="countByExample")
    int countByExample(ViewUserExample example);

    @SelectProvider(type=ViewUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="UserName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserPwd", property="userpwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TrueName", property="truename", jdbcType=JdbcType.VARCHAR),
        @Result(column="Department", property="department", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZhiWei", property="zhiwei", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZaiGang", property="zaigang", jdbcType=JdbcType.VARCHAR),
        @Result(column="EmailStr", property="emailstr", jdbcType=JdbcType.VARCHAR),
        @Result(column="Sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_id", property="urId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_able_work_order_report", property="isAbleWorkOrderReport", jdbcType=JdbcType.TINYINT),
        @Result(column="is_able_work_order_sponsor", property="isAbleWorkOrderSponsor", jdbcType=JdbcType.TINYINT),
        @Result(column="is_able_work_order_accept", property="isAbleWorkOrderAccept", jdbcType=JdbcType.TINYINT),
        @Result(column="is_public_work_diary", property="isPublicWorkDiary", jdbcType=JdbcType.TINYINT)
    })
    List<ViewUser> selectByExample(ViewUserExample example);
    List<ViewUser> selectByExample(ViewUserExample example,RowBounds rowBounds);
}