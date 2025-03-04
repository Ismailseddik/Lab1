package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Before("execution(* com.example.demo.controllers.*.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        logger.info("Method called: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.example.demo.controllers.*.*(..))", returning = "result")
    public void logAfterMethod(JoinPoint joinPoint, Object result) {
        logger.info("Method executed: " + joinPoint.getSignature().getName() + " | Returned: " + result);
    }
}
