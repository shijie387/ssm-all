package com.atshijie.annotation;

import com.atshijie.cmponent.Cat;
import com.atshijie.cmponent.User;
import com.atshijie.config.ApplicationContextConfig;
import com.atshijie.service.OrderService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

public class Test02 {
    private static AnnotationConfigApplicationContext applicationContext ;

    @BeforeAll
    public static void initApplication(){
        applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
    }

    @Test
    public void testGetBean() throws Exception{
        OrderService bean = applicationContext.getBean(OrderService.class);
        System.out.println(bean);

        DataSource druidDataSource = applicationContext.getBean("druidDataSource", DataSource.class);
        Connection connection = druidDataSource.getConnection();
        System.out.println(connection);


        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat);


        User bill = applicationContext.getBean("bill", User.class);
        System.out.println(bill);
        applicationContext.close();

    }

}
