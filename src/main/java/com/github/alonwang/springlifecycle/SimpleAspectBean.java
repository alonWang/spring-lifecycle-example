package com.github.alonwang.springlifecycle;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
@Log
@Component
public class SimpleAspectBean {

    public void aroundMethod(){
        log.info("aspectBean : --------- target method invoke------------");
    }
}
