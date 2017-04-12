package ru.geekbrains.java1.lesson6.animal;

import java.util.Random;

/**
 * Created by smeleyka on 12.04.17.
 */
public class Cat extends Animal{
    Random rand = new Random();
    static int swimLenght = 0;


    public Cat(){}
    public Cat(String name){
        this.name=name;
        this.color= "ordinary";
        this.runLength=(rand.nextInt(4)+2)*100;
    }
    public Cat(String name, String color, int runLength, int jumpHeight) {
        this.name=name;
        this.color=color;
        this.runLength=runLength;
        this.jumpHeight=jumpHeight;

    }

    @Override
    public void swim(int distance) {
        System.out.println(name+" не умеет плавать");
    }
}
