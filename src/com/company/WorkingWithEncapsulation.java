package com.company;

public class WorkingWithEncapsulation {
    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.getTaxAmount(234.5));

        System.out.println(taxCalculator.name = "Damaris");

    }
}

class TaxCalculator {
    double rate = 1.5;
    protected String name;

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    /*
    * There is no access modifier called default, private protected or friend*/

    double getTaxAmount(double price){
        return price * rate;
    }
}
