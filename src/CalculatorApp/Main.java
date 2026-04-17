package CalculatorApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            double num1 = getNumber(scanner, "Enter first number: ");
            char operator = getOperator(scanner);
            double num2 = getNumber(scanner, "Enter second number: ");

            Double result = calculate(num1, num2, operator);

            if (result != null) {
                System.out.println("Result: " + result);
            }

            running = shouldContinue(scanner);
        }

        System.out.println("Calculator exited.");
    }

    // 🔢 Method to get number input
    public static double getNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    // ➕ Method to get operator
    public static char getOperator(Scanner scanner) {
        System.out.print("Enter operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    // Method to calculate result
    public static Double calculate(double num1, double num2, char operator) {

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
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return null;
                }

            default:
                System.out.println("Invalid operator.");
                return null;
        }
    }

    //  Method to check if user wants to continue
    public static boolean shouldContinue(Scanner scanner) {
        System.out.print("Do you want to continue? (yes/no): ");
        String choice = scanner.next();
        return !choice.equalsIgnoreCase("no");
    }
}