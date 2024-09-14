package com.atshijie.component9;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcesser implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanLifeCycle = beanFactory.getBeanDefinition("beanLifeCycle");
        MutablePropertyValues propertyValues = beanLifeCycle.getPropertyValues();
        propertyValues.addPropertyValue("name", "hei");
    }
}
