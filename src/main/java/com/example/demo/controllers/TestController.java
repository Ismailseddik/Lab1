package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name", defaultValue = "User") String name) {
        return "hello "+name;
    }

    @PostMapping("/post")
    public String sayPost(@RequestParam(name = "name", defaultValue = "User") String name) {
        return "Post to "+name;
    }

    @DeleteMapping("/delete")
    public String sayDelete(@RequestParam(name = "name", defaultValue = "User") String name) {
        return "Delete from: "+name;
    }

    @PutMapping("/put")
    public String sayPut(@RequestParam(name = "name", defaultValue = "User") String name) {
        return "Put in : "+name;
    }
}
