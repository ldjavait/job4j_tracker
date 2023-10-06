package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;

public class CutClone {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Daniil");
        names.add("Ivan");
        names.add("Alex");
        names.add("Ivan");
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
