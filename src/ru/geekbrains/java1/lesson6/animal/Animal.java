package ru.geekbrains.java1.lesson6.animal;

/**
 * Created by smeleyka on 12.04.17.
 */
public class Animal {
    protected String type;
    protected String name;
    protected int runLength;
    protected float jumpHeight;
    protected int swimLength;

    public void info() {
        if (swimLength == 0)
            System.out.println(type + " " + name + " умеет: бегать " + runLength + "м, прыгать " + jumpHeight + "м, не плавает");
        else
            System.out.println(type + " " + name + " умеет: бегать " + runLength + "м, прыгать " + jumpHeight + "м, плавать " + swimLength + "м");
    }

    public void run(int distance) {
        if (distance > runLength) System.out.println(type + " " + name + " не может пробежать такую дистанцию");
        else System.out.println(type + " " + name + " пробежал " + distance + " метров.");
    }

    public void jump(int distance) {
        if (distance > runLength) System.out.println(type + " " + name + " не может прыгнуть так далеко");
        else System.out.println(type + " " + name + " прыгнул на " + distance + " метров.");
    }

    public void swim(float distance) {
        if (swimLength == 0) System.out.println(type + " " + name + " не умеет плавать");
        else if (distance > swimLength) System.out.println(type + " " + name + " не может плавать так далеко");
        else System.out.println(type + " " + name + " проплыл " + distance + " метров.");
    }
}
