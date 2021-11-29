package com.company.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    // MORTGAGE CALCULATOR
    //PRINCIPAL
    //INTEREST -- COMPOUNDED ANNUALLY
    //PERIOD --

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments - 1)));

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(formattedMortgage);
    }

}
