package ru.job4j.stream.certification;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Описание всех методов -> 3. Аттестация [#49777 #371123]
 */
public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(pupil ->
                        Stream.of(pupil.subjects()))
                .flatMap(Collection::stream)
                .mapToInt(Subject::score)
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.map(pupil ->
                        new Tuple(pupil.name(), pupil.subjects().stream()
                                .mapToInt(Subject::score)
                                .average()
                                .orElse(0D)))
                .toList();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(pupil ->
                        new Tuple(pupil.name(), pupil.subjects().stream()
                                .mapToInt(Subject::score)
                                .sum()))
                .toList()
                .stream()
                .max(Comparator.comparingDouble(Tuple::score)).stream()
                .findFirst()
                .orElse(null);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.flatMap(pupil ->
                        pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.averagingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(s -> new Tuple(s.getKey(), s.getValue()))
                .toList();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(pupil ->
                        pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.summingDouble(Subject::score)))
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .stream()
                .map(s -> new Tuple(s.getKey(), s.getValue()))
                .findFirst()
                .orElse(null);
    }
}
