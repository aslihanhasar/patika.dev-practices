package com.aslihanhasar.practices.Java101.firstWeek.basicCalculator;

import java.util.Scanner;

public class Calculator1 {
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

        if (choice == 1) {
            int sum = firstNumber + secondNumber;
            System.out.print(firstNumber + " + " + secondNumber + " = " + sum);
        } else if (choice == 2) {
            int distinct = firstNumber - secondNumber;
            System.out.print(firstNumber + " + " + secondNumber + " = " + distinct);
        } else if (choice == 3) {
            int multiply = firstNumber * secondNumber;
            System.out.print(firstNumber + " + " + secondNumber + " = " + multiply);
        } else if (choice == 4) {
            if (secondNumber == 0) {
                System.out.print("Error: Undefined Value");
            } else {
                double division = (double) firstNumber / secondNumber;
                System.out.print(firstNumber + " + " + secondNumber + " = " + division);
            }
        } else {
            System.out.print("Invalid Input! Please, try again.");
        }
    }
}
