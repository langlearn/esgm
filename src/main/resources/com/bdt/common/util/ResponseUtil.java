package com.bdt.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 12-7-5
 * Time: 下午3:10
 * To change this template use File | Settings | File Templates.
 */
public class ResponseUtil {
    private final static String SUCCESS = "success";
    private final static String MSG = "msg";
    private final static String ERROR = "error";
    //后台验证错误使用
    private final static String ERRORS = "errors";
    private final static String FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Inject
    private ObjectMapper objectMapper;

    public void writeSuccess(ServletResponse response) {
        Map<String, Object> result = new HashMap<String, Object>();
        this.writeSuccess(response, result);
    }

    public void writeSuccess(ServletResponse response, Map<String, Object> result) {
        result.put(SUCCESS, true);
        writeJson(response, result);
    }

    public void writeSuccessAndMsg(ServletResponse response, String msg) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(SUCCESS, true);
        result.put(MSG, msg);
        writeJson(response, result);
    }

    public void writeFail(ServletResponse response) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(SUCCESS, false);
        writeJson(response, result);
    }

    public void writeFailAndMsg(ServletResponse response, String msg) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(SUCCESS, false);
        result.put(MSG, msg);
        writeJson(response, result);
    }

    public void writeErrors(ServletResponse response, Map<String, Object> errors) {
        Map<String, Object> result = createErrors(errors);
        writeJson(response, result);
    }

    public void writeFailAndError(ServletResponse response, String error) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(SUCCESS, false);
        result.put(ERROR, error);
        writeJson(response, result);
    }

    public void writeJson(ServletResponse response, Object obj) {
        response.setContentType("application/json");
        try {
            objectMapper.setDateFormat(new SimpleDateFormat(FORMAT));
            objectMapper.writeValue(response.getOutputStream(), obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建后台验证错误，返回对象
     *
     * @param errors
     * @return
     */
    public Map<String, Object> createErrors(Map<String, Object> errors) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(SUCCESS, false);
        result.put(ERRORS, errors);
        return result;
    }

    /**
     * 后台操作成功，返回对象
     *
     * @return
     */
    public Map<String, Object> createSuccess() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(SUCCESS, true);
        return result;
    }
}
