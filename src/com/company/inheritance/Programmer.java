package com.company.inheritance;

public class Programmer extends Employee {
    int bonus = 10_000;

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println("My salary is: " + programmer.salary);
        System.out.println("My salary bonus is: " + programmer.bonus);
    }
}
