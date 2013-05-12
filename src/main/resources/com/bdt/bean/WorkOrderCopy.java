package com.bdt.bean;

import java.util.Date;

public class WorkOrderCopy {
    private Integer wocId;

    private Integer workOrderId;

    private Date copyTime;

    private Integer copyUserId;

    private Byte isSignFor;

    private Date signForTime;

    public Integer getWocId() {
        return wocId;
    }

    public void setWocId(Integer wocId) {
        this.wocId = wocId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Date getCopyTime() {
        return copyTime;
    }

    public void setCopyTime(Date copyTime) {
        this.copyTime = copyTime;
    }

    public Integer getCopyUserId() {
        return copyUserId;
    }

    public void setCopyUserId(Integer copyUserId) {
        this.copyUserId = copyUserId;
    }

    public Byte getIsSignFor() {
        return isSignFor;
    }

    public void setIsSignFor(Byte isSignFor) {
        this.isSignFor = isSignFor;
    }

    public Date getSignForTime() {
        return signForTime;
    }

    public void setSignForTime(Date signForTime) {
        this.signForTime = signForTime;
    }
}