package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

public class SimpleSpringApplicationRunListener extends EventPublishingRunListener {
    private static final Logger logger = LoggerManager.getLogger(SimpleSpringApplicationRunListener.class);
    public SimpleSpringApplicationRunListener(SpringApplication application, String[] args) {
        super(application, args);
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        logger.info("environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        logger.info("contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        logger.info("contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        logger.info("started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        logger.info("running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        logger.info("failed");
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

    @Override
    public void starting() {
        logger.info("starting");
    }
}
