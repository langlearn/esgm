package com.bdt.service.impl;

import com.bdt.bean.*;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.ViewWorkDiaryDetailMapper;
import com.bdt.mapper.ViewWorkDiaryMapper;
import com.bdt.mapper.WorkDiaryMapper;
import com.bdt.service.WorkDiaryService;
import org.apache.commons.lang3.StringUtils;

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
    @Inject
    private ViewWorkDiaryMapper viewWorkDiaryMapper;
    @Inject
    private ViewWorkDiaryDetailMapper viewWorkDiaryDetailMapper;

    @Override
    public void add(WorkDiary model) {
        workDiaryMapper.insert(model);
    }


    @Override
    public void modify(WorkDiary model) {
        workDiaryMapper.updateByPrimaryKeySelective(model);
    }


    @Override
    public void delete(String rids) {
        List<Integer> ids = MyStrUtil.stringToListInteger(rids);
        WorkDiaryExample example = new WorkDiaryExample();
        WorkDiaryExample.Criteria criteria = example.createCriteria();
        criteria.andWdIdIn(ids);
        workDiaryMapper.deleteByExample(example);
    }


    @Override
    public Page<WorkDiary> queryByPage(WorkDiary model, Integer start, Integer limit) {
        Page<WorkDiary> page = new Page<WorkDiary>(start, limit);
        WorkDiaryExample example = new WorkDiaryExample();
        WorkDiaryExample.Criteria criteria = example.createCriteria();
        if (null != model.getUserId()) {
            criteria.andUserIdEqualTo(model.getUserId());
        }
        if (null != model.getWorkTime()) {
            criteria.andWorkTimeEqualTo(model.getWorkTime());
        }
        int count = workDiaryMapper.countByExample(example);
        List<WorkDiary> WorkDiarys = workDiaryMapper.selectByExample(example, page.createRowBounds());
        page.setTotal(count);
        page.setRoot(WorkDiarys);
        return page;
    }

    @Override
    public Page<ViewWorkDiary> queryViewByPage(WorkDiary model, Integer start, Integer limit) {
        Page<ViewWorkDiary> page = new Page<ViewWorkDiary>(start, limit);
        ViewWorkDiaryExample example = new ViewWorkDiaryExample();
        ViewWorkDiaryExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(model.getDepartment())) {
            criteria.andDepartmentLike("%" + model.getDepartment() + "%");
        }
        if (StringUtils.isNotBlank(model.getUserName())) {
            criteria.andUserNameLike("%" + model.getUserName() + "%");
        }
        if (null != model.getWorkTime()) {
            criteria.andWorkTimeEqualTo(model.getWorkTime());
        } else {
            criteria.andWorkTimeIsNotNull();
        }
        int count = viewWorkDiaryMapper.countByExample(example);
        List<ViewWorkDiary> WorkDiarys = viewWorkDiaryMapper.selectByExample(example, page.createRowBounds());
        page.setTotal(count);
        page.setRoot(WorkDiarys);
        return page;
    }

    @Override
    public Page<ViewWorkDiaryDetail> queryDetailViewByPage(WorkDiary model, Integer start, Integer limit) {
        Page<ViewWorkDiaryDetail> page = new Page<ViewWorkDiaryDetail>(start, limit);
        ViewWorkDiaryDetailExample example = new ViewWorkDiaryDetailExample();
        ViewWorkDiaryDetailExample.Criteria criteria = example.createCriteria();
        if (null != model.getUserId()) {
            criteria.andUserIdEqualTo(model.getUserId());
        }
        if (null != model.getWorkTime()) {
            criteria.andWorkTimeEqualTo(model.getWorkTime());
        }

        int count = viewWorkDiaryDetailMapper.countByExample(example);
        List<ViewWorkDiaryDetail> WorkDiarys = viewWorkDiaryDetailMapper.selectByExample(example, page.createRowBounds());
        page.setTotal(count);
        page.setRoot(WorkDiarys);
        return page;
    }
}
