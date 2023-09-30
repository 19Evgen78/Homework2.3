package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    private int num1;
    private int num2;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
        this.num1 = num1;
        this.num2 = num2;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public int plusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.plusCalculator(num1 , num2);
    }
    @GetMapping(path = "/calculator/minus")
    public int minusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minusCalculator(num1 , num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public int multiplyCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplyCalculator(num1 , num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divideCalculator(num1 , num2);
    }
}
