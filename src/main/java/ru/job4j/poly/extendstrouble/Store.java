package ru.job4j.poly.extendstrouble;

/**
 * 1. Что такое полиморфизм. [#3819 #252056]
 */
public interface Store {
    void save(String data);

    String read();
}
