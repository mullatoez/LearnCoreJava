package com.company;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("AUDI");

        System.out.println(cars);

        for (String car : cars){
            System.out.println(car);
        }

    }
}
