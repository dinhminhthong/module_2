package ss3_Array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        int size;
        int [] array;
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
        int number = array[0];

        for (int k = 0; k < array.length;) {
            if (number == array[k]){
                for (int j = k; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                continue;
            }
            k++;
        }
        System.out.println(Arrays.toString(array));

    }
}
