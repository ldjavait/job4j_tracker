package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidInput() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[]{"1"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenMultipleValidInput() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[]{"1", "2", "3", "4", "5", "6"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);
        selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(3);
        selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(4);
        selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(5);
        selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(6);

    }

    @Test
    public void whenNegativeNumValidInput() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[]{"-1"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}