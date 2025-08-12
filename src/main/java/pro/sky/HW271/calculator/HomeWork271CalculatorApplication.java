package pro.sky.HW271.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeWork271CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeWork271CalculatorApplication.class, args);
        // Ссылки на рабочее приложение:
        // http://localhost:8080/calculator
        // http://localhost:8080/calculator/plus?num1=5&num2=5
	}
}
