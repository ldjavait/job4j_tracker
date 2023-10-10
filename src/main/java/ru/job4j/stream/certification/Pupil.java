package ru.job4j.stream.certification;

import java.util.List;

/**
 * Описывает ученика.
 * @param name
 * @param subjects
 */
public record Pupil(String name, List<Subject> subjects) {
}
