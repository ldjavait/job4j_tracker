package ru.job4j.tracker;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 1. Singleton [#94606 #255842]
 */
public class Log4File {
    private static Log4File instance = null;
    private final String[] messages = new String[1000];
    private int index = 0;

    private Log4File() {
    }

    public static Log4File getInstance() {
        if (instance == null) {
            instance = new Log4File();
        }
        return instance;
    }

    public void add(String message) {
        messages[index++] = message;
    }

    public void save() throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        for (String str : messages) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
    }
}
