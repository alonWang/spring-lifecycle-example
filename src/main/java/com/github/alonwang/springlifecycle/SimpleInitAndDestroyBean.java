package com.github.alonwang.springlifecycle;

import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Log
@Component
public class SimpleInitAndDestroyBean {
    @Value("bean.value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        log.info("inject field: -----------["+this.getClass().getSimpleName()+"]----------");
    }

    @PostConstruct
    public void init(){
        log.info("postConstruct: -----------["+this.getClass().getSimpleName()+"]----------");

    }
    @PreDestroy
    public void destroy(){
        log.info("preDestroy: -----------["+this.getClass().getSimpleName()+"]----------");
    }
}
