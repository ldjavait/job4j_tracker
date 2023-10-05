package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapLambdaUsage {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name");
        map.put(2, "top");
        map.put(3, "user");
        map.put(4, "precision");
        map.put(5, "post");
        map.forEach((key, value) -> System.out.println("Key " + key + ", value " + value));
        System.out.println("forEach ↑");
        BiFunction<Integer, String, String> biF = (key, value) -> value + "_" + key;
        map.replaceAll(biF);
        map.forEach((key, value) -> System.out.println("Key " + key + ", value " + value));
        System.out.println("replaceAll ↑");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "name");
        BiFunction<Integer, String, String> biF1 = (key, value) -> value + "_" + key;
        String rsl = map1.computeIfPresent(1, biF1);
        System.out.println("Current value: " + rsl);
        map1.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println("computeIfPresent ↑");
        Map<String, Integer> map2 = new HashMap<>();
        Function<String, Integer> f = String::length;
        map2.computeIfAbsent("Petr", f);
        map2.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println("computeIfAbsent ↑");
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Shoes", 200);
        BiFunction<Integer, Integer, Integer> biF2 = (oldValue, newValue) -> oldValue - newValue;
        int newPrice = map3.merge("Shoes", 50, biF2);
        System.out.println("New price: " + newPrice);
        System.out.println("Price of shirt: " + map3.merge("Shirt", 100, biF2));
        map3.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println("merge ↑");
    }
}
