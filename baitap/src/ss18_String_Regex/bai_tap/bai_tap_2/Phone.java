package ss18_String_Regex.bai_tap.bai_tap_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Phone {
    public  static final String CHECK    = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean flag;

        do {
            System.out.print("nhập chuỗi của bạn: ");
            input=sc.nextLine();
            flag= check(CHECK, input);
            if (flag){
                System.out.print("bạn đã nhập sai chuỗi: ");
            }

        }while (!flag);
        System.out.print("nhập lại chuỗi:" + input);
    }
    public static boolean check(String check, String input){
        return Pattern.matches(check,input);
    }
}
