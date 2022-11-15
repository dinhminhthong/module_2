package ss7_interface.bai_1;

public class Rectangle extends Shape implements Resizeable {
    private double weight = 0.0;
    private double lenght = 0.0;

    public Rectangle() {

    }

    public Rectangle(double weight, double lenght) {
        this.weight = weight;
        this.lenght = lenght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Rectangle(boolean filled, String color, double weight, double length) {
        super(filled, color);
        this.weight = weight;
        this.lenght = length;
    }

    public double getArea() {
        return this.weight * this.lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + this.weight +
                ", lenght=" + this.lenght +
                "Area= " + getArea() + super.toString() +
                '}';

    }

    @Override
    public void resize(double percent) {
        lenght = this.lenght * 100 / percent;
        weight = this.weight * 100 / percent;
    }
}