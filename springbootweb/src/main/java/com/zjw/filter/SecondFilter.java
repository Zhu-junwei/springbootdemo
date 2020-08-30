package com.zjw.filter;


import javax.servlet.*;
import java.io.IOException;


public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入second Filter..");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("退出second Filter..");
    }

    @Override
    public void destroy() {

    }
}
