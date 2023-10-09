package ru.job4j.stream.streamplusmap;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(
                new Student("Den", "00001", "1"),
                Set.of(
                        new Subject("Math", 100),
                        new Subject("History", 10)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("00001");
        System.out.println("Student: " + student);
        Subject math = college.findBySubjectByName("00001", "Math");
        System.out.println("Score: " + math.score());
    }
}
