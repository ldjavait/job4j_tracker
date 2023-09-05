package ru.job4j.cocnat;

/**
 * 13. Работа со строками. StringBuilder, StringJoiner, StringBuffer. [#504915 #375931]
 */
public class JoinExample {
    public static void main(String[] args) {
        String str = String.join(" ", "abc", "def", "ghi");
        System.out.println(str);
    }
}
