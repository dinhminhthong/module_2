package ss3_Array.baitap;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String  inputString;
        char charter;
        int count =0;
       Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn");
        inputString=scanner.nextLine();
        System.out.println("nhập biểu đồ của bạn");
        charter=scanner.next().charAt(0);

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charter) {
                count++;
            }
        }
        System.out.println("biểu đồ bao gồm chuỗi: " +count +" thời ggian");
    }
}
