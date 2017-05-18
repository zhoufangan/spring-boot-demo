package com.zhoufa.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行过滤操作 -->> 前");

        chain.doFilter(request, response);

        System.out.println("执行过滤操作 -->> 后");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
