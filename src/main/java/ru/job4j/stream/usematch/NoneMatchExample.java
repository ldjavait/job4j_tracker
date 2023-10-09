package ru.job4j.stream.usematch;

import java.util.List;

/**
 * Демонстрация работы метода .noneMatch().
 */
public class NoneMatchExample {
    public static void main(String[] args) {
        List<String> strings = List.of("Один", "Два", "Три", "Четыре", "Пять");
        boolean rsl = strings.stream()
                .noneMatch("Шесть"::contains);
        System.out.println(rsl);
    }
}
