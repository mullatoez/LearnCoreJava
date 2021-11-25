package com.company.encapsulation;

public class StudentEncapsulation {
    public static void main(String[] h) {
        Student student = new Student();
        student.setIdNumber(12345);
        student.setName("John Doe");

        System.out.println(student.getIdNumber());
        System.out.println(student.getName());
    }
}
