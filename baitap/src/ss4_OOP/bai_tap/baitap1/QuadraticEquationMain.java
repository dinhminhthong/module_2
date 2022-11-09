package ss4_OOP.bai_tap.baitap1;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner root = new Scanner(System.in);
        System.out.println("vui lòng nhập a:");
        double a = Double.parseDouble(root.nextLine());
        while (a == 0) {
            System.out.println("vui lòng nhập a khác 0:");
            a = Double.parseDouble(root.nextLine());
        }
        System.out.println("vui lòng nhập b:");
        double b =Double.parseDouble(root.nextLine());
        System.out.println("vui lòng nhập c:");
        double c = Double.parseDouble(root.nextLine());
        QuadraticEquation sc = new QuadraticEquation(a,b,c);
        System.out.println("nghiệm 1 của pt là:"+sc.getRoot1());
        System.out.println("nghiệm 2 của pt là:"+sc.getRoot2());
    }

}