package com.zhoufa.autoconfiguration;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
public interface IVelocityProperties {

    String getInputEncoding();

    String getOutputEncoding();

    String getResourceLoaderPath();

    boolean isCache();

    String getPrefix();

    String getSuffix();

    String getContentType();

    boolean isExposeSpringMacroHelpers();

    boolean isExposeRequestAttributes();

    String getRequestContextAttribute();

    String getToolboxConfigLocation();

    String getDateToolAttribute();

    String getNumberToolAttribute();


}
