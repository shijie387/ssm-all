package com.atshijie.test01;

import com.atshijie.component7.Person;
import com.atshijie.component8.Dog;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC8 {
    private static ApplicationContext applicationContext;


    @BeforeAll
    public static void initApplicationContext(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext8.xml");
    }

    @Test
    public void testGetBean() throws Exception{
        Dog bean1 = applicationContext.getBean(Dog.class);
        Dog bean2 = applicationContext.getBean(Dog.class);
        System.out.println(bean1== bean2);


    }


}
