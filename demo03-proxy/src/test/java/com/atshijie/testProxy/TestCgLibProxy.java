package com.atshijie.testProxy;

import com.atshijie.service.CalculatorService;

import com.atshijie.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestCgLibProxy {
    @Test
    public void testProxy(){
        // 目标对象
        CalculatorService calculatorService =new CalculatorServiceImpl();


        // 生成代理对象
        Enhancer enhancer =new Enhancer();
        // 设置父类
        enhancer.setSuperclass(calculatorService.getClass());

        // 设置回调函数   具体增强的规则
        enhancer.setCallback(new MethodInterceptor() {

            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                /*
                * Object obj,      代理对象
                * Method method,   目标核心方法 要被重写哪个方法
                * Object[] args,   实参
                * MethodProxy proxy 子类中重写方法
                * */
                Object res = null;

                try{
                    System.out.println("前置扩展");
                    // 目标核心方法执行
                    res = proxy.invokeSuper(obj,args);
                    System.out.println("后置扩展");
                }catch ( Exception e){
                    System.out.println("异常扩展");
                }finally {
                    System.out.println("最终扩展");
                }

                return res;
            }
        });
        // 生成代理对象
        CalculatorServiceImpl cglibProxy = (CalculatorServiceImpl)enhancer.create();
        // 用代理对象调用方法
        System.out.println(cglibProxy.add(10, 20));
        System.out.println(cglibProxy.sub(30, 20));


    }
}
