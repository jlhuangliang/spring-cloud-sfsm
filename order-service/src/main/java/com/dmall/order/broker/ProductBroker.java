package com.dmall.order.broker;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service", fallback = HystrixClientFallback.class)
public interface ProductBroker {

    @RequestMapping("/products/{productId}")
    Product getProductDetial(@PathVariable("productId") String productId);

}

