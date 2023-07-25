package com.aslihanhasar.practices.Java101.firstWeek.armstrongNumbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, tempNumber, remainder, product, i;
        int digitCounter = 0;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        tempNumber = number;
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCounter++;
        }

        tempNumber = number;
        while (tempNumber > 0) {
            remainder = tempNumber % 10;
            product = 1;
            for (i = 1; i <= digitCounter; i++) {
                product *= remainder;
            }
            sum += product;
            tempNumber /= 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.print(number + " is not an Armstrong Number.");
        }
    }
}
