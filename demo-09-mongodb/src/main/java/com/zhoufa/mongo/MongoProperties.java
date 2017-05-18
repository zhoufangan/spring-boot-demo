package com.zhoufa.mongo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/9.
 */
@Component
@ConfigurationProperties(prefix = "custom.mongo")
public class MongoProperties implements IMongoProperties {

    private String hosts;
    private boolean auth;
    private String username;
    private String password;

    private int connectionPerHost = 80;
    private int connectionTimeout = 6000;
    private int maxWaitTime = 6000;

    @Override
    public String getHosts() {
        return hosts;
    }

    @Override
    public boolean isAuth() {
        return auth;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int getConnectionPerHost() {
        return connectionPerHost;
    }

    @Override
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    @Override
    public int getMaxWaitTime() {
        return maxWaitTime;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConnectionPerHost(int connectionPerHost) {
        this.connectionPerHost = connectionPerHost;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public void setMaxWaitTime(int maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
    }
}
