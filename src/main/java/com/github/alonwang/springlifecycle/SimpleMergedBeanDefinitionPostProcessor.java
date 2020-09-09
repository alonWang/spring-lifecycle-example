package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author alonwang
 * @date 2020/9/9 4:56 下午
 * @detail
 */
@Component
public class SimpleMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    private static final Logger logger = LoggerManager.getLogger(SimpleMergedBeanDefinitionPostProcessor.class);

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        logger.info("postProcessMergedBeanDefinition ----------------[" + beanName + "]------------------");

    }

    @Override
    public void resetBeanDefinition(String beanName) {
        logger.info("resetBeanDefinition ----------------[" + beanName + "]------------------");

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("postProcessBeforeInitialization ----------------[" + beanName + "]------------------");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("postProcessBeforeInitialization ----------------[" + beanName + "]------------------");
        return bean;
    }
}
