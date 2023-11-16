import java.util.Scanner;
import java.util.Stack;

public class Bai4 {
    // đảo ngược chuỗi nhập vào từ bàn phím
    public static String reverseString(String str){
        Stack<Character> characters =new Stack<>();
        for (int i=0;i<str.length();i++){
            characters.push(str.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        int size  = characters.size();
        for (int i=0; i<size;i++){
//            System.out.println(size);
            stringBuilder.append(characters.pop());
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi muốn đảo ngược");
        String input =scanner.nextLine();
        System.out.println("chuỗi đảo ngược: "+reverseString(input));
    }
}
