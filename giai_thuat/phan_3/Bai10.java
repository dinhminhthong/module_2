package phan_3;

public class Bai10 {
    // Viết chương trình nhập mảng các số nguyên và xuất ra các phần tử lẻ có trong mảng.
    public static void soLe(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                System.out.println(n[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        soLe(arr);
    }
}

