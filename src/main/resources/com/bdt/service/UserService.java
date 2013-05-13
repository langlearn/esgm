package com.bdt.service;

import com.bdt.bean.User;
import com.bdt.bean.ViewUser;
import com.bdt.common.bean.Page;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Lim
 * Date: 13-5-11
 * Time: 上午10:53
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    void add(User model);

    void modify(User model);

    void saveAndModify(User model);

    void delete(String rids);

    Page<ViewUser> queryByPage(User model, Integer start, Integer limit);

    List<ViewUser> queryForSponsor();

    List<ViewUser> queryForAccept();
}
