package com.company;

public class WorkingWithInheritance extends Persons {

    public String employeeId;

    WorkingWithInheritance(String name) {
        super(name);
    }

    public static void main(String[] args) {
        WorkingWithInheritance inheritance = new WorkingWithInheritance("Mike");
        inheritance.employeeId = "102ASW";
        inheritance.name = "Damaris";
        System.out.println(inheritance.getName());
    }
}

  class Persons{
    public String name;
    protected String fixtureName;
    Persons(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

