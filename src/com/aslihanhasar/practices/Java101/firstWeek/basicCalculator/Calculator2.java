package com.aslihanhasar.practices.Java101.firstWeek.basicCalculator;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, choice;
        System.out.print("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("""
                Select operation.
                1 - Add
                2 - Subtract
                3 - Multiply
                4 - Divide
                "Enter your choice (1/2/3/4):""");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                int sum = firstNumber + secondNumber;
                System.out.print(firstNumber + " + " + secondNumber + " = " + sum);
            }
            case 2 -> {
                int distinct = firstNumber - secondNumber;
                System.out.print(firstNumber + " + " + secondNumber + " = " + distinct);
            }
            case 3 -> {
                int multiply = firstNumber * secondNumber;
                System.out.print(firstNumber + " + " + secondNumber + " = " + multiply);
            }
            case 4 -> {
                if (secondNumber == 0) {
                    System.out.print("Error: Undefined Value");
                } else {
                    double division = (double) firstNumber / secondNumber;
                    System.out.print(firstNumber + " + " + secondNumber + " = " + division);
                }
            }
            default -> System.out.print("Invalid Input! Please, try again.");
        }
    }
}