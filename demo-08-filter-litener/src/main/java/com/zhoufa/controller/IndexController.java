package com.zhoufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
@Controller
public class IndexController {

    @RequestMapping("/index.do")
    public String index(ModelMap model) {

        Map<String, Object> dog = new HashMap<>();
        dog.put("name", "happy");
        dog.put("age", 12);
        dog.put("color", "yellow");

        model.addAttribute("myDog", dog);

        System.out.println("zhoufangan");

        return "index";
    }

}
