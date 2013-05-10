package com.bdt.service;

import com.bdt.bean.User;
import com.bdt.bean.UserExample;
import com.bdt.bean.ViewUser;
import com.bdt.bean.ViewUserExample;
import com.bdt.common.bean.Page;
import com.bdt.common.util.MyStrUtil;
import com.bdt.mapper.UserMapper;
import com.bdt.mapper.ViewUserMapper;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.List;

/**
 * 用户(权限)Service
 *
 * @author lim
 */
public class UserService {
    @Inject
    private UserMapper userMapper;
    @Inject
    private ViewUserMapper viewUserMapper;
    
    public void add(User model){
        userMapper.insert(model);
    }

    
    public void modify(User model){
        userMapper.updateByPrimaryKeySelective(model);
    }

    public void saveAndModify(User model){
        if(null != model.getUrId() ){
            userMapper.deleteByPrimaryKey(model.getUrId());
        }

        userMapper.insert(model);
    }
    
    public void delete(String rids){
        List<Integer> ids= MyStrUtil.stringToListInteger(rids);
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUrIdIn(ids);
        userMapper.deleteByExample(example);
    }

    
    public Page<ViewUser> queryByPage(User model, Integer start, Integer limit){
        Page<ViewUser> page=new Page<ViewUser>(start,limit);
        ViewUserExample example=new ViewUserExample();
        ViewUserExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(model.getUsername())){
            criteria.andUsernameLike("%" + model.getUsername() + "%");
        }
        int count= viewUserMapper.countByExample(example);
        List<ViewUser> Users= viewUserMapper.selectByExample(example,page.createRowBounds());
        page.setTotal(count);
        page.setRoot(Users);
        return page;
    }
}
