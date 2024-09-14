package com.atshijie.service.impl;

import com.atshijie.dao.OrderDao;
import com.atshijie.dao.impl.OrderDaoImpl2;
import com.atshijie.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl  implements OrderService {
    /*
    * DI相关注解
    *   用于给属性赋值的注解
    *   熟练
    *   @Autowired 给bean类型的属性赋值 + @Qualifer
    *   @Value     给基础数据类型的属性赋值  可以通过 ${}读取properties配置文件中的信息给属性赋值
    *
    *   了解
    *   @Resource   =  @Autowired + @Qualifer
    *
    *
    *
    *
    * */

    /*
    * 1 先根据类型去IOC容器中匹配唯一的一个对象,给当前属性赋值
    * 2 如果根据类型 发现有多个对象可以匹配,这个时候,就使用当前的属性名作为ID确定使用哪个对象
    * 3 如果id也没有匹配成功报错
    * 4 @Autowired的 required = false ,那么,匹配失败也不报错,属性没有赋值
    * 5 @Autowired不依赖setter
    * 6 @Autowired 可以放在setter方法上和构造器上
    *
    * */
    //@Autowired(required = false)
    /*@Autowired
    @Qualifier("orderDao2")*/

    //@Resource(name ="orderDao2")
    @Autowired
    private OrderDao orderDao ;


    //@Autowired
    public void setOrderDao(OrderDao orderDao){
        this.orderDao= orderDao;
    }

    //@Autowired
    public OrderServiceImpl (OrderDao orderDao){
        this.orderDao=orderDao;
    }

    public OrderServiceImpl (){

    }
}
