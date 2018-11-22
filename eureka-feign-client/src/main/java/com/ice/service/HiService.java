package com.ice.service;

import com.ice.config.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ice on 2018/11/16.
 */
@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign ;

    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}