package ru.job4j.inheritance.hide;

/**
 * Происходящее после 11 строки называется сокрытием метода
 */
public class Cat extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Cat");
    }

    public static void staticInvoke() {
        System.out.println("Вызов статического метода Cat");
    }
}
