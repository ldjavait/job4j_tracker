package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    private boolean empty(String s) {
        return check(string -> string.isEmpty(), s);
    }

    public boolean starWith(String s, String pref) {
        return check(string -> string.startsWith(pref), s);
    }

    public boolean contains(String s, String key) {
        return check(string -> string.contains(key), s);
    }

    public boolean check(Predicate<String> p, String s) {
        return p.test(s);
    }

    public String transform(Function<String, String> f, String s) {
        return f.apply(s);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.isEmpty(), ""
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.contains("rn"), "Surname Name"
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        str -> str.toUpperCase(), "aBCdEfghKLmnpRstU"
                )
        );
        System.out.println(
                usage.transform(
                        str -> str.concat("работает корректно."), "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        str -> str.trim(), "    aBC dEfghK Lmnp RstU        "
                )
        );
    }
}
