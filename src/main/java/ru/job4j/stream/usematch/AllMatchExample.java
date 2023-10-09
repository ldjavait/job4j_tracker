package ru.job4j.stream.usematch;

import java.util.List;

/**
 * Демонстрация работы метода .allMatch().
 */
public class AllMatchExample {
    public static void main(String[] args) {
        List<String> strings = List.of("Три", "Триста", "Тринадцать", "Трико", "Тригер");
        boolean rsl = strings.stream()
                .allMatch(e -> e.startsWith("Три"));
        System.out.println(rsl);
    }
}
