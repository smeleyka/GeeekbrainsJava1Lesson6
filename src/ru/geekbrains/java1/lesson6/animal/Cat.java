package ru.geekbrains.java1.lesson6.animal;

/**
 * Created by smeleyka on 12.04.17.
 */
public class Cat extends Animal{
    static int swimLenght = 0;

    public Cat(String name, String color, int runLength, int jumpHeight) {
        this.name=name;

    }

    @Override
    public void swim(int distance) {
        System.out.println("Я не умею плавать");
    }
}
