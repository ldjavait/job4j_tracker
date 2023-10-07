package ru.job4j.stream;

import java.util.stream.Stream;

public enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8, V_9, V_10, V_JACK, V_QUEEN, V_KING, V_ACE
}

class Card {
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> suit + " " + value))
                .forEach(System.out::println);
    }
}


