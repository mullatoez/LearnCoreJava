package com.company.polymorphism;

public class Main {
    public static void main(String[] args) {
        AnAnimal animal = new AnAnimal();
        AnAnimal pig = new Pig();
        AnAnimal cat = new Cat();
        animal.makeSound();
        pig.makeSound();
        cat.makeSound();

    }
}
