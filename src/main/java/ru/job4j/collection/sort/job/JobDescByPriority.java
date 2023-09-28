package ru.job4j.collection.sort.job;

import java.util.Comparator;

/**
 * Компаратор по полю priority. Сортировка по убыванию.
 */
public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
