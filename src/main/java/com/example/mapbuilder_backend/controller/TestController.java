package com.example.mapbuilder_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/hello-world2")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping(value = "/hello-world-2")
    public String helloWorld2(){
        return "Hello World 2!";
    }
}
