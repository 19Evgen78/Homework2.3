package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    public int plusCalculator(int num1, int num2) {
        return num1 + num2;
    }
    public int minusCalculator(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplyCalculator(int num1, int num2) {
        return num1 * num2;
    }
    public String divideCalculator(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на ноль нельзя";
        }else{
            return String.valueOf((float) (num1 / num2));
        }
    }



}
