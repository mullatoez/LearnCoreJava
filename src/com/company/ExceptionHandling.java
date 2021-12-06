package com.company;

public class ExceptionHandling {
    public static void main(String[] args) {

        checkAge(19);
    }

    private static void checkAge(int age) {
        if (age < 18){
            throw new ArithmeticException("Access denied. You must be 18yrs of age");
        }else {
            System.out.println("Access granted. You are old enough");
        }
    }
}
