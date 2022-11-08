package ss3_Array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArr1, sizeArr2;
        int[] arrOne;
        int[] arrTwo;
        int[] concatArray;
        System.out.println("nhập độ dài mảng 1: ");
        sizeArr1 = Integer.parseInt(sc.nextLine());
        arrOne = new int[sizeArr1];
        for (int i = 0; i < sizeArr1; i++) {
            System.out.println("enter number " + (i + 1));
            arrOne[i] = Integer.parseInt(sc.nextLine());
        }
     System.out.println(Arrays.toString(arrOne));
        System.out.println("nhập độ dài mảng 2");
        sizeArr2=Integer.parseInt(sc.nextLine());
        arrTwo = new int[sizeArr2];
        for (int i =0 ; i<sizeArr2;i++){
            System.out.println("enter number"+(i+1));
            arrTwo[i]=Integer.parseInt(sc.nextLine());
        }
      System.out.println(Arrays.toString(arrTwo));
        concatArray =new int[sizeArr1+sizeArr2];
        for (int i=0; i<arrOne.length; i++){
            concatArray[i]=arrOne[i];
        }
        for (int i=0; i<arrTwo.length;i++){
            concatArray[sizeArr1+i]=arrTwo[i];
        }
        System.out.println(Arrays.toString(concatArray));

    }
}
