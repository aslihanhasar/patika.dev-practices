package com.aslihanhasar.practices.Java101.firstWeek.numberOperations;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 0, numberCounter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                numberCounter++;
                System.out.println(i);
            }
        }
        int average = sum / numberCounter;
        System.out.println("Average: " + average);
    }
}
