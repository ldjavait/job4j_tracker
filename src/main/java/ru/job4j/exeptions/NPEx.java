package ru.job4j.exeptions;

/**
 * 0.1. java.lang.NullPointerException [#219364 #254652]
 */
public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Petr Arsentev";
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null) {
                System.out.println(el + " has a size : " + el.length());
            }
        }
    }
}
