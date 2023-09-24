package ru.job4j.tracker;

import java.util.List;

/**
 * 1. Singleton [#94606 #255842]
 */
public class SingleTracker {
    private final Tracker tracker = new Tracker();
    private static Tracker instance = null;

    private SingleTracker() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Boolean deleteItem(int id) {
        return tracker.delete(id);
    }

    public Boolean editItem(int id, Item item) {
        return tracker.replace(id, item);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public List<Item> findByName(String name) {
        return tracker.findByName(name);
    }
}
