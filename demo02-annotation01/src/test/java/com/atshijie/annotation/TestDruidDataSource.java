package com.atshijie.annotation;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.atshijie.config.ApplicationContextConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.Connection;

/*
 * 实例化容器对象
 * 读取配置文件/配置类上信息
 * 根据这些信息,实例化对象
 * */

//@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
@SpringJUnitConfig(ApplicationContextConfig.class)
public class TestDruidDataSource {

    @Autowired
    private DruidDataSource dataSource;

    @Test
    public void testGetConnection() throws Exception{
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
