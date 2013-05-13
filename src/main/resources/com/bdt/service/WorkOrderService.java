package com.bdt.service;

import com.bdt.bean.ViewWorkOrder;
import com.bdt.bean.WorkOrder;
import com.bdt.common.bean.Page;

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

    void copy(Integer woId, String userids);

    Page<ViewWorkOrder> queryByPage(ViewWorkOrder model, Integer start, Integer limit);

}
