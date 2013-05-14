package com.bdt.common.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-3-4
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
public class MyServiceModule implements Module {
    private static Logger logger = Logger.getLogger(MyServiceModule.class);
    private static String IMP = "com/bdt/service/impl/";

    @Override
    @SuppressWarnings("unchecked")
    public void configure(Binder binder) {
        String path = this.getClass().getClassLoader().getResource("").getPath();
        Collection<File> files = FileUtils.listFiles(new File(path + IMP), new String[]{"class"}, false);
        try {
            for (File file : files) {
                String fileName = file.getName();
                String impName = IMP.replace("/", ".") + fileName.substring(0, fileName.length() - 6);
                Class impClazz = Class.forName(impName);
                Class[] clazzs = impClazz.getInterfaces();
                for (Class clazz : clazzs) {
                    binder.bind(clazz).to(impClazz);
                    if (logger.isDebugEnabled()) {
                        logger.debug("[Guice] - bind " + clazz + " to " + impClazz);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
