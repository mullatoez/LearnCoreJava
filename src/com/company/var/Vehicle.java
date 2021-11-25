package com.company.var;

import java.io.IOException;

class One {

    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B "); //AB

        System.out.println(ta);
        String tb = "C ";
        ta = ta.concat(tb); // AB -> ABC

        System.out.println(ta);

        ta.replace('C','D'); // ABD
        System.out.println(ta);

        ta = ta.concat(tb); // ABDC

        System.out.println(ta);
    }
}
class ElectricAccount{
    private double kWh;
    private double rate = 0.07;
    private double bill;

    void addKwh(double kWh){

    }
}
class Customer {

    ElectricAccount electricAccount = new ElectricAccount();
    void useElectricity(double kwh){
        electricAccount.addKwh(kwh);
    }

}


class X {
    void printFile() throws IOException {
        throw new IOException();
    }
}

class Test {
    public static void main(String[] args) throws IOException {
        X x = new X();
        x.printFile();
    }
}
class Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
}

class Car extends Vehicle {

    String trans;

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this.trans = trans;
    }
}


