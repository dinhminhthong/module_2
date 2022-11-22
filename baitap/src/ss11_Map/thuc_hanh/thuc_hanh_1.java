package ss11_Map.thuc_hanh;

import java.util.HashMap;
import java.util.Map;

public class thuc_hanh_1 {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
       student.put("thong",21);
       student.put("tien",27);
       student.put("hoang",25);
        for (Map.Entry<String, Integer> entry: student.entrySet()) {

            System.out.println("key"+entry.getKey()+"value"+entry.getValue());
        }

    }
}
