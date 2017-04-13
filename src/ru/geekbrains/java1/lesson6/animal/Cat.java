package ru.geekbrains.java1.lesson6.animal;

import java.util.Random;

/**
 * Created by smeleyka on 12.04.17.
 */
public class Cat extends Animal {
    private static Random rand = new Random();

    public Cat(String name) {
        this.type = "Кот";
        this.name = name;
        this.runLength = (rand.nextInt(4) + 2) * 100;
        this.jumpHeight = (float) (rand.nextInt(50) + 20) / 10; //от 2.0 до 7.0
        this.swimLength = 0; //коты не умеют плавать
    }
}
