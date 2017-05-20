package com.zhoufa.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/6.
 */
@Component
@ConfigurationProperties(prefix = "pager.web.mvc.velocity")
public class VelocityProperties implements IVelocityProperties {

    // VelocityConfigurer 配置属性
    private String inputEncoding = "UTF-8";
    private String outputEncoding = "UTF-8";
    private String resourceLoaderPath = "templates/";

    // VelocityViewResolver 配置属性
    private boolean cache = true;
    private String prefix = "templates/";// 视图文件的前缀，即存放的路径
    private String suffix = ".vm";// 视图文件的后缀名
    private String contentType = "text/html;charset=UTF-8";
    private boolean exposeSpringMacroHelpers = true;// 是否使用spring对宏定义的支持
    private boolean exposeRequestAttributes = true;// 是否开放request属性
    private String requestContextAttribute = "rc";// request属性引用名称

    // 工具配置
    private String toolboxConfigLocation = "templates/tools.xml";// toolbox配置文件路径
    private String dateToolAttribute = "date";// 日期函数名称
    private String numberToolAttribute = "number";// 数字函数名称

    @Override
    public String getInputEncoding() {
        return inputEncoding;
    }

    @Override
    public String getOutputEncoding() {
        return outputEncoding;
    }

    @Override
    public String getResourceLoaderPath() {
        return resourceLoaderPath;
    }

    @Override
    public boolean isCache() {
        return cache;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public boolean isExposeSpringMacroHelpers() {
        return exposeSpringMacroHelpers;
    }

    public boolean isExposeRequestAttributes() {
        return exposeRequestAttributes;
    }

    @Override
    public String getRequestContextAttribute() {
        return requestContextAttribute;
    }

    @Override
    public String getToolboxConfigLocation() {
        return toolboxConfigLocation;
    }

    @Override
    public String getDateToolAttribute() {
        return dateToolAttribute;
    }

    @Override
    public String getNumberToolAttribute() {
        return numberToolAttribute;
    }

    public void setInputEncoding(String inputEncoding) {
        this.inputEncoding = inputEncoding;
    }

    public void setOutputEncoding(String outputEncoding) {
        this.outputEncoding = outputEncoding;
    }

    public void setResourceLoaderPath(String resourceLoaderPath) {
        this.resourceLoaderPath = resourceLoaderPath;
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setExposeSpringMacroHelpers(boolean exposeSpringMacroHelpers) {
        this.exposeSpringMacroHelpers = exposeSpringMacroHelpers;
    }

    public void setExposeRequestAttributes(boolean exposeRequestAttributes) {
        this.exposeRequestAttributes = exposeRequestAttributes;
    }

    public void setRequestContextAttribute(String requestContextAttribute) {
        this.requestContextAttribute = requestContextAttribute;
    }

    public void setToolboxConfigLocation(String toolboxConfigLocation) {
        this.toolboxConfigLocation = toolboxConfigLocation;
    }

    public void setDateToolAttribute(String dateToolAttribute) {
        this.dateToolAttribute = dateToolAttribute;
    }

    public void setNumberToolAttribute(String numberToolAttribute) {
        this.numberToolAttribute = numberToolAttribute;
    }
}
