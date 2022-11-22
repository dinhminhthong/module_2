package ss7_interface.bai_2;

public class Rectangle extends Shape{
    private double weight = 0;
    private double height = 0;

    public Rectangle(){

    }
    public Rectangle(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight= weight;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=   height;
    }
    public Rectangle(boolean filled, String color, double weight,double height ){
        super(filled,color);
        this.weight=weight;
        this.height=height;
    }
    public double getArea(){
        return this.weight*this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                "Area=" + getArea()+super.toString()+
                '}';
    }
}
