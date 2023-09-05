package ru.job4j.format;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 9. Форматирование данных. Методы format() и printf() [#504975 #376549]
 */
public class Format {
    public static void getGreeting(String name, int age) {
        System.out.printf("Привет! Я %s, мой возраст: %d%n", name, age);
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = new GregorianCalendar();
        System.out.printf("Привет, %s! Текущая дата: %tF, Текущее время: %tT%n", name, instance, instance);
    }

    public static void main(String[] args) {
        getGreeting("Den", 33);
        getGreetingAndTime("Den");
        System.out.printf("Задаем число 0.99 - %.2f%n", 0.99);
        System.out.printf("%1$,+016.2f%n", 5000000.0000);
    }
}
