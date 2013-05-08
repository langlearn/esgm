package com.bdt.common.guice;

import org.mybatis.guice.XMLMyBatisModule;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-3-4
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
public class MyMapperModule extends XMLMyBatisModule {
    @Override
    protected void initialize() {
        setEnvironmentId("db1");
    }
}
