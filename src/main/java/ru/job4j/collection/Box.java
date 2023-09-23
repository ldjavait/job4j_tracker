package ru.job4j.collection;

public class Box {
    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    public static void num(int x) {
        System.out.println("Значение типа int: " + x);
    }

    public static void main(String[] args) {
        System.out.println("Пример авто упаковки");
        int a = 1;
        Integer b;
        b = a;
        System.out.println(b);
        int x = 2;
        num(x);
        System.out.println("Пример авто распаковки");
        Integer m = 3;
        int n = m;
        System.out.println("int n = " + n);
        Integer k = 5;
        Integer l = 6;
        System.out.println(k * l);

    }
}
