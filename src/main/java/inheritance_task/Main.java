package inheritance_task;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Маша", "5"),
                new Teacher("Дмитрий", "Математика"),
                new Person("Владимир")
        };

        for (Person p : people) {
            p.introduce();
        }
    }
}
