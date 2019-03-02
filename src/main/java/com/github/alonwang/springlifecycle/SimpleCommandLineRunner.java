package com.github.alonwang.springlifecycle;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Log
@Component
public class SimpleCommandLineRunner implements CommandLineRunner {
    @Autowired
    private SimpleAspectBean simpleAspectBean;
    @Override
    public void run(String... args) throws Exception {
        simpleAspectBean.aroundMethod();

    }
}
