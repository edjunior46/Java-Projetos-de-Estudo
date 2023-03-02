import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<Shape>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data: %n", (i + 1));
            System.out.print("Rectangle or Circle? (r/c): ");
            sc.nextLine();
            char shape = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK, BLUE, RED): ");
            String color = sc.nextLine();
            if (shape == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapeList.add(new Rectangle(width, height, Color.valueOf(color)));
            } else if (shape == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapeList.add(new Circle(radius, Color.valueOf(color)));
            }
        }

        System.out.println("Shape areas: ");
        for (Shape s : shapeList) {
            System.out.println(String.format("%.2f", s.area()));
        }

        sc.close();

    }
}
