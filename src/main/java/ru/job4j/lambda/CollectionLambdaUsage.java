package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionLambdaUsage {
    public static void main(String[] args) {
        Predicate<String> p = string -> string.length() == 4;
        Collection<String> collection = new ArrayList<>();
        collection.add("name");
        collection.add("top");
        collection.add("user");
        collection.add("precision");
        collection.add("post");
        collection.forEach(System.out::println);
        collection.removeIf(p);
        System.out.println();
        collection.forEach(System.out::println);
    }
}
