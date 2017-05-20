package com.zhoufa.mybatis.pager;

/**
 * @author Created by zhoufangan on 2017/5/20.
 *         数据库方言
 */
public interface Dialect {
    /**
     * 数据库本身是否支持分页当前的分页查询方式
     * 如果数据库不支持的话，则不进行数据库分页
     *
     * @return true：支持当前的分页查询方式
     */
    boolean supportsPaging();

    /**
     * 将sql转换为分页SQL，分别调用分页sql
     *
     * @param targetSql SQL语句
     * @param offset    开始条数
     * @param limit     每页显示多少纪录条数
     * @param sort      排序的字段
     * @param order     asc or desc
     * @return 分页查询的sql
     */
    String getSelectPagingSql(String targetSql, Pageable pageable);

    /**
     * 将sql转换为总记录数SQL
     *
     * @param targetSql SQL语句
     * @return 总记录数的sql
     */
    String getSelectTotalSql(String targetSql);
}
