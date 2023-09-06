package ru.job4j.io;

import java.util.Scanner;

/**
 * 2.0. Чтение из консоли. Класс Scanner. [#179514 #252070]
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать. Как Вас зовут? ");
        String name = input.nextLine();
        System.out.println(name + " , рад Вас видеть!");
    }
}
