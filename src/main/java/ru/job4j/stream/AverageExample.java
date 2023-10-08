package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Елена", 26),
                new Person("Артем", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();
        double a = average.getAsDouble();
        System.out.println(a);
    }
}
