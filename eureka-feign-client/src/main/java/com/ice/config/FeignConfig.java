package com.ice.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by ice on 2018/11/16.
 * 重写FeignClientsConfiguration类中的bean，覆盖默认配置bean，从而达到自定义配置的目的。
 * 例如：Feign默认的配置在请求失败后重新次数为0，即不重试（Retryer.NEVER_RETRY）。
 * 如果希望在请求失败后能够重试，这时需要写一个配置FeignConfig类，在该类中注入Retryer的bean，覆盖掉默认的Retryer的bean，
 * 并将FeignConfig指定为FeignClient的配置类。
 */
@Configuration
public class FeignConfig {

    /**
     * 通过覆盖了默认的Retryer的bean，更改了该FeignClient的请求失败重试策略，重试间隔为100毫秒，最大重试时间为1秒，重试次数为5次。
     * @return Retryer
     */
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, SECONDS.toMillis(1),5);
    }

}
