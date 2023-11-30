package phan_3;

import java.util.Scanner;

public class Bai3 {
//    Hãy liệt kê các số hoàn thiện nhỏ hơn 5000
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;

    do {
        System.out.println(" Nhap vao so num = ");
        num = scanner.nextInt();
    } while (num <= 0);

    for (int i = 2; i <= num; i++) {
        int sum = 1;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0)
                sum += j;
        }
        if (sum == i)
            System.out.println("\n " + i);
    }
}
}
