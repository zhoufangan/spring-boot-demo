package com.zhoufa.mongo;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/9.
 */
public interface IMongoProperties {

    String getHosts();

    boolean isAuth();

    String getUsername();

    String getPassword();

    int getConnectionPerHost();

    int getConnectionTimeout();

    int getMaxWaitTime();

}
