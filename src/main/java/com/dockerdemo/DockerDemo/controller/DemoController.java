package com.dockerdemo.DockerDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/dummy")
public class DemoController {
    @GetMapping
    public ResponseEntity dummy() {
        return ResponseEntity.ok("Hello World");
    }
}
