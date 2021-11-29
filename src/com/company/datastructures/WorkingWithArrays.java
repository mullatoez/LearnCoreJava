package com.company.datastructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int key = 31;
        int last=arr.length-1;
        BinarySearchArray.binarySearch(arr,0,last,key);
    }

    private static void copyingArrays() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = new String[9];
        System.arraycopy(copyFrom, 2, copyTo, 0, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

        /* COPY ARRAYS USING THE copyOfRange method*/
        String[] newCopyRange = Arrays.copyOfRange(copyFrom,2,9);

        for (String str: newCopyRange){
            System.out.println(str + " ");
        }

        int[] numbers = {
                1,2,3,5,6,7,8,9
        };

        int[] numbersCopy = new int[5];

        System.arraycopy(numbers,1,numbersCopy,0,5);
        for (int i : numbersCopy){
            System.out.println(i + " ");
        }
    }

    private static void generalArrays() {
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
