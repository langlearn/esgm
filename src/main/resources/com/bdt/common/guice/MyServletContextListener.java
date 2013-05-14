package com.bdt.common.guice;

import com.bdt.common.filter.CheckLoginFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.google.inject.struts2.Struts2GuicePluginModule;
import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

import javax.inject.Singleton;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-3-25
 * Time: 下午2:41
 * To change this template use File | Settings | File Templates.
 */
public class MyServletContextListener extends GuiceServletContextListener {
    private final static String FORMAT = "yyyy-MM-dd HH:mm:ss";
    public Injector getInjector() {
        return Guice.createInjector(
            new MyMapperModule(),
            new MyServiceModule(),
            new Struts2GuicePluginModule(),
            new ServletModule() {
                @Override
                protected void configureServlets() {
                    ObjectMapper objectMapper=new ObjectMapper();
                    objectMapper.setDateFormat(new SimpleDateFormat(FORMAT));
                    // Struts 2 setup
                    bind(StrutsPrepareAndExecuteFilter.class).in(Singleton.class);
                    bind(CheckLoginFilter.class).in(Singleton.class);
                    filter("*.do").through(CheckLoginFilter.class);
                    filter("/*").through(StrutsPrepareAndExecuteFilter.class);
                    bind(ObjectMapper.class).toInstance(objectMapper);
                }
            }
        );
    }

}