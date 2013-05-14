package com.bdt.service.impl;

import com.bdt.bean.*;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.ViewWorkDiaryDetailMapper;
import com.bdt.mapper.ViewWorkDiaryMapper;
import com.bdt.mapper.WorkDiaryMapper;
import com.bdt.service.ServiceException;
import com.bdt.service.WorkDiaryService;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;

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
        DateTime before7Day = new DateTime().millisOfDay().withMinimumValue().minusDays(7);
        DateTime inputBefore7Day = new DateTime(model.getWorkTime()).millisOfDay().withMinimumValue().minusDays(7);
        int bd = Days.daysBetween(inputBefore7Day, before7Day).getDays();
        //7只允许填入7天(含)内的数据
        if (bd >= 0 && bd <= 7) {
            workDiaryMapper.insert(model);
        } else {
            throw new ServiceException("只允许填写7天内的数据!");
        }
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

        //公开权限
        criteria.andIsPublicWorkDiaryEqualTo((byte) 1);

        example.or().andUserIdEqualTo(model.getUserId());
        int count = viewWorkDiaryMapper.countByExample(example);
        example.setOrderByClause("work_time DESC");
        List<ViewWorkDiary> workDiarys = viewWorkDiaryMapper.selectByExample(example, page.createRowBounds());
        page.setTotal(count);
        page.setRoot(workDiarys);
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
