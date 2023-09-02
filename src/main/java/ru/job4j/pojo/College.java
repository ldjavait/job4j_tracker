package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Denis Lazykin");
        student.setGroup(1);
        student.setDate("01.09.2023");
        System.out.println("Student: " + student.getName()
                + " was enrolled to group number - "
                + student.getGroup()
                + ", on " + student.getDate());
    }
}
