package com.atguigu.dao;

import com.atguigu.pojo.Product;

public interface ProductDao {

    Product findByPid(Integer pid);

    Integer getPriceByPid(int i);

    int updateSalesAndstockByPid(int pid, int count);
}
