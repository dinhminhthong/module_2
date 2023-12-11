package phan_3;

import java.util.Scanner;

public class Bai13 {
    // Hàm kiểm tra xem một số có phải là số chính phương hay không
    public static boolean isChinhPhuong(int num) {
        double sqrt = Math.sqrt(num);
        return (sqrt - Math.floor(sqrt)) == 0;
    }

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
        System.out.println("Các phần tử là số chính phương nằm ở các vị trí lẻ là:");
        for (int i = 1; i < n; i += 2) {
            if (isChinhPhuong(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
