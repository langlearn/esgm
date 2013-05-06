package com.dj.common.util;

/**
 * 将字符串进行处理，返回T对象
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 12-7-13
 * Time: 下午3:53
 * To change this template use File | Settings | File Templates.
 */
public interface ParseStr<T> {
    T parseString(String str);
}
