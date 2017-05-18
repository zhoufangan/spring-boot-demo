package com.zhoufa.autoconfiguration;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/5.
 */
public class JsonViewResolver implements ViewResolver {

    private View jsonView;

    public JsonViewResolver() {

    }

    public JsonViewResolver(JsonView jsonView) {
        this.jsonView = jsonView;
    }

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return this.jsonView;
    }

    public View getJsonView() {
        return jsonView;
    }

    public void setJsonView(View jsonView) {
        this.jsonView = jsonView;
    }
}
