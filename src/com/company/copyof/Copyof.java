package com.company.copyof;

import java.util.ArrayList;
import java.util.List;

public class Copyof {
    public static void main(String[] args) {

        /*COPY OF METHOD ------- LISTS SETS MAPS*/

        List<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Dickson");
        names.add("Odikor");
        names.add("Nancy");

        List<String> copyOfNames = List.copyOf(names);

        doNotChange(copyOfNames);
        System.out.println(copyOfNames);

    }

    private static void doNotChange(List<String> copyOfNames) {
        copyOfNames.add("Victor");
    }
}
