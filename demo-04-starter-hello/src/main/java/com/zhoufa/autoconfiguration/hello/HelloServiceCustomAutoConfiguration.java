package com.zhoufa.autoconfiguration.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)
public class HelloServiceCustomAutoConfiguration {

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService(helloServiceProperties.getMessage());
        return helloService;
    }

}
