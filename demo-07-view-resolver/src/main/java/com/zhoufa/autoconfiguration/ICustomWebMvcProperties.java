package com.zhoufa.autoconfiguration;

import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/5.
 */
public interface ICustomWebMvcProperties {

    List<String> getViewMediaTypeNames();

    enum ViewMediaType {

        json("application/json; charset=utf-8"),
        velocity("text/html; charset=utf-8");

        private String contentType;

        ViewMediaType(String contentType) {
            this.contentType = contentType;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }
    }

}
