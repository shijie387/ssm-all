package com.atguigu.test;

import com.atguigu.service.CheckOutService;
import com.atguigu.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class TestCheckOutService {

    @Autowired
    private CheckOutService checkOutService;

    @Test
    public void testShopBook() throws Exception{
        checkOutService.checkOut();
    }

}
