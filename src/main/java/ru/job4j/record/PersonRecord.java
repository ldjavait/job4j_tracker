package ru.job4j.record;

/**
 * 11. Record [#504880 #375694]
 *
 * @param name
 * @param age
 */
public record PersonRecord(String name, int age) implements Comparable<PersonRecord> {
    public static int maxAge = 100;

    public PersonRecord {
        if (age > 101) {
            throw new IllegalArgumentException("Возраст должен быть менее 101");
        }
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public void info() {
        System.out.println("Напечатать информацию");
    }

    @Override
    public int compareTo(PersonRecord o) {
        return name.compareTo(o.name);
    }
}
