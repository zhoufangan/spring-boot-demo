package com.zhoufa.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;

import javax.sql.DataSource;

/**
 * @author Created by zhoufangan on 2017/5/17.
 *         spring-boot 集成 service
 *         1.创建数据源
 *         2.创建sqlSessionFactory
 */
// 标注这是一个配置类
@Configuration
@PropertySource(
        value = {"config-datasource.properties"},
        encoding = "GBK"
)
@ConfigurationProperties(prefix = "spring.datasource")
@AutoConfigureBefore
public class DataSourceConfiguration {


    // @Value("${spring.datasource.name}")
    private String name;
    // @Value("spring.datasource.url")
    private String url;
    // @Value("spring.datasource.username")
    private String username;
    // @Value("spring.datasource.password")
    private String password;

    private String filters;
    private int maxActive;
    private int initialSize;
    private long maxWait;
    private int minIdle;
    private long timeBetweenEvictionRunsMillis;
    private long minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxOpenPreparedStatements;

    @Bean
    @Order(-1)
    public DataSource dataSource() throws Exception {
        /*
        Properties props = new Properties();
        props.put("driverClassName", environment.getProperty("jdbc.driverClassName"));
        props.put("url", environment.getProperty("jdbc.url"));
        props.put("username", environment.getProperty("jdbc.username"));
        props.put("password", environment.getProperty("jdbc.password"));
        return DruidDataSourceFactory.createDataSource(props);
        */

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(name);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        dataSource.setFilters(filters);
        dataSource.setMaxActive(maxActive);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWait(maxWait);
        dataSource.setMinIdle(minIdle);
        dataSource.setTimeBetweenConnectErrorMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxOpenPreparedStatements(maxOpenPreparedStatements);
        return dataSource;
    }
}
