package com.atshijie.test01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

public class TestIOC6 {
    private static ApplicationContext applicationContext;


    @BeforeAll
    public static void initApplicationContext(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext6.xml");
    }

    @Test
    public void testGetBean() throws Exception{
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }
}
