package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 Class 는 REST API 처리하는 Controller 라고 Spring에서 인식한다.
@RequestMapping("/api") // RequestMapping URI 를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") //http://localost:port/api/hello
    public String hello(){
        return "hello spring boot!";
    }

}
