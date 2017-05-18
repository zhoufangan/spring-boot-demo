package com.zhoufa.service;

import com.zhoufa.dao.UserMapper;
import com.zhoufa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/12.
 */
@Component
public class UserService implements IUserService {

    @Autowired
    private UserMapper<User> userMapper;

    public void insert(User entity) {
        userMapper.insert(entity);
    }

    public void delById(int id) {
        userMapper.delById(id);
    }

    public void modifyById(Map<String, Object> params) {
        userMapper.modifyById(params);
    }

    public User queryById(int id) {
        return userMapper.queryById(id);
    }

    public User queryByUsername(String name) {
        return userMapper.queryByUsername(name);
    }

    public long queryCommonPagerCount(Map<String, Object> params) {
        return userMapper.queryCommonPagerCount(params);
    }

    public List<User> queryCommonPager(Map<String, Object> params) {
        return userMapper.queryCommonPager(params);
    }

    public List<User> queryAll() {
        return userMapper.queryAll();
    }

}
