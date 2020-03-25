package app.LaboratoryN4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * The main class for testing purposes
 * (e.g. Java Comparator class)
 *
 * @version 1.03 25 Mar 2020
 * @author Rostyslav Nakarlovich
 */
public class LaboratoryN4 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Rostyslav", "Nakarlovich", "OOP", 0, 100),
                new Student("Rostyslav", "Asimov", "English", 16, 79),
                new Student("Petro", "Powder", "Calculus", 8, 75),
                new Student("Vasyl", "Fedorenko", "Physics", 2, 60),
                new Student("Boris", "Petrenko", "Computer Arithmetic", 20, 86),
                new Student("Volodymyr", "Romanenko", "Discrete mathematics", 16, 97),
                new Student("Vasyl", "Bondarenko", "Ukrainian", 27, 90)
        };

        System.out.println("Unsorted array of students:");
        for (Student st: students) {
            System.out.println(st);
        }

        Comparator<Student> nameComparator = (Student st1, Student st2) -> { return st1.getFirstName().compareTo(st2.getFirstName()); };
        nameComparator = nameComparator.thenComparing((Student st1, Student st2) -> { return st1.getLastName().compareTo(st2.getLastName()); }); 
        Arrays.sort(students, nameComparator);
        System.out.println("Sorted by full name of the student:");
        for (Student st: students) {
            System.out.println(st);
        }

        Comparator<Student> rateComparator = (Student st1, Student st2) -> { return Integer.compare(st1.getActualRate(), st2.getActualRate()); };
        rateComparator = rateComparator.thenComparing((Student st1, Student st2) -> { return Integer.compare(st1.getDesiredRate(), st2.getDesiredRate()); });
        Arrays.sort(students, rateComparator.reversed());
        System.out.println("Sorted by rate of the student in reverse order:");
        for (Student st: students) {
            System.out.println(st);
        }
    }
}
