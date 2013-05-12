package com.bdt.service.impl;

import com.bdt.bean.Project;
import com.bdt.bean.ProjectExample;
import com.bdt.bean.WorkDiaryExample;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.ProjectMapper;
import com.bdt.service.ProjectService;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-12
 * Time: 下午3:14
 * To change this template use File | Settings | File Templates.
 */
public class ProjectServiceImpl implements ProjectService {
    @Inject
    private ProjectMapper projectMapper;

    @Override
    public void add(Project model){
        projectMapper.insert(model);
    }

    @Override
    public void modify(Project model){
        projectMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public void delete(String rids){
        List<Integer> ids= MyStrUtil.stringToListInteger(rids);
        ProjectExample example=new ProjectExample();
        ProjectExample.Criteria criteria=example.createCriteria();
        criteria.andPIdIn(ids);
        projectMapper.deleteByExample(example);
    }

    @Override
    public Page<Project> queryByPage(Project model, Integer start, Integer limit){
        Page<Project> page=new Page<Project>(start,limit);
        ProjectExample example=new ProjectExample();
        ProjectExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(model.getProjectName()))
            criteria.andProjectNameLike("%"+model.getProjectName()+"%");
        if(StringUtils.isNotBlank(model.getBusinessTypeCode())){
            criteria.andBusinessTypeCodeEqualTo(model.getBusinessTypeCode());
        }
        int count=projectMapper.countByExample(example);
        List<Project> projects=projectMapper.selectByExample(example,page.createRowBounds());
        page.setTotal(count);
        page.setRoot(projects);
        return page;
    }
}
