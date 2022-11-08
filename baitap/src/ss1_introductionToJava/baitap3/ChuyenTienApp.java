package ss1_introductionToJava.baitap3;

import java.util.Scanner;

public class ChuyenTienApp {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("số tiền muốn đổi:");
    double  usd=scanner.nextDouble();
        double vnd = 20000*usd;
        System.out.println("số tiền được đổi ra:"+vnd);
    }
}


