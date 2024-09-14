package com.atguigu.dao.impl;

import com.atguigu.dao.ProductDao;
import com.atguigu.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl  implements ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Product findByPid(Integer pid) {
        String sql = """
                select
                    pid,
                    pname,
                    price,
                    sales,
                    stock
                from 
                    product
                where 
                    pid = ? 
                """;
        List<Product> productList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class), pid);

        return null != productList && productList.size()>0?productList.get(0):null;
    }

    @Override
    public Integer getPriceByPid(int i) {
        String sql = """
                select
                    price
                from 
                    product
                where 
                    pid = ? 
                """;
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, i);
        return price;
    }

    @Override
    public int updateSalesAndstockByPid(int pid, int count) {
        String sql = """
                update
                    product
                set
                    sales = sales + ?,
                    stock = stock - ?
                where 
                    pid = ?
                """;
        return jdbcTemplate.update(sql,count,count,pid);

    }
}
