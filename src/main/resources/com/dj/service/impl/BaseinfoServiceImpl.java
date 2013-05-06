package com.dj.service.impl;

import com.dj.bean.Baseinfo;
import com.dj.bean.BaseinfoExample;
import com.dj.common.bean.Page;
import com.dj.common.util.MyStrUtil;
import com.dj.mapper.BaseinfoMapper;
import com.dj.service.BaseinfoService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-5-2
 * Time: 上午8:34
 * To change this template use File | Settings | File Templates.
 */
public class BaseinfoServiceImpl implements BaseinfoService {
    @Inject
    private BaseinfoMapper baseinfoMapper;

    @Override
    public void add(Baseinfo model){
        baseinfoMapper.insert(model);
    }

    @Override
    public void modify(Baseinfo model){
        baseinfoMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public void delete(String rids){
        List<Integer> ids= MyStrUtil.stringToListInteger(rids);
        BaseinfoExample example=new BaseinfoExample();
        BaseinfoExample.Criteria criteria=example.createCriteria();
        criteria.andRidIn(ids);
        baseinfoMapper.deleteByExample(example);
    }

    @Override
    public Page<Baseinfo> queryByPage(Baseinfo model, Integer start, Integer limit){
        Page<Baseinfo> page=new Page<Baseinfo>(start,limit);
        BaseinfoExample example=new BaseinfoExample();
        BaseinfoExample.Criteria criteria=example.createCriteria();
        int count=baseinfoMapper.countByExample(example);
        List<Baseinfo> baseinfos=baseinfoMapper.selectByExample(example,page.createRowBounds());
        page.setTotal(count);
        page.setRoot(baseinfos);
        return page;
    }
}
