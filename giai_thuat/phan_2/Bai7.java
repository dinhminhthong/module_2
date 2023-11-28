package phan_2;

import java.util.Scanner;

public class Bai7 {
    // Viết chương trình in diện tích các hình hình học (tam giác, tròn, vuông, chữ nhật)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập cạnh huyền tam giác: " );
        double triangleBase = scanner.nextDouble();
        System.out.println("nhập chiều cao tam giác ");
        double triangleHeigth = scanner.nextDouble();
        Triangle triangle1 = new Triangle(triangleBase,triangleHeigth);
        System.out.println("diện tích tam giác laf: "+triangle1.calculateArea());

        System.out.println("nhập cạnh hình vuông: ");
        double squareSize = scanner.nextDouble();
        Square square1 = new Square(squareSize);
        System.out.println("diện tích hình vuông là: "+ square1.calculateArea() );


        System.out.println("nhập chiều rộng hình chữ nhật: ");
        double rectangleHeigth= scanner.nextDouble();
        System.out.println("nhiều chiều dài hình chữ nhật: ");
        double rectangleWeight = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(rectangleHeigth,rectangleWeight);
        System.out.println("diện tích hình chữ nhật là: "+ rectangle1.calculateArea());

        System.out.println("nhập bán kính hình tròn");
        double cricleRadius = scanner.nextDouble();
        Cricle cricle1 = new Cricle(cricleRadius);
        System.out.println("diện tích hình tròn là: "+ cricle1.calculateArea());


    }

}
