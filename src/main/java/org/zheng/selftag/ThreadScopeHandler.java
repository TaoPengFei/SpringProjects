package org.zheng.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Create by zxb on 2017/4/7
 */
public class ThreadScopeHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("thread", new ThreadScopeBeanDefinitionParser());
    }

}
