package com.aslihanhasar.practices.Java101.firstWeek.vatCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price, vatRatio, vatAmount;
        Scanner input = new Scanner(System.in);

        System.out.print("KDV'siz Ürün Fiyatı:");
        price = input.nextDouble();

        boolean betweenRange = (price > 0) && (price <= 1000);
        vatRatio = betweenRange ? 0.18 : 0.08;
        System.out.println("KDV Oranı:" + vatRatio);

        vatAmount = price * vatRatio;
        System.out.println("KDV Tutarı:" + vatAmount);
        System.out.print("KDV'li Ürün Fiyatı:" + (price + vatAmount));
    }
}
