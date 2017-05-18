package com.zhoufa.data.datasource;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/11.
 */
public class DynamicDataSourceContextHolder {

    /**
     * ThreadLocal可以看做是一个容器，容器里面存放着属于当前线程的变量。
     * 所以static就好了
     * <p>
     * 当前线程threadlocal:用来存储，主从数据源的key
     */
    private static ThreadLocal<String> contextHolder = new ThreadLocal<>();

    private static String DB_MASTER_NAME = "dataSourceKeyRW";
    private static String DB_SLAVER_NAME = "dataSourceKeyR";

    public static boolean existsDataSourceInContext() {
        String db = contextHolder.get();
        if (null == db) {
            return false;
        }
        return true;
    }

    public static String getCurrentDataSource() {
        String db = contextHolder.get();
        if (null == db) {
            return DB_MASTER_NAME;
        } else {
            return db;
        }
    }

    public static void setCurrentDataSource(DataSourceTypes type) {
        // 枚举类型直接用 == 比较即可，因为枚举本来就是单例模式的一种用法
        if (DataSourceTypes.MASTER == type) {
            contextHolder.set(DB_MASTER_NAME);
        } else {
            contextHolder.set(DB_SLAVER_NAME);
        }

    }

    public static void clearCurrentDataSource() {
        contextHolder.remove();
    }
}
