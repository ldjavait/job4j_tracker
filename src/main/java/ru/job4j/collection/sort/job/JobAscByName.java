package ru.job4j.collection.sort.job;

import java.util.Comparator;

/**
 * Компаратор по полю name. Сортировка по возрастанию.
 */
public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
