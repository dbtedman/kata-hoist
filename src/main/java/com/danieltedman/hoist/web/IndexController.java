package com.danieltedman.hoist.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(path = {"/{path:^(?!api|static).*}", "/"})
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("<DOCTYPE html>" +
            "<html>" +
            "<head>" +
            "<script src='http://localhost:8000/bundle.min.js'></script>" +
            "</head>" +
            "</html>");
    }
}
