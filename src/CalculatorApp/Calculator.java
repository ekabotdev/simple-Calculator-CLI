package CalculatorApp;

public class Calculator {
    public Double calculate(double num1, double num2, char operator) {

        switch (operator) {
            case '+':
                return num1 + num2;
                case '-':
                    return num1 - num2;
                    case '*':
                        return num1 * num2;
                        case '/':
                            if (num2 != 0) {
                                return num1 / num2;
                            }else {
                                System.out.println("Error: Cannot divide by zero");
                                return null;
                            }
            default:
                System.out.println("invalid operator");
                return null;
        }
    }
}
