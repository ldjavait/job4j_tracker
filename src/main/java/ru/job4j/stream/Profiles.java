package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    /**
     * Преобразует список профилей в список адресов.
     *
     * @param profiles список профилей.
     * @return преобразованный список.
     */
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    /**
     * Метод сортирует результирующий список в порядке возрастания по полю String city, и исключает дубликаты.
     *
     * @param profiles список профилей.
     * @return преобразованный список.
     */
    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
