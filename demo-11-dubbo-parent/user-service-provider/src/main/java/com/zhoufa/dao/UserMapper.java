package com.zhoufa.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 通用Mapper基类
 *
 * @author zhoufangan
 */
@Mapper
public interface UserMapper<T> {

    void insert(T entity);

    void delById(int id);

    void modifyById(Map<String, Object> params);

    T queryById(int id);

    long queryCommonPagerCount(Map<String, Object> params);

    List<T> queryCommonPager(Map<String, Object> params);

    List<T> queryAll();

    T queryByUsername(String name);
}
