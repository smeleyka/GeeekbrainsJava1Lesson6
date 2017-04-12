package ru.geekbrains.java1.lesson6.animal;

/**
 * Created by smeleyka on 12.04.17.
 */
public abstract class Animal {
    protected String name;
    protected String color;
    protected int runLength=0;
    protected int jumpHeight=0;
    protected int swimLength=0;

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

    public void info() {
        System.out.println(name +" " +color  +" " + runLength  +" " + jumpHeight  +" " + swimLength);
    }

    public void run(int distance) {
        if (distance>runLength) System.out.println(name +" не может пробежать такую дистанцию");
        else System.out.println(name+" пробежал "+distance+" метров.");
    }

    public void jump(int distance) {
        if (distance>runLength) System.out.println(name +" не может прыгнуть так далеко");
        else System.out.println(name+" прыгнул на "+distance+" метров.");
    }

    public void swim(int distance) {
        if (distance>runLength) System.out.println(name +" не может Прыгнуть так далеко");
        else System.out.println(name+" прыгнул на "+distance+" метров.");
    }

}
