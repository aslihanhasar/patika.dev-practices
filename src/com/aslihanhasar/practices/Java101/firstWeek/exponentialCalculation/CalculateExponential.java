package com.aslihanhasar.practices.Java101.firstWeek.exponentialCalculation;

import java.util.Scanner;

public class CalculateExponential {
    public static void main(String[] args) {
        int x, n;
        int product = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (x) : ");
        x = scanner.nextInt();

        System.out.print("Enter the exponent number (n) : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            product *= x;
        }
        System.out.print(x + " to the power " + n + " : " + product);
    }
}
