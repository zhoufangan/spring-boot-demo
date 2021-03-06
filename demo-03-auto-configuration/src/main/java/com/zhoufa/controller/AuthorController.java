package com.zhoufa.controller;

import com.zhoufa.auto_config.AuthorSetting.IAuthorSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@Controller
@RequestMapping("/author/")
public class AuthorController {

    @Autowired
    private IAuthorSetting authorSetting;
    @Autowired
    private CharacterEncodingFilter characterEncodingFilter;

    // http://127.0.0.1:8080/win/author/queryAuthor.htm
    @RequestMapping("queryAuthor.htm")
    @ResponseBody
    public String queryAuthor() {
        return "name=[" + authorSetting.getName() + "], age=[" + authorSetting.getAge() + "]";
    }

    // http://127.0.0.1:8080/win/queryEncoding.htm
    @RequestMapping("queryEncoding.htm")
    @ResponseBody
    public String queryEncoding() {
        return "encoding=[" + characterEncodingFilter.getEncoding() + "], forceEncoding=[" + characterEncodingFilter.isForceRequestEncoding() + "]";
    }
}
