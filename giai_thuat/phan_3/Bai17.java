package phan_3;

public class Bai17 {
    public static int dem(int[] arr, int x) {
        int demX = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                demX++;
            }
        }
        return demX;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 4, 5, 3, 2, 3};
        int x = 3;
        System.out.println("số lần xuất hiện của biến x là: " + dem(arr, x));
    }
}
