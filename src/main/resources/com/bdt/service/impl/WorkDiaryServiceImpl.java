package com.bdt.service.impl;

import com.bdt.bean.WorkDiary;
import com.bdt.bean.WorkDiaryExample;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.WorkDiaryMapper;
import com.bdt.service.WorkDiaryService;

import javax.inject.Inject;
import java.util.List;

/**
 * 工作日志Service
 *
 * @author lim
 */
public class WorkDiaryServiceImpl implements WorkDiaryService {
    @Inject
    private WorkDiaryMapper workDiaryMapper;

    @Override
    public void add(WorkDiary model){
        workDiaryMapper.insert(model);
    }

    
    @Override
    public void modify(WorkDiary model){
        workDiaryMapper.updateByPrimaryKeySelective(model);
    }

    
    @Override
    public void delete(String rids){
        List<Integer> ids= MyStrUtil.stringToListInteger(rids);
        WorkDiaryExample example=new WorkDiaryExample();
        WorkDiaryExample.Criteria criteria=example.createCriteria();
        criteria.andWdIdIn(ids);
        workDiaryMapper.deleteByExample(example);
    }

    
    @Override
    public Page<WorkDiary> queryByPage(WorkDiary model, Integer start, Integer limit){
        Page<WorkDiary> page=new Page<WorkDiary>(start,limit);
        WorkDiaryExample example=new WorkDiaryExample();
        WorkDiaryExample.Criteria criteria=example.createCriteria();
//        if(StringUtils.isNotBlank(model.getCcode())){
//            criteria.andCcodeLike("%"+model.getCcode()+"%");
//        }
        int count=workDiaryMapper.countByExample(example);
        List<WorkDiary> WorkDiarys=workDiaryMapper.selectByExample(example,page.createRowBounds());
        page.setTotal(count);
        page.setRoot(WorkDiarys);
        return page;
    }
}
