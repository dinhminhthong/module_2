import java.util.*;

public class Bai5 {
    public static boolean kiemTraChuoiDoiXung(String str) {
//        Stack<Character> stack = new Stack<>();
//        Queue<Character> queue = new LinkedList<>();
//        char[] arr = str.toCharArray();
//        for (char c : arr) {
//            stack.push(c);
//            queue.add(c);
//        }
//        while (!stack.isEmpty() && !queue.isEmpty()) {
//            char stackValue = stack.pop();
//            char queueValue = queue.poll();
//            if (stackValue != queueValue) {
//                return false;
//            }
//        }
//        return true;
        char[]arr = str.toCharArray();
        for (int i = 0; i < arr.length/2 ;i++){
            if (arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi cần kiểm tra");
        String input= scanner.nextLine();
        if (kiemTraChuoiDoiXung(input)) {
            System.out.println(input + " là chuỗi đối xứng.");
        } else {
            System.out.println(input + " không là chuỗi đối xứng.");
        }
    }

}
