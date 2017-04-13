package ru.geekbrains.java1.lesson6.animal;

import java.util.Random;

/**
 * Created by smeleyka on 12.04.17.
 */
public class Dog extends Animal {
    private static Random rand = new Random();

    public Dog(String name) {
        this.type = "Собака";
        this.name = name;
        this.runLength = (rand.nextInt(4) + 2) * 100;
        this.jumpHeight = (float) (rand.nextInt(20) + 1) / 10; //от 0.1 до 2.0
        this.swimLength = (rand.nextInt(4) + 1) * 10;
    }
}
