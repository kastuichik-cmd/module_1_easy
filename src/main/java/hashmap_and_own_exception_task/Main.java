package hashmap_and_own_exception_task;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        addStudent(students, new Student("1", "Павел", 20));
        addStudent(students, new Student("2", "Света", 22));
        addStudent(students, new Student("3", "Алиса", 19));

        Student foundStudent = findStudentById(students, "4");
        System.out.println("Найден студент: " + foundStudent);

        removeStudentById(students, "1");

        System.out.println("Все студенты после удаления:");
        students.values().forEach(System.out::println);
    }

    static void addStudent(Map<String, Student> students, Student student) {
        students.put(student.getStudentId(), student);
    }

    static Student findStudentById(Map<String, Student> students, String studentId) {
        Student student = students.get(studentId);
        if (student == null) {
            throw new StudentNotFoundException("Студент с ID " + studentId + " не найден");
        }
        return student;
    }

    static void removeStudentById(Map<String, Student> students, String studentId) {
        students.remove(studentId);
    }


}
