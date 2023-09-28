package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemDescByNameTest {
    @Test
    public void whenDescSortByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "bit"),
                new Item(2, "coin"),
                new Item(3, "apple")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "coin"),
                new Item(1, "bit"),
                new Item(3, "apple")
        );
        assertThat(items).isEqualTo(expected);
    }
}