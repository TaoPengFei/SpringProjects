package org.zheng.placeholder;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;

/**
 * Create by zxb on 2017/4/15
 */
public class PasswordPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        MutablePropertyValues propertyValues = beanFactory.getBeanDefinition("user").getPropertyValues();
        PropertyValue encryPassWordObj = propertyValues.getPropertyValue("password");
        if (encryPassWordObj == null || encryPassWordObj.getValue() == null) {
            return;
        }
        String encryPassword = ((TypedStringValue) encryPassWordObj.getValue()).getValue();
        //模拟解密
        String realPassword = encryPassword + "AAAAA";
        propertyValues.add("password", realPassword);
    }
}
