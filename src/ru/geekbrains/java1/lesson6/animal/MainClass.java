package ru.geekbrains.java1.lesson6.animal;

/**
 * Created by smeleyka on 12.04.17.
 */
public class MainClass {
    public static void main(String[] args) {

//        Animal cat1 =  new Animal("Barsik","brown",50,30);
//        Animal cat2 =  new Animal("Barsik","brown",50,30);
//        Animal cat3 =  new Animal("Barsik","brown",50,30);
//        Animal cat4 =  new Animal("Barsik","brown",50,30);

        Cat cat1 = new Cat("Barsik","brown",100,5);
        Cat cat2 = new Cat("Pushok","grey",200,4);
        Cat cat3 = new Cat("Belka","orange",90,6);
        Cat cat4 = new Cat("Murzik","black",150,5);

        cat1.run(150);
        cat2.swim(20);


    }
}
