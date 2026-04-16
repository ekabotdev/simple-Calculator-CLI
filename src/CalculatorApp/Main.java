package CalculatorApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter operator (+, _, *, /)");
        char operator = input.next().charAt(0);

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
                case '-':
                    result = num1 - num2;
                    break;
                    case '*':
                        result = num1 * num2;
                        break;
                        case '/':
                            if (num2 != 0) {
                               result = num1 / num2;
                            }else {
                                System.out.println("Cannot divide by zero");
                                return;
                            }
                            break;
                            default:
                                System.out.println("Invalid operator");
                                return;
        }
        System.out.println("The result is: " + result);
    }
}
