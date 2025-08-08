package pro.sky.HW271.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW271.calculator.service.CounterService;

@RestController
@RequestMapping("/calculator")
public class ExampleController {
    private final CounterService counterService;

    public ExampleController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/counter")
    public String count() {
        counterService.countdown();
        return "Количество запросов: " + counterService.getCount();
    }
/*
    @GetMapping("/greetings")
    public String greetings(@RequestParam("name") String name, @RequestParam("lastName") String lastName) {
        return "Hello, " + name + " " + lastName;
    }
*/
    @GetMapping("/plus")
    public String result(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);
        String result = num1 + " + " + num2 + " = " + String.valueOf(intNum1 + intNum2);
        return result;
    }
}
