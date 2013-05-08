package com.bdt.action;

import com.bdt.bean.Baseinfo;
import com.bdt.common.base.MyActionSupport;
import com.bdt.common.bean.Page;
import com.bdt.service.BaseinfoService;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-4-28
 * Time: 下午3:38
 * To change this template use File | Settings | File Templates.
 */
public class BaseinfoAction extends MyActionSupport<Baseinfo> {

    private Baseinfo model=new Baseinfo();

    @Override
    public Baseinfo getModel() {
        return model;
    }

    @Inject
    private BaseinfoService baseinfoService;

    public void add(){
        baseinfoService.add(model);
        responseUtil.writeSuccess(response);
    }

    public void modify(){
        baseinfoService.modify(model);
        responseUtil.writeSuccess(response);
    }

    public void delete(){
        String rids=request.getParameter("rids");
        baseinfoService.delete(rids);
        responseUtil.writeSuccess(response);
    }

    public void query(){
        Page<Baseinfo> result=baseinfoService.queryByPage(model,start,limit);
        responseUtil.writeJson(response,result);
    }
}
