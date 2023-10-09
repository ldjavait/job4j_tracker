package ru.job4j.stream.streamplusmap;

import java.util.Map;
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
    public Student findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(s -> s.account().equals(account))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск предмета по аккаунту и имени предмета.
     *
     * @param accountNumber номер аккаунта.
     * @param name          название предмета.
     * @return null, если предмет не найден.
     */
    public Subject findBySubjectByName(String accountNumber, String name) {
        var account = findByAccount(accountNumber);
        if (account == null) {
            return null;
        }
        return students.get(account)
                .stream()
                .filter(s -> s.name().equals(name))
                .findFirst()
                .orElse(null);
    }
}
