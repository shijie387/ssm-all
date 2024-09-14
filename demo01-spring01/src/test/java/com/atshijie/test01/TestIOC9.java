package com.atshijie.test01;

import com.atshijie.component8.Dog;
import com.atshijie.component9.BeanLifeCycle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC9 {
    private static ClassPathXmlApplicationContext applicationContext;


    @BeforeAll
    public static void initApplicationContext(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext9.xml");
    }

    @Test
    public void testGetBean() throws Exception{
        BeanLifeCycle beanLifeCycle = applicationContext.getBean("beanLifeCycle", BeanLifeCycle.class);
        beanLifeCycle.work();
        applicationContext.close();
    }


}
