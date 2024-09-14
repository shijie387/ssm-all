package com.atshijie.testProxy;


import com.atshijie.service.CalculatorService;
import com.atshijie.service.ComputerService;
import com.atshijie.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDKProxy {
   @Test
   public void testProxy() throws Exception{
       CalculatorService calculatorService = new CalculatorServiceImpl();

       CalculatorService calculatorServiceProxy = (CalculatorService) Proxy.newProxyInstance(
               calculatorService.getClass().getClassLoader(),
               calculatorService.getClass().getInterfaces(),
               (Object proxy, Method method, Object[] args) -> {


                   /*
                    * Object proxy,    代理对象
                    * Method method,   要增强的目标的核心方法
                    * Object[] args    调用时传入的实参数组
                    * */

                   Object result = null;
                   try {
                       // 前置的扩展功能
                       System.out.println("前置扩展功能");
                       // 目标对象的核心方法
                       result = method.invoke(calculatorService, args);
                       // 后置的扩展功能
                       System.out.println("后置扩展功能");
                   }catch (Exception e){
                       // 核心方法出现异常时的扩展功能
                       System.out.println("异常状态下的扩展功能");
                   }finally {
                       // 核心方法无论是否出现异常,都会扩展的功能
                       System.out.println("一定会执行的扩展功能");
                   }
                   return result;
               }
       );

       System.out.println(calculatorServiceProxy.add(10,20));
       System.out.println(calculatorServiceProxy.div(40,20));
   }
}
