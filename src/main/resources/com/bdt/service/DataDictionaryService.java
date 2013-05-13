package com.bdt.service;

import com.bdt.bean.DataDictionary;
import com.bdt.common.bean.Page;

import java.util.List;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Lim
 * Date: 13-5-11
 * Time: 上午10:52
 * To change this template use File | Settings | File Templates.
 */
public interface DataDictionaryService {
    void add(DataDictionary model);

    void modify(DataDictionary model);

    void delete(String rids);

    Page<DataDictionary> queryByPage(DataDictionary model, Integer start, Integer limit);

    List<DataDictionary> queryByList(DataDictionary model);

    List<DataDictionary> queryByParentCode(String parentCode);
}
