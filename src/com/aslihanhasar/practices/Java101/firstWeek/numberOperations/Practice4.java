package com.aslihanhasar.practices.Java101.firstWeek.numberOperations;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,sum=0;
        do{
            System.out.println("Enter the number: ");
            number = scanner.nextInt();
            if ((number % 2 == 1)) {
                System.out.println("Number: " +number);
                sum+=number;
            }
        } while (number>0);
        System.out.println("Sum: "+sum);
    }
}
