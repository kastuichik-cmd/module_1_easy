package Interfaces_and_abstraction_task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea = totalArea + shape.getArea();

            if (shape instanceof Drawable drawable) {
                drawable.draw();
            }
        }

        System.out.println("Общая площадь всех фигур: " + totalArea);
    }
}
