package com.zjw.config;

import com.zjw.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 完成Servlet组件的注册
 */
@Configuration
public class ServletConfig {

    /**
     * 容器开始的时候初始化一次
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet(), "/second");
        bean.addUrlMappings("/second2");
        bean.addUrlMappings("/second3");
        return bean;
    }
}
