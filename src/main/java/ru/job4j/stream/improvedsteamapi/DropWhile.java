package ru.job4j.stream.improvedsteamapi;

import java.util.stream.Stream;

/**
 * Демонстрация работы метода Stream.dropWhile
 */
public class DropWhile {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 1, 2)
                .dropWhile(e -> e < 3)
                .map(e -> "Result:" + e)
                .forEach(System.out::println);
    }
}
