package com.zhoufa.data.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/11.
 */
@Component
@ConfigurationProperties(prefix = "pager.mysql")
public class DynamicDataSourceProperties implements IDynamicDataSourceProperties {

    // master配置
    private String master_url;
    private String master_username;
    private String master_password;

    // slave配置
    private String slaver_url;
    private String slaver_username;
    private String slaver_password;

    public String getMaster_url() {
        return master_url;
    }

    public String getMaster_username() {
        return master_username;
    }

    public String getMaster_password() {
        return master_password;
    }

    public String getSlaver_url() {
        return slaver_url;
    }

    public String getSlaver_username() {
        return slaver_username;
    }

    public String getSlaver_password() {
        return slaver_password;
    }

    public void setMaster_url(String master_url) {
        this.master_url = master_url;
    }

    public void setMaster_username(String master_username) {
        this.master_username = master_username;
    }

    public void setMaster_password(String master_password) {
        this.master_password = master_password;
    }

    public void setSlaver_url(String slaver_url) {
        this.slaver_url = slaver_url;
    }

    public void setSlaver_username(String slaver_username) {
        this.slaver_username = slaver_username;
    }

    public void setSlaver_password(String slaver_password) {
        this.slaver_password = slaver_password;
    }
}
