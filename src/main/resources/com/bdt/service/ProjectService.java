package com.bdt.service;

import com.bdt.bean.Project;
import com.bdt.common.bean.Page;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-5-12
 * Time: 下午3:19
 * To change this template use File | Settings | File Templates.
 */
public interface ProjectService {
    void add(Project model);

    void modify(Project model);

    void delete(String rids);

    Page<Project> queryByPage(Project model, Integer start, Integer limit);
}
