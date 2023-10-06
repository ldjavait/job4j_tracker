package ru.job4j.stream;

/**
 * Модель данных - анкета.
 */
public class Profile {
    Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
