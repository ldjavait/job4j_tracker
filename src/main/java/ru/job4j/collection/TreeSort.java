package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println("Сортировка по возрастанию" + numbers);
        Set<Integer> num = new TreeSet<>(Collections.reverseOrder());
        num.add(5);
        num.add(1);
        num.add(3);
        System.out.println("Сортировка по убыванию" + num);
    }
}
