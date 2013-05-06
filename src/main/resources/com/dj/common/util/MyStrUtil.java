package com.dj.common.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串处理工具
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 12-7-13
 * Time: 下午3:30
 * To change this template use File | Settings | File Templates.
 */
public class MyStrUtil {
    private final static String SEPARATOR=",";
    /**
     * 将字符串，通过分隔符转换成特定类型列表
     * @param value
     * @param separator
     * @param t
     * @param <T>
     * @return
     */
    public static <T> List<T> stringToList(String value,String separator,ParseStr<T> t){
        String[] strs = StringUtils.split(value, separator);
        List<T> result=new ArrayList<T>();
        for (String str : strs) {
            result.add(t.parseString(str));
        }
        return result;
    }

    /**
     * 将字符串，通过分隔符转换成List<Integer>
     * @param value
     * @return
     */
    public static List<Integer> stringToListInteger(String value){
       return stringToListInteger(value,SEPARATOR);
    }

    public static List<Integer> stringToListInteger(String value,String separator){
        return stringToList(value,separator, new ParseStr<Integer>() {
            @Override
            public Integer parseString(String str) {
                return Integer.parseInt(str);
            }
        });
    }
}
