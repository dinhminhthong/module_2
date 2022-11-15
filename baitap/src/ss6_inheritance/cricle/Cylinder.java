package ss6_inheritance.cricle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }
  public Cylinder (double height){
        this.height = height;
  }
  public Cylinder (double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public  double getVolume(){
        return super.getRadius()*super.getRadius()*this.height*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + " Voloume "  +getVolume()+
        '}';
    }
}
