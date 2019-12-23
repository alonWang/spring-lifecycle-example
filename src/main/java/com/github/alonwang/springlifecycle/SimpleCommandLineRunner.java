package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerManager.getLogger(SimpleCommandLineRunner.class);
    @Autowired
    private SimpleBean simpleBean;
    @Override
    public void run(String... args) throws Exception {
        logger.info("before run");
        simpleBean.aroundMethod();
        logger.info("after run");
    }
}
