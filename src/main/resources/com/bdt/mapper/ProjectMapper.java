package com.bdt.mapper;

import com.bdt.bean.Project;
import com.bdt.bean.ProjectExample;
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

public interface ProjectMapper {
    @SelectProvider(type=ProjectSqlProvider.class, method="countByExample")
    int countByExample(ProjectExample example);

    @DeleteProvider(type=ProjectSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProjectExample example);

    @Delete({
        "delete from JEHR_project",
        "where p_id = #{pId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pId);

    @Insert({
        "insert into JEHR_project (business_type_id, project_name, ",
        "remark, business_type_code)",
        "values (#{businessTypeId,jdbcType=INTEGER}, #{projectName,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{businessTypeCode,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="pId", before=false, resultType=Integer.class)
    int insert(Project record);

    @InsertProvider(type=ProjectSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="pId", before=false, resultType=Integer.class)
    int insertSelective(Project record);

    @SelectProvider(type=ProjectSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="p_id", property="pId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="business_type_id", property="businessTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_type_code", property="businessTypeCode", jdbcType=JdbcType.VARCHAR)
    })
    List<Project> selectByExample(ProjectExample example);

    @Select({
        "select",
        "p_id, business_type_id, project_name, remark, business_type_code",
        "from JEHR_project",
        "where p_id = #{pId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="p_id", property="pId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="business_type_id", property="businessTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_type_code", property="businessTypeCode", jdbcType=JdbcType.VARCHAR)
    })
    Project selectByPrimaryKey(Integer pId);

    @UpdateProvider(type=ProjectSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    @UpdateProvider(type=ProjectSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    @UpdateProvider(type=ProjectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Project record);

    @Update({
        "update JEHR_project",
        "set business_type_id = #{businessTypeId,jdbcType=INTEGER},",
          "project_name = #{projectName,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "business_type_code = #{businessTypeCode,jdbcType=VARCHAR}",
        "where p_id = #{pId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Project record);

    List<Project> selectByExample(ProjectExample example, RowBounds rowBounds);
}