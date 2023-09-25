package ru.job4j.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1. Интерфейс Queue [#504942 #377785]
 */
public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("State of Queue before remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
        queue.remove();
        System.out.println();
        System.out.println("State of Queue after remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
        System.out.println();
        System.out.println(queue.peek());
    }
}
