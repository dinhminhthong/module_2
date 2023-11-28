package phan_2;

public class Cricle extends Shape{
    private double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle() {
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }
}
