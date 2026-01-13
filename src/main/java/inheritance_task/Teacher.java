package inheritance_task;

public class Teacher extends Person {

    private String specialty;

    public Teacher(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    @Override
    public void introduce() {
        System.out.printf("Учитель: %s. Специальность: %s.%n", name, specialty);
    }
}
