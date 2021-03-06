package com.zhoufa.mybatis.pager;

/**
 * @author Created by zhoufangan on 2017/5/20.
 */
public class DialectForMysql implements Dialect {
    public static final String SELECT = "select";
    public static final String FROM = "from";
    public static final String ORDER_BY = "order by";
    public static final String UNION = "union";

    @Override
    public boolean supportsPaging() {
        return true;
    }

    @Override
    public String getSelectTotalSql(String targetSql) {
        String sql = targetSql.toLowerCase();
        StringBuilder sqlBuilder = new StringBuilder(sql);

        /*
        int orderByPos = 0;
        if ((orderByPos = sqlBuilder.lastIndexOf(ORDER_BY)) != -1) {
            sqlBuilder.delete(orderByPos, sqlBuilder.length());
        }
        */
        sqlBuilder.insert(0, "select count(1) as count from ( ").append(" ) as t");

        return sqlBuilder.toString();
    }

    @Override
    public String getSelectPagingSql(String targetSql, Pageable pageable) {
        StringBuilder sqlBuilder = new StringBuilder(targetSql);
        String orderRule = "";
        if (pageable.getSort() != null && pageable.getSort().size() > 0) {
            for (Sort sort : pageable.getSort()) {
                orderRule += "," + sort.getProperty() + " " + sort.getDirection();
            }
            orderRule = orderRule.replaceFirst(",", "");
        }

        sqlBuilder.insert(0, "select * from (");
        sqlBuilder.append(") tmp order by " + orderRule);
        sqlBuilder.append(" limit " + ((pageable.getPageNumber() - 1) * pageable.getPageSize())
                + "," + pageable.getPageSize());

        return sqlBuilder.toString();
    }
}
