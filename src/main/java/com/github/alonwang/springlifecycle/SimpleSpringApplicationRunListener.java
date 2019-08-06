package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class SimpleSpringApplicationRunListener extends EventPublishingRunListener {
    private static final Logger logger = LoggerManager.getLogger(SimpleSpringApplicationRunListener.class);
    public SimpleSpringApplicationRunListener(SpringApplication application, String[] args) {
        super(application, args);
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        super.environmentPrepared(environment);
        logger.info("environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        super.contextPrepared(context);
        logger.info("contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        super.contextLoaded(context);
        logger.info("contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        super.started(context);
        logger.info("started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        super.running(context);
        logger.info("running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        super.failed(context, exception);
        logger.info("failed");
    }
}
