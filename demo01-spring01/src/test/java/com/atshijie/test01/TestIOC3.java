package com.atshijie.test01;

import com.atshijie.component2.Cat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC3 {

    private static ClassPathXmlApplicationContext context;
    @BeforeAll
    public static void init() {
        context = new ClassPathXmlApplicationContext("applicationContext3.xml");
    }

    @Test
    public void testGetBean() throws Exception{
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);
    }
}
