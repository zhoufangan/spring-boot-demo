package com.zhoufa.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author Created by zhoufangan on 2017/5/17.
 *         spring-boot 集成 service
 *         1.创建数据源
 *         2.创建sqlSessionFactory
 */
@Configuration
@ConfigurationProperties
public class DataSourceConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    @Order(-1)
    public DataSource dataSource() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", environment.getProperty("spring.datasource.name"));
        props.put("url", environment.getProperty("spring.datasource.url"));
        props.put("username", environment.getProperty("spring.datasource.username"));
        props.put("password", environment.getProperty("spring.datasource.password"));
        props.put("filters", environment.getProperty("spring.datasource.filters"));
        props.put("maxActive", environment.getProperty("spring.datasource.maxActive"));
        props.put("initialSize", environment.getProperty("spring.datasource.initialSize"));
        props.put("maxWait", environment.getProperty("spring.datasource.maxWait"));
        props.put("minIdle", environment.getProperty("spring.datasource.minIdle"));
        props.put("timeBetweenEvictionRunsMillis", environment.getProperty("spring.datasource.timeBetweenEvictionRunsMillis"));
        props.put("minEvictableIdleTimeMillis", environment.getProperty("spring.datasource.minEvictableIdleTimeMillis"));
        props.put("validationQuery", environment.getProperty("spring.datasource.validationQuery"));
        props.put("testWhileIdle", environment.getProperty("spring.datasource.testWhileIdle"));
        props.put("testOnBorrow", environment.getProperty("spring.datasource.testOnBorrow"));
        props.put("testOnReturn", environment.getProperty("spring.datasource.testOnReturn"));
        props.put("poolPreparedStatements", environment.getProperty("spring.datasource.poolPreparedStatements"));
        props.put("maxOpenPreparedStatements", environment.getProperty("spring.datasource.maxOpenPreparedStatements"));
        return DruidDataSourceFactory.createDataSource(props);
    }
}
