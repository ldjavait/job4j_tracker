package ru.job4j.stream.streamplusmap;

/**
 * Описывает студента.
 *
 * @param name имя.
 * @param account аккаунт, уникальный идентификатор.
 * @param group группа.
 */
public record Student(String name, String account, String group) {
}
