package com.aslihanhasar.practices.Java101.secondWeek.boxingGameSimulation;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            int counter = 1;
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("*********************************\n" +
                        "      ROUND " + counter + " HAS STARTED !!\n" +
                        "*********************************");
                if (isChance()) {
                    f1.health = f1.round(f2);
                    if (isWin()) {
                        break;
                    } else {
                        f2.health = f2.round(f1);
                        if (isWin()) {
                            break;
                        }
                    }
                    printInfo();
                } else {
                    f2.health = f2.round(f1);
                    if (isWin()) {
                        break;
                    } else {
                        f1.health = f1.round(f2);
                        if (isWin()) {
                            break;
                        }
                    }
                    printInfo();
                }
                counter++;
            }
            printInfo();
        } else {
            System.out.println("The weight categories of the boxers do not match.");
        }
    }

    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isChance() {
        double randomValue = Math.random() * 10;
        return (randomValue <= 5);
    }

    void printInfo() {
        System.out.println("------------------------------------");
        System.out.println(this.f1.nickName + " 's remaining health:  " + this.f1.health);
        System.out.println(this.f2.nickName + " 's remaining health:  " + this.f2.health);
        System.out.println("------------------------------------");
    }

    boolean isWin() {
        if (f1.health <= 0) {
            f1.health = 0;
            System.out.println("The winner is " + f2.nickName + " !");
            return true;
        } else if (f2.health <= 0) {
            f2.health = 0;
            System.out.println("The winner is " + f1.nickName + " !");
            return true;
        }
        return false;
    }
}
