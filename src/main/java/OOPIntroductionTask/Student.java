package OOPIntroductionTask;

public class Student {
    private String name;
    private int age;
    private double averageGrade;


    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        setAverageGrade(averageGrade);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade < 0 || averageGrade > 10) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне 0-10!");
        }
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade;
    }
}
