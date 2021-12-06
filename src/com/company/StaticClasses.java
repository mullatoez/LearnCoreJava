package com.company;

public class StaticClasses {

    static {
        System.out.println("Im in static");
    }

    public static void main(String[] args) {
        System.out.println("Im in main");
        System.out.println(getSum(10,10,10,10));
    }

    static int getSum(int a, int b, int c, int d){
        int sum =  a + b + c + d;
        return sum;
    }
}
