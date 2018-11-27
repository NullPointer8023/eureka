package com.ice.hystrix;

import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by ice on 2018/11/26.
 */

public interface ZuulFallbackProvider {
    public String getRoute();
    public ClientHttpResponse fallbackResponse();
}
