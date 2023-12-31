package com.dockerdemo.DockerDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class DemoController {
    @PostMapping(value = "/dummy")
    public ResponseEntity dummy() {
        return ResponseEntity.ok("Hello World");
    }
}
