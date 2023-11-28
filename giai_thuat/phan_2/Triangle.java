package phan_2;

public class Triangle extends Shape{
    private double base;
    public double height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5*base*height;
    }
}
