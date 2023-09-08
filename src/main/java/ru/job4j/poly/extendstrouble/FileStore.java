package ru.job4j.poly.extendstrouble;

/**
 * 1. Что такое полиморфизм. [#3819 #252056]
 */
public class FileStore implements Store {
    private String path;

    public FileStore() {
    }

    public void save(String data) {
    }

    public String read() {
        return null;
    }
}
