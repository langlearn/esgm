package com.bdt.bean;

public class User {
    private Integer urId;

    private Integer userId;

    private Byte isAbleWorkOrderReport;

    private Byte isAbleWorkOrderSponsor;

    private Byte isAbleWorkOrderAccept;

    private Byte isPublicWorkDiary;

    //临时属性
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getIsAbleWorkOrderReport() {
        return isAbleWorkOrderReport;
    }

    public void setIsAbleWorkOrderReport(Byte isAbleWorkOrderReport) {
        this.isAbleWorkOrderReport = isAbleWorkOrderReport;
    }

    public Byte getIsAbleWorkOrderSponsor() {
        return isAbleWorkOrderSponsor;
    }

    public void setIsAbleWorkOrderSponsor(Byte isAbleWorkOrderSponsor) {
        this.isAbleWorkOrderSponsor = isAbleWorkOrderSponsor;
    }

    public Byte getIsAbleWorkOrderAccept() {
        return isAbleWorkOrderAccept;
    }

    public void setIsAbleWorkOrderAccept(Byte isAbleWorkOrderAccept) {
        this.isAbleWorkOrderAccept = isAbleWorkOrderAccept;
    }

    public Byte getIsPublicWorkDiary() {
        return isPublicWorkDiary;
    }

    public void setIsPublicWorkDiary(Byte isPublicWorkDiary) {
        this.isPublicWorkDiary = isPublicWorkDiary;
    }
}