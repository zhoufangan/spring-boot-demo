package com.zhoufa.autoconfiguration.hello;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
public class HelloService {

    private String msg;

    public HelloService(String msg) {
        this.msg = msg;
    }

    public String talk() {
        return this.msg;
    }

}
