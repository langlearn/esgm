package com.bdt.mapper;

import com.bdt.bean.DataDictionary;
import com.bdt.bean.DataDictionaryExample;
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

public interface DataDictionaryMapper {
    @SelectProvider(type=DataDictionarySqlProvider.class, method="countByExample")
    int countByExample(DataDictionaryExample example);

    @DeleteProvider(type=DataDictionarySqlProvider.class, method="deleteByExample")
    int deleteByExample(DataDictionaryExample example);

    @Delete({
        "delete from JEHR_data_dictionary",
        "where dd_id = #{ddId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ddId);

    @Insert({
        "insert into JEHR_data_dictionary (dictionary_name, dictionary_code, ",
        "parent_code, is_use, ",
        "descriptions)",
        "values (#{dictionaryName,jdbcType=VARCHAR}, #{dictionaryCode,jdbcType=VARCHAR}, ",
        "#{parentCode,jdbcType=VARCHAR}, #{isUse,jdbcType=TINYINT}, ",
        "#{descriptions,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="ddId", before=false, resultType=Integer.class)
    int insert(DataDictionary record);

    @InsertProvider(type=DataDictionarySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="ddId", before=false, resultType=Integer.class)
    int insertSelective(DataDictionary record);

    @SelectProvider(type=DataDictionarySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="dd_id", property="ddId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dictionary_name", property="dictionaryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="dictionary_code", property="dictionaryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_code", property="parentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_use", property="isUse", jdbcType=JdbcType.TINYINT),
        @Result(column="descriptions", property="descriptions", jdbcType=JdbcType.VARCHAR)
    })
    List<DataDictionary> selectByExample(DataDictionaryExample example);
    List<DataDictionary> selectByExample(DataDictionaryExample example,RowBounds rowBounds);

    @Select({
        "select",
        "dd_id, dictionary_name, dictionary_code, parent_code, is_use, descriptions",
        "from JEHR_data_dictionary",
        "where dd_id = #{ddId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="dd_id", property="ddId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dictionary_name", property="dictionaryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="dictionary_code", property="dictionaryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_code", property="parentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_use", property="isUse", jdbcType=JdbcType.TINYINT),
        @Result(column="descriptions", property="descriptions", jdbcType=JdbcType.VARCHAR)
    })
    DataDictionary selectByPrimaryKey(Integer ddId);

    @UpdateProvider(type=DataDictionarySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);

    @UpdateProvider(type=DataDictionarySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);

    @UpdateProvider(type=DataDictionarySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DataDictionary record);

    @Update({
        "update JEHR_data_dictionary",
        "set dictionary_name = #{dictionaryName,jdbcType=VARCHAR},",
          "dictionary_code = #{dictionaryCode,jdbcType=VARCHAR},",
          "parent_code = #{parentCode,jdbcType=VARCHAR},",
          "is_use = #{isUse,jdbcType=TINYINT},",
          "descriptions = #{descriptions,jdbcType=VARCHAR}",
        "where dd_id = #{ddId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DataDictionary record);
}