package com.bdt.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-5-13
 * Time: 上午11:50
 * To change this template use File | Settings | File Templates.
 */
public interface AddedMapper {
    List<Map> selectProject();

    List<Map> selectWorkOrderCopy(@Param("woId") Integer woId);
}
