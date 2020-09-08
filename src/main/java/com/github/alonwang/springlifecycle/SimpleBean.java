package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class SimpleBean implements EnvironmentAware, BeanFactoryAware, ApplicationContextAware, BeanClassLoaderAware, ApplicationEventPublisherAware, BeanNameAware, ResourceLoaderAware, MessageSourceAware, InitializingBean, DisposableBean {
    @Autowired
    private ApplicationContext applicationContext;
    private static final Logger logger = LoggerManager.getLogger(SimpleBean.class);
    @Value("${bean.value}")
    private String value;
    @Autowired
    private SimpleBean2 simpleBean2;

    public SimpleBean() {
        logger.info(String.format("SimpleBean constructor-------value: %s", value));
    }

    static {
        logger.info("SimpleBean class instantiation-------");
    }

    public String getValue() {
        return value;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        logInfo("beanClassLoaderAware", classLoader);
    }

    private void logInfo(String progress, Object object) {
        logger.info("Aware :--------------[" + progress + "]:[" + object.getClass().getSimpleName() + "]--------------");

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

    @PostConstruct
    public void init() {
        logger.info(String.format("SimpleBean--init--value: %s", value));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info(String.format("SimpleBean--afterPropertiesSet--value: %s", value));
    }

    @PreDestroy
    public void preDestroy() {
        logger.info(String.format("SimpleBean--preDestroy--value: %s", value));
    }

    @Override
    public void destroy() throws Exception {
        logger.info(String.format("SimpleBean--destroy--value: %s", value));
    }

    public void aroundMethod() {
        logger.info("aspectBean : --------- target method invoke------------");
    }
}
