package com.zhoufa.data.autoconfiguration;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhoufa.data.datasource.DataSourceTypes;
import com.zhoufa.data.datasource.DynamicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/11.
 */
@SuppressWarnings("ALL")
@Configuration
@AutoConfigureAfter(IDynamicDataSourceProperties.class)
public class DynamicDataSourceAutoConfiguration {

    @Autowired
    private IDynamicDataSourceProperties properties;

    // 数据源必须优先被加载，值越小越优先
    @Order(-1)
    @Bean(name = "dataSource")
    @Primary
    public DataSource dataSource() {
        DruidDataSource master = buildDruidDataSource(properties.getMaster_url(), properties.getMaster_username(), properties.getMaster_password());
        DruidDataSource slaver = buildDruidDataSource(properties.getSlaver_url(), properties.getSlaver_username(), properties.getSlaver_password());

        // 初始化
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceTypes.MASTER.name(), master);
        targetDataSources.put(DataSourceTypes.SLAVER.name(), slaver);
        Object defaultTargetDataSource = master;

        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(targetDataSources);
        dataSource.setDefaultTargetDataSource(defaultTargetDataSource);
        return dataSource;
    }

    private DruidDataSource buildDruidDataSource(String url, String username, String password) {
        try {
            DruidDataSource druid = new DruidDataSource();
            druid.setUrl(url);
            druid.setUsername(username);
            druid.setPassword(password);

            druid.setInitialSize(IDynamicDataSourceProperties.initialSize);
            druid.setMaxActive(IDynamicDataSourceProperties.maxActive);
            druid.setMinIdle(IDynamicDataSourceProperties.minIdle);
            druid.setMaxWait(IDynamicDataSourceProperties.maxWait);
            druid.setValidationQuery(IDynamicDataSourceProperties.validationQuery);
            druid.setTestOnBorrow(IDynamicDataSourceProperties.testOnBorrow);
            druid.setTestOnReturn(IDynamicDataSourceProperties.testOnReturn);
            druid.setTestWhileIdle(IDynamicDataSourceProperties.testWhileIdle);
            druid.setTimeBetweenConnectErrorMillis(IDynamicDataSourceProperties.timeBetweenEvictionRunsMillis);
            druid.setMinEvictableIdleTimeMillis(IDynamicDataSourceProperties.minEvictableIdleTimeMillis);
            druid.setRemoveAbandoned(IDynamicDataSourceProperties.removeAbandoned);
            druid.setRemoveAbandonedTimeout(IDynamicDataSourceProperties.removeAbandonedTimeout);
            druid.setLogAbandoned(IDynamicDataSourceProperties.logAbandoned);
            druid.setFilters(IDynamicDataSourceProperties.filters);
            return druid;
        } catch (SQLException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
