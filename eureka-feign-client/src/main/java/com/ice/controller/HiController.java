package com.ice.controller;

import com.ice.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ice on 2018/11/16.
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "eureka-client",required = false) String name ){
        return hiService.sayHi(name);
    }
}