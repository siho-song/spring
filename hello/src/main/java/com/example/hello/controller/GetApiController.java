package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //http://localhost:8080/api/get/hello
    public String getHello(){
        return "get hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

//    @GetMapping(path= "/path-variable/{name}")
//    public String pathVariable(@PathVariable String name){
//        System.out.println(" PathVariable : "+name);
//        return name;
//    }
//
    @GetMapping(path= "/path-variable/{name}")
    public String pathVariableId(@PathVariable(name= "name") String id, int pathId ){
        System.out.println(" PathVariable : "+id);
        System.out.println(1);
        return id;
    }
//
    @GetMapping(path= "/path-variable/{name}/{id}")
    public String pathVariableIdMany(@PathVariable(name="id") String id, @PathVariable(name="name") String name ){
        System.out.println(" PathVariable : "+id +","+name);
        return name+" "+id;
    }

    //https://www.google.com/search
    // ?q=intellij
    // &oq=intellij
    // &aqs=chrome..69i57j69i59l3j0i512j0i131i433i512j0i512l4.2220j0j15
    // &sourceid=chrome
    // &ie=UTF-8

    //?key=value&key2=value2

    //http://localhost:8080/api/get/query-param?user=show&email=thdtlgh234@gmail.com&age=27
    @GetMapping(path="/query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(stringStringEntry -> {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
            System.out.println("\n");

            sb.append(stringStringEntry.getKey()+"=" +stringStringEntry.getValue()+"\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param22")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name+" "+email+" "+age;
    }


//   //https://www.google.com/search
//    // ?q=intellij
//    // &oq=intellij
//    // &aqs=chrome..69i57j69i59l3j0i512j0i131i433i512j0i512l4.2220j0j15
//    // &sourceid=chrome
//    // &ie=UTF-8

//    query 문을 springboot에서 판단한다. 이후 해당 변수 (key) 에 있는 값들을 해당 객체에서 변수와 이름 매칭을 시켜준다.
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();

    }

}
