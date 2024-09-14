package com.atshijie.test01;

import com.atshijie.component1.Cat;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC1 {

    @Test
    public void testGetBean(){
        /*ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext();
        context1.setConfigLocation("applicationContext1.xml");
        context1.refresh();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Cat cat = context.getBean("cat", Cat.class);
//        Cat cat1 = (Cat)context.getBean("cat");
//        Cat cat2 = context.getBean(Cat.class);
        System.out.println(cat);
    }
}
