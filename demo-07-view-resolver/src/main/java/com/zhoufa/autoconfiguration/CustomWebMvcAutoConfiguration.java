package com.zhoufa.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/5.
 */
@SuppressWarnings("ALL")
@Configuration
@AutoConfigureAfter(ICustomWebMvcProperties.class)
public class CustomWebMvcAutoConfiguration {

    @Autowired
    private ICustomWebMvcProperties customWebMvcProperties;

    @Bean
    public ViewResolver viewResolver() {
        if (null == customWebMvcProperties) {
            return buildDefaultJsonViewResolver();
        }

        // 1.没有配置视图
        List<String> viewMediaTypeNames = customWebMvcProperties.getViewMediaTypeNames();
        if (null == viewMediaTypeNames || 0 == viewMediaTypeNames.size()) {
            return buildDefaultJsonViewResolver();
        }

        // 2.只配置一种视图
        if (1 == viewMediaTypeNames.size()) {
            return buildViewResolver(viewMediaTypeNames.get(0));
        }

        // 3.配置多视图,使用ContentNegotiatingViewResolver
        List<ViewResolver> viewResolvers = new ArrayList<>();
        for (String mediaName : viewMediaTypeNames) {
            ViewResolver vr = buildViewResolver(mediaName);
            viewResolvers.add(vr);
        }

        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setViewResolvers(viewResolvers);
        return resolver;
    }

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

    private JsonViewResolver buildDefaultJsonViewResolver() {
        // 使用默认配置
        JsonView jsonView = new JsonView();
        return new JsonViewResolver(jsonView);
    }

    private ViewResolver buildViewResolver(String mediaName) {
        // json viewResolver
        if (ICustomWebMvcProperties.ViewMediaType.json.name().equals(mediaName)) {
            JsonView jsonView = new JsonView();
            jsonView.setContentType(ICustomWebMvcProperties.ViewMediaType.json.getContentType());
            return new JsonViewResolver(jsonView);
        }

        // velocity viewResolver
        if (ICustomWebMvcProperties.ViewMediaType.velocity.name().equals(mediaName)) {

            VelocityViewResolver resolver = new VelocityViewResolver();
            resolver.setCache(true);
            resolver.setPrefix("templates/");// 视图文件的前缀，即存放的路径
            resolver.setSuffix(".vm");// 视图文件的后缀名
//            resolver.setToolboxConfigLocation("templates/tools.xml");// toolbox配置文件路径
//            resolver.setDateToolAttribute("date");// 日期函数名称
//            resolver.setNumberToolAttribute("number");// 数字函数名称
            resolver.setContentType("text/html;charset=UTF-8");//
            resolver.setExposeSpringMacroHelpers(true);// 是否使用spring对宏定义的支持
            resolver.setExposeRequestAttributes(true);// 是否开放request属性
            resolver.setRequestContextAttribute("rc");// request属性引用名称
            return resolver;
        }

        return buildDefaultJsonViewResolver();
    }

}
