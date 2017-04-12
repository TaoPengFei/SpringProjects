package org.zheng.selftag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by zxb on 2017/4/7
 */
public class ThreadScopeTest {

    public static void main(String[] args) throws InterruptedException {
        final ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("主线程对象比较是否相同：" + (ac.getBean("cc") == ac.getBean("cc")));
        new Thread(() -> {
            Model model1 = (Model) ac.getBean("cc");
            System.out.println("线程一：model1.hash=" + System.identityHashCode(model1));
        }).start(); 

        new Thread(() -> {
            Model model2 = (Model) ac.getBean("cc");
            System.out.println("线程二：model2.hash=" + System.identityHashCode(model2));
        }).start();

    }
}
