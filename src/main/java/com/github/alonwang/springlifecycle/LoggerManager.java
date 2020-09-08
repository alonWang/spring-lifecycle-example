package com.github.alonwang.springlifecycle;

import org.apache.logging.slf4j.Log4jLoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: alonwang
 * @create: 2019-08-06 09:18
 **/
@Component
public class LoggerManager {
    private static final Log4jLoggerFactory log4jLogFactory = new Log4jLoggerFactory();

    public static Logger getLogger() {
        return log4jLogFactory.getLogger("logger");
    }

    public static Logger getLogger(Class clazz) {
        return log4jLogFactory.getLogger(clazz.getSimpleName());
    }

}
