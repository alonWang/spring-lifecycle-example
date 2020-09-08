package com.github.alonwang.springlifecycle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {
    private static final Logger logger = LoggerManager.getLogger(SimpleAspect.class);
    @Before("execution(* com.github.alonwang.springlifecycle.SimpleBean.aroundMethod())")
    public void beforeMethod(JoinPoint joinPoint) {
        logger.info("aspect: -----before method execute-----");
    }

    @After("execution(* com.github.alonwang.springlifecycle.SimpleBean.aroundMethod()))")
    public void afterMethod(JoinPoint joinPoint) {
        logger.info("aspect: -----after method execute-----");
    }

    @Around("execution(* com.github.alonwang.springlifecycle.SimpleBean.aroundMethod()))")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        logger.info("aspect: -----around------before method execute-----");
        Object result = proceedingJoinPoint.proceed();
        logger.info("aspect: -----around------after method execute-----");
        return result;
    }
}
