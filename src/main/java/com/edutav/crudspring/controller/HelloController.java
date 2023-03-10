package com.edutav.crudspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private static final String HELLO = "Hello!";

    @GetMapping
    public String hello() {
        return HELLO;
    }
    
}
