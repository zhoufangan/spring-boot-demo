package com.zhoufa.controller;

import com.zhoufa.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/5.
 */
@Controller
public class PersonController {

    @RequestMapping("/index.do")
    public String index(ModelMap modelMap) {
        Person person = new Person("周方安", 30);
        modelMap.addAttribute("person", person);
        return "index";

//        List<Person> people = new ArrayList<>();
//        Person p1 = new Person("张三", 25);
//        Person p2 = new Person("李四", 25);
//        Person p3 = new Person("王五", 25);
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//
//        List<Object> data = new ArrayList<>();
//        data.add(single);
//        data.add(people);
//        ResultModel ret = new ResultModel();
//        ret.setCode(0);
//        ret.setMessage("success");
//        ret.setData(data);
//        return ret;
    }

}
