package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        for (String str : collection) {
            System.out.println(str);
        }
        collection.remove("two");
        System.out.println("Вывод содержимого коллекции после удаления");
        for (String str : collection) {
            System.out.println(str);
        }
        Collection<String> list = new ArrayList<>(collection);
        for (String str : list) {
            System.out.println(str);
        }
        collection.retainAll(list);
        System.out.println("Вывод содержимого коллекции после вызова retainAll");
        for (String str : collection) {
            System.out.println(str);
        }
        Collection<String> coll = new ArrayList<>();
        coll.add("one");
        coll.add("two");
        coll.add("three");
        System.out.println("Размер коллекции равен: " + coll.size());
        System.out.println("Коллекция содержит элемент two: " + coll.contains("two"));
        System.out.println("Содержимое в виде массива: " + Arrays.toString(coll.toArray()));
        coll.clear();
        System.out.println("Коллекция после очистки пуста: " + collection.isEmpty());
    }
}
