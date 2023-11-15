import java.util.HashMap;
import java.util.Map;

public class Bai1 {
   public static void demKyTu(String str) {
//        int[] counter = new int[256];
//        for (int i = 0; i < str.length(); i++) {
//            counter[str.charAt(i)]++;
//        }
//        char[] array = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            array[i] = str.charAt(i);
//            int flag = 0;
//            for (int j = 0; j <= i; j++) {
//                if (str.charAt(i) == array[j]) flag++;
//            }
//            if (flag == 1)
//                System.out.println("Số lần xuất hiện của " + str.charAt(i) + " trong chuỗi:" + counter[str.charAt(i)]);
//        }
       Map<Character,Integer> map = new HashMap<>();
       char[]array = str.toCharArray();
       for (char c: array){
           if (map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else {
               map.put(c,1);
           }
       }
       System.out.println(map);
    }
    public static void main(String[] args) {
        String str = "aabacsdc";
        demKyTu(str);
    }
}
