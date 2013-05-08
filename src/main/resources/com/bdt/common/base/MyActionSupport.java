package com.bdt.common.base;

import com.bdt.common.util.ResponseUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-3-25
 * Time: 上午10:09
 * To change this template use File | Settings | File Templates.
 */
public abstract class MyActionSupport<T> extends ActionSupport implements SessionAware,
        ServletRequestAware, ServletResponseAware,ModelDriven<T> {

    @Inject
    protected ResponseUtil responseUtil;
    @Inject
    protected ObjectMapper objectMapper;

    protected Integer start;

    protected Integer limit;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = (start-1)*limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    protected Map<String, Object> session;

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected Integer optid;

    public void setSession(Map<String, Object> session) {
        optid= (Integer) session.get("optid");
        this.session = session;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        String page=servletRequest.getParameter("page");
        String rows=servletRequest.getParameter("rows");
        this.limit=(rows!=null?Integer.parseInt(rows):20);
        this.start=(page!=null?(Integer.parseInt(page)-1)*20:0);
        this.request = servletRequest;
    }

    public void setServletResponse(HttpServletResponse servletResponse) {
        this.response = servletResponse;
    }
}
