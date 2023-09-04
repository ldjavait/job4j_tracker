package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * @param id индекс которого хотим узнать.
     * @return возвращает индекс по ID.
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

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
     * Проверяет все элементы массива items, сравнивая id с аргументом int id
     * и возвращает найденный Item. Если Item не найден - возвращает null.
     *
     * @param id уникальный номер заявки.
     * @return возвращает найденную заявку.
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * (85) Найти индекс ячейки по id.
     * (87) Проставить id с item. При замене нужно сохранять старый id.
     * (88) Записать в ячейку с найденным индексом объект item. Это входящий параметр.
     * (89) Вернуть true, если замена произведена или false, если index по id не найден.
     *
     * @param id   заявки, которую меняем
     * @param item объект item.
     * @return true, если замена произведена или false, если index по id не найден.
     */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }
}