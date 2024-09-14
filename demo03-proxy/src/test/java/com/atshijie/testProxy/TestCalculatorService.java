package com.atshijie.testProxy;


import com.atshijie.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class TestCalculatorService {

    @Autowired
    @Qualifier("CalculatorServiceProxy")
    private CalculatorService calculatorService;

    @Test
    public void testAdd() throws Exception{
        int add = calculatorService.add(1, 2);
        System.out.println(add);
    }
}