package com.bdt.service;

import com.bdt.bean.DataDictionary;
import com.bdt.bean.DataDictionaryExample;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.DataDictionaryMapper;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.List;

/**
 * 数据字典Service
 *
 * @author lim
 */
public class DataDictionaryService {
    @Inject
    private DataDictionaryMapper dataDictionaryMapper;

    
    public void add(DataDictionary model){
        dataDictionaryMapper.insert(model);
    }

    
    public void modify(DataDictionary model){
        dataDictionaryMapper.updateByPrimaryKeySelective(model);
    }

    
    public void delete(String rids){
        List<Integer> ids= MyStrUtil.stringToListInteger(rids);
        DataDictionaryExample example=new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria=example.createCriteria();
        criteria.andDdIdIn(ids);
        dataDictionaryMapper.deleteByExample(example);
    }

    
    public Page<DataDictionary> queryByPage(DataDictionary model, Integer start, Integer limit){
        Page<DataDictionary> page=new Page<DataDictionary>(start,limit);
        DataDictionaryExample example=new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(model.getDictionaryName())){
            criteria.andDictionaryNameLike("%"+model.getDictionaryName()+"%");
        }
        int count= dataDictionaryMapper.countByExample(example);
        List<DataDictionary> DataDictionarys= dataDictionaryMapper.selectByExample(example,page.createRowBounds());
        page.setTotal(count);
        page.setRoot(DataDictionarys);
        return page;
    }
}
