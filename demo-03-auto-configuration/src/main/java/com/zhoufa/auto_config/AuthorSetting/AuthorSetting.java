package com.zhoufa.auto_config.AuthorSetting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@Component
@PropertySource(
        value = {"config-author.properties"},
        encoding = "GBK"
)
@ConfigurationProperties(prefix = "custom.author")
public class AuthorSetting implements IAuthorSetting {

    // @Value("${custom.author.name}")
    private String name;
    // Value("${custom.author.age}")
    private int age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
