package inheritance_task;

public class Student extends Person {

    private String year;

    public Student(String name, String year) {
        super(name);
        this.year = year;
    }

    @Override
    public void introduce() {
        System.out.printf("%s: студент %s-го курса.%n", name, year);
    }
}
