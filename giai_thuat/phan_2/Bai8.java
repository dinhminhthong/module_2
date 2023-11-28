package phan_2;

public class Bai8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 7, 6},
                {7, 8, 117}
        };
        int n = matrix.length; // Kích thước của ma trận vuông
        int sumMainDiagonal = 0; // Tổng đường chéo chính
        int sumSecondaryDiagonal = 0; // Tổng đường chéo phụ

        for (int i = 0; i < n; i++) {
            sumMainDiagonal += matrix[i][i]; // Thêm phần tử trên đường chéo chính vào tổng
            sumSecondaryDiagonal += matrix[i][n - 1 - i]; // Thêm phần tử trên đường chéo phụ vào tổng
        }
        System.out.println("Tổng đường chéo chính của ma trận vuông là: " + sumMainDiagonal);
        System.out.println("Tổng đường chéo phụ của ma trận vuông là: " + sumSecondaryDiagonal);
    }
}
