package ru.job4j.cocnat;

/**
 * 13. Работа со строками. StringBuilder, StringJoiner, StringBuffer. [#504915 #375931]
 */
public class ConcatExample {
    public static void main(String[] args) {
        String str = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(str);
    }
}
