package com.bdt.common.util;

/**
 * Created with IntelliJ IDEA.
 * User: Lim
 * Date: 13-5-14
 * Time: 下午4:08
 * To change this template use File | Settings | File Templates.
 */

import com.opensymphony.xwork2.ActionContext;

/**
 * 从session中取得optid
 */
public class Userutil {

    public static Integer getCurrentUserId() {
        return (Integer) ActionContext.getContext().getSession().get("optid");
    }
}
