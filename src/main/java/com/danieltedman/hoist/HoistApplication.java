package com.danieltedman.hoist;

import com.danieltedman.hoist.internal.gateway.time.TimeGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HoistApplication {
    private static final Logger log = LoggerFactory.getLogger(HoistApplication.class);

    // TODO: Move actuator onto a different port as these endpoints wont be exposed to the web
    public static void main(String[] args) {
        log.info("Starting application");
        SpringApplication.run(HoistApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    @Bean
    public TimeGateway timeGateway() {
        return new TimeGateway();
    }

    // TODO: Bean our universe
}
