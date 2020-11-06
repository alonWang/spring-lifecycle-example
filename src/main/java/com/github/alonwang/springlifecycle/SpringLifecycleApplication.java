package com.github.alonwang.springlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLifecycleApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringLifecycleApplication.class, args);
    }

}
