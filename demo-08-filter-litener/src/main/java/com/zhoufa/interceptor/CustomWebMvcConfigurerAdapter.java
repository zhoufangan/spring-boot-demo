package com.zhoufa.interceptor;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
@Configuration
@EnableAutoConfiguration
public class CustomWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 只有经过DispatcherServlet 的请求，才会走拦截器链，我们自定义的Servlet 请求是不会被拦截的，
        // 比如我们自定义的Servlet地址 http://localhost:8080/xs/myservlet 是不会被拦截器拦截的。

        // 对所有的请求拦截使用/** ,对某个模块下的请求拦截使用：/myPath/*
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/＊＊");

        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/＊＊");

        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/＊＊");

        super.addInterceptors(registry);
    }
}
