package ru.job4j.stream.improvedsteamapi;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Демонстрация метода .of для получения списков и коллекций.
 */
public class OfMethod {
    public static void main(String[] args) {
        List.of(5, 1, 2).forEach(System.out::println);
        Set.of(5, 1, 2, 3, 54).forEach(System.out::println);
        Map.of("first", 1, "second", 2)
                .forEach((v, k) -> System.out.println(v + " " + k));
    }
}
