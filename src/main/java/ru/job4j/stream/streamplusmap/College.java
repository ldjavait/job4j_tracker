package ru.job4j.stream.streamplusmap;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Поиск предмета по аккаунту.
     *
     * @param account аккаунт.
     * @return null, если предмет не найден.
     */
    public Optional<Student> findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(s -> s.account().equals(account))
                .findFirst();
    }

    /**
     * Поиск предмета по аккаунту и имени предмета.
     *
     * @param account номер аккаунта.
     * @param name    название предмета.
     * @return null, если предмет не найден.
     */
    public Optional<Subject> findBySubjectByName(String account, String name) {
        Optional<Student> acc = findByAccount(account);
        if (acc.isPresent()) {
            Set<Subject> subjects = students.get(acc.get());
            return subjects
                    .stream()
                    .filter(s -> s.name().equals(name))
                    .findFirst();
        }
        return Optional.empty();
    }
}