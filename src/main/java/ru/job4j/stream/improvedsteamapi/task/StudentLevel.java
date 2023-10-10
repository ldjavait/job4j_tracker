package ru.job4j.stream.improvedsteamapi.task;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    /**
     * Метод должен вернуть список студентов, у которых балл аттестата больше bound,
     * отсортированных в обратном порядке, от большего балла к меньшему.
     *
     * @param students список студентов.
     * @param bound    значение с которым сравниваем средний балл.
     * @return список студентов, у которых балл аттестата больше bound.
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted(((o1, o2) -> Integer.compare(o2.score(), o1.score())))
                .takeWhile(s -> s.score() > bound)
                .collect(Collectors.toList());
    }
}
