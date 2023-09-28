package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemAscByNameTest {
    @Test
    public void whenAscSortByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "bit"),
                new Item(2, "coin"),
                new Item(3, "apple")
                );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "apple"),
                new Item(1, "bit"),
                new Item(2, "coin")
        );
        assertThat(items).isEqualTo(expected);
    }
}