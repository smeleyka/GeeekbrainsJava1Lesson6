package ru.geekbrains.java1.lesson6.animal;

/**
 * Created by smeleyka on 12.04.17.
 */
public class Animal {
    protected String name;
    protected String color;
    protected int runLength;
    protected int jumpHeight;
    protected int swimLength;



    public Animal(){}

    public Animal(String name, String color, int runLength, int jumpHeight, int swimLength) {
        this.name = name;
        this.color = color;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        this.swimLength = swimLength;
    }

    public Animal(String name, String color, int runLength, int jumpHeight) {
        this.name = name;
        this.color = color;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        swimLength=0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getSwimLength() {
        return swimLength;
    }

    public void run(int distance) {
        if (distance>runLength) System.out.println(name +" не может Пробежать такую дистанцию");
        else System.out.println(name+" пробежал "+distance+" метров.");
    }

    public void jump(int distance) {
        if (distance>runLength) System.out.println(name +" не может Прыгнуть так далеко");
        else System.out.println(name+" прыгнул на "+distance+" метров.");
    }

    public void swim(int distance) {
        if (distance>runLength) System.out.println(name +" не может Прыгнуть так далеко");
        else System.out.println(name+" прыгнул на "+distance+" метров.");
    }



}
