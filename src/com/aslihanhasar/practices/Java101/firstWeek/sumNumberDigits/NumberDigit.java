package com.aslihanhasar.practices.Java101.firstWeek.sumNumberDigits;

import java.util.Scanner;

public class NumberDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits of the number: " + sum);
    }
}
