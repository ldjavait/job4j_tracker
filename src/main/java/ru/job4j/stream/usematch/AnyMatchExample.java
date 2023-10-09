package ru.job4j.stream.usematch;

import java.util.List;

/**
 * Демонстрация работы метода .anyMatch().
 */
public class AnyMatchExample {
    public static void main(String[] args) {
        List<String> strings = List.of("Один", "Два", "Три", "Четыре", "Пять");
        boolean rsl = strings.stream()
                .anyMatch(e -> e.startsWith("Од"));
        System.out.println(rsl);
    }
}
