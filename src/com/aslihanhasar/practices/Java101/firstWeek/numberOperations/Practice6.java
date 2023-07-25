package com.aslihanhasar.practices.Java101.firstWeek.numberOperations;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Powers of 2: ");
        for (int i = 1; i < number; i *= 2) {
            System.out.println(i);
        }
    }

}
