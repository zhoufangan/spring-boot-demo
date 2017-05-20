package com.zhoufa.auto_config.HttpEncoding;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
@ConfigurationProperties(prefix = "pager.http.encode")
public class HttpEncodingProperties implements IHttpEncodingProperties {

    private Charset encoding = DEFAULT_CHARSET;
    private boolean forceEncoding = true;

    @Override
    public Charset getEncoding() {
        return this.encoding;
    }

    @Override
    public boolean getForceEncoding() {
        return this.forceEncoding;
    }

    public void setEncoding(Charset encoding) {
        this.encoding = encoding;
    }

    public void setForceEncoding(boolean forceEncoding) {
        this.forceEncoding = forceEncoding;
    }
}
