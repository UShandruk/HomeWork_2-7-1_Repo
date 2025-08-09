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

    // Вычесть два числа и вернуть результат в формате “5 - 5 = 0”
    public String minus(int num1, int num2) {
        String result = num1 + " - " + num2 + " = " + String.valueOf(num1 - num2);
        return result;
    }

    // Умножить одно число на другое и вернуть результат в формате “5 * 5 = 25”
    public String multiply(int num1, int num2) {
        String result = num1 + " * " + num2 + " = " + String.valueOf(num1 * num2);
        return result;
    }

    // Разделить одно число на другое и вернуть результат в формате “5 / 5 = 1”
    public String divide(int num1, int num2) {
        String result = "";
        if (num2 == 0)
            result = "Ошибка деления на ноль.";
        else {
            result = num1 + " / " + num2 + " = " + String.valueOf(num1 / num2);
        }
        return result;
    }
}