package ru.job4j.inheritance;

public class ToyCat extends Cat {
    public boolean canBeWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.catPurr());
        ToyCat toyCat = new ToyCat();
        System.out.println(toyCat.catPurr());
        System.out.println(toyCat.canBeWashMachine());
    }
}
