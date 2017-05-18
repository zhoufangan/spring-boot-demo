package com.zhoufa.auto_config.HttpEncoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@Configuration
// 开启属性注入
@EnableConfigurationProperties(HttpEncodingProperties.class)
public class HttpEncodingCustomAutoConfiguration {

    @Autowired
    private HttpEncodingProperties httpEncodingProperties;

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        if (null == httpEncodingProperties) {
            return null;
        }
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding(httpEncodingProperties.getEncoding().name());
        filter.setForceEncoding(httpEncodingProperties.getForceEncoding());
        return filter;
    }

}
