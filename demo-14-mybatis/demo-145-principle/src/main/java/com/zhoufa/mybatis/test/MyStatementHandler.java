package com.zhoufa.mybatis.test;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author Created by zhoufangan on 2017/5/20.
 */
public class MyStatementHandler implements StatementHandler {

    @Override
    public Statement prepare(Connection connection, Integer integer) throws SQLException {
        return null;
    }

    @Override
    public void parameterize(Statement statement) throws SQLException {

    }

    @Override
    public void batch(Statement statement) throws SQLException {

    }

    @Override
    public int update(Statement statement) throws SQLException {
        return 0;
    }

    @Override
    public <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException {
        return null;
    }

    @Override
    public <E> Cursor<E> queryCursor(Statement statement) throws SQLException {
        return null;
    }

    @Override
    public BoundSql getBoundSql() {
        return null;
    }

    @Override
    public ParameterHandler getParameterHandler() {
        return null;
    }
}
