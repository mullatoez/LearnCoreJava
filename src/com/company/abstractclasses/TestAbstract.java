package com.company.abstractclasses;

public class TestAbstract implements TestOneAbstract {

    @Override
    public void printName() {
        System.out.println("Name");
    }

    @Override
    public void printFavLanguage() {
        System.out.println("Java");
    }
}
