package com.zhoufa.controller;

import com.zhoufa.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/5.
 */
@Controller
public class PersonController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {

        Person single = new Person("周方安", 30);

        List<Person> people = new ArrayList<>();
        Person p1 = new Person("张三", 25);
        Person p2 = new Person("李四", 25);
        Person p3 = new Person("王五", 25);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        modelMap.addAttribute("singlePerson", single);
        modelMap.addAttribute("people", people);

        return "index";
    }

}
