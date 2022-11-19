package ss10_stack_queue.bai_tap1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        Stack<Integer> num = new Stack<>();
        int size = arr.length;
        for (int i=0; i<size; i++){
            System.out.println("nhập phần tử mảng"+(i+1)+"trong mảng muốn đảo ngược");
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng bạn nhập"+ Arrays.toString(arr));
        for (int i=0;i<size;i++){
            num.push(arr[i]);
        }
        for (int i=0;i<size;i++){
            arr[i]=num.pop();
        }
        System.out.println("mảng đảo ngược"+Arrays.toString(arr));
    }

}

