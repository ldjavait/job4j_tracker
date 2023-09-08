package ru.job4j.poly.extendstrouble;

/**
 * 1. Что такое полиморфизм. [#3819 #252056]
 */
public class MemStore implements Store {
    private final String[] mem = new String[100];
    private int size = 0;

    public void save(String data) {
        mem[size++] = data;
    }

    public String read() {
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buff.append(mem[i]);
        }
        return buff.toString();
    }
}
