package ru.job4j.stream;

import java.util.*;
import java.util.stream.IntStream;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 1, -3, 2);
        Optional<Integer> minE = list.stream()
                .min(Comparator.naturalOrder());
        System.out.println(minE.get());
        System.out.println();
        OptionalInt min = IntStream
                .rangeClosed(1, 32)
                .min();
        System.out.println(min.getAsInt());
    }
}
