package ru.geekbrains.java1.lesson6;

import ru.geekbrains.java1.lesson6.animal.*;

import java.util.Random;

/**
 * Created by smeleyka on 13.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Бобик");

        cat1.info();
        cat2.info();
        dog1.info();
        dog2.info();

    }
}
