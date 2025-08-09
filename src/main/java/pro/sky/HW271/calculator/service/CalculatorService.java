package pro.sky.HW271.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private int count;

    // Сложить два числа и вернуть результат в формате “5 + 5 = 10”
    public String plus(int num1, int num2) {
        String result = num1 + " + " + num2 + " = " + String.valueOf(num1 + num2);
        return result;
    }
}