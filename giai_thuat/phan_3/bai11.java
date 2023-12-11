package phan_3;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Các phần tử chẵn nhỏ hơn 20 là:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] < 20) {
                System.out.print(arr[i] + " ");
            }
        }

    }

}
