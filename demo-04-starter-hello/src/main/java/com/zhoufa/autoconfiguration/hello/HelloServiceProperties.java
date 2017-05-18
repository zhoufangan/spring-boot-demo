package com.zhoufa.autoconfiguration.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@ConfigurationProperties(prefix = "custom.hello")
public class HelloServiceProperties implements IHelloServiceProperties {

    private String message;

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
