package com.aslihanhasar.practices.Java101.firstWeek.numberOperations;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Powers of 4: ");
        for (int i = 1; i < number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5: ");
        for (int i = 1; i < number; i *= 5) {
            System.out.println(i);
        }
    }
}
