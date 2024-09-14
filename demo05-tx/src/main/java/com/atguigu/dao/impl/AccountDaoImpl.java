package com.atguigu.dao.impl;

import com.atguigu.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl  implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int updateBanlanceByAid(int aid, Integer totalPrice) {
        String sql = """
                update
                    account 
                set 
                    balance = balance - ?
                where 
                    aid = ?
                """;
        return jdbcTemplate.update(sql,totalPrice,aid);
    }
}
