package ss6_inheritance.cricle;

import java.util.Scanner;

public class CricleMain {
    public static void main(String[] args) {
        Circle cr = new Circle();
        System.out.println(cr);
        cr = new Circle(3,"red");
        System.out.println(cr);
        Cylinder cyl = new Cylinder(6);
        System.out.println(cyl);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập bán kính");
        double r = Double.parseDouble(sc.nextLine());
        cr.setRadius(r);
        System.out.println(cr.toString());


    }
}
