package com.spring.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class MainController {
    @GetMapping("/main")
    public ResponseEntity<String> mainPage(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
