package com.danieltedman.hoist.web.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/api")
public class APIIndexController {
    @GetMapping(path = "/")
    public ResponseEntity<HashMap<String, String>> index() {
        final HashMap<String, String> result = new HashMap<>();
        result.put("Hello", "World!");
        return ResponseEntity.ok(result);
    }
}
