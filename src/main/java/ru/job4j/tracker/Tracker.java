package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * Добавляет заявку, переданную в аргументах в массив заявок items.
     * Присваивает уникальный ключ в объект item через setID()
     *
     * @param item объект заявка.
     * @return добавленный объект в заявку.
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * @return возвращает копию массива items без null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * @param key проверяет в цикле все элементы массива items,
     *            сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * @return Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     */
    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                rsl[index] = item;
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    /**
     * Проверяет в цикле все элементы массива items, сравнивая id с аргументом int id
     * и возвращает найденный Item. Если Item не найден - возвращает null.
     *
     * @param id уникальный номер заявки.
     * @return возвращает найденную заявку.
     */
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}