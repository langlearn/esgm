package com.dj.service;

import com.dj.bean.Baseinfo;
import com.dj.common.bean.Page;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-5-2
 * Time: 上午8:41
 * To change this template use File | Settings | File Templates.
 */
public interface BaseinfoService {
    void add(Baseinfo model);

    void modify(Baseinfo model);

    void delete(String rids);

    Page<Baseinfo> queryByPage(Baseinfo model, Integer start, Integer limit);
}
