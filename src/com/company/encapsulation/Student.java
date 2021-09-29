package com.company.encapsulation;

public class Student {
    private int idNumber;
    private String name;

    Student(int idNumber, String name){
        this.idNumber = idNumber;
        this.name = name;
    }

    Student()
    {

    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
