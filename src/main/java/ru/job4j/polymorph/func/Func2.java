package ru.job4j.polymorph.func;

public interface Func2 {
    default double func(double x, double y) {
        return x * x - y + 5;
    }

    default void funcMessage() {
        System.out.println("Сообщение из Func2");
    }
}
