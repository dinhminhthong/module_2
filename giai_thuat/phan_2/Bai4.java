package phan_2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, tram, chuc, donvi;
        System.out.println("Nhập vào một số có 3 chữ số: ");
        n = scanner.nextInt();
        tram = n / 100;
        chuc = (n % 100) / 10;
        donvi = (n % 100) % 10;
        System.out.println("Chữ số hàng trăm của số " + n + " là: " + tram);
        System.out.println("Chữ số hàng chục của số " + n + " là: " + chuc);
        System.out.println("Chữ số hàng đơn vị của số " + n + " là: " + donvi);

    }
}
