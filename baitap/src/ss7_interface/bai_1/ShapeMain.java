package ss7_interface.bai_1;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[]shapes = new Shape[3];
        shapes [0]=new Circle(3);
        shapes[1]=new Rectangle(2,4);
        shapes[3]= new Square(3);
           for(Shape shape: shapes){
               System.out.println(shape);
           }

    }
}
