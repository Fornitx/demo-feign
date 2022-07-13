package com.example.feign.client;

import com.example.feign.commons.data.DemoRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunnerConfig {
    @Bean
    public CommandLineRunner commandLineRunner(DemoClient client) {
        return args -> {
            client.foo(new DemoRequest(3, "Foo"))
                .doOnNext(System.out::println)
                .block();
        };
    }
}
