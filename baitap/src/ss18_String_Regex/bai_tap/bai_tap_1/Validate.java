package ss18_String_Regex.bai_tap.bai_tap_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    private static final String CHECK = "^(C|A|P)\\d{4}(G|H|I|K|L|M)$";

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        boolean flag;

        do {
            System.out.print("Nhập chuỗi của bạn: ");
            input = sc.nextLine();
            flag = check(CHECK,input);
            if(flag){
                System.out.println("Nhập sai chuỗi: ");
            }
        } while (!flag);
        System.out.println("nhập lại chuỗi: "+input);

    }
    public static boolean check(String a, String input){
        return Pattern.matches(a,input);
    }
}
