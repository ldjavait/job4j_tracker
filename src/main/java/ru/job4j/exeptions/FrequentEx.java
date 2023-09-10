package ru.job4j.exeptions;

/**
 * 0. Что такое исключение. [#3821 #254649]
 */
public class FrequentEx {
    public static void main(String[] args) {
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        for (String shop : shops) {
            System.out.println(shop);
        }
    }
}
