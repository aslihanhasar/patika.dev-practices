package com.aslihanhasar.practices.Java101.firstWeek.userLogin;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, answer;
        int password, newPassword;

        System.out.print("Enter your username: ");
        userName = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextInt();
        scanner.nextLine();

        if ((userName.equals("aslihan")) && (password == 123456789)) {
            System.out.print("You are successfully logged in.");
        } else if (!userName.equals("aslihan")) {
            System.out.print("Username not correct.");
        } else {
            System.out.print("Forgot password? To reset write yes.");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("Enter your new password: ");
                newPassword = scanner.nextInt();
                if (newPassword != password) {
                    System.out.print("Password Changed!");
                } else {
                    System.out.print("Your new password must be different from current password.");
                }
            }
        }
    }
}

