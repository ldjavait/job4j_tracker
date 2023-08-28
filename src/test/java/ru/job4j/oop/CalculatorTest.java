package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {
    @Test
    void whenX5multiplyY2Than10() {
        Calculator x = new Calculator();
        int expected = 10;
        int rsl = x.multiply(2);
        assertThat(rsl).isEqualTo(expected);
    }
}