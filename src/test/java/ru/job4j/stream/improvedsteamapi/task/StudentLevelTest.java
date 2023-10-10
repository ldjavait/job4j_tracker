package ru.job4j.stream.improvedsteamapi.task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class StudentLevelTest {
    @Test
    public void whenSorted() {
        List<Student> in = new ArrayList<>();
        in.add(new Student(28, "Den"));
        in.add(new Student(134, "Nasty"));
        List<Student> expected = List.of(
                new Student(134, "Nasty"),
                new Student(28, "Den")
        );
        assertThat(StudentLevel.levelOf(in, 20)).containsSequence(expected);
    }

    @Test
    public void whenOnlyNull() {
        List<Student> in = new ArrayList<>();
        in.add(null);
        List<Student> ex = List.of();
        assertThat(StudentLevel.levelOf(in, 20)).containsAll(ex);
    }

    @Test
    public void whenHasNull() {
        List<Student> in = new ArrayList<>();
        in.add(null);
        in.add(new Student(134, "Nasty"));
        in.add(new Student(28, "Den"));
        List<Student> ex = List.of(
                new Student(134, "Nasty"),
                new Student(28, "Den")
        );
        assertThat(StudentLevel.levelOf(in, 20)).containsAll(ex);
    }
}