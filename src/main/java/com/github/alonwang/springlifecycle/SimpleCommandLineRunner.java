package com.github.alonwang.springlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Log
@Component
public class SimpleCommandLineRunner implements CommandLineRunner {
    @Autowired
    private SimpleBean simpleBean;
    @Override
    public void run(String... args) throws Exception {
        simpleBean.aroundMethod();

    }
}
