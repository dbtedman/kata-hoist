package com.danieltedman.hoist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HoistApplication {
    // TODO: Move actuator onto a different port as these endpoints wont be exposed to the web
    public static void main(String[] args) {
        SpringApplication.run(HoistApplication.class, args);
    }
}
