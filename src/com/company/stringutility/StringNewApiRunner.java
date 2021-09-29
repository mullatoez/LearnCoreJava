package com.company.stringutility;

import java.util.List;

public class StringNewApiRunner {
    public static void main(String[] args) {

        // isBlank() --
        String name = null;
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());

        //nullPointer
        String str = null;
        System.out.println(str.isBlank());

        /*//Local variable type inference
        List<String> names1 = List.of("Victor","Samuel");
        List<String> names2 = List.of("Nancy","Rossane");

        var names = List.of(names1,names2);

        names.forEach(System.out::println);*/



    }
}
