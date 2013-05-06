package com.dj.common.util;

import java.security.MessageDigest;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 12-7-31
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class MD5Util {
    //初始密码
    private final static String INIT_PWD="123456";

    public static String getMD5Str(String passwd){
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(passwd.getBytes("UTF8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte s[] = m.digest();
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
        }
        return result;
    }

    public static String getMD5InitPwd(){
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(INIT_PWD.getBytes("UTF8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte s[] = m.digest();
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(getMD5Str("123456"));
    }
}
