package org.zheng.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by zxb on 2017/4/15
 */
public class UserTest {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)ac.getBean("user");
        System.out.println(user);
    }
}
