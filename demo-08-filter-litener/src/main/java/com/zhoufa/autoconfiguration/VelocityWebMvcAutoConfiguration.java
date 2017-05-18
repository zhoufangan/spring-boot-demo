package com.zhoufa.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.util.Properties;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
@SuppressWarnings("ALL")
@Configuration
@AutoConfigureAfter(IVelocityProperties.class)
public class VelocityWebMvcAutoConfiguration {

    @Autowired
    private IVelocityProperties velocityProperties;

    @Bean
    public VelocityConfigurer velocityConfigurer() {
        Properties properties = new Properties();
        properties.put("input.encoding", "UTF-8");
        properties.put("output.encoding", "UTF-8");

        VelocityConfigurer config = new VelocityConfigurer();
        config.setResourceLoaderPath("templates/");
        config.setVelocityProperties(properties);
        return config;
    }

    @Bean
    public VelocityViewResolver velocityViewResolver() {
        VelocityViewResolver resolver = new VelocityViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("templates/");// 视图文件的前缀，即存放的路径
        resolver.setSuffix(".vm");// 视图文件的后缀名

//        resolver.setToolboxConfigLocation("templates/tools.xml");// toolbox配置文件路径
//        resolver.setDateToolAttribute("date");// 日期函数名称
//        resolver.setNumberToolAttribute("number");// 数字函数名称

        resolver.setContentType("text/html;charset=UTF-8");//
        resolver.setExposeSpringMacroHelpers(true);// 是否使用spring对宏定义的支持
        resolver.setExposeRequestAttributes(true);// 是否开放request属性
        resolver.setRequestContextAttribute("rc");// request属性引用名称
        return resolver;
    }

}
