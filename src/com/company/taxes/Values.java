package com.company.taxes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

enum Level {
    /*
    * Enum constants are public, static and final
    * */
    LOW,
    MEDIUM,
    HIGH
}

class classDate {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();

    public static void main(String[] args) {
        classDate classDate = new classDate();
        System.out.println(classDate.date);
        System.out.println(classDate.time);
        System.out.println(classDate.dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(classDate.dateTime);
        System.out.println(formattedDate);
    }
}

abstract class AnimalOne {
    /*
     * If a class is not abstract, it can't contain abstract methods
     * when extending an abstract class, you have to implement all the abstract methods
     * If the method is not abstract, you can implement or leave it
     * If the method is not abstract, you must provide the method body. A MUST
     * */
    abstract void makeSound();

    void walk() {

    }
}

class Cow extends AnimalOne {
    @Override
    void makeSound() {
        System.out.println("A cow moos");
    }
}

public class Values {
    int x = 5;

    static class InnerClass {
        int y = 7;
    }

    public static void main(String[] args) {

        Level[] levels = Level.values();

        for (Level level: levels){
            System.out.println(level);
        }


    }

    private static void testingAbstraction() {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
        pig.animalRun();
        System.out.println("===============");
        Animal animal = new Pig();
        animal.animalSound();
        animal.animalRun();
        animal.sleep();
        System.out.println("================");
    }
}

interface Animall {
    void animalSound();

    void run();
}

class Pigg implements Animall {
    @Override
    public void animalSound() {
        System.out.println("Pigg says wee wee");
    }

    @Override
    public void run() {
        System.out.println("Pigg runs");
    }
}

abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
    }

    abstract void animalRun();
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Pig is sleeping");
    }

    @Override
    void animalRun() {
        System.out.println("Pig is running");
    }
}
