package firsttask;

public class Main {
    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle(3, 4, 5);
        GeometricFigure trapezium = new Trapezium(5, 7, 4);
        GeometricFigure rectangle = new Rectangle(4, 6);

        System.out.println("Triangle Area: " + triangle.area() + " | Perimeter: " + triangle.perimeter());
        System.out.println("Trapezium Area: " + trapezium.area() + " | Perimeter: " + trapezium.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area() + " | Perimeter: " + rectangle.perimeter());

    }
}
