package com.bdt.common.servlet;

import com.google.inject.Injector;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 * User: yang
 * Date: 13-4-12
 * Time: 上午11:04
 * To change this template use File | Settings | File Templates.
 */
public class ContextListener implements ServletContextListener {
    private Timer timer;
    @Override
    public void contextInitialized(ServletContextEvent event) {
        Injector injector= (Injector) event.getServletContext().getAttribute(Injector.class.getName());
        timer = new java.util.Timer(true);
        event.getServletContext().log("定时器已启动");
        /*timer.schedule(ownerWarnTask, 0,5*60*1000);*/
        event.getServletContext().log("已经添加任务调度表");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        timer.cancel();
        event.getServletContext().log("定时器销毁");
    }
}
