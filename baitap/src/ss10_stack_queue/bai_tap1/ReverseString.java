package ss10_stack_queue.bai_tap1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String result = "";
        System.out.println("nhập chuỗi muốn đổi");
        String str = sc.nextLine();
        String [] world = str.split("");
        for (int i=0; i<world.length;i++){
              stack.push(world[i]);
        }
        System.out.println("chuổi đảo ngược");
        for (int i=0; i<world.length;i++){
       result += " "+stack.pop();
        }
        System.out.println(result);
    }
}


