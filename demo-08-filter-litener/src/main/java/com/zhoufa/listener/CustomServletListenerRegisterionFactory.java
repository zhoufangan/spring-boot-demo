package com.zhoufa.listener;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
@Configuration
@EnableAutoConfiguration
public class CustomServletListenerRegisterionFactory {

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean registration = new ServletListenerRegistrationBean();
        registration.setListener(new CustomContextLoaderListener());
        return registration;
    }

}
