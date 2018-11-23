package com.ice.config;

import org.springframework.stereotype.Component;

/**
 * Created by ice on 2018/11/23.
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    /**
     * HiHystrix作为熔断器的逻辑处理类，需要实现EurekaClientFeign接口，并需要再接口方法sayHiFromClientEureka填下处理逻辑。
     * 同时在类上标注@Component注解，注入IOC容器中
     */
    @Override
    public String sayHiFromClientEureka(String name){
        return "hi,feign---client---" + name + ",sorry,error!" ;
    }
}
