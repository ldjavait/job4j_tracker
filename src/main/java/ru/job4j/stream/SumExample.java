package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Елена", 26),
                new Person("Артем", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum = people.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(sum);
    }
}
