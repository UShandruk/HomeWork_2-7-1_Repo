package pro.sky.HW271.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW271.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор.";
    }


    @GetMapping("/plus")
    public String methodPlus(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
    //public String methodPlus(@RequestParam int num1, @RequestParam int num2) {
        if (num1 == null)
            return "Введите параметр num1 (?num1=значение).";
        if (num2 == null)
            return "Введите параметр num2 (&num2=значение).";
        int resultInt = calculatorService.plus(num1, num2);
        String resultString = num1 + " + " + num2 + " = " + resultInt;
        return resultString;
    }

    @GetMapping("/minus")
    public String methodMinus(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
        if (num1 == null)
            return "Введите параметр num1 (?num1=значение).";
        if (num2 == null)
            return "Введите параметр num2 (&num2=значение).";
        int resultInt = calculatorService.minus(num1, num2);
        String resultString = num1 + " - " + num2 + " = " + resultInt;
        return resultString;
    }

    @GetMapping("/multiply")
    public String methodMultiply(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
        if (num1 == null)
            return "Введите параметр num1 (?num1=значение).";
        if (num2 == null)
            return "Введите параметр num2 (&num2=значение).";
        int result = calculatorService.multiply(num1, num2);
        String resultString = num1 + " * " + num2 + " = " + result;
        return resultString;
    }

    @GetMapping("/divide")
    public String methodDivide(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
        if (num1 == null)
            return "Введите параметр num1 (?num1=значение).";
        if (num2 == null)
            return "Введите параметр num2 (&num2=значение).";
        if (num2 == 0)
            return "Деление на ноль.";
        int result = calculatorService.divide(num1, num2);
        String resultString = num1 + " / " + num2 + " = " + result;
        return resultString;
    }
}
