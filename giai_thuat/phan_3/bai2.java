package phan_3;

import java.util.Scanner;

public class bai2 {
    //Viết chương trình đếm số ước số của số nguyên dương n.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        int count =0;
        System.out.println("nhập n: ");
        n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if (n%i==0){
                count ++;
            }
        }
        System.out.println("Số ước của " + n + " là: " + count);
    }
}
