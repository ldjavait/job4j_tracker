package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class DeferredExecution {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Den"};
        Comparator<String> lengthCmp = (o1, o2) -> {
            System.out.println("execute comparator");
            return Integer.compare(o1.length(), o2.length());
        };
        Arrays.sort(names, lengthCmp);
    }
}
