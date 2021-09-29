package com.company.abstraction;

public class Lion extends Animal{
    @Override
    void sound() {
        System.out.println("A lion roars");
    }

    @Override
    void move() {
        System.out.println("A lion moves");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
        lion.move();

    }
}
