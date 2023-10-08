package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToObjExample {
    public static void main(String[] args) {
        List<String> list = IntStream.rangeClosed(1, 687)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
