package com.bdt.service.impl;

import com.bdt.bean.DataDictionary;
import com.bdt.bean.DataDictionaryExample;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.DataDictionaryMapper;
import com.bdt.service.DataDictionaryService;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.List;

/**
 * 数据字典Service
 *
 * @author lim
 */
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Inject
    private DataDictionaryMapper dataDictionaryMapper;

    @Override
    public void add(DataDictionary model) {
        dataDictionaryMapper.insert(model);
    }


    @Override
    public void modify(DataDictionary model) {
        dataDictionaryMapper.updateByPrimaryKeySelective(model);
    }


    @Override
    public void delete(String rids) {
        List<Integer> ids = MyStrUtil.stringToListInteger(rids);
        DataDictionaryExample example = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = example.createCriteria();
        criteria.andDdIdIn(ids);
        dataDictionaryMapper.deleteByExample(example);
    }


    @Override
    public Page<DataDictionary> queryByPage(DataDictionary model, Integer start, Integer limit) {
        Page<DataDictionary> page = new Page<DataDictionary>(start, limit);
        DataDictionaryExample example = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(model.getDictionaryName())) {
            criteria.andDictionaryNameLike("%" + model.getDictionaryName() + "%");
        }
        int count = dataDictionaryMapper.countByExample(example);
        List<DataDictionary> DataDictionarys = dataDictionaryMapper.selectByExample(example, page.createRowBounds());
        page.setTotal(count);
        page.setRoot(DataDictionarys);
        return page;
    }

    @Override
    public List<DataDictionary> queryByList(DataDictionary model) {
        DataDictionaryExample example = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(model.getDictionaryCode())) {
            criteria.andDictionaryCodeEqualTo(model.getDictionaryCode());
        }
        if (StringUtils.isNotBlank(model.getParentCode())) {
            criteria.andParentCodeEqualTo(model.getParentCode());
        }
        return dataDictionaryMapper.selectByExample(example);
    }

    @Override
    public List<DataDictionary> queryByParentCode(String parentCode) {
        DataDictionaryExample example = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = example.createCriteria();
        criteria.andParentCodeEqualTo(parentCode);
        return dataDictionaryMapper.selectByExample(example);
    }
}
