package com.bdt.mapper;

import com.bdt.bean.User;
import com.bdt.bean.UserExample;
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

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    int countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from JEHR_user",
        "where ur_id = #{urId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer urId);

    @Insert({
        "insert into JEHR_user (user_id, is_able_work_order_report, ",
        "is_able_work_order_sponsor, is_able_work_order_accept, ",
        "is_public_work_diary)",
        "values (#{userId,jdbcType=INTEGER}, #{isAbleWorkOrderReport,jdbcType=TINYINT}, ",
        "#{isAbleWorkOrderSponsor,jdbcType=TINYINT}, #{isAbleWorkOrderAccept,jdbcType=TINYINT}, ",
        "#{isPublicWorkDiary,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="urId", before=false, resultType=Integer.class)
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="urId", before=false, resultType=Integer.class)
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ur_id", property="urId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_able_work_order_report", property="isAbleWorkOrderReport", jdbcType=JdbcType.TINYINT),
        @Result(column="is_able_work_order_sponsor", property="isAbleWorkOrderSponsor", jdbcType=JdbcType.TINYINT),
        @Result(column="is_able_work_order_accept", property="isAbleWorkOrderAccept", jdbcType=JdbcType.TINYINT),
        @Result(column="is_public_work_diary", property="isPublicWorkDiary", jdbcType=JdbcType.TINYINT)
    })
    List<User> selectByExample(UserExample example);
    List<User> selectByExample(UserExample example,RowBounds rowBounds);

    @Select({
        "select",
        "ur_id, user_id, is_able_work_order_report, is_able_work_order_sponsor, is_able_work_order_accept, ",
        "is_public_work_diary",
        "from JEHR_user",
        "where ur_id = #{urId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ur_id", property="urId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_able_work_order_report", property="isAbleWorkOrderReport", jdbcType=JdbcType.TINYINT),
        @Result(column="is_able_work_order_sponsor", property="isAbleWorkOrderSponsor", jdbcType=JdbcType.TINYINT),
        @Result(column="is_able_work_order_accept", property="isAbleWorkOrderAccept", jdbcType=JdbcType.TINYINT),
        @Result(column="is_public_work_diary", property="isPublicWorkDiary", jdbcType=JdbcType.TINYINT)
    })
    User selectByPrimaryKey(Integer urId);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update JEHR_user",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "is_able_work_order_report = #{isAbleWorkOrderReport,jdbcType=TINYINT},",
          "is_able_work_order_sponsor = #{isAbleWorkOrderSponsor,jdbcType=TINYINT},",
          "is_able_work_order_accept = #{isAbleWorkOrderAccept,jdbcType=TINYINT},",
          "is_public_work_diary = #{isPublicWorkDiary,jdbcType=TINYINT}",
        "where ur_id = #{urId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}