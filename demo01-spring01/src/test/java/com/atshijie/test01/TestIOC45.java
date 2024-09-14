package com.atshijie.test01;

import com.atshijie.component45.Cat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC45 {
    private static ClassPathXmlApplicationContext context;
    @BeforeAll
    public static void init() {
        context = new ClassPathXmlApplicationContext("applicationContext45.xml");
    }

    @Test
    public void testGetBean() throws Exception{
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);

    }}
