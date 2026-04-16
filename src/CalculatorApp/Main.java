package CalculatorApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
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
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }
            System.out.println("The result is: " + result);
            System.out.println("Do you want to continue? (yes/no) :");
            String choice = input.next();

            if (choice.equalsIgnoreCase("no")) {
                running = false;
                System.out.println("Calculator exited.");
            }
        }
    }
}
