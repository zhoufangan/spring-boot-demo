package com.zhoufa.controller;

import com.zhoufa.autoconfiguration.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@Controller
@RequestMapping("/hello/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("index.htm")
    @ResponseBody
    public String index() {
        return helloService.talk();
    }

}
