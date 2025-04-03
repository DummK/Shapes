package shape;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.height = height;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return (a * height) / 2;
    }
}
