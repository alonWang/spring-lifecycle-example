package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: alonwang
 * @create: 2019-08-06 09:16
 **/
@Component
public class SimpleSpringEventListener implements ApplicationListener<SpringApplicationEvent> {
    private static final Logger logger = LoggerManager.getLogger(SimpleSpringEventListener.class);

    @Override
    public void onApplicationEvent(SpringApplicationEvent event) {
        logger.info(event.getClass().getSimpleName());
    }
}
