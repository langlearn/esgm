package com.bdt.bean;

public class ViewUser {
    private Integer userId;

    private String username;

    private String userpwd;

    private String truename;

    private String department;

    private String zhiwei;

    private String zaigang;

    private String emailstr;

    private String sex;

    private Integer urId;

    private Byte isAbleWorkOrderReport;

    private Byte isAbleWorkOrderSponsor;

    private Byte isAbleWorkOrderAccept;

    private Byte isPublicWorkDiary;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei == null ? null : zhiwei.trim();
    }

    public String getZaigang() {
        return zaigang;
    }

    public void setZaigang(String zaigang) {
        this.zaigang = zaigang == null ? null : zaigang.trim();
    }

    public String getEmailstr() {
        return emailstr;
    }

    public void setEmailstr(String emailstr) {
        this.emailstr = emailstr == null ? null : emailstr.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
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