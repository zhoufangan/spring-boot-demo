package com.zhoufa.mybatis.pager;

/**
 * @author Created by zhoufangan on 2017/5/20.
 *         排序字段 和 排序规则
 */
public class Sort {

    private String property;
    private String direction;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
