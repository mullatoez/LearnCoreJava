package com.company;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Mike", 33);
        people.put("Kevin", 25);
        people.put("Saka", 21);

        for (Integer age : people.values()){
            System.out.println(age);
        }
    }
}
