package ru.job4j.exeptions;

public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException(String msg) {
        super(msg);
    }
}
