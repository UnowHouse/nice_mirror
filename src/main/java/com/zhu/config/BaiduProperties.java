package com.zhu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.config
 *  @文件名:   BaiduProperties
 *  @创建者:   Unow
 *  @创建时间:  2018/11/25 17:39
 *  @描述：    TODO
 */
@Component
@ConfigurationProperties("baidu.taken")
public class BaiduProperties {
    private String appId;
    private String apiKey;
    private String secretKey;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
