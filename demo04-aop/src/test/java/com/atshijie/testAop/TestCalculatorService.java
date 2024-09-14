package com.atshijie.testAop;


import com.atshijie.config.Demo04Config;
import com.atshijie.service.CalculatorService;

import com.atshijie.service.ComputerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
@SpringJUnitConfig(Demo04Config.class)
public class TestCalculatorService {
    @Autowired
    private CalculatorService calculatorService;
    @Autowired
    private ComputerService computerService;


    @Test
    public void testAdd(){
        System.out.println(calculatorService.add(10, 20));
        System.out.println(computerService.add(10,30));
//        System.out.println(calculatorService.div(10, 0) );


    }


}
