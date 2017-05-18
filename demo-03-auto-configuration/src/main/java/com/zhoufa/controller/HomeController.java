package com.zhoufa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Value("${custom.code.author}")
    private String codeAuthor;
    @Value("${custom.code.name}")
    private String codeName;

    @RequestMapping("home.htm")
    @ResponseBody
    public String queryHomePage() {
        return "welcome to spring boot!";
    }

    @RequestMapping("addCustomProperties.htm")
    @ResponseBody
    public String addCustomProperties() {
        return "代码作者=[" + codeAuthor + "], 项目名称=[" + codeName + "]";
    }
}
