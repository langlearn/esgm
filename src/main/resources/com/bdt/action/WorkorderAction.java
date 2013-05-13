package com.bdt.action;

import com.bdt.bean.DataDictionary;
import com.bdt.bean.ViewWorkOrder;
import com.bdt.bean.WorkOrder;
import com.bdt.common.base.MyActionSupport;
import com.bdt.common.bean.Page;
import com.bdt.service.DataDictionaryService;
import com.bdt.service.WorkOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.commons.beanutils.PropertyUtils;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-12
 * Time: 下午11:44
 * To change this template use File | Settings | File Templates.
 */
public class WorkorderAction extends MyActionSupport<WorkOrder> {
    private WorkOrder model = new WorkOrder();

    @Override
    public WorkOrder getModel() {
        return model;
    }

    @Inject
    private WorkOrderService service;
    @Inject
    private DataDictionaryService dataDictionaryService;

    public void add() {
        service.add(model);
        responseUtil.writeSuccess(response);
    }

    public void modify() {
        service.modify(model);
        responseUtil.writeSuccess(response);
    }

    public void delete() {
        String rids = request.getParameter("rids");
        service.delete(rids);
        responseUtil.writeSuccess(response);
    }

    public void query() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ViewWorkOrder viewWorkOrder = new ViewWorkOrder();
        PropertyUtils.copyProperties(viewWorkOrder, model);
        viewWorkOrder.setProjectName(request.getParameter("projectName"));
        Page<ViewWorkOrder> result = service.queryByPage(viewWorkOrder, start, limit);
        responseUtil.writeJson(response, result);
    }

    public String execute() throws JsonProcessingException {
        List<DataDictionary> dataDictionaries = dataDictionaryService.queryByParentCode("001");
        request.setAttribute("dataDictionaries", objectMapper.writeValueAsString(dataDictionaries));
        return SUCCESS;
    }
}
