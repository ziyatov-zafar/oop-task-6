package firsttask;

public class Trapezium extends GeometricFigure {
    private double sideA, sideB, height;

    public Trapezium(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double area() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + 2 * Math.sqrt(Math.pow((sideB - sideA) / 2, 2) + Math.pow(height, 2));
    }
}
