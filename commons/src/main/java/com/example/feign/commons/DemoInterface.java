package com.example.feign.commons;

import com.example.feign.commons.data.DemoRequest;
import com.example.feign.commons.data.DemoResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

public interface DemoInterface {
    @PostMapping(value = "/foo",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    Mono<DemoResponse> foo(@RequestBody DemoRequest request);
}
