package ru.job4j.enumeration;

/**
 * Класс заказ-наряд Order.
 * Класс Order содержит поля номер заказ-наряда, модель автомобиля и статус его ремонта в автосервисе
 */
public record Order(int number, String car, Status status) {
}
