package com.dj.mapper;

import com.dj.bean.Baseinfo;
import com.dj.bean.BaseinfoExample;
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

public interface BaseinfoMapper {
    @SelectProvider(type=BaseinfoSqlProvider.class, method="countByExample")
    int countByExample(BaseinfoExample example);

    @DeleteProvider(type=BaseinfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(BaseinfoExample example);

    @Delete({
        "delete from t_baseinfo",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rid);

    @Insert({
        "insert into t_baseinfo (ccode, cname, ",
        "csort)",
        "values (#{ccode,jdbcType=VARCHAR}, #{cname,jdbcType=VARCHAR}, ",
        "#{csort,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="rid", before=false, resultType=Integer.class)
    int insert(Baseinfo record);

    @InsertProvider(type=BaseinfoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="rid", before=false, resultType=Integer.class)
    int insertSelective(Baseinfo record);

    @SelectProvider(type=BaseinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="rid", property="rid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ccode", property="ccode", jdbcType=JdbcType.VARCHAR),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="csort", property="csort", jdbcType=JdbcType.VARCHAR)
    })
    List<Baseinfo> selectByExample(BaseinfoExample example);

    @Select({
        "select",
        "rid, ccode, cname, csort",
        "from t_baseinfo",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="rid", property="rid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ccode", property="ccode", jdbcType=JdbcType.VARCHAR),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="csort", property="csort", jdbcType=JdbcType.VARCHAR)
    })
    Baseinfo selectByPrimaryKey(Integer rid);

    @UpdateProvider(type=BaseinfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Baseinfo record, @Param("example") BaseinfoExample example);

    @UpdateProvider(type=BaseinfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Baseinfo record, @Param("example") BaseinfoExample example);

    @UpdateProvider(type=BaseinfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Baseinfo record);

    @Update({
        "update t_baseinfo",
        "set ccode = #{ccode,jdbcType=VARCHAR},",
          "cname = #{cname,jdbcType=VARCHAR},",
          "csort = #{csort,jdbcType=VARCHAR}",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Baseinfo record);

    List<Baseinfo> selectByExample(BaseinfoExample example, RowBounds rowBounds);
}