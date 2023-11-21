package phan_2;

import java.util.Scanner;

public class bai2 {
    public static int fibonaci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        for (int i = 0; i <n; i++) {
            f0 = f1;
            f1 =fn;
            fn = f0 + f1;
        }
        return fn;
    }
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài dãy finonacy: ");
        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(fibonaci(i)+" ");
        }
    }
}
