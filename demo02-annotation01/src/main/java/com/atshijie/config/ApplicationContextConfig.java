package com.atshijie.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.atshijie.cmponent.Cat;
import com.atshijie.cmponent.Mouse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = {"classpath:jdbc.properties","classpath:account.properties"})
@ComponentScan(basePackages = "com.atshijie")
@Import(ConfigA.class)
public class ApplicationContextConfig {

    @Bean("druidDataSource")
    @Scope("singleton")
    public DataSource getDataSource(
            @Value("${jdbc_url}") String url,
            @Value("${jdbc_driver}") String driver,
            @Value("${jdbc_username}")  String username,
            @Value("${jdbc_password}") String password
    ){
        DruidDataSource dataSource =new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driver);
        return dataSource;
    }

}
