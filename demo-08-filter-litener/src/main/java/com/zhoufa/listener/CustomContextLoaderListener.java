package com.zhoufa.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * spring启动监听器,继承ContextLoaderListener
 *
 * @author zhoufangan
 */
public class CustomContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        System.out.println(">>>   CustomContextLoaderListener    >>>>>>>");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
