package com.atshijie.test01;

import com.atshijie.component7.Person;
import com.atshijie.component7.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

public class TestIOC7 {
    private static ApplicationContext applicationContext;


    @BeforeAll
    public static void initApplicationContext(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext7.xml");
    }

    @Test
    public void testGetBean() throws Exception{
        Person person1 = applicationContext.getBean("person2", Person.class);
        System.out.println(person1);


    }


}
