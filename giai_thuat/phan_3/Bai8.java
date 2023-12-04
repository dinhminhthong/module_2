package phan_3;

import java.util.Scanner;

public class Bai8 {
    //Viết chương trình tính tiền cước taxi:
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số km: ");
        total = scanner.nextInt();
        if (total<=1){
            count = total * 10000;
        } else if (total<30 && total>1) {
            count = (total-1)*2000 + 1*10000;
        }else {
            count = 1* 10000 + 29*2000 + (total-30)*3000;
        }
        System.out.println("số tiên taxi cần thanh toán là: "+count);
    }
}
