package ss4_OOP.thuc_hanh;

import java.util.Scanner;

public class GiaiThuat {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {8,7,2,5,3,1};
        int x =10;
        for (int i=0;i< args.length;i++){
            for (int j=0;j< arr.length;j++){
             if (i != j){
                 if(arr[i]+arr[j]==x){
           System.out.println("{"+arr[i]+","+arr[j]+"}");
                 }
             }
            }
        }

    }
}
