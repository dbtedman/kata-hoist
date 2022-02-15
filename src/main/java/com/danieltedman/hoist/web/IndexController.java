package com.danieltedman.hoist.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public ResponseEntity<String> index() {
        // TODO: Switch this to loading an index.html page that references the compiled js
        // TODO: Match all GET requests that are not /api/** or /static/**
        return ResponseEntity.ok("Hello, World!");
    }
}
