package phan_2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn");
        chuoi = scanner.nextLine();
        for (int i = 0; i <chuoi.length() ; i++) {
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}
