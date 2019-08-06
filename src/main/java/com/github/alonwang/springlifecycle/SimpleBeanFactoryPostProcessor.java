package com.github.alonwang.springlifecycle;

import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    private static final Logger logger = LoggerManager.getLogger(SimpleBeanFactoryPostProcessor.class);
    /**
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beans
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beans.
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException in case of errors
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("beanFactoryPostProcessor: ----------------[" + beanFactory.getClass().getSimpleName() + "]------------------");
    }
}
