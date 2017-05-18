package com.zhoufa.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    // 在preHandle中，可以进行编码、安全控制等处理；
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 除去login接口，其它接口均需要登陆验证
        String memberId = request.getHeader("memberId");
        String token = request.getHeader("token");

        System.out.println(">>>LoginInterceptor>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");
        return super.preHandle(request, response, handler);
    }

    // 在postHandle中，有机会修改ModelAndView；
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>LoginInterceptor>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
        super.postHandle(request, response, handler, modelAndView);
    }

    // 在afterCompletion中，可以根据ex是否为null判断是否发生了异常，进行日志记录。
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(">>>MyInterceptor1>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
        super.afterCompletion(request, response, handler, ex);
    }
}
