package ru.job4j.stream.usereduce;

import java.util.List;
import java.util.Optional;

/**
 * Демонстрация метода .reduce(BinaryOperator<T> accumulator) на числах.
 */
public class ReduceInt {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> sum = nums.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum.get());
        System.out.println();
        Optional<Integer> multi = nums.stream()
                .reduce((a, b) -> a * b);
        System.out.println(multi.get());
    }
}
