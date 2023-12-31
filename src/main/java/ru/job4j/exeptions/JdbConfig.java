package ru.job4j.exeptions;

public class JdbConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not bo null");
        }
    }

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
