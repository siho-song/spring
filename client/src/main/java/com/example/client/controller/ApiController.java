package com.example.client.controller;


import com.example.client.dto.Req;
import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {
    private final RestTemplateService restTemplateService;

    public ApiController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/hello")
    public UserResponse getHello(){
        return restTemplateService.hello();
    }


    @GetMapping("/hi")
    public Req<UserResponse> getHi(){
//        return restTemplateService.post();
//        restTemplateService.exchange();
        return restTemplateService.genericExchange();
    }
}
