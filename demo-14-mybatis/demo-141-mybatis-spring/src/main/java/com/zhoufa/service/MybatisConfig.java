package com.zhoufa.service;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author Created by zhoufangan on 2017/5/17.
 *         spring-boot 集成 service
 *         1.创建数据源
 *         2.创建sqlSessionFactory
 */
// 标注这是一个配置类
@Configuration
@PropertySource(
        value = {"config-mybatis.properties"},
        encoding = "GBK"
)
public class MybatisConfig {
    @Autowired
    private Environment environment;

    @Value("${jdbc.driver}")
    private String jdbcDriverClassName;
    @Value("jdbc.url")
    private String jdbcUrl;
    @Value("jdbc.username")
    private String jdbcUsername;
    @Value("jdbc.password")
    private String jdbcPassword;

    @Bean
    public DataSource dataSource() throws Exception {
        /*
        Properties props = new Properties();
        props.put("driverClassName", environment.getProperty("jdbc.driverClassName"));
        props.put("url", environment.getProperty("jdbc.url"));
        props.put("username", environment.getProperty("jdbc.username"));
        props.put("password", environment.getProperty("jdbc.password"));
        */

        Properties props = new Properties();
        props.put("driverClassName", jdbcDriverClassName);
        props.put("url", jdbcUrl);
        props.put("username", jdbcUsername);
        props.put("password", jdbcPassword);
        return DruidDataSourceFactory.createDataSource(props);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        // 指定数据源(这个必须有，否则报错)
        fb.setDataSource(ds);
        // 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        // 指定基包
        fb.setTypeAliasesPackage(environment.getProperty("service.typeAliasesPackage"));
        // 指定xml文件位置
        fb.setMapperLocations(
                new PathMatchingResourcePatternResolver()
                        .getResources(environment.getProperty("service.mapperLocations")));
        return fb.getObject();
    }
}
