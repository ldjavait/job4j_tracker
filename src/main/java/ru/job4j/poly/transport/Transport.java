package ru.job4j.poly.transport;

public interface Transport {
    void go();

    void passenger(int passenger);

    int fill(int count);
}
