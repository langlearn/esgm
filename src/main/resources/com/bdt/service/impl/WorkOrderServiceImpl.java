package com.bdt.service.impl;

import com.bdt.bean.*;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.AddedMapper;
import com.bdt.mapper.ViewWorkOrderMapper;
import com.bdt.mapper.WorkOrderCopyMapper;
import com.bdt.mapper.WorkOrderMapper;
import com.bdt.service.WorkOrderService;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-12
 * Time: 下午11:31
 * To change this template use File | Settings | File Templates.
 */
public class WorkOrderServiceImpl implements WorkOrderService {
    @Inject
    private WorkOrderMapper workOrderMapper;
    @Inject
    private WorkOrderCopyMapper workOrderCopyMapper;
    @Inject
    private ViewWorkOrderMapper viewWorkOrderMapper;
    @Inject
    private AddedMapper addedMapper;

    @Override
    public void add(WorkOrder model) {
        model.setAcceptStatus(new Byte("0"));
        model.setConfirmStatus(new Byte("0"));
        model.setCheckReceiveStatus(new Byte("0"));
        workOrderMapper.insert(model);
    }

    @Override
    public void modify(WorkOrder model) {
        workOrderMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public void delete(String rids) {
        List<Integer> ids = MyStrUtil.stringToListInteger(rids);
        WorkOrderExample example = new WorkOrderExample();
        WorkOrderExample.Criteria criteria = example.createCriteria();
        criteria.andWoIdIn(ids);
        workOrderMapper.deleteByExample(example);
    }


    private void copy(Integer woId, String userids) {
        final Date COPY_TIME = new Date();
        List<Integer> ids = MyStrUtil.stringToListInteger(userids);
        for (Integer userid : ids) {
            WorkOrderCopy workOrderCopy = new WorkOrderCopy();
            workOrderCopy.setWorkOrderId(woId);
            workOrderCopy.setCopyTime(COPY_TIME);
            workOrderCopy.setCopyUserId(userid);
            workOrderCopyMapper.insertSelective(workOrderCopy);
        }
    }

    @Override
    public Page<ViewWorkOrder> queryByPage(ViewWorkOrder model, Integer start, Integer limit) {
        Page<ViewWorkOrder> page = new Page<ViewWorkOrder>(start, limit);
        ViewWorkOrderExample example = new ViewWorkOrderExample();
        ViewWorkOrderExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(model.getWorkOrderTitle()))
            criteria.andWorkOrderTitleLike("%" + model.getWorkOrderTitle() + "%");
        if (StringUtils.isNotBlank(model.getProjectName()))
            criteria.andProjectNameLike("%" + model.getProjectName() + "%");
        if (model.getAcceptStatus() != null)
            criteria.andAcceptStatusEqualTo(model.getAcceptStatus());
        if (model.getCheckReceiveStatus() != null)
            criteria.andCheckReceiveStatusEqualTo(model.getCheckReceiveStatus());
        if (model.getConfirmStatus() != null)
            criteria.andConfirmStatusEqualTo(model.getConfirmStatus());
        if (model.getAcceptUserId() != null) {
            criteria.andAcceptUserIdEqualTo(model.getAcceptUserId());
        }
        if (model.getReportUserId() != null) {
            criteria.andReportUserIdEqualTo(model.getReportUserId());
        }
        if (model.getSponsorUserId() != null) {
            criteria.andSponsorUserIdEqualTo(model.getSponsorUserId());
        }
        int count = viewWorkOrderMapper.countByExample(example);
        List<ViewWorkOrder> viewWorkOrders = viewWorkOrderMapper.selectByExampleWithBLOBs(example, page.createRowBounds());
        page.setTotal(count);
        page.setRoot(viewWorkOrders);
        return page;
    }

    @Override
    public List<ViewWorkOrder> queryByList(ViewWorkOrder model) {
        ViewWorkOrderExample example = new ViewWorkOrderExample();
        ViewWorkOrderExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(model.getWorkOrderTitle()))
            criteria.andWorkOrderTitleLike("%" + model.getWorkOrderTitle() + "%");
        if (StringUtils.isNotBlank(model.getProjectName()))
            criteria.andProjectNameLike("%" + model.getProjectName() + "%");
        if (model.getAcceptStatus() != null)
            criteria.andAcceptStatusEqualTo(model.getAcceptStatus());
        if (model.getCheckReceiveStatus() != null)
            criteria.andCheckReceiveStatusEqualTo(model.getCheckReceiveStatus());
        if (model.getConfirmStatus() != null)
            criteria.andConfirmStatusEqualTo(model.getConfirmStatus());
        if (model.getAcceptUserId() != null) {
            criteria.andAcceptUserIdEqualTo(model.getAcceptUserId());
        }
        if (model.getReportUserId() != null) {
            criteria.andReportUserIdEqualTo(model.getReportUserId());
        }
        if (model.getSponsorUserId() != null) {
            criteria.andSponsorUserIdEqualTo(model.getSponsorUserId());
        }
        List<ViewWorkOrder> viewWorkOrders = viewWorkOrderMapper.selectByExampleWithBLOBs(example);

        return viewWorkOrders;
    }

    @Override
    public Page<ViewWorkOrder> queryCopyByPage(Integer userId, Byte isSignFor, Integer start, Integer limit) {
        Page<ViewWorkOrder> page = new Page<ViewWorkOrder>(start, limit);
        int count = addedMapper.countWorkOrderForCopy(userId, isSignFor);
        List<ViewWorkOrder> viewWorkOrders = addedMapper.selectWorkOrderForCopy(userId, isSignFor, page.createRowBounds());
        page.setTotal(count);
        page.setRoot(viewWorkOrders);
        return page;
    }

    @Override
    public void confirm(Integer woId) {
        WorkOrder workOrder = new WorkOrder();
        workOrder.setWoId(woId);
        workOrder.setConfirmStatus(new Byte("1"));
        workOrder.setConfirmTime(new Date());
        workOrderMapper.updateByPrimaryKeySelective(workOrder);
    }

    @Override
    public void check(Integer woId) {
        WorkOrder workOrder = new WorkOrder();
        workOrder.setWoId(woId);
        workOrder.setCheckReceiveStatus(new Byte("1"));
        workOrder.setCheckReceiveTime(new Date());
        workOrderMapper.updateByPrimaryKeySelective(workOrder);
    }

    @Override
    public void invalid(Integer woId, String invalidReason) {
        WorkOrder workOrder = new WorkOrder();
        workOrder.setWoId(woId);
        workOrder.setCheckReceiveStatus(new Byte("2"));
        workOrder.setCheckReceiveTime(new Date());
        workOrder.setInvalidReason(invalidReason);
        workOrderMapper.updateByPrimaryKeySelective(workOrder);
    }


    @Override
    public void accept(Integer woId, String userids) {
        WorkOrder workOrder = new WorkOrder();
        workOrder.setWoId(woId);
        workOrder.setAcceptStatus(new Byte("1"));
        workOrder.setAcceptTime(new Date());
        workOrderMapper.updateByPrimaryKeySelective(workOrder);
        WorkOrderCopyExample example = new WorkOrderCopyExample();
        WorkOrderCopyExample.Criteria criteria = example.createCriteria();
        criteria.andWorkOrderIdEqualTo(woId);
        workOrderCopyMapper.deleteByExample(example);
        copy(woId, userids);
    }

    @Override
    public List<Map> queryCopy(Integer woId) {
        return addedMapper.selectWorkOrderCopy(woId);
    }
}
