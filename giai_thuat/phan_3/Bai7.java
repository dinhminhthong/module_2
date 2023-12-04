package phan_3;

import java.util.Scanner;

public class Bai7 {
    public static boolean soHoanThien (int n){
        int sum =0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                sum +=i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int count=0;
        for (int i = 1; i <n ; i++) {
            if (soHoanThien(i)){
                count++;
            }
        }
        System.out.println("số hoàn thiện nhỏ hơn "+n+"là: "+count);
    }
}
