package com.ice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by allin on 2018/11/13.
 */
@RestController
public class HiController {
    @Value("${server.port}")
    private String port ;

    @GetMapping("/hi")
    public String home(@RequestParam String name ){
        return "hi + " + name + ",i am client2 from port:" + port ;
    }

}
