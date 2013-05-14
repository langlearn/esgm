package com.bdt.service;

import com.bdt.bean.ViewWorkDiary;
import com.bdt.bean.ViewWorkDiaryDetail;
import com.bdt.bean.WorkDiary;
import com.bdt.common.bean.Page;

/**
 * Created with IntelliJ IDEA.
 * User: Lim
 * Date: 13-5-11
 * Time: 上午11:10
 * To change this template use File | Settings | File Templates.
 */
public interface WorkDiaryService {
    void add(WorkDiary model);

    void modify(WorkDiary model, Integer optid);

    void delete(String rids, Integer optid);

    Page<WorkDiary> queryByPage(WorkDiary model, Integer start, Integer limit);

    Page<ViewWorkDiary> queryViewByPage(WorkDiary model, Integer start, Integer limit);

    Page<ViewWorkDiaryDetail> queryDetailViewByPage(WorkDiary model, Integer start, Integer limit);
}
