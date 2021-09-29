package com.company.var;

import java.util.List;

public class VarKeyword {
    public static void main(String[] args) {

        /*VAR IS NOT A KEYWORD*/

        for (var i = 0; i < 5; i++) {
            System.out.println(i);
        }

        List<String> names = List.of("Victor","Odikor","Tarrus","Nancy","Hanson");

        for (var var : names)
            System.out.println(var);

    }
}
