package phan_2;

import java.util.Scanner;

public class bai6 {
    //. Viết chương trình giải hệ phương trình bậc nhất
    public static void main(String[] args) {
        float a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        a = scanner.nextFloat();
        System.out.println("nhập b");
        b = scanner.nextFloat();
        if (a==0){
            if (b==0){
                System.out.println("phương trình vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            float x = -b/a;
            System.out.println("phương trình có  nghiệm"+ x);
        }
    }

}
