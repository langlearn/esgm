package com.bdt.action;

import com.bdt.bean.WorkDiary;
import com.bdt.common.base.MyActionSupport;
import com.bdt.common.bean.Page;
import com.bdt.service.WorkDiaryService;

import javax.inject.Inject;

/**
 * 工作日志
 *
 * @author lim
 */
public class WorkdiaryAction extends MyActionSupport<WorkDiary> {

    private WorkDiary model=new WorkDiary();

    @Override
    public WorkDiary getModel() {
        return model;
    }

    @Inject
    private WorkDiaryService workDiaryService;

    public void add(){
        workDiaryService.add(model);
        responseUtil.writeSuccess(response);
    }

    public void modify(){
        workDiaryService.modify(model);
        responseUtil.writeSuccess(response);
    }

    public void delete(){
        String rids=request.getParameter("rids");
        workDiaryService.delete(rids);
        responseUtil.writeSuccess(response);
    }

    public void query(){
        Page<WorkDiary> result= workDiaryService.queryByPage(model,start,limit);
        responseUtil.writeJson(response,result);
    }
}
