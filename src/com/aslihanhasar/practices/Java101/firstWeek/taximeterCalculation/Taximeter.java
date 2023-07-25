package com.aslihanhasar.practices.Java101.firstWeek.taximeterCalculation;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance;
        double taximeterPrice = 0;
        double pricePerKm = 2.20;
        int startPrice = 10;
        int minTaximeterPrice = 20;
        boolean priceMin;

        System.out.print("Enter the distance (km):");
        distance = input.nextDouble();

        taximeterPrice += (startPrice + (distance * pricePerKm));
        priceMin = taximeterPrice < minTaximeterPrice;
        taximeterPrice = priceMin ? minTaximeterPrice : taximeterPrice;
        System.out.print("Taksimeter Fare:" + taximeterPrice + " TL");
    }
}
