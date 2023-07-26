package com.aslihanhasar.practices.Java101.secondWeek.boxingGameSimulation;

public class Fighter {
    String nickName;
    int weight;
    int damage;
    int health;
    int block;

    Fighter(String nickName, int weight, int damage, int health, int block) {
        this.nickName = nickName;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        this.block = block;
    }

    int round(Fighter foe) {
        System.out.println(foe.nickName + " ==> " + nickName);
        if (isBlock()) {
            System.out.println(nickName + " BLOCKED THE MOVE! ");
            return health;
        } else {
            System.out.println(nickName + " FAILED TO BLOCK THE MOVE! ");
            return health - foe.damage;
        }
    }

    boolean isBlock() {
        double randomValue = Math.random() * 100;
        return randomValue <= block;
    }
}
