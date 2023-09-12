package ru.job4j.exeptions;

public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String msg) {
        super(msg);
    }
}
