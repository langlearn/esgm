package com.bdt.service;

import com.bdt.bean.ViewWorkOrder;
import com.bdt.bean.WorkOrder;
import com.bdt.common.bean.Page;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-12
 * Time: 下午11:45
 * To change this template use File | Settings | File Templates.
 */
public interface WorkOrderService {
    void add(WorkOrder model);

    void modify(WorkOrder model);

    void delete(String rids);

    Page<ViewWorkOrder> queryByPage(ViewWorkOrder model, Integer start, Integer limit);

    void confirm(Integer woId);

    void check(Integer woId);

    void accept(Integer woId, String userids);

    void invalid(Integer woId, String invalidReason);

    List<Map> queryCopy(Integer woId);
}
