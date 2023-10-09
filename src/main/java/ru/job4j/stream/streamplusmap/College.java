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
        for (Student student : students.keySet()) {
            if (student.account().equals(account)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Поиск предмета по аккаунту и имени предмета.
     *
     * @param account аккаунт.
     * @param name    название предмета.
     * @return null, если предмет не найден.
     */
    public Subject findBySubjectByName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            Set<Subject> subjects = students.get(a);
            for (Subject subject : subjects) {
                if (subject.name().equals(name)) {
                    return subject;
                }
            }
        }
        return null;
    }
}
