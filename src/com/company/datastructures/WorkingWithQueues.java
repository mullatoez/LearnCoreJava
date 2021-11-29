package com.company.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<>();
        people.add("Mike");
        ListIterator<String> peopleIterator = people.listIterator();

        while (peopleIterator.hasNext()){
            System.out.println(peopleIterator.next());
        }

        System.out.println(people.size());
    }

    private static void queues() {
        Queue<String> supermarket = new LinkedList<>();
        supermarket.add("Kim");
        supermarket.add("Mike");
        supermarket.add("Mirriam");
        supermarket.add("Asha");

        supermarket.remove();

        System.out.println(supermarket.peek());
    }


}
