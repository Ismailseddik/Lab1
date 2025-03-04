package com.example.demo.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    @PostMapping("/Post")
    public String sayPost(){
        return "Post";
    }
    @DeleteMapping("/Delete")
    public String sayDelete(){
        return "Delete";
    }
    @PutMapping("/Put")
    public String sayPut(){
        return "Put";
    }
}
