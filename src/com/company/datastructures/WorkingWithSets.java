package com.company.datastructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Balls> balls = new HashSet<>();
        balls.add(new Balls("yellow"));
        balls.add(new Balls("blue"));
        balls.add(new Balls("green"));
        balls.add(new Balls("purple"));

        balls.forEach(System.out::println);
        System.out.println(balls.size());
    }

    static class Balls{
        String color;

        public Balls(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Balls balls = (Balls) o;
            return Objects.equals(color, balls.color);
        }

        @Override
        public String toString() {
            return "Balls{" +
                    "color='" + color + '\'' +
                    '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }
}
