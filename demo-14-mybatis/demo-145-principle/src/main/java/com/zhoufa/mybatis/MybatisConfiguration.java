package com.zhoufa.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import com.zhoufa.mybatis.pager.DialectForSqlServer;
import com.zhoufa.mybatis.pager.PagingInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author Created by zhoufangan on 2017/5/19.
 */
@Configuration
@EnableTransactionManagement
@AutoConfigureAfter(value = {DataSourceConfiguration.class})
public class MybatisConfiguration implements IMybatisConfiguration, TransactionManagementConfigurer {

    @Autowired
    private Environment environment;

    @SuppressWarnings("ALL")
    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() {
        // 简单构建
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        // 加入自定义插件
//        PagingInterceptor pagingInterceptor = new PagingInterceptor();
//        pagingInterceptor.setDialect(new DialectForSqlServer());

        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.put("dialect", "SqlServer2012Dialect");
        properties.put("offsetAsPageNum", "");
        properties.put("rowBoundsWithCount", "");
        properties.put("pageSizeZero", "");
        properties.put("reasonable", "");
        properties.put("supportMethodsArguments", "");
        properties.put("countColumn", "");
        properties.put("", "");
        pageInterceptor.setProperties(properties);

        bean.setPlugins(
                new Interceptor[]{
                        // pagingInterceptor
                }
        );
        // 添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            Resource[] resources = resolver.getResources("classpath:com/zhoufa/mapper/*Mapper.xml");
            bean.setMapperLocations(resources);
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
