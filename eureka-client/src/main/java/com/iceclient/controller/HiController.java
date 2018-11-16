package com.iceclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ice on 2018/11/13.
 */
@RestController
public class HiController {
    @Value("${server.port}")
    private String port ;

    @GetMapping("/hi")
    public String home(@RequestParam String name ){
        return "hi + " + name + ",i am client1 from port:" + port ;
    }

}
