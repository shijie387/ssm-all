package com.atshijie.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;
import java.util.Arrays;

@Component
@Aspect
@Order(2)
public class ServiceAspect2 {



    @Before("com.atshijie.aspects.MyPointCuts.calculatorServicePointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();

        String modifier = Modifier.toString(signature.getModifiers());
        String name = signature.getName();

        System.out.println("service before, method is: " + modifier + " " + name + " parameters are:" + Arrays.toString(args));
    }

    @AfterReturning(value = "com.atshijie.aspects.MyPointCuts.calculatorServicePointCut()", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();

        String modifier = Modifier.toString(signature.getModifiers());
        String name = signature.getName();

        System.out.println("service returning, method is: " + modifier + " " + name + " parameters are:" + Arrays.toString(args)+ " result:" + result);
    }

    @AfterThrowing(value = "com.atshijie.aspects.MyPointCuts.calculatorServicePointCut()", throwing = "e")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception e) {
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();

        String modifier = Modifier.toString(signature.getModifiers());
        String name = signature.getName();

        System.out.println("service returning, method is: " + modifier + " " + name + " parameters are:" + Arrays.toString(args)+ " Exception:" + e);
    }

    @After(value = "com.atshijie.aspects.MyPointCuts.calculatorServicePointCut()")
    public void afterAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();

        String modifier = Modifier.toString(signature.getModifiers());
        String name = signature.getName();

        System.out.println("service final, method is: " + modifier + " " + name + " parameters are:" + Arrays.toString(args));
    }

    @Around("com.atshijie.aspects.MyPointCuts.calculatorServicePointCut()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String modifier = Modifier.toString(signature.getModifiers());
        String name = signature.getName();

        Object result = null;
        try{
            // 前置通知
            System.out.println("serviceAspect2 环绕通知, try语句核心方法前, 目标方法是:"+ modifier+ " "+ name +" 使用的实参是:"+ Arrays.toString(args)+" 即将执行");
            // 目标核心方法在此执行
            result= joinPoint.proceed(args);
            // 返回通知
            System.out.println("serviceAspect2 环绕通知, try语句核心方法后, 目标方法是:"+ modifier+ " "+ name +" 使用的实参是:"+ Arrays.toString(args)+" 执行结果是:"+ result);

        }catch (Throwable e){
            // 异常通知
            System.out.println("serviceAspect2 环绕通知, catch语句, 目标方法是:"+ modifier+ " "+ name +" 使用的实参是:"+ Arrays.toString(args)+" 出现异常,异常信息是:"+ e.getMessage());
        }finally {
            // 最终通知
            System.out.println("serviceAspect2 环绕通知, finally语句, 目标方法是:"+ modifier+ " "+ name +" 使用的实参是:"+ Arrays.toString(args)+" 执行结束");
        }
        return result;


    }
}