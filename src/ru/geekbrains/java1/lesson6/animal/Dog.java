package ru.geekbrains.java1.lesson6.animal;

import java.util.Random;

/**
 * Created by smeleyka on 12.04.17.
 */
public class Dog extends Animal{
    Random rand = new Random();
    int runLength = rand.nextInt(7)*100;


    public Dog(String name, String color, int runLength, int jumpHeight, int swimLength) {
        this.name = name;
        this.color = color;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        this.swimLength = swimLength;
    }
}
