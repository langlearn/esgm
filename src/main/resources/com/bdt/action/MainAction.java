package com.bdt.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-14
 * Time: 上午12:59
 * To change this template use File | Settings | File Templates.
 */
public class MainAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("hello,world!");
        return SUCCESS;
    }
}
