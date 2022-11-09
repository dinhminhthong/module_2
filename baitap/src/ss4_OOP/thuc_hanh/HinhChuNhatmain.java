package ss4_OOP.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhatmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double chieuDai = sc.nextDouble();
        System.out.println("nhap chieu rong");
        double chieuRong = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println("hinh chữ nhật của bạn \n");
        System.out.println("chu vi của nó là \n"+hcn.getPerimeter());

    }
}
