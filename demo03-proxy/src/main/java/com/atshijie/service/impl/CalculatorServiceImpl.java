package com.atshijie.service.impl;

import com.atshijie.service.CalculatorService;
import com.atshijie.service.ComputerService;
import org.springframework.stereotype.Service;

@Service("CalculatorService")
public class CalculatorServiceImpl implements CalculatorService, ComputerService {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }

    @Override
    public void methodA() {
        System.out.println("methodA");
    }
}
