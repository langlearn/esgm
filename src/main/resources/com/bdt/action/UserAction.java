package com.bdt.action;

import com.bdt.bean.User;
import com.bdt.bean.ViewUser;
import com.bdt.common.base.MyActionSupport;
import com.bdt.common.bean.Page;
import com.bdt.service.UserService;

import javax.inject.Inject;

/**
 * 用户(权限)
 * 本模块没有实际的用户数据操纵,用户数据来自视图view_JEHR_ERPUser
 * 本模块权限应与用户一一对应,只需要修改功能即可
 * @author lim
 */
public class UserAction extends MyActionSupport<User> {

    private User model=new User();

    @Override
    public User getModel() {
        return model;
    }

    @Inject
    private UserService userService;

    public void add(){
        userService.add(model);
        responseUtil.writeSuccess(response);
    }

    public void modify(){
        userService.saveAndModify(model);
        responseUtil.writeSuccess(response);
    }

    public void delete(){
        String rids=request.getParameter("rids");
        userService.delete(rids);
        responseUtil.writeSuccess(response);
    }

    public void query(){
        Page<ViewUser> result= userService.queryByPage(model,start,limit);
        responseUtil.writeJson(response,result);
    }
}
