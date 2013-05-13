package com.bdt.action;

import com.bdt.bean.SysUser;
import com.bdt.bean.SysUserExample;
import com.bdt.common.base.MyActionSupport;
import com.bdt.common.util.MD5Util;
import com.bdt.mapper.SysUserMapper;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import javax.inject.Inject;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-12
 * Time: 下午5:01
 * To change this template use File | Settings | File Templates.
 */
@Results(
        @Result(name="loginPage",location="/index.jsp",type="redirect")
)
public class LoginAction extends MyActionSupport<SysUser> {

    private SysUser model=new SysUser();

    @Override
    public SysUser getModel() {
        return model;
    }

    @Inject
    private SysUserMapper sysUserMapper;

    public void verify(){
        SysUserExample example=new SysUserExample();
        SysUserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameEqualTo(model.getUsername());
        List<SysUser> sysUsers=sysUserMapper.selectByExample(example);
        if(sysUsers.size()>0){
            SysUser sysUser=sysUsers.get(0);
            if(MD5Util.getMD5Str(model.getUserpwd()).equals(sysUser.getUserpwd())){
                session.put("optid",sysUser.getId());
                responseUtil.writeSuccess(response);
            }else {
                responseUtil.writeFailAndError(response,"密码错误，请重新输入!");
            }
        }else {
            responseUtil.writeFailAndError(response,"该用户不存在!");
        }
    }

    public String loginOff() {
        session.clear();
        return "loginPage";
    }
}
