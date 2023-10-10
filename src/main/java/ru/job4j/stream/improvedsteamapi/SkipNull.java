package ru.job4j.stream.improvedsteamapi;

import java.util.stream.Stream;

/**
 * Демонстрация работы метода Stream.ofNullable
 */
public class SkipNull {
    public static void main(String[] args) {
        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(e -> "Result:" + e)
                .forEach(System.out::println);
    }
}
