package streamApiTask;


import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Паша", 28, 7.0));
        students.add(new Student("Лера", 27, 9.7));
        students.add(new Student("АМаша", 29, 8.2));
        students.add(new Student("АСвета", 27, 6.8));

        double avg = students.stream()
                .filter(s -> s.getAge() > 20)
                .filter(s -> s.getName().startsWith("А"))
                .collect(Collectors.averagingDouble(Student::getAverageGrade));

        System.out.println(avg);
    }
}
