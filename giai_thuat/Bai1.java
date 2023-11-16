import java.util.HashMap;
import java.util.Map;

public class Bai1 {
   public static void demKyTu(String str) {
// đếm số lâần suất hiện kí tự của 1 chuỗi
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
