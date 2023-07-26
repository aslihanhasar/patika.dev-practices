package com.aslihanhasar.practices.Java101.firstWeek.palindromicNumbers;

import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int number) {
        int tempNumber = number;
        int reverseNumber = 0;
        int lastNumber;

        while (tempNumber > 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            System.out.println(isPalindrome(number));
        } while (number > 0);
    }
}
