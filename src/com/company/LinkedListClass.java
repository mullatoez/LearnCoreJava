package com.company;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Bmw");
        cars.add("Audi");
        cars.add("Subaru");
        cars.add("Honda");
        /*System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());*/

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

            for (String car : cars) {
                System.out.println(car);
            }

    }
}
