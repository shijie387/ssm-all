package com.atshijie.annotation;

import com.atshijie.controller.OrderController;
import com.atshijie.dao.OrderDao;
import com.atshijie.service.OrderService;
import com.atshijie.util.XXXUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.OrderUtils;

public class Test01 {

    private static ApplicationContext applicationContext;

    @BeforeAll
    public static void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testGetBean() throws Exception{
        OrderController orderController = applicationContext.getBean(OrderController.class);
        OrderService orderService = applicationContext.getBean(OrderService.class);
        OrderDao orderDao = applicationContext.getBean(OrderDao.class);
        XXXUtil xxxUtil = applicationContext.getBean(XXXUtil.class);

        System.out.println();
    }
}
