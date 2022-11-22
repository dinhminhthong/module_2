package ss7_interface.ss6_inheritance.point2d;

import java.util.Arrays;
import java.util.Scanner;

public class Point2dMain {
    public static void main(String[] args) {
        Point2d point2D = new Point2d();
        System.out.println(point2D);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  x");
        float x1 = Float.parseFloat(scanner.nextLine());
        System.out.println("enter  y");
        float y1 = Float.parseFloat(scanner.nextLine());
        point2D.setXY(x1, y1);
        point2D.getXY();
        System.out.println(point2D);
        Point3d point3D = new Point3d();
        System.out.println("enter  Z");
        float z1 = Float.parseFloat(scanner.nextLine());
        Point3d pointD = new Point3d(x1, y1, z1);


        System.out.println("point 3D " + Arrays.toString(pointD.getXYZ()));
    }
}
