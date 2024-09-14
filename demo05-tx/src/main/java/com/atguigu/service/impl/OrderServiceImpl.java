package com.atguigu.service.impl;

import com.atguigu.dao.AccountDao;
import com.atguigu.dao.ProductDao;
import com.atguigu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
//@Transactional  // 当前类下的所有方法都要增加事务控制功能
public class OrderServiceImpl  implements OrderService {
    @Autowired
    private ProductDao productDao;

    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional(
            timeout = 5 , // 默认值-1 表示不限制事务方法的执行时间
            // 所有的检查型异常发生时,都是不回滚
            rollbackFor = FileNotFoundException.class ,// 指定要发生回滚的检查型异常
            // 所有的运行时异常,都回滚
            noRollbackFor = ArithmeticException.class ,// 指定不发生回滚的运行时异常
            readOnly = false, // 事务是否是只读事务  true 事务内只能做查询  false事务内可以做增删改
            isolation = Isolation.DEFAULT ,// 控制事务的隔离级别
            propagation = Propagation.REQUIRES_NEW// 默认值  REQUIRED 连累  REQUIRES_NEW 不连累
    ) // 只为当前方法增加事务控制功能
    public void shopBook(){
        // 张三买书   1 号图书3本     2号图书5本
        Integer price1 =productDao.getPriceByPid(1);
        Integer price2 =productDao.getPriceByPid(2);


        // 修改图书的库存和销量
        productDao.updateSalesAndstockByPid(1 , 3);
        productDao.updateSalesAndstockByPid(2 , 5);

        // FileInputStream fis = new FileInputStream("d:/xxx.txt");
        /*System.out.println(1/0);*/

        // 计算张三的的花费
        Integer totalPrice = price1*3+ price2*5;
        // 让张三的金额减少
        accountDao.updateBanlanceByAid(1,totalPrice);
    }

}
