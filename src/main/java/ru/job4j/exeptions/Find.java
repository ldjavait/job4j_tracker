package ru.job4j.exeptions;

/**
 * 3. Замена if-else-throw на if-throw [#49895 #255072]
 */
public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 && index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 0);
        System.out.println(rsl);
    }
}
