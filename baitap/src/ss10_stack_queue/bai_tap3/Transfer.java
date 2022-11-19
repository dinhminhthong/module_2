package ss10_stack_queue.bai_tap3;

import java.util.Scanner;
import java.util.Stack;

public class Transfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> number = new Stack<>();
        int num;
        do {
            System.out.println("nhập số nguyên bất kì:");
            num= Integer.parseInt(sc.nextLine());
        } while (num<=0);
        while (num>0){
            int surplus = num%2;
            number.push(surplus);
            num = num/2;

        }
        int size = number.size();
        System.out.println("sau khi chuyển đổi nhị phân là: ");
        for (int i=0;i<size;i++){
            System.out.println(number.pop()+" ");
        }

    }
}

