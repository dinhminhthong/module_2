package phan_3;

import java.util.Random;

public class Bai9 {
//Vết chương trình phát sinh ngẫu nhiên mảng một chiều các số nguyên âm
    public static int[] songuyenam(int size){
        int [] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result[i]= random.nextInt(Integer.MAX_VALUE)*-1;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = songuyenam(n);
        System.out.println("Mảng: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
