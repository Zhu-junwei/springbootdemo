package com.zjw.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SecondListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("second listener ... init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("second listener ... destroy");
    }
}
