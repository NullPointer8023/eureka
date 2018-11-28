package com.ice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ice on 2018/11/28.
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${iceVersion}")
    String version ;

    @Value("${server.port}")
    private String port ;

    @RequestMapping(value = "/version")
    public String getVersion(){
        return version + "，port：" + port;
    }

}
