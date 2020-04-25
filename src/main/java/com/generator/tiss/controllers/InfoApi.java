package com.generator.tiss.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/info")
public class InfoApi {

    @GetMapping("/ping")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("pong");
    }
}
