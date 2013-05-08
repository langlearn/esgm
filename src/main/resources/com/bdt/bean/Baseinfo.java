package com.bdt.bean;

public class Baseinfo {
    private Integer rid;

    private String ccode;

    private String cname;

    private String csort;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode == null ? null : ccode.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCsort() {
        return csort;
    }

    public void setCsort(String csort) {
        this.csort = csort == null ? null : csort.trim();
    }
}