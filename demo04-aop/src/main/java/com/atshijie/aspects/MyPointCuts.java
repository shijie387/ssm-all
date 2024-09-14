package com.atshijie.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(public int com.atshijie.service..*(int, int))")
    public void calculatorServicePointCut() {}
}
