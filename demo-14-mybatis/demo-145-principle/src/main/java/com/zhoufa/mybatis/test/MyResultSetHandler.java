package com.zhoufa.mybatis.test;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.resultset.ResultSetHandler;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/20.
 */
public class MyResultSetHandler implements ResultSetHandler {

    @Override
    public <E> List<E> handleResultSets(Statement statement) throws SQLException {
        return null;
    }

    @Override
    public <E> Cursor<E> handleCursorResultSets(Statement statement) throws SQLException {
        return null;
    }

    @Override
    public void handleOutputParameters(CallableStatement callableStatement) throws SQLException {

    }
}
