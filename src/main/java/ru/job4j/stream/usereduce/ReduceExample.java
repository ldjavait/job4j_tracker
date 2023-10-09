package ru.job4j.stream.usereduce;

import java.util.List;

/**
 * Демонстрация метода .reduce(T identity, BinaryOperator<T> accumulator) на числах.
 */
public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = nums.stream()
                .reduce(2, (a, b) -> a + b);
        System.out.println(sum);
    }
}
