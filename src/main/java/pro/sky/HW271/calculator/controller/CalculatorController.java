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
    //public String result1(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
    public String result(@RequestParam(required=false) String num1, @RequestParam(required=false) String num2) {
        if (num1 == null)
            return "Введите параметр num1 (?num1=значение)";
        if (num2 == null)
            return "Введите параметр num2 (&num2=значение)";
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);
        return calculatorService.plus(intNum1, intNum2);
    }
}
