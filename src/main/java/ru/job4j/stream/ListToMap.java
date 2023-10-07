package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    /**
     * Преобразовывает список в карту. Ключ - это фамилия студента, значение - объект Student (ученик).
     *
     * @param list список студентов List<Student>
     * @return результат его преобразования в Map<String, Student>
     */
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        Student::surname,
                        student -> student,
                        (ex, r) -> ex
                ));
    }
}
