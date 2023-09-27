package ru.job4j.collection.subject;

import java.util.*;

/**
 * Класс Label содержит результаты: имя и баллы.
 * Этот класс используется как для учеников, так и для предметов.
 */
public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0D;
        int subjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                subjects++;
            }
        }
        return sum / subjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        double sum = 0D;
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum / subjects.size()));
            sum = 0D;
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Double> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.put(subject.name(), temp.getOrDefault(subject.name(), 0d) + subject.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Double> pair : temp.entrySet()) {
            labels.add(new Label(pair.getKey(), pair.getValue() / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        double sum = 0D;
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum));
            sum = 0D;
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Double> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.put(subject.name(), temp.getOrDefault(subject.name(), 0d) + subject.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Double> pair : temp.entrySet()) {
            labels.add(new Label(pair.getKey(), pair.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
