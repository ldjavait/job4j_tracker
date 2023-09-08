package ru.job4j.polymorph.func;

/**
 * 4.1. Элементы интерфейса [#504948 #376802]
 */
public class MainFunc implements Func1, Func2 {
    @Override
    public double func(double x, double y) {
        return Func2.super.func(x, y);
    }

    @Override
    public void funcMessage() {
        Func2.super.funcMessage();
    }
}