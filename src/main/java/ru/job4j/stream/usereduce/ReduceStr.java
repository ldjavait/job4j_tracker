package ru.job4j.stream.usereduce;

import java.util.List;
import java.util.Optional;

/**
 * Демонстрация метода .reduce(BinaryOperator<T> accumulator) на строках.
 */
public class ReduceStr {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three");
        Optional<String> rsl = strings.stream()
                .reduce((a, b) -> a + " " + b);
        System.out.println(rsl.get());
    }
}
