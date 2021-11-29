package com.company.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Friends> friendsMap = new HashMap<>();
        friendsMap.put(1, new Friends("Frida"));
        friendsMap.put(2, new Friends("Miriam"));
        friendsMap.put(3, new Friends("Saumu"));

        System.out.println(friendsMap);
        System.out.println(friendsMap.size());
        System.out.println(friendsMap.get(1));
        System.out.println(friendsMap.keySet());
        System.out.println(friendsMap.values());

        friendsMap.entrySet().forEach(t ->
                System.out.println(t.getKey() + " for " + t.getValue()));
    }

    private static class Friends {
        String name;

        public Friends(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Friends friends = (Friends) o;
            return Objects.equals(name, friends.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Friends{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
