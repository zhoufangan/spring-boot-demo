package com.zhoufa.controller;

import com.alibaba.fastjson.JSON;
import com.zhoufa.model.User;
import com.zhoufa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/11.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("insert.do")
    @ResponseBody
    public String insert(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) Integer gender) {
        User user = new User();
        user.setUserName(null == username ? "" : username);
        user.setUserAge(null == age ? 0 : age);
        user.setGender(null == gender ? 0 : gender);
        userService.insert(user);
        String json = JSON.toJSONString(user);
        return json;
    }

    @RequestMapping("delById.do")
    @ResponseBody
    public String delById(int id) {
        userService.delById(id);
        return "delete success!";
    }

    @RequestMapping("queryAll.do")
    @ResponseBody
    public String queryAll() {
        List<User> users = userService.queryAll();
        String json = JSON.toJSONString(users);
        return json;
    }

}
