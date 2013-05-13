package com.bdt.bean;

import java.util.Date;

public class WorkOrder {
    private Integer woId;

    private Integer taskId;

    private String workOrderTitle;

    private Date expectBeginTime;

    private Date expectEndTime;

    private Integer projectId;

    private Integer reportUserId;

    private Date reportTime;

    private Integer sponsorUserId;

    private Integer acceptUserId;

    private Byte confirmStatus;

    private Date confirmTime;

    private Byte acceptStatus;

    private Date acceptTime;

    private Byte checkReceiveStatus;

    private Date checkReceiveTime;

    private String invalidReason;

    private String workOrderContent;

    public Integer getWoId() {
        return woId;
    }

    public void setWoId(Integer woId) {
        this.woId = woId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getWorkOrderTitle() {
        return workOrderTitle;
    }

    public void setWorkOrderTitle(String workOrderTitle) {
        this.workOrderTitle = workOrderTitle == null ? null : workOrderTitle.trim();
    }

    public Date getExpectBeginTime() {
        return expectBeginTime;
    }

    public void setExpectBeginTime(Date expectBeginTime) {
        this.expectBeginTime = expectBeginTime;
    }

    public Date getExpectEndTime() {
        return expectEndTime;
    }

    public void setExpectEndTime(Date expectEndTime) {
        this.expectEndTime = expectEndTime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getReportUserId() {
        return reportUserId;
    }

    public void setReportUserId(Integer reportUserId) {
        this.reportUserId = reportUserId;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getSponsorUserId() {
        return sponsorUserId;
    }

    public void setSponsorUserId(Integer sponsorUserId) {
        this.sponsorUserId = sponsorUserId;
    }

    public Integer getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(Integer acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public Byte getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Byte confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Byte getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(Byte acceptStatus) {
        this.acceptStatus = acceptStatus;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Byte getCheckReceiveStatus() {
        return checkReceiveStatus;
    }

    public void setCheckReceiveStatus(Byte checkReceiveStatus) {
        this.checkReceiveStatus = checkReceiveStatus;
    }

    public Date getCheckReceiveTime() {
        return checkReceiveTime;
    }

    public void setCheckReceiveTime(Date checkReceiveTime) {
        this.checkReceiveTime = checkReceiveTime;
    }

    public String getInvalidReason() {
        return invalidReason;
    }

    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason == null ? null : invalidReason.trim();
    }

    public String getWorkOrderContent() {
        return workOrderContent;
    }

    public void setWorkOrderContent(String workOrderContent) {
        this.workOrderContent = workOrderContent == null ? null : workOrderContent.trim();
    }
}