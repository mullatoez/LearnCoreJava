package com.company;

public class WorkingWithMethods {
    public static void main(String[] args) {
        WorkingWithMethods methods = new WorkingWithMethods();
        String res = methods.getValue(2);
        System.out.println(res);
    }

    String getValue(int x){
        if (x > 10){
           return "OK";
        }else {
           return "NOT OK";
        }
    }
}
