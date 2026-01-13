package OOPIntroductionTask;

public class StudentEqualityTest {
    public static void main(String[] args) {
        Student s1 = new Student("Паша", 20, 9.0);
        Student s2 = new Student("Паша", 20, 7.5);
        Student s3 = new Student("Рома", 22, 8.0);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
