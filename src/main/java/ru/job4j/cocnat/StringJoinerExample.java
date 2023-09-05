package ru.job4j.cocnat;

import java.util.StringJoiner;

/**
 * 13. Работа со строками. StringBuilder, StringJoiner, StringBuffer. [#504915 #375931]
 */
public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}
