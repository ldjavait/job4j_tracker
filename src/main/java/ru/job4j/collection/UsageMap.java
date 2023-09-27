package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("dzaka89@gmail.com", "Den");
        map.put("dzaka89@gmail.com", "Den");
        map.put("dlazykin856@gmail.com", "Den");
        map.put("ldjavait@ya.ru", "Den");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
