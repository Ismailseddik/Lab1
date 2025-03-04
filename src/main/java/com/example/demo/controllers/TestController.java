package com.example.demo.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    @PostMapping("/post")
    public String sayPost(){
        return "Post";
    }
    @DeleteMapping("/delete")
    public String sayDelete(){
        return "Delete";
    }
    @PutMapping("/put")
    public String sayPut(){
        return "Put";
    }
}
