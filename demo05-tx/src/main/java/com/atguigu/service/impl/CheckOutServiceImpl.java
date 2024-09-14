package com.atguigu.service.impl;

import com.atguigu.service.CheckOutService;
import com.atguigu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckOutServiceImpl  implements CheckOutService {
    @Autowired
    private OrderService orderService;
    // 张三同时为两个订单结账
    /* 一个事务方法中,调用了另一个或者多个其他事务方法 */
    @Override
    @Transactional
    public void checkOut() {
        //第一个订单
        orderService.shopBook();
        //第二个订单
        orderService.shopBook();
    }
}
