package arraylist_and_comparator_task;

import oop_introduction_task.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Паша", 20, 9.0),
                new Student("Паша", 20, 8.3),
                new Student("Рома", 27, 7.6),
                new Student("Света", 29, 2.4),
                new Student("Алиса", 30, 4.2),
                new Student("Женя", 30, 6.3)

        ));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("\nСортировка по имени:");
        students.forEach(System.out::println);



        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getAverageGrade(), s1.getAverageGrade());
            }
        });
        System.out.println("\nСортировка по среднему баллу:");
        students.forEach(System.out::println);
    }
}
