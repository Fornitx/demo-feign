package com.example.feign.server;

import com.example.feign.commons.DemoInterface;
import com.example.feign.commons.data.DemoRequest;
import com.example.feign.commons.data.DemoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/demo")
@Slf4j
public class FeignController implements DemoInterface {
    @Override
    public Mono<DemoResponse> foo(DemoRequest request) {
        log.info("request: {}", request);
        return Mono.fromCallable(() -> new DemoResponse(request.id(), request.str().repeat(request.id())));
    }
}
