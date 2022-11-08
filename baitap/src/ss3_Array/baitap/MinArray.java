package ss3_Array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) ;
            System.out.println("Size Should not exceed 20 :");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
             System.out.println("enter element"+(i+1)+": ");
             array[i] = sc.nextInt();
             i++;
        }
        System.out.println("propety list: ");
        System.out.println(Arrays.toString(array));

        int min =array[0];
        int index =1 ;
        for (int j=0;j<array.length;j++){
            if (array[j]<min){
                min = array[j];
                index = j;
            }
        }
        System.out.print("The smallest property value in the list is " + min + " ,at position " + index);
    }
}