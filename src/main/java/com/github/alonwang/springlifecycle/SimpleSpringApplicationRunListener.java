package com.github.alonwang.springlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import lombok.extern.java.Log;

@Log
public class SimpleSpringApplicationRunListener extends EventPublishingRunListener {
    public SimpleSpringApplicationRunListener(SpringApplication application, String[] args) {
        super(application, args);
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        super.environmentPrepared(environment);
        log.info("environmentPrepared----------");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        super.contextPrepared(context);
        log.info("contextPrepared---------");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        super.contextLoaded(context);
        log.info("contextLoaded---------");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        super.started(context);
        log.info("started-------");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        super.running(context);
        log.info("running-------");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        super.failed(context, exception);
        log.info("failed-------");
    }
}
