package com.zhoufa.service;

import com.zhoufa.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/12.
 */
public interface IUserService {

    void insert(User entity);

    void delById(int id);

    void modifyById(Map<String, Object> params);

    User queryById(int id);

    User queryByUsername(String name);

    long queryCommonPagerCount(Map<String, Object> params);

    List<User> queryCommonPager(Map<String, Object> params);

    List<User> queryAll();

}
