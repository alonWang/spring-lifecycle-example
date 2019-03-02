package com.github.alonwang.springlifecycle;

import lombok.extern.java.Log;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Log
@Component
public class SimpleAwareBean implements EnvironmentAware, BeanFactoryAware, ApplicationContextAware, BeanClassLoaderAware, ApplicationEventPublisherAware, BeanNameAware, ResourceLoaderAware, MessageSourceAware {


    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        logInfo("beanClassLoaderAware", classLoader);
    }

    private void logInfo(String progress, Object object) {
        log.info("Aware :--------------[" + progress + "]:[" + object.getClass().getSimpleName() + "]--------------");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logInfo("beanFactoryAware", beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        logInfo("beanNameAware", name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logInfo("applicationContextAware", applicationContext);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        logInfo("applicationEventPublisher", applicationEventPublisher);
    }

    @Override
    public void setEnvironment(Environment environment) {
        logInfo("environmentAware", environment);
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        logInfo("messageSourceAware", messageSource);
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        logInfo("resourceLoaderAware", resourceLoader);
    }

}
