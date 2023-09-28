package ru.job4j.collection.sort.job;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        jobs.sort(new SortByNameJob());
        System.out.println(jobs);
        System.out.println();
        jobs.sort(new SortDescByNameJob());
        System.out.println(jobs);
        System.out.println("Комбинированный компаратор");
        List<Job> job = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        job.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(job);
        System.out.println();
        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        job.sort(comb);
        System.out.println(job);
    }
}
