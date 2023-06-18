package com.example.calculator2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService culculator = new CalculatorServiceImpl();

    @GetMapping("/")
    public  String greating() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String add (@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + culculator.add(num1, num2);
    }
    @GetMapping("/minus")
    public String minus (@RequestParam int num1, int num2) {
        return num1 + " - " + num2 + " = " + culculator.minus (num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply (@RequestParam int num1, int num2) {
        return num1 + " * " + num2 + " = " + culculator.multiply (num1, num2);
    }
    @GetMapping("/divide")
    public String divide (@RequestParam int num1, int num2) {
        if (num2 == 0) {
            return "На 0 делить нельзя";
        }
        return num1 + " / " + num2 + " = " + culculator.divide (num1,  num2);
    }

}
