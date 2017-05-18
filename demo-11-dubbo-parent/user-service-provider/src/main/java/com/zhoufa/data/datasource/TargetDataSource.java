package com.zhoufa.data.datasource;

import java.lang.annotation.*;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/11.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface TargetDataSource {

    // 默认主库
    DataSourceTypes dataSourceType() default DataSourceTypes.MASTER;
}