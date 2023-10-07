package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Mike"),
                new StringBuilder("Den"),
                new StringBuilder("Stan")
        );
        List<StringBuilder> editNames = names.stream()
                .peek((e) -> e.append(" (Job4j student)"))
                .sorted()
                .toList();
        System.out.println(editNames);
    }
}
