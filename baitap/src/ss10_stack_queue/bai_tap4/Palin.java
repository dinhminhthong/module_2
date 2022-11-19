package ss10_stack_queue.bai_tap4;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palin {
    public static void main(String[] args) {
        Stack<String> str = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        System.out.println("nhập chuỗi của bạn: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] arr = string.toLowerCase().split("");
        for (int i=0; i<arr.length;i++){
            str.push(arr[i]);
        }
        for (int i=0;i< arr.length;i++){
            queue.add(arr[i]);
        }
        int size = queue.size();
        boolean flag  = true;
        for (int i=0;i<size;i++){
            if (!queue.poll().equals(str.pop())){
                flag =false;
            } else {
                flag =true;
            }
        }
        if (flag){
            System.out.println("là palindrome");
        } else {
            System.out.println("ko phải là palindrome");
        }
    }

}
