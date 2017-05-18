package com.zhoufa.auto_config.HttpEncoding;

import java.nio.charset.Charset;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/4.
 */
public interface IHttpEncodingProperties {

    Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    Charset getEncoding();

    boolean getForceEncoding();

}
