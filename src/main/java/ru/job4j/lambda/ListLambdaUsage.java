package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListLambdaUsage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 7, 9, 12);
        list.forEach(System.out::println);
        System.out.println();
        UnaryOperator<Integer> u = integer -> (int) Math.pow(integer, 2);
        list.replaceAll(u);
        list.forEach(System.out::println);
    }
}
