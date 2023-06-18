package com.example.calculator2;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add (int a, int b) {
        return a + b;
    }

    @Override
    public int minus (int a, int b) {
        return a - b;
    }

    @Override
    public int multiply (int a, int b) {
        return a * b;
    }

    @Override
    public int divide (int a, int b) {
        return a / b;
    }
}
