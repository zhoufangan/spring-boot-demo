package com.zhoufa.data.autoconfiguration;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/11.
 */
public interface IDynamicDataSourceProperties {

    // 通用配置
    int initialSize = 1;
    int maxActive = 20;
    int minIdle = 1;
    int maxWait = 60000;
    String validationQuery = "SELECT 'x'";
    boolean testOnBorrow = false;
    boolean testOnReturn = false;
    boolean testWhileIdle = true;
    long timeBetweenEvictionRunsMillis = 60000;
    long minEvictableIdleTimeMillis = 25200000;
    boolean removeAbandoned = true;
    int removeAbandonedTimeout = 1800;
    boolean logAbandoned = true;
    String filters = "stat";


    String getMaster_url();

    String getMaster_username();

    String getMaster_password();

    String getSlaver_url();

    String getSlaver_username();

    String getSlaver_password();

}
