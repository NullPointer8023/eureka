package com.ice.controller;

import com.ice.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ice on 2018/11/15.
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "zbj") String name){
        return ribbonService.hi(name);
    }

    @Autowired
    private LoadBalancerClient loadBanlancer;

    //负载均衡器LoadBalancerClient是从Eureka Client获取服务注册列表信息的，并将服务注册列表信息缓存了一份。当调用choose时，根据负载均衡策略选择一个服务实例的信息，从而进行了负载均衡。
    @GetMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance instance = loadBanlancer.choose("eureka-client");
        return instance.getHost() + ":" + instance.getPort();
    }
}
