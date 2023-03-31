package com.example.server.controller;


import com.example.server.dto.Req;
import com.example.server.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Slf4j
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

//    https://openapi.naver.com/v1/search/local.json
//    ?query=\xea\xb0\x88\xeb\xb9\x84\xec\xa7\x91
//    &display=10
//    &start=1
//    &sort=random
    @GetMapping("/naver")
    public String naver(){

        String query = "중국집";
//        String encode = Base64.getEncoder().encodeToString(query.getBytes(StandardCharsets.UTF_8));

        URI uri = UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path("/v1/search/local.json")
                .queryParam("query",query)
                .queryParam("display",10)
                .queryParam("start",1)
                .queryParam("sort","random")
                .encode()
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<Void> req = RequestEntity.get(uri)
                .header("X-Naver-Client-Id","JHr433RmJgTYeDhgdJSm")
                .header("X-Naver-Client-Secret","IlPOX18987")
                .build();

        ResponseEntity<String> result = restTemplate.exchange(req,String.class);
        return result.getBody();

    }


    @GetMapping("/hello")
    public User hello(@RequestParam String name, @RequestParam int age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

//    @PostMapping("/user/{userId}/name/{userName}")
//    public User post(@RequestBody User user,
//                     @PathVariable int userId,
//                     @PathVariable String userName,
//                     @RequestHeader("x-authorization") String authorization,
//                     @RequestHeader("custom-header") String customHeader)
//    {
//        log.info("userId : {} , userName : {}",userId,userName);
//        log.info("x-authorization : {} ",authorization);
//        log.info("custom-header : {} ",customHeader);
//        log.info("client req : {}",user);
//        return user;
//    }

    @PostMapping("/user/{userId}/name/{userName}")
    public Req<User> post(
//                     HttpEntity<String> entity,
                     @RequestBody Req<User> user,
                     @PathVariable int userId,
                     @PathVariable String userName,
                     @RequestHeader("x-authorization") String authorization,
                     @RequestHeader("custom-header") String customHeader)
    {
//        log.info("httpentity : {}",entity.getBody());
        //디버깅가능
        log.info("userId : {} , userName : {}",userId,userName);
        log.info("x-authorization : {} ",authorization);
        log.info("custom-header : {} ",customHeader);
        log.info("client req : {}",user);

        Req<User> response = new Req<>();
        response.setHeader(new Req.Header());
        response.setResBody(user.getResBody());
        return response;
    }
}
