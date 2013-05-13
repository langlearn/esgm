package com.bdt.action;

import com.bdt.bean.DataDictionary;
import com.bdt.bean.Project;
import com.bdt.common.base.MyActionSupport;
import com.bdt.common.bean.Page;
import com.bdt.service.DataDictionaryService;
import com.bdt.service.ProjectService;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.inject.Inject;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-12
 * Time: 下午3:20
 * To change this template use File | Settings | File Templates.
 */
public class ProjectAction extends MyActionSupport<Project> {
    private Project model = new Project();

    @Override
    public Project getModel() {
        return model;
    }

    @Inject
    private ProjectService service;
    @Inject
    private DataDictionaryService dataDictionaryService;

    public void add() {
        service.add(model);
        responseUtil.writeSuccess(response);
    }

    public void modify() {
        String pid = request.getParameter("pId");
        model.setpId(Integer.parseInt(pid));
        service.modify(model);
        responseUtil.writeSuccess(response);
    }

    public void delete() {
        String rids = request.getParameter("rids");
        service.delete(rids);
        responseUtil.writeSuccess(response);
    }

    public void query() {
        Page<Project> result = service.queryByPage(model, start, limit);
        responseUtil.writeJson(response, result);
    }

    public String execute() throws JsonProcessingException {
        List<DataDictionary> dataDictionaries = dataDictionaryService.queryByParentCode("001");
        request.setAttribute("dataDictionaries", objectMapper.writeValueAsString(dataDictionaries));
        return SUCCESS;
    }
}
