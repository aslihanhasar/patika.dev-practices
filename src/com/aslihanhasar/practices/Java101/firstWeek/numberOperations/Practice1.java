package com.aslihanhasar.practices.Java101.firstWeek.numberOperations;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.println("Even Numbers: ");
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
