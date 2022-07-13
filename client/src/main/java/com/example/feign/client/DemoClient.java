package com.example.feign.client;

import com.example.feign.commons.DemoInterface;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient(value = "demo", url = "http://localhost:8080/demo")
public interface DemoClient extends DemoInterface {
}
