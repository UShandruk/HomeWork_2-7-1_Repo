package pro.sky.HW271.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW271.calculator.service.ExampleService;

@RestController
@RequestMapping("/example")
public class ExampleController {
    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать.";
    }

    @GetMapping("/counter")
    public String count() {
        exampleService.countdown();
        return "Количество запросов: " + exampleService.getCount();
    }

    @GetMapping("/greetings")
    public String greetings(@RequestParam("name") String name, @RequestParam("lastName") String lastName) {
        return "Hello, " + name + " " + lastName;
    }
}
