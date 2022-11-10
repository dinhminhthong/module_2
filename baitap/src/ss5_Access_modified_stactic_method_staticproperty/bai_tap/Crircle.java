package ss5_Access_modified_stactic_method_staticproperty.bai_tap;

import java.util.Scanner;

public class Crircle {
    private double radius = 1.0;
    private String color = "red";

    public Crircle() {
    }

    public Crircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (this.radius*this.radius*Math.PI);
    }
    public static void main(String[] args) {
        Crircle cr = new Crircle();
        System.out.println(cr.getArea());
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính khác đi bro");
        int r = Integer.parseInt(sc.nextLine());
        Crircle area = new Crircle(r);
        System.out.println("diện tích mới nà:"+area.getArea());


    }


}
