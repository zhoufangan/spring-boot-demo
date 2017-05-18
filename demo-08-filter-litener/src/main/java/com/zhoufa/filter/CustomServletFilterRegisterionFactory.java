package com.zhoufa.filter;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
@Configuration
@EnableAutoConfiguration
public class CustomServletFilterRegisterionFactory {

    // 当然也可以通过注解的方式直接使用

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");

        FilterRegistrationBean register = new FilterRegistrationBean();
        register.setFilter(new LoginFilter());
        register.setOrder(1);
        register.setUrlPatterns(urlPatterns);
        return register;
    }

}
