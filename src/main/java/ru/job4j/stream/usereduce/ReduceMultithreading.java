package ru.job4j.stream.usereduce;

import ru.job4j.stream.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Демонстрация метода .reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner).
 */
public class ReduceMultithreading {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Лена", 26),
                new Person("Тема", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum = people.stream()
                .reduce(0, (a, b) -> {
                            if (b.getAge() > 25) {
                                return a + b.getAge();
                            } else {
                                return a;
                            }
                        },
                        (a, b) -> a + b
                );
        System.out.println(sum);
    }
}
