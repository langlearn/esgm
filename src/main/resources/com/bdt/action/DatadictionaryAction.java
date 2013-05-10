package com.bdt.action;

import com.bdt.bean.DataDictionary;
import com.bdt.common.base.MyActionSupport;
import com.bdt.common.bean.Page;
import com.bdt.service.DataDictionaryService;

import javax.inject.Inject;

/**
 * 数据字典
 *
 * @author lim
 */
public class DatadictionaryAction extends MyActionSupport<DataDictionary> {

    private DataDictionary model=new DataDictionary();

    @Override
    public DataDictionary getModel() {
        return model;
    }

    @Inject
    private DataDictionaryService dataDictionaryService;

    public void add(){
        dataDictionaryService.add(model);
        responseUtil.writeSuccess(response);
    }

    public void modify(){
        dataDictionaryService.modify(model);
        responseUtil.writeSuccess(response);
    }

    public void delete(){
        String rids=request.getParameter("rids");
        dataDictionaryService.delete(rids);
        responseUtil.writeSuccess(response);
    }

    public void query(){
        Page<DataDictionary> result= dataDictionaryService.queryByPage(model,start,limit);
        responseUtil.writeJson(response,result);
    }
}
