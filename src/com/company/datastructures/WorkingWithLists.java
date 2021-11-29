package com.company.datastructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("purple");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("pink"));

        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
