package com.atguigu.test;

import com.atguigu.dao.ProductDao;
import com.atguigu.pojo.Product;
import com.atguigu.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class TestOrderService {

    @Autowired
    private OrderService orderService;

    @Test
    public void testShopBook() throws Exception{
        orderService.shopBook();
    }

}
