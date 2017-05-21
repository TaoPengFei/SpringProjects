package org.zheng.samename;

import org.springframework.context.ApplicationContext;

/**
 * Create by zxb on 2017/5/21
 */
public class Test {
    public static void main(String[] args){
        //按配置文件读取顺序，如果允许覆盖，那么打印I'am ClassB！覆盖原来的I'am ClassA
        ApplicationContext applicationContext = new CustomApplicationContext(new String[]{"beans.xml","beans2.xml"});
        BaseClass action = (BaseClass)applicationContext.getBean("action");
        action.say();
    }
}
