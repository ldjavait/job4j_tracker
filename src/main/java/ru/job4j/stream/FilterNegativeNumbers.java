package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, -34, 23, 11, 10, 523, 0, 1, 95, -7);
        List<Integer> positive = num.stream()
                .filter(i -> i > 0)
                .toList();
        positive.forEach(System.out::println);
    }
}
