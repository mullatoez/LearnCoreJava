package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("W3SCHOLS");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("A match was found");
        } else {
            System.out.println("A match was not found");
        }
    }
}
