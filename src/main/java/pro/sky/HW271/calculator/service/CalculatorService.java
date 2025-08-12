package pro.sky.HW271.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private int count;

    // Сложить два числа и вернуть результат
    public int plus(Integer num1, Integer num2) {
        int result = num1 + num2;
        return result;
    }

    // Вычесть два числа и вернуть результат
    public int minus(Integer num1, Integer num2) {
        int result = num1 - num2;
        return result;
    }

    // Умножить одно число на другое и вернуть результат
    public int multiply(Integer num1, Integer num2) {
        int result = num1 * num2;
        return result;
    }

    // Разделить одно число на другое и вернуть результат
    public int divide(Integer num1, Integer num2) {
        int result = num1 / num2;
        return result;
    }
}