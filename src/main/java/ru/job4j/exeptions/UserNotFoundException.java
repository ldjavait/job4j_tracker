package ru.job4j.exeptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
