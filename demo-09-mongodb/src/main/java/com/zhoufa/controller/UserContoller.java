package com.zhoufa.controller;

import com.alibaba.fastjson.JSON;
import com.zhoufa.entity.User;
import com.zhoufa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/10.
 */
@Controller
@RequestMapping("/user/")
@ResponseBody
public class UserContoller {

    @Autowired
    private UserService userService;

    @RequestMapping("/insert.do")
    public String inser(String name, int age, boolean gender) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setGender(gender);
        userService.saveUser(user);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/queryAll.do")
    public String queryAll() {
        List<User> users = userService.findAll();
        return JSON.toJSONString(users);
    }

}
