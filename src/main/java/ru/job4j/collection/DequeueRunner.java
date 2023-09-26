package ru.job4j.collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 2. Интерфейс Deque [#504943 #377840]
 */
public class DequeueRunner {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println("Итератор назад");
        Deque<String> iteratorDeque = new LinkedList<>();
        iteratorDeque.add("second");
        iteratorDeque.addFirst("first");
        iteratorDeque.addLast("third");
        Iterator<String> iteratorStraight = iteratorDeque.descendingIterator();
        while (iteratorStraight.hasNext()) {
            System.out.println(iteratorStraight.next());
        }
        System.out.println("Итератор вперед");
        Iterator<String> iteratorBack = iteratorDeque.iterator();
        while (iteratorBack.hasNext()) {
            System.out.println(iteratorBack.next());
        }
    }
}
