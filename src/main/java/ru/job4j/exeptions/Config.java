package ru.job4j.exeptions;

/**
 * 3. Замена if-else-throw на if-throw [#49895 #255072]
 */
public class Config {
    public static void load(String path) {
        if (path == null) {
            throw new IllegalStateException("Path could not be null.");
        }
        System.out.println("load config by " + path);
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
