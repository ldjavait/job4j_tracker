package ru.job4j.collection.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    /**
     * Берет из очереди evenElements только четные символы и все их собирает в результирующую строку.
     * Эта очередь всегда имеет четное число элементов;
     *
     * @return строку с четными символами.
     */
    private String getEvenElements() {
        StringBuilder builder = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                builder.append(evenElements.poll());
            } else {
                evenElements.poll();
            }
        }
        return builder.toString();
    }

    /**
     * Берет символы начиная с последнего и так пока не заберет их все.
     *
     * @return фразу.
     */
    private String getDescendingElements() {
        StringBuilder builder = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            builder.append(descendingElements.pollLast());
        }
        return builder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
