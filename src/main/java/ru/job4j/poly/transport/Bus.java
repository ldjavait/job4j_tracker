package ru.job4j.poly.transport;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Bus is go");
    }

    @Override
    public void passenger(int passenger) {
        System.out.println("There are only " + passenger + " passengers inside the bus");
    }

    @Override
    public int fill(int count) {
        System.out.println("Refueling has begun at, " + count);
        return count * 40;
    }
}
