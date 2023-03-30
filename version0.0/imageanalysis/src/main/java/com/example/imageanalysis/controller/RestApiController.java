package com.example.imageanalysis.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class RestApiController {

    @GetMapping("/{pageNum}")
    public ResponseEntity mainPage(@PathVariable(name="pageNum") String pageNum){
        return ResponseEntity.status(HttpStatus.OK).body(pageNum);
    }


}
