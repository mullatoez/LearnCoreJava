package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("Bmw");
        cars.add("Benz");
        cars.add("Subaru");

        /*System.out.println(cars);
        for (String car : cars){
            System.out.println(car);
        }*/

        //USING ITERATOR
        Iterator<String> iterator = cars.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println("==================");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*cars.set(3,"Honda");
        System.out.println(cars);

        cars.remove(3);

        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);

        Collections.shuffle(cars);*/
    }
}
