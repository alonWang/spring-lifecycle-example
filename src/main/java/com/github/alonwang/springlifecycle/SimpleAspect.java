package com.github.alonwang.springlifecycle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Log
@Aspect
@Component
public class SimpleAspect {
    @Before("execution(* com.github.alonwang.springlifecycle.SimpleBean.aroundMethod())")
    public void beforeMethod(JoinPoint joinPoint) {
        log.info("aspect: -----before method execute-----");
    }

    @After("execution(* com.github.alonwang.springlifecycle.SimpleBean.aroundMethod()))")
    public void afterMethod(JoinPoint joinPoint) {
        log.info("aspect: -----after method execute-----");
    }

    @Around("execution(* com.github.alonwang.springlifecycle.SimpleBean.aroundMethod()))")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        log.info("aspect: -----around------before method execute-----");
        Object result = proceedingJoinPoint.proceed();
        log.info("aspect: -----around------after method execute-----");
        return result;
    }
}
