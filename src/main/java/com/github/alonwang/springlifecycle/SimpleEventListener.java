package com.github.alonwang.springlifecycle;

import lombok.extern.java.Log;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Log
@Component
public class SimpleEventListener implements ApplicationListener {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        log.info("event: ---------------[" + event.getClass().getSimpleName() + "]---------------");
    }
}
