package com.example.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* com.example.demo.controllers.TestController.sayHello(..))")
    public void logBeforeGet() {
        System.out.println("Before API call: GET /hello is about to be executed.");
    }

    @After("execution(* com.example.demo.controllers.TestController.sayHello(..))")
    public void logAfterGet() {
        System.out.println("After API call: GET /hello execution completed.");
    }

    @Before("execution(* com.example.demo.controllers.TestController.sayPost(..))")
    public void logBeforePost() {
        System.out.println("Before API call: POST /Post is about to be executed.");
    }

    @After("execution(* com.example.demo.controllers.TestController.sayPost(..))")
    public void logAfterPost() {
        System.out.println("After API call: POST /Post execution completed.");
    }

    @Before("execution(* com.example.demo.controllers.TestController.sayDelete(..))")
    public void logBeforeDelete() {
        System.out.println("Before API call: DELETE /Delete is about to be executed.");
    }

    @After("execution(* com.example.demo.controllers.TestController.sayDelete(..))")
    public void logAfterDelete() {
        System.out.println("After API call: DELETE /Delete execution completed.");
    }

    @Before("execution(* com.example.demo.controllers.TestController.sayPut(..))")
    public void logBeforePut() {
        System.out.println("Before API call: PUT /Put is about to be executed.");
    }

    @After("execution(* com.example.demo.controllers.TestController.sayPut(..))")
    public void logAfterPut() {
        System.out.println("After API call: PUT /Put execution completed.");
    }
}
