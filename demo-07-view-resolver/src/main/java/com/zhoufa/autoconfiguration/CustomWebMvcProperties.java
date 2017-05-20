package com.zhoufa.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/5.
 */
@Component
@ConfigurationProperties(prefix = "pager.web.mvc")
public class CustomWebMvcProperties implements ICustomWebMvcProperties {

    private String mediaTypes = ViewMediaType.json.name();

    private List<String> viewMediaTypeNames;

    @Override
    public List<String> getViewMediaTypeNames() {
        if (null == viewMediaTypeNames) {
            viewMediaTypeNames = new ArrayList<>();

            String[] types = mediaTypes.split(",");
            for (String media : types) {
                if (null == media || "".equals(media = media.trim())) {
                    continue;
                }
                viewMediaTypeNames.add(media);
            }
        }
        return this.viewMediaTypeNames;
    }

    public String getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
    }
}
