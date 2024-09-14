package com.atshijie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("CalculatorServiceProxy")
public class CalculatorServiceProxy implements CalculatorService {

    @Autowired
    @Qualifier("CalculatorService")
    private CalculatorService calculatorService;

    @Override
    public int add(int i, int j) {
        // 核心方法之前要新增的功能
        System.out.println("add方法执行了,使用的实参是:"+i + "---" +j);
        // 目标对象的核心方法
        int result =calculatorService.add(i,j);
        // 核心方法之后要新增的功能
        System.out.println("add方法执行的结果是:"+result);

        return result;
    }

    @Override
    public int sub(int i, int j) {
        // 核心方法之前要新增的功能
        System.out.println("sub方法执行了,使用的实参是:"+i + "---" +j);
        // 目标对象的核心方法
        int result =calculatorService.sub(i,j);
        // 核心方法之后要新增的功能
        System.out.println("sub方法执行的结果是:"+result);

        return result;
    }

    @Override
    public int mul(int i, int j) {
        // 核心方法之前要新增的功能
        System.out.println("mul方法执行了,使用的实参是:"+i + "---" +j);
        // 目标对象的核心方法
        int result =calculatorService.mul(i,j);
        // 核心方法之后要新增的功能
        System.out.println("mul方法执行的结果是:"+result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        // 核心方法之前要新增的功能
        System.out.println("div方法执行了,使用的实参是:"+i + "---" +j);
        // 目标对象的核心方法
        int result =calculatorService.div(i,j);
        // 核心方法之后要新增的功能
        System.out.println("div方法执行的结果是:"+result);
        return result;
    }
}
