package phan_2;

import java.util.Scanner;

public class bai9 {
    public static int[][] nhapVaXuLyMaTran(int n, Scanner scanner) {
        int[][] matrix = new int[n][n];

        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị tại vị trí [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }
    // Hàm in ma trận
    public static void inMaTran(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void tinhVaInTongTheoHang(int[][] matrix) {
        System.out.println("Tổng theo từng hàng:");
        for (int i = 0; i < matrix.length; i++) {
            int tongHang = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                tongHang += matrix[i][j];
            }
            System.out.println("Hàng " + i + ": " + tongHang);
        }
    }

    public static void tinhVaInTongTheoCot(int[][] matrix) {
        System.out.println("Tổng theo từng cột:");
        for (int j = 0; j < matrix[0].length; j++) {
            int tongCot = 0;
            for (int i = 0; i < matrix.length; i++) {
                tongCot += matrix[i][j];
            }
            System.out.println("Cột " + j + ": " + tongCot);
        }
    }

    public static int tinhTongDuongCheoChinh(int[][] matrix) {
        int tongCheoChinh = 0;
        for (int i = 0; i < matrix.length; i++) {
            tongCheoChinh += matrix[i][i];
        }
        return tongCheoChinh;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông n: ");
        int n = scanner.nextInt();
        int[][] matrix = nhapVaXuLyMaTran(n, scanner);
        System.out.println("Ma trận vuông:");
        inMaTran(matrix);
        tinhVaInTongTheoHang(matrix);
        tinhVaInTongTheoCot(matrix);
        int tongCheoChinh = tinhTongDuongCheoChinh(matrix);
        System.out.println("Tổng trên đường chéo chính: " + tongCheoChinh);
    }
}
