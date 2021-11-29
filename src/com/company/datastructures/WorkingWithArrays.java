package com.company.datastructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "red";
        colors[2] = "white";
        colors[3] = "blue";
        colors[4] = "gray";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        int[] numbers = {100,200};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < colors.length;i++){
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1;i >= 0;i--){
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        for (String color : colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
