import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, delta, x1, x2;
        System.out.println("nhập a");
        a = scanner.nextFloat();
        System.out.println("nhập b");
        b = scanner.nextFloat();
        System.out.println("nhập c");
        c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phương trình vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                x1 = (-c) / b;
                System.out.println("phương triình có nghiệm kép: " + x1);
            }
        } else {
            delta = (float) (Math.pow(b,2)-(4*a*c));
            if (delta<0){
                System.out.println("phương trình vô nghiệm");
            }else if (delta==0){
                x1= -b/(2*a);
                System.out.println("phương trình có nghiệm kép: "+x1);
            }else {
                x1 = (float) ((-b -Math.sqrt(delta))/(2*a));
                x2 = (float) ((-b +Math.sqrt(delta))/(2*a));
                System.out.println("phuương trình có nghiệm x1: "+x1);
                System.out.println("phuương trình có nghiệm x2: "+x2);
            }
        }
    }
}
