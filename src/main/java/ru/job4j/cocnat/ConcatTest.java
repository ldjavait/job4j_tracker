package ru.job4j.cocnat;

/**
 * 13. Работа со строками. StringBuilder, StringJoiner, StringBuffer. [#504915 #375931]
 */
public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            str.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}

