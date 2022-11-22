package ss7_interface.bai_2;

public class Cricle extends Shape{
private double radius = 0;

public Cricle(){

}
public Cricle(double darius){
    this.radius =darius;
}
public Cricle(boolean filled, String color, double darius){
    super(filled,color);
    this.radius=radius;
}
public double getRadius(){
    return this.radius;
}
public void setRadius(double radius){
    this.radius=radius;
}
public double getArea(){
    return this.radius*this.radius*Math.PI;
}

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +"area"+getArea()+super.toString()+
                '}';
    }
}
