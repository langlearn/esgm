package com.dj.common.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.ibatis.session.RowBounds;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页对象
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 12-7-5
 * Time: 上午10:47
 * To change this template use File | Settings | File Templates.
 */
public class Page<T> {
    private int total=0;
    private List<T> root=new ArrayList<T>();
    @JsonIgnore
    private int offset;
    @JsonIgnore
    private int limit;

    public Page(int offset,int limit){
        this.offset=offset;
        this.limit=limit;
    }

    public RowBounds createRowBounds(){
        RowBounds rowBounds=new RowBounds(offset,limit);
        return  rowBounds;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    @JsonProperty("rows")
    public List<T> getRoot() {
        return root;
    }

    public void setRoot(List<T> root) {
        this.root = root;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
