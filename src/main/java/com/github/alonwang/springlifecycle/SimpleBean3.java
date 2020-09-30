package com.github.alonwang.springlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author alonwang
 * @date 2020/9/20 9:32 上午
 * @detail
 */
@Component
public class SimpleBean3 {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private SimpleBean2 simpleBean2;
}
