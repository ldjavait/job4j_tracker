package ru.job4j.collection.sort.job;

import java.util.Comparator;

/**
 * Компаратор по полю name. Сортировка по убыванию.
 */
public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
