package com.example.springSkaffold.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String test(){
        return "Test " + environment.getProperty("SPRING_PROFILES_ACTIVE");
    }
}
