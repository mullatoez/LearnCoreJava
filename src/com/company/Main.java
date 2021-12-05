package com.company;

import java.util.*;
class Animal {
    public void animalSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    public void animalSound() {
        System.out.println("A dog barks");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("A pig says: wee wee");
    }
}


class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

abstract class MyClass {
    int x;

    public abstract void sendSms();

    public MyClass() {
        x = 6;
    }
}

class MyClassExtender extends MyClass {

    @Override
    public void sendSms() {
        System.out.println("Sms send!");
    }
}

class Vehicle {
    protected String brand = "Ford";
    private int wheels = 4; // private is not accessible on any subclass

    public void honk(){
        System.out.println("Tuut!, tuuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        System.out.println(car.brand);
        System.out.println(car);
    }
}

public class Main {

    int modelYear;
    String carName;

    public Main(int modelYear, String carName) {
        this.modelYear = modelYear;
        this.carName = carName;
    }

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal pig = new Pig();
        dog.animalSound();
        pig.animalSound();

    }

    private static void constructorMaking() {
        Main main = new Main(2018, "Audi S5");
        System.out.println(main.carName);
        System.out.println(main.modelYear);
        /*ACCESS MODIFIERS*/
        /*
         * PUBLIC - the code is accessible to all classes
         * PRIVATE - the code is accessible only in the declared class
         * DEFAULT - the code is only accessible in the specified package. It happens when you don't specify modifier
         * PROTECTED - the code is accessible in the specified package and all the sub-classes;
         * */
    }

    public void sendEmail() {
        System.out.println("Email send!");
    }

    private static void sendSms() {
        System.out.println("An sms was send");
    }

    private static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    private static void methodOverloading() {
        System.out.println(sumTwos(10, 5));
        System.out.println(sumTwos(2.3, 4.5));
    }

    private static int sumTwos(int x, int y) {
        return x + y;
    }

    private static double sumTwos(double x, double y) {
        return x + y;
    }

    private static void multidimensionalArrays() {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }

    private static void loopingThroughArrays() {
        String[] cars = {
                "Audi",
                "Bmw",
                "Benz",
                "Nissan",
                "Wish"
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("====New Way====");

        for (String car : cars) {
            System.out.println(car);
        }
    }

    private static void ternaryOperator() {
        double marks = 78.2;

        System.out.println((marks > 65 ? "Pass" : "Fail"));
    }

    private static void workingWithArrays() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (Integer integer : numbers) {
            sum = sum + integer;
        }

        System.out.println(sum);
    }

    private static void enhancedForLoop() {

        String[] names = {"kimanthi", "kevin", "kyei", "jackson", "mike"};

        for (String name : names) {
            int sum = 0;
            for (int i = 0; i < names.length; i++) {
                char ch = name.charAt(i);
                int letterNumber = ch - 96; // converts an 'a' to 1, 'b' to 2 etc
                sum = sum + letterNumber;
            }

            System.out.println("Lucky number for " + name + " is" + sum);
        }

        String[] cars = {"bmw", "audi", "benz", "range"};

        for (int i = 0; i < cars.length; i++) {
            // continue; continue or break statements terminates the loop
            System.out.println(cars[i]);
        }

        List names1 = new ArrayList();
        names1.add("Kevin");
        names1.add("Kimatu");
        names1.add("Anne");
        names1.add("Keith");

        List<String> cars1 = new ArrayList<>();
        cars1.add("bmw");
        cars1.add("audi");
        cars1.add("benz");
        cars1.add("range");
        int i = 0;
        for (String car : cars) {
            System.out.println("The value of i is " + i + " " + car.toUpperCase());
            i++;
        }

        System.out.println(i);

        for (Object obj : names) {

            System.out.println(obj.toString().toUpperCase());
        }


        Set s = new HashSet();
        s.add("a");
        s.add("bb");
        s.add("ccc");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    private static void forLoops() {
        int i = 0;
        for (; i < 10; i = i + 2) {
            System.out.println(i);
        }
    }

    private static void doWhileLoop() {
        int i = 4;

        do {
            System.out.println("i is " + i);
        } while (i-- > 0);
        System.out.println("After loop, i is " + i);
    }

    private static void whileLoop() {
        int i = 4;

        while (i > 0) {

            System.out.println("i is " + i);
            i--;

        }

        System.out.println("Value of i after the loop is " + i);

    }

    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}
