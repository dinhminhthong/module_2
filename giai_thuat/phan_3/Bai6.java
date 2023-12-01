package phan_3;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào n: ");
        n = scanner.nextInt();
        System.out.println("dãy số chính phương là: ");
        for (int i = 0; i <n ; i++) {
            if (Math.sqrt(i)%1==0) {
                System.out.print(i+" ");
            }
        }
    }
}
