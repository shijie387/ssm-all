package com.atguigu.test;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class TestEmployeeMapper {
    private static EmployeeMapper employeeMapper;
    @BeforeAll
    public static void initEmployeeMapper() throws Exception{
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        // 获取配置文件的输入流
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory ssf  = ssfb.build(in);
        //SqlSessionFactory 创建一个Session对象
        SqlSession sqlSession = ssf.openSession();
        // 通过SqlSession 获得Mapper接口的对象
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
    }





}
