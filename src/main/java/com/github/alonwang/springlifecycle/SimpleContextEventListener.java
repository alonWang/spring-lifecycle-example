package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

@Component
public class SimpleContextEventListener implements ApplicationListener<ApplicationContextEvent> {
    private static final Logger logger = LoggerManager.getLogger(SimpleContextEventListener.class);

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        logger.info(event.getClass().getSimpleName());
    }


}
