package ru.job4j.collection.order;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order key : orders) {
            map.put(key.getNumber(), key);
        }
        return map;
    }
}
