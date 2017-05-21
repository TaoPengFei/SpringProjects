package org.zheng.samename;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by zxb on 2017/5/21
 */
public class CustomApplicationContext extends ClassPathXmlApplicationContext {

    public CustomApplicationContext(String... configLocations) throws BeansException {
        super(configLocations);
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        beanFactory.setAllowBeanDefinitionOverriding(false);
    }
}
